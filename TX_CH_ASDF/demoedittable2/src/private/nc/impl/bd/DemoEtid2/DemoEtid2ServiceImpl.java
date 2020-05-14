package nc.impl.bd.DemoEtid2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.bs.bd.baseservice.md.BatchBaseService;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.bd.DemoEtid2.IDemoEtid2QryService;
import nc.itf.bd.DemoEtid2.IDemoEtid2Service;
import nc.itf.bd.defdoc.IDefdocConst;
import nc.itf.bd.pub.IBDMetaDataIDConstBasic;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.asdf.demoetid2.DemoEtid2;
import nc.vo.bd.meta.BatchOperateVO;
import nc.vo.pub.BusinessException;

/**
* <b>   </b>
*
* <p>
    *
    * </p>
*
* Create at 2009-12-25 上午09:31:57
*
* @author bq
* @since V6.0
*/

public class DemoEtid2ServiceImpl extends BatchBaseService<DemoEtid2> implements IDemoEtid2Service, IDemoEtid2QryService {

    private IMDPersistenceQueryService queryService=null;
    public DemoEtid2ServiceImpl() {
        super("9b8e1ce8-0c83-4613-94e9-d4b27d210b98");
    }

    @Override
    public BatchOperateVO batchSaveCurrtype(BatchOperateVO vo) throws BusinessException {
        return batchSave(vo);
    }

    @Override
    public DemoEtid2 findByPK(String key) throws BusinessException {
        DemoEtid2 demoEtid2 = null;
        try {
            Object vo = new BaseDAO().retrieveByPK(DemoEtid2.class, key);
            demoEtid2 = (vo == null ? null : (DemoEtid2) vo);
        } catch (Exception e) {
            Logger.error(e.getMessage(), e);
            throw new BusinessException(e);
        }

        return demoEtid2;
    }

    @SuppressWarnings("unchecked")
    @Override
    public DemoEtid2[] queryAll() throws BusinessException {
        Collection<DemoEtid2> col=getQueryService().queryBillOfVOByCondWithOrder(DemoEtid2.class, "1=1", true, false, new String[]{});
        return col.toArray(new DemoEtid2[0]);
    }

        @SuppressWarnings("unchecked")
        @Override
        public DemoEtid2[] query(String where) throws BusinessException {
        Collection<DemoEtid2> col=getQueryService().queryBillOfVOByCondWithOrder(DemoEtid2.class, where, true, false, new String[]{});

            return col.toArray(new DemoEtid2[0]);
            }
            private IMDPersistenceQueryService getQueryService()
            {
            if(queryService==null)
            queryService=NCLocator.getInstance().lookup(IMDPersistenceQueryService.class);
            return queryService;

            }

            @Override
            public String[] queryPKs(String where) throws BusinessException {
            String[] pks = null;
            StringBuilder querySQL = new StringBuilder("select ");
            querySQL.append(" pk_id ");
            querySQL.append(" from ");
            querySQL.append(" asdf_DemoEtid2 ");
            querySQL.append(" where ");
            querySQL.append(where);
            querySQL.append(" order by ");
            querySQL.append(" ts ");

            List<String> pkList = (ArrayList<String>) new BaseDAO().executeQuery(
                    querySQL.toString(), new ColumnListProcessor());
                    if (pkList != null && pkList.size() > 0) {
                    pks = pkList.toArray(new String[pkList.size()]);
                    }

                    return pks;
                    }
        }
