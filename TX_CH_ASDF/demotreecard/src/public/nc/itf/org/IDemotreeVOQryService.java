
package nc.itf.org;

import nc.vo.asdf.demotreecard.DemotreeVO;
import nc.vo.pub.BusinessException;

/**
* 部门分类 查询服务接口
* @author ncc
*
*/
public interface IDemotreeVOQryService {

    /**
    * 查询满足条件的VO数组
    * @param sqlwhere
    * @return
    * @throws BusinessException
    */
    public DemotreeVO[] queryDemotreeVOSByClause(String sqlwhere) throws BusinessException;

    /**
    * 根据主键数组查询获取VO数组
    * @param ids
    * @return
    * @throws BusinessException
    */
    public  DemotreeVO[] queryDemotreeVOsByPKS(String[] ids)    throws BusinessException;

    /**
    * 查询全部
    *
    * @return
    * @throws BusinessException
    */
    public  DemotreeVO[] queryAllDemotreeVOs() throws BusinessException;

    /**
    * 查询某集团下所有
    * @param pk_group
    * @return
    * @throws BusinessException
    */
    public DemotreeVO[] queryAllDemotreeVOSByGroupID(String pk_group) throws BusinessException;

    /**
    * 查询某集团下满足查询条件的所有
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
    * 是否有子类别
    * @param id
    * @return
    * @throws BusinessException
    */
    public boolean hasSubDemotreeVO(String id) throws BusinessException;

}
