import { ajax, toast, promptBox } from 'nc-lightapp-front';

var treeId = 'demotreeVOTree';//树组件Id
var formId = 'demotreeVO';//卡片组件Id
var pageCode = "asdf_demotreeVO"; // 小应用页面编码
var primaryKey = 'pk_depa'// 主键
var fatherKey = 'father_pk'//上级主键

var urlArray = {
loadTreeDataUrl: "/nccloud/asdf/demotreeVO/queryDemotreeVOTree.do",
queryCardUrl: "/nccloud/asdf/demotreeVO/queryDemotreeVOCard.do",
saveCardUrl: '/nccloud/asdf/demotreeVO/saveDemotreeVO.do',
delTreeNodeUrl: '/nccloud/asdf/demotreeVO/deleteDemotreeVO.do'
};

var initfn = {

};
/**
* 树节点新增
*/
export function onAddTreeNode(selectNode) {
//选中树节点
this.props.syncTree.setNodeSelected(treeId, selectNode.refpk);
doAdd.call(this,updateStatus.bind(this))
}

/**
* 树节点编辑
*/
export function onEditTreeNode(selectedTreeNode) {
/****未选中提示***/
if (!selectedTreeNode) {
toast({ content: this.state.json['CH010103-000012'], color: 'warning' });//默认top/* 国际化处理： 请选中需要编辑的节点*/
return;
}
this.props.syncTree.setNodeSelected(selectedTreeNode.refpk);
// 加载对应卡片信息
loadFormData.call(this,selectedTreeNode.refpk, () => {
this.props.form.setFormStatus(formId, 'edit');
updateStatus.call(this);
})
}

export function afterInit(){

}
/**
* 树节点删除
*/
export function onDeleteTreeNode(selectedTreeNode) {

if (!selectedTreeNode) {
toast({ content: this.state.json['CH010103-000014'], color: 'warning' });//默认top/* 国际化处理： 请选中需要删除的节点*/
return;
}
if (selectedTreeNode.refpk == this.root.refpk) {
toast({ content: this.state.json['CH010103-000015'], color: 'warning' });//默认top/* 国际化处理： 根节点不能删除*/
return;
}
let message = this.state.json['CH010103-000016']/* 国际化处理： 确认要删除所选数据吗？*/

promptBox({
color: 'warning',               // 提示类别默认"success"， "success"/"info"/"warning"/"danger",非必输
title: this.state.json['CH010103-000017'],                // 提示标题, 默认不同类别下分别为："已成功"/"帮助信息"/"请注意"/"出错啦",非必输/* 国际化处理： 确认删除*/
content: message,             // 提示内容,非必输
noFooter: false,                // 是否显示底部按钮(确定、取消),默认显示(false),非必输
noCancelBtn: false,             // 是否显示取消按钮,，默认显示(false),非必输
beSureBtnName: this.state.json['CH010103-000006'],          // 确定按钮名称, 默认为"确定",非必输/* 国际化处理： 确定*/
cancelBtnName: this.state.json['CH010103-000007'],           // 取消按钮名称, 默认为"取消",非必输/* 国际化处理： 取消*/
beSureBtnClick: doDel.bind(this, selectedTreeNode)
})
}
/**
* 保存
*/
export function onSaveButtonClick() {
doSave.call(this,(data) => {
afterSave.call(this,data,()=>{
updateStatus.call(this)
});
});
}

/**
* 保存新增
*/
export function onSaveAddButtonClick() {
doSave.call(this,(data) => {
afterSave.call(this,data, () => {
doAdd.call(this,() => {
updateStatus.call(this);
})
});
})
}

/**
* 取消
*/
export function onCancelButtonClick() {

promptBox({
color: 'warning',               // 提示类别默认"success"， "success"/"info"/"warning"/"danger",非必输
title: this.state.json['CH010103-000021'],                // 提示标题, 默认不同类别下分别为："已成功"/"帮助信息"/"请注意"/"出错啦",非必输/* 国际化处理： 确认取消*/
content: this.state.json['CH010103-000022'],             // 提示内容,非必输/* 国际化处理： 是否确认要取消？*/
noFooter: false,                // 是否显示底部按钮(确定、取消),默认显示(false),非必输
noCancelBtn: false,             // 是否显示取消按钮,，默认显示(false),非必输
beSureBtnName: this.state.json['CH010103-000006'],          // 确定按钮名称, 默认为"确定",非必输/* 国际化处理： 确定*/
cancelBtnName: this.state.json['CH010103-000007'],           // 取消按钮名称, 默认为"取消",非必输/* 国际化处理： 取消*/
beSureBtnClick: doCancel.bind(this)   // 确定按钮点击调用函数,非必输
})
}

