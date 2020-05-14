package nc.itf.bd.demoEtidVO;

import nc.vo.bd.meta.BatchOperateVO;
import nc.vo.pub.BusinessException;

/**
* <b>   </b>
*
* <p>
    *
    * </p>
*
* Create at 2009-12-25 上午09:29:16
*
* @author bq
* @since V6.0
*/

public interface IDemoEtidVOService {

    /**
    * 批量保存VO
    *
    * @param vo 批量VO
    * @return
    * @throws BusinessException
    */
    BatchOperateVO batchSaveCurrtype(BatchOperateVO vo) throws BusinessException;

}
