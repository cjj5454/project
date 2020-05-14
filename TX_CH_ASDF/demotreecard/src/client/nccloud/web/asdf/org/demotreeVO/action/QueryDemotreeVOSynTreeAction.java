
package nccloud.web.asdf.org.demotreeVO.action;

import nc.itf.org.IDemotreeVOQryService;
import nc.vo.asdf.demotreecard.DemotreeVO;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nccloud.web.action.NCCAction;

/**
* ��ѯְ����Action
* @author ncc
*/
public class QueryDemotreeVOSynTreeAction extends NCCAction {

@Override
public <T> Object execute(IRequest request, T para) throws Exception {
    //���ýӿ�
    IDemotreeVOQryService qryService = ServiceLocator.find(IDemotreeVOQryService.class);
    //��ѯȫ��
    DemotreeVO[] vos = qryService.queryAllDemotreeVOs();

    if(vos == null || vos.length == 0) {
    return null;
    }

    // �˴����⴦��һ�£�ͨ���ӿڲ�ѯ������VO���У�������ݿ⵱��father_pk�ǡ�~������ôVO�о���null������ǰ�˼������ṹ����
    for (DemotreeVO vo : vos) {

    if (vo.getFather_pk() == null || "".equals(vo.getFather_pk())) {

    vo.setFather_pk("~");

    }
    }
    // ������
    DemotreeVOTreeNodeWrapper wrapper = new DemotreeVOTreeNodeWrapper(vos);
    //������ṹ���ݲ�����
    return wrapper.getTree();
    }
    }
