package nc.vo.asdf.demotreecard;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> 此处简要描述此类功能 </b>
 * <p>
 *   此处添加累的描述信息
 * </p>
 *  创建日期:2020-4-30
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class DemotreeVO extends SuperVO {
	
/**
*主键
*/
public java.lang.String pk_depa;
/**
*名称
*/
public java.lang.String name;
/**
*编码
*/
public java.lang.String code;
/**
*上级物料分类
*/
public java.lang.String father_pk;
/**
*地址
*/
public java.lang.String depa_add;
/**
*状态
*/
public java.lang.String depa_state;
/**
*联系人
*/
public java.lang.String depa_cantects;
/**
*集团
*/
public java.lang.String pk_group;
/**
*自定义项1
*/
public java.lang.String def1;
/**
*自定义项2
*/
public java.lang.String def2;
/**
*自定义项3
*/
public java.lang.String def3;
/**
*自定义项4
*/
public java.lang.String def4;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_depa的Getter方法.属性名：主键
*  创建日期:2020-4-30
* @return java.lang.String
*/
public java.lang.String getPk_depa() {
return this.pk_depa;
} 

/**
* 属性pk_depa的Setter方法.属性名：主键
* 创建日期:2020-4-30
* @param newPk_depa java.lang.String
*/
public void setPk_depa ( java.lang.String pk_depa) {
this.pk_depa=pk_depa;
} 
 
/**
* 属性 name的Getter方法.属性名：名称
*  创建日期:2020-4-30
* @return java.lang.String
*/
public java.lang.String getName() {
return this.name;
} 

/**
* 属性name的Setter方法.属性名：名称
* 创建日期:2020-4-30
* @param newName java.lang.String
*/
public void setName ( java.lang.String name) {
this.name=name;
} 
 
/**
* 属性 code的Getter方法.属性名：编码
*  创建日期:2020-4-30
* @return java.lang.String
*/
public java.lang.String getCode() {
return this.code;
} 

/**
* 属性code的Setter方法.属性名：编码
* 创建日期:2020-4-30
* @param newCode java.lang.String
*/
public void setCode ( java.lang.String code) {
this.code=code;
} 
 
/**
* 属性 father_pk的Getter方法.属性名：上级物料分类
*  创建日期:2020-4-30
* @return nc.vo.asdf.demotreecard.DemotreeVO
*/
public java.lang.String getFather_pk() {
return this.father_pk;
} 

/**
* 属性father_pk的Setter方法.属性名：上级物料分类
* 创建日期:2020-4-30
* @param newFather_pk nc.vo.asdf.demotreecard.DemotreeVO
*/
public void setFather_pk ( java.lang.String father_pk) {
this.father_pk=father_pk;
} 
 
/**
* 属性 depa_add的Getter方法.属性名：地址
*  创建日期:2020-4-30
* @return java.lang.String
*/
public java.lang.String getDepa_add() {
return this.depa_add;
} 

/**
* 属性depa_add的Setter方法.属性名：地址
* 创建日期:2020-4-30
* @param newDepa_add java.lang.String
*/
public void setDepa_add ( java.lang.String depa_add) {
this.depa_add=depa_add;
} 
 
/**
* 属性 depa_state的Getter方法.属性名：状态
*  创建日期:2020-4-30
* @return nc.vo.asdf.demotreecard.StateEnum
*/
public java.lang.String getDepa_state() {
return this.depa_state;
} 

/**
* 属性depa_state的Setter方法.属性名：状态
* 创建日期:2020-4-30
* @param newDepa_state nc.vo.asdf.demotreecard.StateEnum
*/
public void setDepa_state ( java.lang.String depa_state) {
this.depa_state=depa_state;
} 
 
/**
* 属性 depa_cantects的Getter方法.属性名：联系人
*  创建日期:2020-4-30
* @return java.lang.String
*/
public java.lang.String getDepa_cantects() {
return this.depa_cantects;
} 

/**
* 属性depa_cantects的Setter方法.属性名：联系人
* 创建日期:2020-4-30
* @param newDepa_cantects java.lang.String
*/
public void setDepa_cantects ( java.lang.String depa_cantects) {
this.depa_cantects=depa_cantects;
} 
 
/**
* 属性 pk_group的Getter方法.属性名：集团
*  创建日期:2020-4-30
* @return nc.vo.org.GroupVO
*/
public java.lang.String getPk_group() {
return this.pk_group;
} 

/**
* 属性pk_group的Setter方法.属性名：集团
* 创建日期:2020-4-30
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( java.lang.String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* 属性 def1的Getter方法.属性名：自定义项1
*  创建日期:2020-4-30
* @return java.lang.String
*/
public java.lang.String getDef1() {
return this.def1;
} 

/**
* 属性def1的Setter方法.属性名：自定义项1
* 创建日期:2020-4-30
* @param newDef1 java.lang.String
*/
public void setDef1 ( java.lang.String def1) {
this.def1=def1;
} 
 
/**
* 属性 def2的Getter方法.属性名：自定义项2
*  创建日期:2020-4-30
* @return java.lang.String
*/
public java.lang.String getDef2() {
return this.def2;
} 

/**
* 属性def2的Setter方法.属性名：自定义项2
* 创建日期:2020-4-30
* @param newDef2 java.lang.String
*/
public void setDef2 ( java.lang.String def2) {
this.def2=def2;
} 
 
/**
* 属性 def3的Getter方法.属性名：自定义项3
*  创建日期:2020-4-30
* @return java.lang.String
*/
public java.lang.String getDef3() {
return this.def3;
} 

/**
* 属性def3的Setter方法.属性名：自定义项3
* 创建日期:2020-4-30
* @param newDef3 java.lang.String
*/
public void setDef3 ( java.lang.String def3) {
this.def3=def3;
} 
 
/**
* 属性 def4的Getter方法.属性名：自定义项4
*  创建日期:2020-4-30
* @return java.lang.String
*/
public java.lang.String getDef4() {
return this.def4;
} 

/**
* 属性def4的Setter方法.属性名：自定义项4
* 创建日期:2020-4-30
* @param newDef4 java.lang.String
*/
public void setDef4 ( java.lang.String def4) {
this.def4=def4;
} 
 
/**
* 属性 生成时间戳的Getter方法.属性名：时间戳
*  创建日期:2020-4-30
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* 属性生成时间戳的Setter方法.属性名：时间戳
* 创建日期:2020-4-30
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("asdf.demotreeVO");
    }
   }
    