package nc.vo.asdf.demoetidtable;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> �˴���Ҫ�������๦�� </b>
 * <p>
 *   �˴�����۵�������Ϣ
 * </p>
 *  ��������:2020-4-29
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class DemoEtidVO extends SuperVO {
	
/**
*����
*/
public java.lang.String pk_demoetid;
/**
*����
*/
public java.lang.String pk_group;
/**
*����
*/
public java.lang.String demo_name;
/**
*����
*/
public java.lang.String demo_age;
/**
*�Ա�
*/
public java.lang.String demo_sex;
/**
*����
*/
public java.lang.String demo_depa;
/**
*ʱ���
*/
public UFDateTime ts;
    
    
/**
* ���� pk_demoetid��Getter����.������������
*  ��������:2020-4-29
* @return java.lang.String
*/
public java.lang.String getPk_demoetid() {
return this.pk_demoetid;
} 

/**
* ����pk_demoetid��Setter����.������������
* ��������:2020-4-29
* @param newPk_demoetid java.lang.String
*/
public void setPk_demoetid ( java.lang.String pk_demoetid) {
this.pk_demoetid=pk_demoetid;
} 
 
/**
* ���� pk_group��Getter����.������������
*  ��������:2020-4-29
* @return nc.vo.org.GroupVO
*/
public java.lang.String getPk_group() {
return this.pk_group;
} 

/**
* ����pk_group��Setter����.������������
* ��������:2020-4-29
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( java.lang.String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* ���� demo_name��Getter����.������������
*  ��������:2020-4-29
* @return java.lang.String
*/
public java.lang.String getDemo_name() {
return this.demo_name;
} 

/**
* ����demo_name��Setter����.������������
* ��������:2020-4-29
* @param newDemo_name java.lang.String
*/
public void setDemo_name ( java.lang.String demo_name) {
this.demo_name=demo_name;
} 
 
/**
* ���� demo_age��Getter����.������������
*  ��������:2020-4-29
* @return java.lang.String
*/
public java.lang.String getDemo_age() {
return this.demo_age;
} 

/**
* ����demo_age��Setter����.������������
* ��������:2020-4-29
* @param newDemo_age java.lang.String
*/
public void setDemo_age ( java.lang.String demo_age) {
this.demo_age=demo_age;
} 
 
/**
* ���� demo_sex��Getter����.���������Ա�
*  ��������:2020-4-29
* @return nc.vo.asdf.demoetidtable.SexEnum
*/
public java.lang.String getDemo_sex() {
return this.demo_sex;
} 

/**
* ����demo_sex��Setter����.���������Ա�
* ��������:2020-4-29
* @param newDemo_sex nc.vo.asdf.demoetidtable.SexEnum
*/
public void setDemo_sex ( java.lang.String demo_sex) {
this.demo_sex=demo_sex;
} 
 
/**
* ���� demo_depa��Getter����.������������
*  ��������:2020-4-29
* @return java.lang.String
*/
public java.lang.String getDemo_depa() {
return this.demo_depa;
} 

/**
* ����demo_depa��Setter����.������������
* ��������:2020-4-29
* @param newDemo_depa java.lang.String
*/
public void setDemo_depa ( java.lang.String demo_depa) {
this.demo_depa=demo_depa;
} 
 
/**
* ���� ����ʱ�����Getter����.��������ʱ���
*  ��������:2020-4-29
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* ��������ʱ�����Setter����.��������ʱ���
* ��������:2020-4-29
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
    