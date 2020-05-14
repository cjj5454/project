
package nccloud.web.asdf.org.demotreeVO.action;

import java.util.HashMap;

import nc.itf.org.IDemotreeVOManageService;
import nc.itf.org.IDemotreeVOQryService;
import nc.vo.asdf.demotreecard.DemotreeVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDateTime;
import nccloud.dto.asdf.org.demotreeVO.DemotreeVOConst;
import nccloud.dto.asdf.org.demotreeVO.DemotreeVODTO;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nccloud.web.action.NCCAction;

/**
*  ɾ��Action
* @author tangcht
*
*/
public class DelDemotreeVOAction extends NCCAction {

@Override
public <T> Object execute(IRequest request, T para) throws Exception {
    //��ò���
    DemotreeVODTO dto = (DemotreeVODTO)para;

    String pk = dto.getPk_depa();

    UFDateTime ts = dto.getTs();
    if (pk == null) {
    return false;
    }
    //���ýӿ�
    IDemotreeVOQryService qryService = ServiceLocator.find(IDemotreeVOQryService.class);

    IDemotreeVOManageService service = ServiceLocator.find(IDemotreeVOManageService.class);
    //��ѯȫ��ְ������
    DemotreeVO[] vos = qryService.queryDemotreeVOsByPKS(new String[] {pk});
    //�ж��Ƿ�ɾ��
    if(vos == null || vos.length == 0) {
    throw new BusinessException(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("nccasdf",
    "0nccasdf0200"));
    }

    DemotreeVO vo = vos[0];

    //У��ts
    if(!vo.getTs().equals(ts)) {
    throw new BusinessException(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("nccasdf",
    "0nccasdf0201"));
    }
    //ִ��ɾ��
    service.deleteVO(vos[0]);

    return true;
    }
    @Override
    protected Class getParaClass() {

    return DemotreeVODTO.class;

    }

    }