/**
* 刷新
*/
export function onRefreshButtonClick(){
loadTreeData.call(this,() => {
this.props.form.EmptyAllFormValue(formId);
toast({ content: this.state.json['CH010103-000028'], color: 'success' });/* 国际化处理： 刷新成功*/
updateStatus.call(this);
});
}

/**
* 左树加载
* */
export function loadTreeData(callback){
/**************
* 构造请求参数
*************/
let requestParam = {};
/*************
* ajax请求 加载树数据
*************/
ajax({
url: urlArray.loadTreeDataUrl,
data: requestParam,
success: (result) => {
if (result.success) {
this.root.refname = this.state.json['CH010103-000000']
this.root.title = this.state.json['CH010103-000000']
let data = [Object.assign({ ...this.root }, { children: result.data })];
//同步树  加载全部数据
dealTreeData(data)
this.props.syncTree.setSyncTreeData(treeId, data)
//展开节点  设置默认展开项
this.props.syncTree.openNodeByPk(treeId, this.root.refpk);
this.props.form.setFormStatus(formId, 'browse')
updateStatus.call(this);
callback && callback.call(this);
}
}
});
}

function beforeTreeLoad () {


}

function afterTreeLoad(){

}

/**
* 处理树数据
* @param data
* @returns {*}
*/
function dealTreeData(data) {

let deleteDataChildrenProp = node => {

if (!node.children || node.children.length == 0) {
delete node.children;
}
else {
node.isLeaf = false;
node.children.forEach((e) => {
deleteDataChildrenProp(e);
});
}
};
data.forEach((e) => {
deleteDataChildrenProp(e);
});
}

function doAdd(callback){
//清空表单数据
this.props.form.EmptyAllFormValue(formId);
//设置表单为编辑态
this.props.form.setFormStatus(formId, 'edit');
//设置父pk值
let selectNode = this.props.syncTree.getSelectNode(treeId);
this.props.form.setFormItemsValue(formId, { [fatherKey]: { value: selectNode.refpk, display: selectNode.refname } });
// 回调函数，有异步ajax，考虑是否放到ajax里面
callback && callback.call(this);
}

// 保存操作
function doSave(callback){

let requestParam = {};
/**************************************************
*
* 保存：
*     1、获取表单对象
*     2、构造请求参数模型
*     3、ajax请求，后台根据表单对象主键执行保存或更新操作
*     4、回调，刷新当前树节点的父节点
*
* 保存状态下：
*      恢复到浏览态，根据当前选中的树节点决定按钮的可见性和可操作性
*
**************************************************/
let formData = this.props.form.getAllFormValue(formId);//获得表单信息

// 针对停启用，之后可以去掉
if(formData.rows[0].values.hasOwnProperty('enablestate')){
formData.rows[0].values.enablestate.value = formData.rows[0].values.enablestate.value?2:1;
}
/****
* 构造参数
* @type {string}
*/
formData.areacode = formId;//添加表单的areacode编码
formData.rows['status'] = '2';//设置状态

/***设置请求参数***/
requestParam = {
model: formData,
pageid: pageCode//pageid : 我们导出的模板的名字  也就是 json数据的最外层的code值
};

//ajax请求
this.props.validateToSave(requestParam, () => {
ajax({
url: urlArray.saveCardUrl,
data: requestParam,
success: (result) => {
if (result.success) {
toast({ content: this.state.json['CH010103-000029'], color: 'success' });/* 国际化处理： 保存成功*/
callback && callback.call(this,result.data);
}
}
});
}, { [formId]: "form" })
}

