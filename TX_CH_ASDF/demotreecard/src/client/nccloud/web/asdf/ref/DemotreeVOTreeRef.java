package nccloud.web.asdf.ref;

import nc.bs.framework.common.InvocationInfoProxy;
import nc.vo.asdf.demotreecard.DemotreeVO;
import nccloud.framework.web.processor.refgrid.RefQueryInfo;
import nccloud.framework.web.ui.meta.RefMeta;
import nccloud.framework.web.ui.meta.TreeRefMeta;
import nccloud.web.refer.DefaultTreeRefAction;

/** @version: ncc
* @author:ncc
*/
public class DemotreeVOTreeRef extends DefaultTreeRefAction {

@Override
public TreeRefMeta getRefMeta(RefQueryInfo refQueryInfo) {
TreeRefMeta trf = new TreeRefMeta();
trf.setCodeField("code");
trf.setNameField("name");
trf.setPkField("pk_depa");
trf.setPidField("father_pk");
trf.setTableName("asdf_demotree");
return trf;
}

@Override
public String getExtraSql(RefQueryInfo paramRefQueryInfo,
RefMeta paramRefMeta) {

return " and pk_group = '"+InvocationInfoProxy.getInstance().getGroupId()+"'";
}

@Override
public String getOrderSql(RefQueryInfo paramRefQueryInfo,
RefMeta paramRefMeta) {
return " order by code ";
}

}
