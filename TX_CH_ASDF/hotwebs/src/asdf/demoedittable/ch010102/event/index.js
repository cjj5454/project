//表格编辑后事件
export function onTableAfterEdit(props, moduleId, key, value, changedrows, index, record) {
    // props, moduleId, key, value（当前值）, changedrows（新旧值集合）, record（行数据）, index（当前index）){
alert('编辑后事件');

}
//表格编辑前事件
export function onTablebeforeEdit() {
    //props,moduleId(区域id),key(操作的键),value(当前值),data(当前表单所有值)
   // alert('编辑前事件');
//    return false;
   return true;
}

/**
* 模态框取消按钮事件
* @param {*} props
*/
export function onCloseTableModel(props) {
}