package nc.vo.asdf.demoetid2;

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
 *  ��������:2020-5-6
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class DemoEtid2 extends SuperVO {
	
/**
*����
*/
public java.lang.String pk_id;
/**
*�ʲ����
*/
public java.lang.String pk_ass;
/**
*����
*/
public java.lang.String pk_group;
/**
*���ŷ���
*/
public java.lang.String pk_depa;
/**
*����
*/
public java.lang.String demo2_name_;
/**
*ö��
*/
public java.lang.String demo_enum;
/**
*�Զ�����2
*/
public java.lang.String def2;
/**
*�Զ�����3
*/
public java.lang.String def3;
/**
*�Զ�����4
*/
public java.lang.String def4;
/**
*�Զ�����5
*/
public java.lang.String def5;
/**
*ʱ���
*/
public UFDateTime ts;
    
    
/**
* ���� pk_id��Getter����.������������
*  ��������:2020-5-6
* @return java.lang.String
*/
public java.lang.String getPk_id() {
return this.pk_id;
} 

/**
* ����pk_id��Setter����.������������
* ��������:2020-5-6
* @param newPk_id java.lang.String
*/
public void setPk_id ( java.lang.String pk_id) {
this.pk_id=pk_id;
} 
 
/**
* ���� pk_ass��Getter����.���������ʲ����
*  ��������:2020-5-6
* @return nc.vo.fa.asset.AssetVO
*/
public java.lang.String getPk_ass() {
return this.pk_ass;
} 

/**
* ����pk_ass��Setter����.���������ʲ����
* ��������:2020-5-6
* @param newPk_ass nc.vo.fa.asset.AssetVO
*/
public void setPk_ass ( java.lang.String pk_ass) {
this.pk_ass=pk_ass;
} 
 
/**
* ���� pk_group��Getter����.������������
*  ��������:2020-5-6
* @return nc.vo.org.GroupVO
*/
public java.lang.String getPk_group() {
return this.pk_group;
} 

/**
* ����pk_group��Setter����.������������
* ��������:2020-5-6
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( java.lang.String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* ���� pk_depa��Getter����.�����������ŷ���
*  ��������:2020-5-6
* @return java.lang.String
*/
public java.lang.String getPk_depa() {
return this.pk_depa;
} 

/**
* ����pk_depa��Setter����.�����������ŷ���
* ��������:2020-5-6
* @param newPk_depa java.lang.String
*/
public void setPk_depa ( java.lang.String pk_depa) {
this.pk_depa=pk_depa;
} 
 
/**
* ���� demo2_name_��Getter����.������������
*  ��������:2020-5-6
* @return java.lang.String
*/
public java.lang.String getDemo2_name_() {
return this.demo2_name_;
} 

/**
* ����demo2_name_��Setter����.������������
* ��������:2020-5-6
* @param newDemo2_name_ java.lang.String
*/
public void setDemo2_name_ ( java.lang.String demo2_name_) {
this.demo2_name_=demo2_name_;
} 
 
/**
* ���� demo_enum��Getter����.��������ö��
*  ��������:2020-5-6
* @return nc.vo.asdf.demoetid2.Demo_enum
*/
public java.lang.String getDemo_enum() {
return this.demo_enum;
} 

/**
* ����demo_enum��Setter����.��������ö��
* ��������:2020-5-6
* @param newDemo_enum nc.vo.asdf.demoetid2.Demo_enum
*/
public void setDemo_enum ( java.lang.String demo_enum) {
this.demo_enum=demo_enum;
} 
 
/**
* ���� def2��Getter����.���������Զ�����2
*  ��������:2020-5-6
* @return java.lang.String
*/
public java.lang.String getDef2() {
return this.def2;
} 

/**
* ����def2��Setter����.���������Զ�����2
* ��������:2020-5-6
* @param newDef2 java.lang.String
*/
public void setDef2 ( java.lang.String def2) {
this.def2=def2;
} 
 
/**
* ���� def3��Getter����.���������Զ�����3
*  ��������:2020-5-6
* @return java.lang.String
*/
public java.lang.String getDef3() {
return this.def3;
} 

/**
* ����def3��Setter����.���������Զ�����3
* ��������:2020-5-6
* @param newDef3 java.lang.String
*/
public void setDef3 ( java.lang.String def3) {
this.def3=def3;
} 
 
/**
* ���� def4��Getter����.���������Զ�����4
*  ��������:2020-5-6
* @return java.lang.String
*/
public java.lang.String getDef4() {
return this.def4;
} 

/**
* ����def4��Setter����.���������Զ�����4
* ��������:2020-5-6
* @param newDef4 java.lang.String
*/
public void setDef4 ( java.lang.String def4) {
this.def4=def4;
} 
 
/**
* ���� def5��Getter����.���������Զ�����5
*  ��������:2020-5-6
* @return java.lang.String
*/
public java.lang.String getDef5() {
return this.def5;
} 

/**
* ����def5��Setter����.���������Զ�����5
* ��������:2020-5-6
* @param newDef5 java.lang.String
*/
public void setDef5 ( java.lang.String def5) {
this.def5=def5;
} 
 
/**
* ���� ����ʱ�����Getter����.��������ʱ���
*  ��������:2020-5-6
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* ��������ʱ�����Setter����.��������ʱ���
* ��������:2020-5-6
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("asdf.DemoEtid2");
    }
   }
    