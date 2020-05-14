
package nc.itf.org;

import nc.vo.asdf.demotreecard.DemotreeVO;
import nc.vo.pub.BusinessException;

/**
* ���ŷ��� ��ѯ����ӿ�
* @author ncc
*
*/
public interface IDemotreeVOQryService {

    /**
    * ��ѯ����������VO����
    * @param sqlwhere
    * @return
    * @throws BusinessException
    */
    public DemotreeVO[] queryDemotreeVOSByClause(String sqlwhere) throws BusinessException;

    /**
    * �������������ѯ��ȡVO����
    * @param ids
    * @return
    * @throws BusinessException
    */
    public  DemotreeVO[] queryDemotreeVOsByPKS(String[] ids)    throws BusinessException;

    /**
    * ��ѯȫ��
    *
    * @return
    * @throws BusinessException
    */
    public  DemotreeVO[] queryAllDemotreeVOs() throws BusinessException;

    /**
    * ��ѯĳ����������
    * @param pk_group
    * @return
    * @throws BusinessException
    */
    public DemotreeVO[] queryAllDemotreeVOSByGroupID(String pk_group) throws BusinessException;

    /**
    * ��ѯĳ�����������ѯ����������
    * @param pk_group
    * @param sqlwhere
    * @return
    * @throws BusinessException
    */
    public DemotreeVO[] queryAllDemotreeVOSByGroupIDAndClause(String pk_group, String sqlwhere) throws BusinessException;

    /**
    * @param id
    * @return
    * @throws BusinessException
    */
    public boolean hasJob(String id) throws BusinessException;

    /**
    * �Ƿ��������
    * @param id
    * @return
    * @throws BusinessException
    */
    public boolean hasSubDemotreeVO(String id) throws BusinessException;

}
