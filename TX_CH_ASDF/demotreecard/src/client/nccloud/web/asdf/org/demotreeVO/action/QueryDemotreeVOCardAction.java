
package nccloud.web.asdf.org.demotreeVO.action;

import java.util.HashMap;

import nc.itf.uap.IUAPQueryBS;
import nc.vo.asdf.demotreecard.DemotreeVO;
import nc.vo.pub.BusinessException;
import nccloud.dto.asdf.org.demotreeVO.DemotreeVOConst;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.convert.translate.Translator;
import nccloud.framework.web.ui.pattern.form.Form;
import nccloud.framework.web.ui.pattern.form.FormOperator;
import nccloud.web.action.NCCAction;
/**
* 查询卡片信息Action
* @author tangcht
*
*/
public class QueryDemotreeVOCardAction extends NCCAction {

@Override
public <T> Object execute(IRequest request, T para) throws Exception {

    String pk = ((HashMap) para).get("pk_depa") == null ? null : ((HashMap) para).get("pk_depa").toString();

    // 小应用页面编码，前端传
    String pagecode = ((HashMap) para).get(DemotreeVOConst.PAGECODE) == null ? null : ((HashMap) para).get(DemotreeVOConst.PAGECODE).toString();

    if (pk == null || pagecode == null) {
    throw new BusinessException(
    nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("nccasdf",
    "0nccasdf0202")
    +pk+nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("nccasdf",
    "0nccasdf0203")
    +pagecode);
    }

    IUAPQueryBS service = ServiceLocator.find(IUAPQueryBS.class);
    DemotreeVO vo = (DemotreeVO) service.retrieveByPK(DemotreeVO.class, pk);

    FormOperator convertor = new FormOperator(pagecode);
    Form form = convertor.toForm(vo);
    Translator translator = new Translator();
    translator.translate(form);

    return form;
    }

    }
