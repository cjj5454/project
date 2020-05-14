package nc.vo.asdf.demoetidtable;

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
 *  创建日期:2020-4-29
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class DemoEtidVO extends SuperVO {
	
/**
*主键
*/
public java.lang.String pk_demoetid;
/**
*集团
*/
public java.lang.String pk_group;
/**
*名称
*/
public java.lang.String demo_name;
/**
*年龄
*/
public java.lang.String demo_age;
/**
*性别
*/
public java.lang.String demo_sex;
/**
*部门
*/
public java.lang.String demo_depa;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_demoetid的Getter方法.属性名：主键
*  创建日期:2020-4-29
* @return java.lang.String
*/
public java.lang.String getPk_demoetid() {
return this.pk_demoetid;
} 

/**
* 属性pk_demoetid的Setter方法.属性名：主键
* 创建日期:2020-4-29
* @param newPk_demoetid java.lang.String
*/
public void setPk_demoetid ( java.lang.String pk_demoetid) {
this.pk_demoetid=pk_demoetid;
} 
 
/**
* 属性 pk_group的Getter方法.属性名：集团
*  创建日期:2020-4-29
* @return nc.vo.org.GroupVO
*/
public java.lang.String getPk_group() {
return this.pk_group;
} 

/**
* 属性pk_group的Setter方法.属性名：集团
* 创建日期:2020-4-29
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( java.lang.String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* 属性 demo_name的Getter方法.属性名：名称
*  创建日期:2020-4-29
* @return java.lang.String
*/
public java.lang.String getDemo_name() {
return this.demo_name;
} 

/**
* 属性demo_name的Setter方法.属性名：名称
* 创建日期:2020-4-29
* @param newDemo_name java.lang.String
*/
public void setDemo_name ( java.lang.String demo_name) {
this.demo_name=demo_name;
} 
 
/**
* 属性 demo_age的Getter方法.属性名：年龄
*  创建日期:2020-4-29
* @return java.lang.String
*/
public java.lang.String getDemo_age() {
return this.demo_age;
} 

/**
* 属性demo_age的Setter方法.属性名：年龄
* 创建日期:2020-4-29
* @param newDemo_age java.lang.String
*/
public void setDemo_age ( java.lang.String demo_age) {
this.demo_age=demo_age;
} 
 
/**
* 属性 demo_sex的Getter方法.属性名：性别
*  创建日期:2020-4-29
* @return nc.vo.asdf.demoetidtable.SexEnum
*/
public java.lang.String getDemo_sex() {
return this.demo_sex;
} 

/**
* 属性demo_sex的Setter方法.属性名：性别
* 创建日期:2020-4-29
* @param newDemo_sex nc.vo.asdf.demoetidtable.SexEnum
*/
public void setDemo_sex ( java.lang.String demo_sex) {
this.demo_sex=demo_sex;
} 
 
/**
* 属性 demo_depa的Getter方法.属性名：部门
*  创建日期:2020-4-29
* @return java.lang.String
*/
public java.lang.String getDemo_depa() {
return this.demo_depa;
} 

/**
* 属性demo_depa的Setter方法.属性名：部门
* 创建日期:2020-4-29
* @param newDemo_depa java.lang.String
*/
public void setDemo_depa ( java.lang.String demo_depa) {
this.demo_depa=demo_depa;
} 
 
/**
* 属性 生成时间戳的Getter方法.属性名：时间戳
*  创建日期:2020-4-29
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* 属性生成时间戳的Setter方法.属性名：时间戳
* 创建日期:2020-4-29
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("asdf.demoEtidVO");
    }
   }
    