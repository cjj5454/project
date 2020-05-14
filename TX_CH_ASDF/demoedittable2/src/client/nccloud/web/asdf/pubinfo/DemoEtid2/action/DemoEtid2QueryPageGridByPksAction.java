package nccloud.web.asdf.pubinfo.DemoEtid2.action;

import java.util.ArrayList;
import java.util.Map;

import nc.impl.pubapp.pattern.database.IDQueryBuilder;
import nc.itf.bd.DemoEtid2.IDemoEtid2QryService;
import nc.vo.asdf.demoetid2.DemoEtid2;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.ui.pattern.grid.Grid;
import nccloud.framework.web.ui.pattern.grid.GridOperator;
import nccloud.web.action.NCCAction;

/***************************************************************
* 鍥藉鍦板尯鍒嗛〉鏌ヨ
* @author tangcht
* @version nccloud1.0
* @since 2018-9-30
* @see
***************************************************************/
public class DemoEtid2QueryPageGridByPksAction extends NCCAction {

@Override
public <T> Object execute(IRequest request, T para) throws Exception {
    Grid grid = null;
    Map<String, Object> paras = (Map<String, Object>) para;
    String[] pks = (String[]) ((ArrayList) paras.get("pks")).toArray(new String[0]);
    IDQueryBuilder sqlbuilder = new IDQueryBuilder();
    String wherePart = sqlbuilder.buildSQL("pk_id", pks);
    IDemoEtid2QryService qryService = ServiceLocator.find(IDemoEtid2QryService.class);
    DemoEtid2[] vos = qryService.query(wherePart);
    GridOperator opr = new GridOperator(DemoEtid2Consts.pagecode);
    grid = opr.toGrid(vos);
    return grid;
    }

    }
