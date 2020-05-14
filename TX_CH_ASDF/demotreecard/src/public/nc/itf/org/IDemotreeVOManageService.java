
package nc.itf.org;

import nc.vo.asdf.demotreecard.DemotreeVO;
import nc.vo.pub.BusinessException;


/**
* 部门分类 增删改服务接口
* @author ncc
*
*/
public interface IDemotreeVOManageService {
/**
* 新增
* @param vo
* @return
* @throws BusinessException
*/
public DemotreeVO insertVO(DemotreeVO vo) throws BusinessException;

/**
* 更新
* @param vo
* @return
* @throws BusinessException
*/
public DemotreeVO updateVO(DemotreeVO vo) throws BusinessException;

/**
* 删除职务类别
* @param vo
* @throws BusinessException
*/
public void deleteVO(DemotreeVO vo) throws BusinessException;

/**
* 启用
* @param vo
* @return
* @throws BusinessException
*/
public DemotreeVO enableVO(DemotreeVO vo) throws BusinessException;

/**
* 停用
* @param vo
* @throws BusinessException
*/
public DemotreeVO disableVO(DemotreeVO vo) throws BusinessException;
}
