package nc.vo.asdf.demotreecard;

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
 *  ��������:2020-4-30
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class DemotreeVO extends SuperVO {
	
/**
*����
*/
public java.lang.String pk_depa;
/**
*����
*/
public java.lang.String name;
/**
*����
*/
public java.lang.String code;
/**
*�ϼ����Ϸ���
*/
public java.lang.String father_pk;
/**
*��ַ
*/
public java.lang.String depa_add;
/**
*״̬
*/
public java.lang.String depa_state;
/**
*��ϵ��
*/
public java.lang.String depa_cantects;
/**
*����
*/
public java.lang.String pk_group;
/**
*�Զ�����1
*/
public java.lang.String def1;
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
*ʱ���
*/
public UFDateTime ts;
    
    
/**
* ���� pk_depa��Getter����.������������
*  ��������:2020-4-30
* @return java.lang.String
*/
public java.lang.String getPk_depa() {
return this.pk_depa;
} 

/**
* ����pk_depa��Setter����.������������
* ��������:2020-4-30
* @param newPk_depa java.lang.String
*/
public void setPk_depa ( java.lang.String pk_depa) {
this.pk_depa=pk_depa;
} 
 
/**
* ���� name��Getter����.������������
*  ��������:2020-4-30
* @return java.lang.String
*/
public java.lang.String getName() {
return this.name;
} 

/**
* ����name��Setter����.������������
* ��������:2020-4-30
* @param newName java.lang.String
*/
public void setName ( java.lang.String name) {
this.name=name;
} 
 
/**
* ���� code��Getter����.������������
*  ��������:2020-4-30
* @return java.lang.String
*/
public java.lang.String getCode() {
return this.code;
} 

/**
* ����code��Setter����.������������
* ��������:2020-4-30
* @param newCode java.lang.String
*/
public void setCode ( java.lang.String code) {
this.code=code;
} 
 
/**
* ���� father_pk��Getter����.���������ϼ����Ϸ���
*  ��������:2020-4-30
* @return nc.vo.asdf.demotreecard.DemotreeVO
*/
public java.lang.String getFather_pk() {
return this.father_pk;
} 

/**
* ����father_pk��Setter����.���������ϼ����Ϸ���
* ��������:2020-4-30
* @param newFather_pk nc.vo.asdf.demotreecard.DemotreeVO
*/
public void setFather_pk ( java.lang.String father_pk) {
this.father_pk=father_pk;
} 
 
/**
* ���� depa_add��Getter����.����������ַ
*  ��������:2020-4-30
* @return java.lang.String
*/
public java.lang.String getDepa_add() {
return this.depa_add;
} 

/**
* ����depa_add��Setter����.����������ַ
* ��������:2020-4-30
* @param newDepa_add java.lang.String
*/
public void setDepa_add ( java.lang.String depa_add) {
this.depa_add=depa_add;
} 
 
/**
* ���� depa_state��Getter����.��������״̬
*  ��������:2020-4-30
* @return nc.vo.asdf.demotreecard.StateEnum
*/
public java.lang.String getDepa_state() {
return this.depa_state;
} 

/**
* ����depa_state��Setter����.��������״̬
* ��������:2020-4-30
* @param newDepa_state nc.vo.asdf.demotreecard.StateEnum
*/
public void setDepa_state ( java.lang.String depa_state) {
this.depa_state=depa_state;
} 
 
/**
* ���� depa_cantects��Getter����.����������ϵ��
*  ��������:2020-4-30
* @return java.lang.String
*/
public java.lang.String getDepa_cantects() {
return this.depa_cantects;
} 

/**
* ����depa_cantects��Setter����.����������ϵ��
* ��������:2020-4-30
* @param newDepa_cantects java.lang.String
*/
public void setDepa_cantects ( java.lang.String depa_cantects) {
this.depa_cantects=depa_cantects;
} 
 
/**
* ���� pk_group��Getter����.������������
*  ��������:2020-4-30
* @return nc.vo.org.GroupVO
*/
public java.lang.String getPk_group() {
return this.pk_group;
} 

/**
* ����pk_group��Setter����.������������
* ��������:2020-4-30
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( java.lang.String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* ���� def1��Getter����.���������Զ�����1
*  ��������:2020-4-30
* @return java.lang.String
*/
public java.lang.String getDef1() {
return this.def1;
} 

/**
* ����def1��Setter����.���������Զ�����1
* ��������:2020-4-30
* @param newDef1 java.lang.String
*/
public void setDef1 ( java.lang.String def1) {
this.def1=def1;
} 
 
/**
* ���� def2��Getter����.���������Զ�����2
*  ��������:2020-4-30
* @return java.lang.String
*/
public java.lang.String getDef2() {
return this.def2;
} 

/**
* ����def2��Setter����.���������Զ�����2
* ��������:2020-4-30
* @param newDef2 java.lang.String
*/
public void setDef2 ( java.lang.String def2) {
this.def2=def2;
} 
 
/**
* ���� def3��Getter����.���������Զ�����3
*  ��������:2020-4-30
* @return java.lang.String
*/
public java.lang.String getDef3() {
return this.def3;
} 

/**
* ����def3��Setter����.���������Զ�����3
* ��������:2020-4-30
* @param newDef3 java.lang.String
*/
public void setDef3 ( java.lang.String def3) {
this.def3=def3;
} 
 
/**
* ���� def4��Getter����.���������Զ�����4
*  ��������:2020-4-30
* @return java.lang.String
*/
public java.lang.String getDef4() {
return this.def4;
} 

/**
* ����def4��Setter����.���������Զ�����4
* ��������:2020-4-30
* @param newDef4 java.lang.String
*/
public void setDef4 ( java.lang.String def4) {
this.def4=def4;
} 
 
/**
* ���� ����ʱ�����Getter����.��������ʱ���
*  ��������:2020-4-30
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* ��������ʱ�����Setter����.��������ʱ���
* ��������:2020-4-30
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
    