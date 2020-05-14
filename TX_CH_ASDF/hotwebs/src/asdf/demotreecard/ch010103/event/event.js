import {loadFormData} from '../action/action';

var treeId = 'demotreeVOTree';//树组件Id
var formId = 'demotreeVO';//卡片组件Id
/**
* 点击树节点
* @param refpk
*/
export function onSelectTree(refpk) {

if (!refpk || refpk === null) return;

//编辑态  树节点操作无效  应该提供一个接口，编辑态任何操作都不能动
if (this.props.form.getFormStatus(formId) === 'edit') return;

if (refpk === '~') {
//清空表单
this.props.form.EmptyAllFormValue(formId);
return;
}

loadFormData.bind(this)(refpk);
}

/**
* 鼠标进入树节点事件
* @param key
*/
export function onMouseEnterEve(key) {
//设置
if (key === this.root.refpk) {
let obj = {
delIcon: false, //false:隐藏； true:显示; 默认都为true显示
editIcon: false,
addIcon: true
};
this.props.syncTree.hideIcon(treeId, key, obj);
}
}

/**
* 表单编辑后事件
* @param props
* @param moduleId
* @param key
* @param value
* @param index
*/
export function onAfterFormEvent(props, moduleId, key, value, index) {
}

/**
* 表单编辑前事件
* @param {*} props
* @param {*} moduleId
* @param {*} key
* @param {*} value
* @param {*} data
*/
export function onBeforeFormEvent(props, moduleId, key, value, data) {
return true;
}
