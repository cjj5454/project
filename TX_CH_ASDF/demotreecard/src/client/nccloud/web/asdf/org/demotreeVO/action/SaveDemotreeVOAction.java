
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
* ����Action
* @author ncc
*
*/
public class SaveDemotreeVOAction extends NCCAction {

@Override
public <T> Object execute(IRequest request, T para) throws Exception {
    //���form����
    Form form = (Form) para;

    FormConvertor ope = new FormConvertor();
    //ת��vo
    DemotreeVO vo = ope.fromForm(DemotreeVO.class, form);

    DemotreeVO result = null;
    //�������
    String pk = vo.getPk_depa();
    // ���Ǳ������Ҫ�У��Ժ������Ϊȫ�ּ��ŵ�ʱ������ֶ�û�о����ֲ�����
    // vo.setPk_group(SessionContext.getInstance().getClientInfo().getPk_group());

    //���ýӿ�
    IDemotreeVOQryService qryService = ServiceLocator.find(IDemotreeVOQryService.class);
    IDemotreeVOManageService service = ServiceLocator.find(IDemotreeVOManageService.class);




    if (pk == null || "".equals(pk)) {
    String whereCondition = "code = '" + vo.getCode() + "'" + " and father_pk = '" +vo.getFather_pk() +"'";
    Collection<DemotreeVO> voCollection = MDPersistenceService.lookupPersistenceQueryService()
    .queryBillOfVOByCond(DemotreeVO.class, whereCondition, false);
    if(!voCollection.isEmpty()) {
    String msg = "���ڵ�����ظ�";
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
    String msg = "���ڵ�����ظ�";
    throw new BusinessException(msg);
    }
    }
    } else {
    String msg = "����ֵΪ��";
    throw new BusinessException(msg);
    }


    DemotreeVO[] oldvos = qryService.queryDemotreeVOsByPKS(new String[] {pk});
    //�ж��Ƿ�ɾ��
    if(oldvos == null || oldvos.length == 0) {
    throw new BusinessException(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("nccasdf",
    "0nccasdf0200"));//�������������ѱ������޸Ļ�ɾ������ˢ��ҳ�棡
    }

    DemotreeVO oldvo = oldvos[0];

    //У��ts
    if(!oldvo.getTs().equals(vo.getTs())) {
    throw new BusinessException(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("nccasdf",
    "0nccasdf0201"));//�������������ѱ������޸ģ���ˢ�½��棡
    }

    result = service.updateVO(vo);
    }

    // �������������ڵ�һ�β��벢��û�и��ڵ�Ľڵ㣨�����ڵ㣩
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
