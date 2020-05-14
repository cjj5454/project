import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import { createPage, base } from 'nc-lightapp-front';
import * as actions from '../action/action';
import * as events from '../event/event';
const { NCDiv } = base;

var treeId = 'demotreeVOTree';//树组件Id
var formId = 'demotreeVO';//卡片组件Id
var pageCode = "CH010103_demotreeVO"; // 小应用页面编码
var multiInit = 'CH010103'; //多语资源编码
var domainName = 'asdf';  // 模块编码

/**
* 职务类别-全局
*/
class comp extends Component {
constructor(props) {
super(props)
this.state = {
disabledSearch: false,
json: {}
}
//自定义根节点
this.root = {
"isleaf": false,
"key": "root",
"title": this.state.json['CH010103-000000'],/* 国际化处理： 职务类别*/
"id": "root",
"innercode": "root",
"pid": "",
"refname": this.state.json['CH010103-000000'],/* 国际化处理： 职务类别*/
"refpk": "~"
};
actions['afterInit'](this);
}

/**
* react 生命周期函数 组件渲染完后触发事件
*/
componentDidMount() {
// 保存json和inlt到页面state中并刷新页面
let callback = (json, status, inlt) => {
if (status) {
this.setState({ json, inlt }, () => {
this.initTemplate(this.props, () => {
actions['loadTreeData'].bind(this)()
})
})
}
}
this.props.MultiInit.getMultiLang({ moduleId: multiInit, domainName, callback })
}

/**
    * react 生命周期函数 组件渲染完后触发事件
    */
    componentWillMount() {
        // 保存json和inlt到页面state中并刷新页面
        let callback = (json, status, inlt) => {
            this.setState({ json:json, inlt:inlt }, () => {
                this.root.refname = this.root.title = this.state.json['CH010103-000000'];
                this.initTemplate(this.props, () => {
                    actions['loadTreeData'].bind(this)()
                })
            })
        }
        this.props.MultiInit.getMultiLang({ moduleId: multiInit, domainName, callback })
    }

/**
* 初始化：模板和按钮
*/
initTemplate = (props, callback) => {
props.createUIDom(
{
pagecode: pageCode//页面id
},
data => {
if (data) {
if (data.template) {
let meta = data.template;
this.modifierMeta(props, meta)
props.meta.setMeta(meta);
}
if (data.button) {
props.button.setButtons(data.button,()=>{
this.updateButtonStatus('browse');
});
}
callback && callback();
}
}
)
}


updateButtonStatus = (status)=>{
this.props.button.setButtonsVisible({
Save:status != 'browse',
SaveAdd:status == 'add',
Cancel:status != 'browse',
Print:false,//根据业务需要放出
Output:false,
Refresh:status == 'browse'
})
}
/**
* 调整模板属性
*/
modifierMeta(props, meta) {
return meta;
}

buttonClick(props, id) {
switch (id) {
case 'Save':
actions['onSaveButtonClick'].call(this)
break
case 'SaveAdd':
actions['onSaveAddButtonClick'].call(this)
break
case 'Cancel':
actions['onCancelButtonClick'].call(this)
break
case 'Refresh':
actions['onRefreshButtonClick'].call(this)
break
}
}

/**
* 渲染
* @returns {*}
*/
render() {
const { syncTree, form, button, DragWidthCom,BillHeadInfo} = this.props;
const {createBillHeadInfo} = BillHeadInfo; //新加 返回图标和按钮
//DragWidthCom 平台出的左右布局的组件  专用于树卡和树表
const { createSyncTree } = syncTree;//创建同步树 需要引入这个
const { createForm } = form;//创建表单，需要引入这个
const { createButtonApp } = button;
return (
<div className="nc-bill-tree-card">
    {/* 头部 header*/}
    <NCDiv areaCode={NCDiv.config.HEADER} className="header">
        {/* 标题 title*/}
        <div className="title" >
            {createBillHeadInfo({
            title: this.state.json['CH010103-000023']/* 国际化处理： 职务类别-全局*/,
            showBackBtn: false,
            initShowBackBtn: false
            }
            )}
        </div>
        {/* 按钮组 btn-group*/}
        <div className=" btn-group">
            {createButtonApp({
            area: 'header-action',
            buttonLimit: 3,
            onButtonClick: this.buttonClick.bind(this),
            })}

        </div>
    </NCDiv>
    {/* 树卡区域 */}
    <div className="tree-card">
        <DragWidthCom
        // 左树区域
        leftDom={
        <div className="tree-area">
            {createSyncTree({
            treeId: treeId,
            needEdit: true, //不启用编辑
            showLine: false, //显示连线
            needSearch: true, //是否需要搜索框
            //onSelectedChange: this.onSelectTreeNodeChange.bind(this),//选择改变
            onSelectEve: events['onSelectTree'].bind(this),//选择
            onMouseEnterEve: events['onMouseEnterEve'].bind(this),
            clickEditIconEve: actions['onEditTreeNode'].bind(this), //编辑点击 回调
            clickAddIconEve: actions['onAddTreeNode'].bind(this), //新增点击 回调
            clickDelIconEve: actions['onDeleteTreeNode'].bind(this), // 删除点击 回调
            showModal: false,
            disabledSearch: this.state.disabledSearch || false
            })}
        </div>}     //左侧区域dom
        // 右卡片区域
        rightDom={
        <div className="card-area">
            {createForm(formId, {
            cancelPSwitch: true,
            onAfterEvent: events['onAfterFormEvent'].bind(this),
            onBeforeEvent: events['onBeforeFormEvent'].bind(this)
            })
            }
        </div>}     //右侧区域dom
        defLeftWid='280px'      // 默认左侧区域宽度，px/百分百
        />
    </div>
</div>
)
}
}

let TreeForm = createPage({
billinfo: {
billtype: 'form',
pagecode: pageCode,
bodycode: formId
},
})(comp)

ReactDOM.render(<TreeForm />, document.querySelector('#app'))
