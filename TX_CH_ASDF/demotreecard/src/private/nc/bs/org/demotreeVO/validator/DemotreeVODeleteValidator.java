
package nc.bs.org.demotreeVO.validator;

import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.ml.NCLangResOnserver;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.itf.org.IDemotreeVOQryService;
import nc.itf.uap.bd.refcheck.IReferenceCheck;
import nc.vo.asdf.demotreecard.DemotreeVO;
import nc.vo.pub.BusinessException;

/**
* ���ŷ��� ɾ��У��
* @author ncc
*
*/
public class DemotreeVODeleteValidator implements Validator {

    public DemotreeVODeleteValidator() {
        super();
    }

    @Override
    public ValidationFailure validate(Object obj) {
        if (!(obj instanceof DemotreeVO)) {
            throw new IllegalArgumentException(NCLangResOnserver.getInstance().getStrByID("nccasdf", "0nccasdf0204")/*��У�����ݲ��ǲ��ŷ�������.*/);
        }

        DemotreeVO demotreeVO = (DemotreeVO) obj;
        ValidationFailure vf = null;
        StringBuffer failureMessage = new StringBuffer();
        try {
            if (getDemotreeVOQryService().hasSubDemotreeVO(demotreeVO.getPrimaryKey())) {
                failureMessage.append(NCLangResOnserver.getInstance().getStrByID("nccasdf", "0nccasdf0205")/*������ŷ��ຬ�������*/);
            }
            if (getDemotreeVOQryService().hasJob(demotreeVO.getPrimaryKey())) {
            failureMessage.append(NCLangResOnserver.getInstance().getStrByID("nccasdf", "0nccasdf0206")/*������ŷ��ຬ��ְ��*/);
            }
        //����ע�����ù�ϵ�� �� Ԫ��������     �ж� ְ������Ƿ�����
        //if (getReferenceCheckService().isReferenced(demotreeVO.getTableName(), (demotreeVO.getPrimaryKey(), new String[]{"om_jobgrade","om_job","om_jobtype"})) {
            //failureMessage.append(NCLangResOnserver.getInstance().getStrByID("nccasdf", "0nccasdf0207")/*������ŷ����Ѿ��� ҵ������ã�*/);
        //}
        } catch (BusinessException e) {
            Logger.error(e.getMessage(), e);
            failureMessage.append(e.getMessage());
        }

        String message = failureMessage.toString();
        if (message != null && !message.trim().equals("")) {
            vf = new ValidationFailure();
            vf.setMessage(NCLangResOnserver.getInstance().getStrByID("nccasdf", "0nccasdf0208", null, new String[]{message})/*{0}����ɾ����*/);
            return vf;
        }

        return null;
}

    private IDemotreeVOQryService getDemotreeVOQryService() {
        return NCLocator.getInstance().lookup(IDemotreeVOQryService.class);
    }

    private IReferenceCheck getReferenceCheckService() {
        return NCLocator.getInstance().lookup(IReferenceCheck.class);
    }

}