function afterSave(data, callback){

if (!data || data == null) return;

/****判断刷新父节点，还是刷新选中节点****/
/************************************
* 如果是新增，就刷新当前选中节点
* 如果是编辑，就刷新当前节点的父节点
*
************************************/
let formData = this.props.form.getAllFormValue(formId);//获得表单信息
var pk = null;
if (formData.rows[0].values.hasOwnProperty(primaryKey)) {
var pk = formData.rows[0].values[primaryKey].value;//当前表单有pk:update 刷新父节点；没有pk:save 刷新当前节点
}
/**
* 没有主键  false时就是有主键  即编辑 即刷新父节点
* true时 就是无主键 即 新增  即刷新当前节点
*/
let nonPk = !pk || pk === null || pk === '';
debugger;

if (!data.node[0].children || data.node[0].children.length == 0) {
delete data.node[0].children;
}

data.node.forEach(item => {
item.iconBox = {
addIcon: true,
editIcon: true,
delIcon: true
}
})
if (nonPk) {
//新增回调后添加
this.props.syncTree.addNodeSuccess(treeId, data.node[0]);
} else {
//修改回调后修改
this.props.syncTree.editNodeSuccess(treeId, data.node[0]);
}
//展开树节点
this.props.syncTree.openNodeByPk(treeId, data.node[0].pid);
//选中树节点
this.props.syncTree.setNodeSelected(treeId, data.node[0].refpk);
//设置表单浏览态
this.props.form.setFormStatus(formId, 'browse');
this.props.form.setAllFormValue({ [formId]: data.form[formId] });
// 回调方法，如果有异步ajax，考虑好是否放到ajax里面
callback && callback.call(this,data);
}

function doDel(selectedTreeNode){

if (!selectedTreeNode) return;

let requestParam = {
pk_depa:selectedTreeNode.refpk,
ts:selectedTreeNode.nodeData.ts
}
ajax({
url: urlArray.delTreeNodeUrl,
data: requestParam,
success: (result) => {
if (result.success) {
this.props.form.EmptyAllFormValue(formId);
//调用异步树的接口，删除该树节点
this.props.asyncTree.delTreeData(treeId, selectedTreeNode.refpk);
toast({ content: this.state.json['CH010103-000018'], color: 'success' });/* 国际化处理： 删除成功！,提示*/
updateStatus.call(this);
}
}
})
}

/**
* 取消
*/
function doCancel(){

//同步树 取消的逻辑
let selectedTreeNode = this.props.syncTree.getSelectNode(treeId);//获得选中节点
if (selectedTreeNode == null) {
this.props.form.EmptyAllFormValue(formId)
this.props.form.setFormStatus(formId, 'browse')
updateStatus.call(this);
return
}
/**********************************************************
*
* 取消：
*      1、重新根据选中的树节点查询表单对象
*      2、回调，设置表单对象
*      3、设置按钮状态
*
**********************************************************/

/**********************************************************
* modified by wangying16 on 2018/12/12 for NCCLOUD-95993
* 1.将会引起表单渲染的语句放到ajax请求内，防止请求未完毕时界面已渲染导致无数据
* 2.当选中了树节点时，修改表单项停启用状态可用，同NC保持一致。
**********************************************************/
if (selectedTreeNode && selectedTreeNode.refpk != '~') {
loadFormData.call(this,selectedTreeNode.refpk, () => {
this.props.form.setFormStatus(formId, 'browse')
updateStatus.call(this);
})
} else {
//没有选中项  清空所有数据
this.props.form.EmptyAllFormValue(formId);
this.props.form.setFormStatus(formId, 'browse');
//设置状态
updateStatus.call(this);
}
}

export function loadFormData(refpk, callback){

if (!refpk || refpk === '~') return;

let data = {
pagecode: pageCode,
[primaryKey]: refpk
};

//查询节点信息
ajax({
url: urlArray.queryCardUrl,
data,
success: (result) => {
if (result.success) {
//清空表单
this.props.form.EmptyAllFormValue(formId);
this.props.form.setAllFormValue({ [formId]: result.data[formId] });
// 模板公式
if (result.formulamsg && result.formulamsg instanceof Array && result.formulamsg.length > 0) {
this.props.dealFormulamsg(
result.formulamsg, {
[formId]: 'form'
}
)
}
callback && callback.call(this);
}
}
});
}

//
function updateStatus(){
updateButtonStatus.call(this);
updateTreeStatus.call(this);
}

//更新按钮状态
function updateButtonStatus(){

let formStatus = this.props.form.getFormStatus(formId);

let buttonVisible = {
Save: formStatus != 'browse',
SaveAdd: formStatus != 'browse',
Cancel: formStatus != 'browse',
Refresh: formStatus === 'browse',
}

let buttonDisabled = {
Save: formStatus === 'browse',
SaveAdd: formStatus === 'browse',
Cancel: formStatus === 'browse',
Refresh: formStatus != 'browse',
}

this.props.button.setButtonVisible(buttonVisible);
this.props.button.setButtonDisabled(buttonDisabled)
}

// 更新左树搜索框是否可用
function updateTreeStatus(){

let formStatus = this.props.form.getFormStatus(formId);
// 非浏览态设置左树不可用。
this.props.syncTree.setNodeDisable(treeId, formStatus != 'browse');
this.setState({
disabledSearch: formStatus != 'browse',
})
}

