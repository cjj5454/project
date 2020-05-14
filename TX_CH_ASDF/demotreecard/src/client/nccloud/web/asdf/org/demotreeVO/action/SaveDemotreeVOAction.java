
package nccloud.web.asdf.org.demotreeVO.action;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

import nc.itf.org.IDemotreeVOManageService;
import nc.itf.org.IDemotreeVOQryService;
import nc.vo.asdf.demotreecard.DemotreeVO;
import nc.vo.pub.BusinessException;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.container.SessionContext;
import nccloud.framework.web.convert.pattern.FormConvertor;
import nccloud.framework.web.convert.translate.Translator;
import nccloud.framework.web.ui.pattern.form.Form;
import nccloud.framework.web.ui.pattern.form.FormOperator;
import nccloud.web.action.NCCAction;
import nc.md.persist.framework.MDPersistenceService;
/**
* 保存Action
* @author ncc
*
*/
public class SaveDemotreeVOAction extends NCCAction {

@Override
public <T> Object execute(IRequest request, T para) throws Exception {
    //获得form对象
    Form form = (Form) para;

    FormConvertor ope = new FormConvertor();
    //转成vo
    DemotreeVO vo = ope.fromForm(DemotreeVO.class, form);

    DemotreeVO result = null;
    //获得主键
    String pk = vo.getPk_depa();
    // 不是必填，但是要有，以后如果分为全局集团的时候，这个字段没有就区分不开了
    // vo.setPk_group(SessionContext.getInstance().getClientInfo().getPk_group());

    //调用接口
    IDemotreeVOQryService qryService = ServiceLocator.find(IDemotreeVOQryService.class);
    IDemotreeVOManageService service = ServiceLocator.find(IDemotreeVOManageService.class);




    if (pk == null || "".equals(pk)) {
    String whereCondition = "code = '" + vo.getCode() + "'" + " and father_pk = '" +vo.getFather_pk() +"'";
    Collection<DemotreeVO> voCollection = MDPersistenceService.lookupPersistenceQueryService()
    .queryBillOfVOByCond(DemotreeVO.class, whereCondition, false);
    if(!voCollection.isEmpty()) {
    String msg = "树节点编码重复";
    throw new BusinessException(msg);
    }
    if("~".equals(vo.getFather_pk())) {vo.setFather_pk(null);}

    result = service.insertVO(vo);
    }else {

    String findByPk = " pk_depa = '" + pk + "'";
    Collection<DemotreeVO> pkVO = MDPersistenceService.lookupPersistenceQueryService()
    .queryBillOfVOByCond(DemotreeVO.class, findByPk, false);
    if (!pkVO.isEmpty()) {
    List<DemotreeVO> listVo = new ArrayList<>(pkVO);
    if (!listVo.get(0).getCode().equals(vo.getCode())) {
    String whereCondition = "";
    if (null == vo.getFather_pk()) {
    whereCondition = "code = '" + vo.getCode() + "'" + " and father_pk = '~'";
    } else {
    whereCondition = "code = '" + vo.getCode() + "'" + " and father_pk = '"+ vo.getFather_pk()+"'";
    }
    Collection<DemotreeVO> voCollection = MDPersistenceService.lookupPersistenceQueryService()
    .queryBillOfVOByCond(DemotreeVO.class, whereCondition, false);
    if (!voCollection.isEmpty()) {
    String msg = "树节点编码重复";
    throw new BusinessException(msg);
    }
    }
    } else {
    String msg = "主键值为空";
    throw new BusinessException(msg);
    }


    DemotreeVO[] oldvos = qryService.queryDemotreeVOsByPKS(new String[] {pk});
    //判断是否被删除
    if(oldvos == null || oldvos.length == 0) {
    throw new BusinessException(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("nccasdf",
    "0nccasdf0200"));//您操作的数据已被他人修改或删除，请刷新页面！
    }

    DemotreeVO oldvo = oldvos[0];

    //校验ts
    if(!oldvo.getTs().equals(vo.getTs())) {
    throw new BusinessException(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("nccasdf",
    "0nccasdf0201"));//您操作的数据已被他人修改，请刷新界面！
    }

    result = service.updateVO(vo);
    }

    // 特殊修正，对于第一次插入并且没有父节点的节点（即根节点）
    if (result.getFather_pk() == null || "".equals(result.getFather_pk())) {
    result.setFather_pk("~");
    }
    DemotreeVOTreeNodeWrapper wrapper = new DemotreeVOTreeNodeWrapper(new DemotreeVO[] { result });
    FormOperator convertor = new FormOperator("CH010103_demotreeVO");
    Form retForm = convertor.toForm(result);
    Translator translator = new Translator();
    translator.translate(retForm);
    Map<String,Object> res = new HashMap<String,Object>();
    res.put("node",wrapper.getTree());
    res.put("form",retForm);
    return res;
    }

    @Override
    protected Class getParaClass() {

    return Form.class;

    }


    }
