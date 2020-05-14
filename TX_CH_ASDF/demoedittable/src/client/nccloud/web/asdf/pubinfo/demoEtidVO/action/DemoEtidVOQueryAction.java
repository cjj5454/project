package nccloud.web.asdf.pubinfo.demoEtidVO.action;

import java.util.ArrayList;
import java.util.List;

import nc.impl.pubapp.pattern.database.IDQueryBuilder;
import nc.itf.bd.demoEtidVO.IDemoEtidVOQryService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.asdf.demoetidtable.DemoEtidVO;
import nccloud.dto.baseapp.querytree.dataformat.QueryTreeFormatVO;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.convert.translate.Translator;
import nccloud.framework.web.ui.model.PageInfo;
import nccloud.framework.web.ui.pattern.grid.Grid;
import nccloud.framework.web.ui.pattern.grid.GridOperator;
import nccloud.pubitf.platform.query.INCCloudQueryService;
import nccloud.web.action.NCCAction;

/***************************************************************
* @author tangcht
* @version nccloud1.0
* @since 2019-1-7
* @see
***************************************************************/
public class DemoEtidVOQueryAction extends NCCAction {

@Override
public <T> Object execute(IRequest request, T para) throws Exception {
    QueryTreeFormatVO info = (QueryTreeFormatVO) para;
    Grid grid = null;
    // 1、根据传入的参数构建scheme
    INCCloudQueryService qservice = ServiceLocator.find(INCCloudQueryService.class);
    IQueryScheme scheme = qservice.convertCondition(info);
    // 调用接口查询数据
    IDemoEtidVOQryService service = ServiceLocator.find(IDemoEtidVOQryService.class);
    String wherepart = scheme.getWhereSQLOnly();
    wherepart = wherepart == null ? "1=1" : wherepart;
    String[] ids = service.queryPKs(wherepart);
    if(ids == null || ids.length <= 0) {
    return grid;
    }
    int pageSize = Integer.parseInt(info.getPageInfo().getPageSize());
    int pageIndex = Integer.parseInt(info.getPageInfo().getPageIndex());
    PageInfo pageInfo = new PageInfo();
    pageInfo.setTotal(ids.length);
    pageInfo.setPageSize(pageSize);
    pageInfo.setTotalPage(this.getTotalPage(pageInfo, ids.length));
    setPageIndex(pageInfo,pageIndex);
    String[] PageIds = this.getCurrPageIds(ids, pageInfo);

    IDQueryBuilder sqlbuilder = new IDQueryBuilder();
    String wherePart = sqlbuilder.buildSQL("pk_demoetid", PageIds);
    IDemoEtidVOQryService qryService = ServiceLocator.find(IDemoEtidVOQryService.class);
    DemoEtidVO[] vos = qryService.query(wherePart);

    if(vos != null && vos.length > 0){

    GridOperator gridOperator = new GridOperator(DemoEtidVOConsts.pagecode);
    grid = gridOperator.toGrid(vos);

    // 翻译器，将主键翻译成名称
    Translator translator = new Translator();
    translator.translate(grid);

    grid.getModel().setPageinfo(pageInfo);
    grid.getModel().setAllpks(ids);
    }
    return grid;
    }

    @Override
    protected Class getParaClass() {
    return QueryTreeFormatVO.class;
    }

    private String[] getCurrPageIds(String[] ids,PageInfo page){
    List<String> list = new ArrayList<String>();
            int end = Math.min((page.getPageIndex()+1)*page.getPageSize(), page.getTotal());
            int start = ((page.getPageIndex()<0?0:page.getPageIndex()))*page.getPageSize()+1;
            int sum = end - start + 1;
            for(int i=0;i<sum;i++){
            list.add(ids[start-1]);
            start++;
            }

            return list.toArray(new String[0]);
            }

            private void setPageIndex(PageInfo page,int pageIndex){
            if(pageIndex<0)pageIndex =0;
            if((pageIndex+1)*page.getPageSize() < page.getTotal()){
            page.setPageIndex(pageIndex);
            }else{
            page.setPageIndex(page.getTotalPage()-1);
            }
            }

            private int getTotalPage(PageInfo pageInfo, int len) {

            int size = pageInfo.getPageSize();
            int total = 0;
            if (len % size == 0) {
            total = len / size;
            } else {
            total = len / size + 1;
            }
            return total;
            }

            }
