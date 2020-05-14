
package nccloud.web.asdf.org.demotreeVO.action;

import java.util.HashMap;
import java.util.Map;

import nc.hr.utils.MultiLangHelper;
import nc.vo.asdf.demotreecard.DemotreeVO;
import nccloud.web.asdf.commons.tree.TreeWapper;

public class DemotreeVOTreeNodeWrapper extends TreeWapper<Object> {

    public DemotreeVOTreeNodeWrapper(Object[] objs) {
    super(objs);
    }

    @Override
    protected String getId(Object t) {

    return ((DemotreeVO) t).getPk_depa();
    }

    @Override
    protected String getName(Object t) {
        DemotreeVO vo = (DemotreeVO) t;
        String name = MultiLangHelper.getName(vo);
        // 获取名称 规定code加上 空格 加上name
        return vo.getCode() + " " + name;
    }

    @Override
    protected String getPid(Object t) {
        return ((DemotreeVO) t).getFather_pk();
    }

    @Override
    protected String getInnercode(Object t) {

    return null;
    }

    @Override
    @SuppressWarnings("rawtypes")
    protected Map getData(Object t) {
    DemotreeVO vo = (DemotreeVO) t;
    Map<String, String> returnMap = new HashMap<String, String>();
    returnMap.put("ts",vo.getTs().toString());
    return returnMap;
    }
    }
