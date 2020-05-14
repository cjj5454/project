package nccloud.web.asdf.pubinfo.DemoEtid2.action;

import nc.itf.bd.DemoEtid2.IDemoEtid2Service;
import nc.vo.asdf.demoetid2.DemoEtid2;
import nc.vo.bd.meta.BatchOperateVO;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.convert.translate.Translator;
import nccloud.framework.web.ui.pattern.grid.Grid;
import nccloud.framework.web.ui.pattern.grid.GridFormulaHandler;
import nccloud.framework.web.ui.pattern.grid.GridOperator;
import nccloud.vo.utils.BatchVOTool;
import nccloud.web.action.NCCAction;
import nccloud.web.utils.GridModelConvertUtils;

/***************************************************************
* @author tangcht
* @version nccloud1.0
* @since 2018-7-10
* @see
***************************************************************/
public class DemoEtid2SaveAction extends NCCAction {

@Override
public <T> Object execute(IRequest request, T para) throws Exception {
    Grid grid = (Grid) para;
    GridModelConvertUtils gridConvUtl = new GridModelConvertUtils();
    DemoEtid2[] vos = gridConvUtl.toVOs(DemoEtid2.class, grid.getModel());
    BatchVOTool<DemoEtid2> tool = new BatchVOTool<DemoEtid2>(DemoEtid2.class);
            BatchOperateVO batchVO = tool.getBatchOperateVO(vos);
            BatchOperateVO savedBatchVO = ServiceLocator.find(IDemoEtid2Service.class).batchSaveCurrtype(batchVO);
            DemoEtid2[] saveVOs = tool.getVOsByBatchVO(savedBatchVO);
            if (saveVOs != null && saveVOs.length > 0) {
                grid = gridConvUtl.toGridOpe(DemoEtid2Consts.pagecode, saveVOs);
            // GridOperator gridOperator = new GridOperator(DemoEtid2Consts.pagecode);
            // grid = gridOperator.toGrid(saveVOs);
            }
            // 处理显示公式
            GridFormulaHandler gridFormulaHandler = new GridFormulaHandler(grid);
            gridFormulaHandler.handleLoadFormula();
            // 翻译器，将主键翻译成名称
            Translator translator = new Translator();
            translator.translate(grid);
            return grid;
            }

            @Override
            protected Class getParaClass() {
            return Grid.class;
            }


            }
