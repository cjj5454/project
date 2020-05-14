
package nc.impl.org;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import nc.bs.dao.BaseDAO;
import nc.itf.org.IDemotreeVOQryService;
import nc.jdbc.framework.SQLParameter;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.asdf.demotreecard.DemotreeVO;
import nc.vo.pub.BusinessException;
import nc.vo.trade.sqlutil.IInSqlBatchCallBack;
import nc.vo.trade.sqlutil.InSqlBatchCaller;

/**
 * 部门分类 查询服务实现
 *
 * @author ncc
 *
 */
public class DemotreeVOQryServiceImpl implements IDemotreeVOQryService {

    @SuppressWarnings("unchecked")
    @Override
    public DemotreeVO[] queryDemotreeVOSByClause(String sqlwhere) throws BusinessException {
        Collection<DemotreeVO> c = (Collection<DemotreeVO>) getMDQueryService().queryBillOfVOByCondWithOrder(DemotreeVO.class, sqlwhere, true, true, new String[] {"ts"});
        if (c != null && c.size() > 0) {
            return c.toArray(new DemotreeVO[0]);
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public DemotreeVO[] queryAllDemotreeVOs() throws BusinessException {
        Collection<DemotreeVO> c = (Collection<DemotreeVO>) getMDQueryService().queryBillOfVOByCond(DemotreeVO.class, "", false);
        if (c == null || c.isEmpty())
            return null;
        else {
            DemotreeVO[] vos = c.toArray(new DemotreeVO[0]);
            return vos;
        }
    }

    @SuppressWarnings("unchecked")
    public DemotreeVO[] queryDemotreeVOsByPKS(String[] ids)
            throws BusinessException {
        if (ids == null || ids.length == 0)
            return null;

        InSqlBatchCaller call = new InSqlBatchCaller(ids);
        Collection<DemotreeVO> c = new ArrayList<DemotreeVO>();

        try {
            c = (Collection<DemotreeVO>) call.execute(new IInSqlBatchCallBack() {

                Collection<DemotreeVO> results = new ArrayList<DemotreeVO>();

                @SuppressWarnings("unchecked")
                public Object doWithInSql(String inSql)
                        throws BusinessException, SQLException {
                    String condition = "pk_depa"+" in " + inSql;
                    Collection<DemotreeVO> each_result = (Collection<DemotreeVO>) getMDQueryService().queryBillOfVOByCond(DemotreeVO.class, condition, false);
                    results.addAll(each_result);
                    return results;
                }
            });
        } catch (SQLException e) {
            throw new BusinessException(e);
        }

        if (c != null && c.size() > 0)
            return c.toArray(new DemotreeVO[c.size()]);
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public DemotreeVO[] queryAllDemotreeVOSByGroupID(String pk_group)
            throws BusinessException {
        if (pk_group == null || "".equals(pk_group))
            return null;
        String condition = "pk_group"+" = '" + pk_group + "'";
        Collection<DemotreeVO> c = (Collection<DemotreeVO>) getMDQueryService().queryBillOfVOByCond(DemotreeVO.class, condition, false);

        if (c != null && c.size() > 0)
            return c.toArray(new DemotreeVO[c.size()]);
        return null;
    }

    @SuppressWarnings("unchecked")
    public DemotreeVO[] queryAllDemotreeVOSByGroupIDAndClause(String pk_group,
                                                            String sqlwhere) throws BusinessException {
        if (pk_group == null || "".equals(pk_group))
            return null;
        String condition = "pk_group" + " = '" + pk_group + "'";
        if (sqlwhere !=null && !"".equals(sqlwhere)) {
            condition += " and " + sqlwhere;
        }
        Collection<DemotreeVO> c = (Collection<DemotreeVO>) getMDQueryService().queryBillOfVOByCond(DemotreeVO.class, condition, false);

        if (c != null && c.size() > 0)
            return c.toArray(new DemotreeVO[c.size()]);
        return null;
    }

    public boolean hasJob(String id) throws BusinessException {
        String sql = "select 1 from om_job where pk_jobtype = ?";
        SQLParameter par = new SQLParameter();
        par.addParam(id);
        return (Boolean)getBaseDAO().executeQuery(sql,par, new ResultSetProcessor() {

            @Override
            public Object handleResultSet(ResultSet rs) throws SQLException {
                return rs.next();
            }

        });
    }

    public boolean hasSubDemotreeVO(String id) throws BusinessException {
        String sql = "select 1 from asdf_demotree where father_pk = ?";
        SQLParameter par = new SQLParameter();
        par.addParam(id);
        return (Boolean)getBaseDAO().executeQuery(sql,par, new ResultSetProcessor() {

            @Override
            public Object handleResultSet(ResultSet rs) throws SQLException {
                return rs.next();
            }

        });
    }

    private IMDPersistenceQueryService getMDQueryService() {
        return MDPersistenceService.lookupPersistenceQueryService();
    }

    private BaseDAO baseDAO = null;

    private BaseDAO getBaseDAO() {
        if (baseDAO == null) {
            baseDAO = new BaseDAO();
        }
        return baseDAO;
    }

}
