package nc.itf.bd.demoEtidVO;

import nc.vo.asdf.demoetidtable.DemoEtidVO;
import nc.vo.pub.BusinessException;

/**
* <b> </b>
*
* <p>
    *
    * </p>
*
* Create at 2009-12-25 上午09:32:55
*
* @author bq
* @since V6.0
*/

public interface IDemoEtidVOQryService {

    public DemoEtidVO[] queryAll() throws BusinessException;

    public DemoEtidVO[] query(String where) throws BusinessException;

    public String[] queryPKs(String where) throws BusinessException;

    public DemoEtidVO findByPK(String key) throws BusinessException;
}
