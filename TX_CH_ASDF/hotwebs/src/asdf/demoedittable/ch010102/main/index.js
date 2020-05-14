import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import { createPage, base, high } from 'nc-lightapp-front';
import * as actions from '../action/index';
import * as events from '../event/index';
const { NCDiv } = base;
const { PrintOutput } = high;

import './index.less';

const gridid = 'head';
const searchid = 'search';
const pageId = 'CH010102_czncc';
const appcode = 'CH010102';
const printNodeKey = null;
const urls = {
    queryUrl: '/nccloud/asdf/demoEtidVO/DemoEtidVOQuery.do',
    pageQueryUrl: '/nccloud/asdf/demoEtidVO/DemoEtidVOQueryPageGridByPks.do',
    saveUrl: '/nccloud/asdf/demoEtidVO/DemoEtidVOSave.do',
    printUrl: '/nccloud/asdf/demoEtidVO/DemoEtidVOPrint.do'
}

class DemoEtidVOTable extends Component {

    constructor(props) {
        super(props);
        this.state = {
            OID: '',
            searchValue: '',
            checkValue: 'false',
            json: {}
        }

        let callback = (json, status, inlt) => {
            if (status) {
                this.setState({ json, inlt }, () => {
                    actions['initTemplate'].call(this, this.props, actions['onloaddata'].bind(this));
                });
            }
        }
        this.props.MultiInit.getMultiLang({ moduleId: 'CH010102', domainName: 'asdf', callback })
    }

    componentDidUpdate() {
        let l_formstatus = this.props.editTable.getStatus(gridid);
        if (l_formstatus != 'add' && l_formstatus != "edit") {
            window.onbeforeunload = null;
        }
        else {
            window.onbeforeunload = () => {//编辑态关闭页签或浏览器的提示
                return '';
            };
        }
    }


    render() {
        const { editTable, button, search, BillHeadInfo } = this.props;
        const { createBillHeadInfo } = BillHeadInfo;
        const { createButtonApp } = button;
        const { NCCreateSearch } = search;
        const { createEditTable } = editTable;
        const tableState = this.props.editTable.getStatus(gridid);

        return (
            <div className="nc-single-table">
                {/* 头部 header */}
                <NCDiv className="nc-singleTable-header-area" style={tableState == 'browse' ? {} : { border: 'none' }} areaCode={NCDiv.config.HEADER}>
                    {/* 标题 title */}
                    <div className="header-title-search-area">
                        {createBillHeadInfo(
                            {
                                title: this.state.json['CH010102-000018']/* 国际化处理： 国家地区*/,
                                backBtnClick: () => { },
                                initShowBackBtn: false
                            }
                        )}
                    </div>
                    {/* 按钮区  btn-group */}
                    <div className="header-button-area header-button-area-print-btn">
                        {createButtonApp({
                            area: 'header',//按钮注册中的按钮区域
                            onButtonClick: actions['onClickButton'].bind(this)
                        })}
                    </div>
                </NCDiv>

                <div className="nc-singleTable-search-area" style={{ display: tableState == 'browse' ? '' : 'none' }}>
                    {NCCreateSearch(searchid, {//查询区
                        clickSearchBtn: actions['onClickSearchBtn'].bind(this)
                    })}
                </div>
                {/* 列表区 */}
                <div className="nc-singleTable-table-area">
                    {createEditTable(gridid, {
                        handlePageInfoChange: actions['onClickPageInfo'].bind(this),
                        onCloseModel: events['onCloseTableModel'].bind(this),
                        onBeforeEvent: events['onTablebeforeEdit'].bind(this),
                        onAfterEvent: events['onTableAfterEdit'].bind(this),
                        statusChange: actions['gridStatusChange'].bind(this),
                        selectedChange: actions['gridBeChecked'].bind(this),
                        onSelected: actions['onSelected'].bind(this),
                        onSelectedAll: actions['onSelected'].bind(this),
                        showCheck: true,
                        showIndex: true,
                        isAddRow: true,
                        showPagination: true,
                        adaptionHeight: true
                    })}
                </div>
                <PrintOutput
                    ref='printOutput'
                    url={urls['printUrl']}
                    data={{
                        funcode: appcode,//功能节点编码
                        nodekey: printNodeKey,//模板节点编码
                        oids: this.state.ids,
                        outputType: 'output'
                    }}
                />
            </div>
        )
    }
}

DemoEtidVOTable = createPage({
    billinfo: [{
        billtype: 'grid',
        pagecode: pageId,
        bodycode: gridid
    }],
    mutiLangCode: appcode
})(DemoEtidVOTable);

ReactDOM.render(<DemoEtidVOTable />, document.querySelector('#app'));
