package nc.impl.bd.demoEtidVO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.bs.bd.baseservice.md.BatchBaseService;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.bd.demoEtidVO.IDemoEtidVOQryService;
import nc.itf.bd.demoEtidVO.IDemoEtidVOService;
import nc.itf.bd.defdoc.IDefdocConst;
import nc.itf.bd.pub.IBDMetaDataIDConstBasic;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.asdf.demoetidtable.DemoEtidVO;
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

public class DemoEtidVOServiceImpl extends BatchBaseService<DemoEtidVO> implements IDemoEtidVOService, IDemoEtidVOQryService {

    private IMDPersistenceQueryService queryService=null;
    public DemoEtidVOServiceImpl() {
        super("594cd059-db2e-4646-9aff-dc096da2dee6");
    }

    @Override
    public BatchOperateVO batchSaveCurrtype(BatchOperateVO vo) throws BusinessException {
        return batchSave(vo);
    }

    @Override
    public DemoEtidVO findByPK(String key) throws BusinessException {
        DemoEtidVO demoEtidVO = null;
        try {
            Object vo = new BaseDAO().retrieveByPK(DemoEtidVO.class, key);
            demoEtidVO = (vo == null ? null : (DemoEtidVO) vo);
        } catch (Exception e) {
            Logger.error(e.getMessage(), e);
            throw new BusinessException(e);
        }

        return demoEtidVO;
    }

    @SuppressWarnings("unchecked")
    @Override
    public DemoEtidVO[] queryAll() throws BusinessException {
        Collection<DemoEtidVO> col=getQueryService().queryBillOfVOByCondWithOrder(DemoEtidVO.class, "1=1", true, false, new String[]{});
        return col.toArray(new DemoEtidVO[0]);
    }

        @SuppressWarnings("unchecked")
        @Override
        public DemoEtidVO[] query(String where) throws BusinessException {
        Collection<DemoEtidVO> col=getQueryService().queryBillOfVOByCondWithOrder(DemoEtidVO.class, where, true, false, new String[]{});

            return col.toArray(new DemoEtidVO[0]);
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
            querySQL.append(" pk_demoetid ");
            querySQL.append(" from ");
            querySQL.append(" asdf_demoEtid ");
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
