
package nccloud.web.asdf.org.demotreeVO.action;

import nc.itf.org.IDemotreeVOQryService;
import nc.vo.asdf.demotreecard.DemotreeVO;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nccloud.web.action.NCCAction;

/**
* 查询职左树Action
* @author ncc
*/
public class QueryDemotreeVOSynTreeAction extends NCCAction {

@Override
public <T> Object execute(IRequest request, T para) throws Exception {
    //调用接口
    IDemotreeVOQryService qryService = ServiceLocator.find(IDemotreeVOQryService.class);
    //查询全部
    DemotreeVO[] vos = qryService.queryAllDemotreeVOs();

    if(vos == null || vos.length == 0) {
    return null;
    }

    // 此处特殊处理一下：通过接口查询出来的VO当中，如果数据库当中father_pk是“~”，那么VO中就是null，导致前端加载树结构出错。
    for (DemotreeVO vo : vos) {

    if (vo.getFather_pk() == null || "".equals(vo.getFather_pk())) {

    vo.setFather_pk("~");

    }
    }
    // 构造树
    DemotreeVOTreeNodeWrapper wrapper = new DemotreeVOTreeNodeWrapper(vos);
    //获得树结构数据并返回
    return wrapper.getTree();
    }
    }
