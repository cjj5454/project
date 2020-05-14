
package nc.itf.org;

import nc.vo.asdf.demotreecard.DemotreeVO;
import nc.vo.pub.BusinessException;


/**
* ���ŷ��� ��ɾ�ķ���ӿ�
* @author ncc
*
*/
public interface IDemotreeVOManageService {
/**
* ����
* @param vo
* @return
* @throws BusinessException
*/
public DemotreeVO insertVO(DemotreeVO vo) throws BusinessException;

/**
* ����
* @param vo
* @return
* @throws BusinessException
*/
public DemotreeVO updateVO(DemotreeVO vo) throws BusinessException;

/**
* ɾ��ְ�����
* @param vo
* @throws BusinessException
*/
public void deleteVO(DemotreeVO vo) throws BusinessException;

/**
* ����
* @param vo
* @return
* @throws BusinessException
*/
public DemotreeVO enableVO(DemotreeVO vo) throws BusinessException;

/**
* ͣ��
* @param vo
* @throws BusinessException
*/
public DemotreeVO disableVO(DemotreeVO vo) throws BusinessException;
}
