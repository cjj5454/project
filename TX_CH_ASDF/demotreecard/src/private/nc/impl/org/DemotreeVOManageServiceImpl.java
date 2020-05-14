
package nc.impl.org;

import nc.bs.bd.baseservice.ITreePersistenceUtil;
import nc.bs.bd.baseservice.TreeBaseService;
import nc.bs.bd.baseservice.validator.BDTreeUpdateLoopValidator;
import nc.bs.org.demotreeVO.validator.DemotreeVODeleteValidator;
import nc.bs.uif2.validation.Validator;
import nc.itf.org.IDemotreeVOManageService;
import nc.itf.org.IOrgMetaDataIDConstBasic;
import nc.vo.asdf.demotreecard.DemotreeVO;
import nc.vo.util.BDReferenceChecker;
import nc.vo.util.BDUniqueRuleValidate;

/**
* 部门分类 查询实现
*
* @author ncc
*
*/
public class DemotreeVOManageServiceImpl extends TreeBaseService<DemotreeVO> implements IDemotreeVOManageService {

    public DemotreeVOManageServiceImpl() {
        super("fcf62f24-c32a-4d61-aea8-a1209c7c8f32", ITreePersistenceUtil.GENERAL_PERSISTENCE_STYPE);
    }

    @Override
    protected Validator[] getInsertValidator() {
        return new Validator[] {
            // new JobTypeNullValidator(),
            // new JobTypeParentDisableValidator(),
            new BDUniqueRuleValidate(),
            new BDTreeUpdateLoopValidator()
    };
    }

    @Override
    protected Validator[] getUpdateValidator(DemotreeVO oldVO) {
        return new Validator[] {
            // new JobTypeNullValidator(),
            new BDUniqueRuleValidate(),
            new BDTreeUpdateLoopValidator()
        };
    }

    @Override
    protected Validator[] getDeleteValidator() {
        return new Validator[] {
            new DemotreeVODeleteValidator()
        };
    }
}
