package nc.itf.bd.DemoEtid2;
//123
//444
//6666
import nc.vo.asdf.demoetid2.DemoEtid2;
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

public interface IDemoEtid2QryService {

    public DemoEtid2[] queryAll() throws BusinessException;

    public DemoEtid2[] query(String where) throws BusinessException;

    public String[] queryPKs(String where) throws BusinessException;

    public DemoEtid2 findByPK(String key) throws BusinessException;
}
