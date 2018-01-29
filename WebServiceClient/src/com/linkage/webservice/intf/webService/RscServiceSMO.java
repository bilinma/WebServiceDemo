package com.linkage.webservice.intf.webService;

import java.util.List;
import java.util.Map;

/**
 * @author mosj
 *
 */
public interface RscServiceSMO {

	/**
	 * xml��ʽ��modify by mosj 20050104
	 * ȡ��Tml�б�
	 * @param tmlId	
	 * @return 
	 *  <?xml version='1.0' ?>
	 *	<tmls>
	 * 	 <tml>
	 *  	<tmlId></tmlId>                 
	 *  	<tmlTypeCd></tmlTypeCd>        
	 *   	<areaId></areaId>               
	 *   	<manageCd></manageCd>           
	 *   	<name></name>                
	 *   	<description></description>   
	 *   	<createDt></createDt>   
	 *   	<expDt></expDt>         		
	 *   	<version></version>      
	 *	</tml>
	 *	</tmls>
	 */
	public String getTmlXml(Integer tmlId) throws Exception;

	/**
	 * xml��ʽ��modify by mosj 20050104
	 * ȡ��Tml�б�
	 * @param Object �����豸��ѯdeviceCode;������ĳ�����Բ��� tmlName, tmlManageCd, tmlTypeCd, areaId ; 
	 * @return 
	 *  <?xml version='1.0' ?>
	 *	<tmls>
	 * 	 <tml>
	 *  	<tmlId></tmlId>
	 *  	<tmlTypeCd></tmlTypeCd>
	 *   	<areaId></areaId>
	 *   	<manageCd></manageCd>
	 *   	<name></name>
	 *   	<description></description>
	 *   	<createDt></createDt>
	 *   	<expDt></expDt>
	 *   	<version></version>
	 *	 </tml>
	 *	</tmls>
	 */
	public String getTmlXml(String deviceCode, String tmlName, String tmlManageCd, Integer tmlTypeCd, Integer areaId)
			throws Exception;

	/*
	 *  ����tmlId��ȡ�¼�tmlId
	 * @param: tmlId	
	 * @return:List ÿһ��Ԫ���ǁA��tmlId
	 */
	public List getTmlSub(Integer tmlId) throws Exception;

	/**
	 * ����������
	 * @param xml
	 * @return
	 * @throws BssException
	 */
	public List assignAn(String xml) throws Exception;

	/**
	 * Ԥռ������
	 * @param xml
	 * @return
	 * @throws BssException
	 */
	public List allocAn(String xml) throws Exception;

	/**
	 * �ͷź���
	 * @param xml
	 * @return
	 * @throws BssException
	 */
	public List releaseAn(String xml) throws Exception;
	
	/**
	 * �ͷ�e8-c����
	 * @param xml
	 * @return
	 * @throws BssException
	 */
	public String releaseE8CTd(String xml) throws Exception;

	/**
	 * ���Ӻ���
	 * @param xml
	 * @return
	 * @throws BssException
	 */
	public List addAn(String xml) throws Exception;

	/**
	 * ɾ������
	 * @param xml
	 * @return
	 * @throws BssException
	 */
	public List deleteAn(String xml) throws Exception;

	/**
	 * ��ѯ����
	 * @param xml
	 * @return
	 * @throws BssException
	 */
	public List getAn(String xml) throws Exception;

	/**
	 * ��ѯ�ն˸�����Ϣ
	 * @param xml
	 * @return
	 * @throws BssException
	 * ����

	�ն��豸���ID/terminal_device/terminal_dev_spec/id

	��ѯ����

		����1���豸��ţ�/terminal_device/device_numbers/device_number[an_type_cd =?-1��]/number

		����2���������ͱ����/terminal_device/device_numbers/device_number/an_type_cd+/terminal_device/device_numbers/device_number/number

	������ն��豸ʵ��ID���豸��ţ��ն��豸ʵ�����ԣ��豸�ͺ�֧�ֵķ���������

	�ӿ�XML��ʽ

	<?xml version="1.0" encoding="UTF-8" ?> 
	- <terminalDevice>
			<id>102</id> 
			<code>SN0003</code> 
	- 		<terminalDevSpec>
				<id>10302008</id> 
				<name>С��ͨ�ֻ�</name> 
			</terminalDevSpec>
	- 		<deviceModel>
				<id>109</id> 
				<name>UT318</name> 
	- 			<manufacturer>
					<id>3</id> 
					<name>UT˹�￵</name> 
				</manufacturer>
	- 			<servSpecs>
	- 				<servSpec>
						<id>35</id> 
						<isSupport>Y</isSupport> 
					</servSpec>
	- 				<servSpec>
						<id>36</id> 
						<isSupport>Y</isSupport> 
					</servSpec>
				</servSpecs>
			</deviceModel>
	- 		<accessNumbers>
	- 			<accessNumber>
					<anTypeCd>501</anTypeCd> 
					<name>С��ͨ������</name> 
					<anId>92</anId> 
					<number>002500000002</number> 
					<result>0</result> 
					<cause></cause> 
				 </accessNumber>
			</accessNumbers>
	- 		<items>
	- 			<item>
					<id>102</id> 
					<name>�ֻ���ɫ</name> 
					<value></value> 
				</item>
			</items>
	</terminalDevice>*/

	public String getTerminalDevice(String xml) throws Exception;

	/**
	 * ����areaId��ѯ��������������TmlId 
	 * @param areaId
	 * @return
	 * @throws BssException
	 */
	public Integer findTmlByAreaId(Integer areaId) throws Exception;

	/**
	 * xml��ʽȡTml
	 * @param manageCd
	 * @return
	 * <?xml version="1.0" encoding="UTF-8"?>
	 * <Tmls>
	 * <Tml><tmlId>44</tmlId>
	 * <tmlTypeCD>6</tmlTypeCD>
	 * <areaId>8</areaId>
	 * <manageCd>222</manageCd>
	 * <name>2202</name>
	 * <description/>
	 * <createdDt>2004-12-23 15:06:56.0</createdDt>
	 * <expDt>3000-01-01 00:00:01.0</expDt>
	 * <version>2004-12-23 15:06:56.0</version>
	 * <parentTmlId>2</parentTmlId>
	 * <tmlGroupId>1</tmlGroupId>
	 * </Tml>
	 * </Tmls>
	 * @throws BssException
	 */
	public String findTmlByManageCd(String manageCd) throws Exception;

	/**
	 * ����ProdIdȡTml
	 * @param prodId
	 * @return HashMap��List   key: TML_ID   NAME
	 * @throws BssException
	 */
	public List getTmlByProdId(Long prodId) throws Exception;

	/**
	 * ȡ����������,���Ϊ��,Ҫ�����账

	 * @param areaId
	 * @param phoneNumber
	 * @param tmlId
	 * @return
	 * @throws BssException
	 */
	public int getNumberOfDevice(Integer areaId, String phoneNumber, Integer tmlId) throws Exception;

	/**
	 * �ն��豸PIN�뼰PUK�����

	 * @param String Map
	 * @return ����Map
	 * @author WANGZH
	 * ���룺�ն��豸���루�Ժ󻹿�����

	 * ������ն��豸PIN�뼰PUK

	*/
	public Map getTerminalDeviceCode(Map terminalDeviceInfo) throws Exception;

	/**
	 * ͨ����Ʒ��ѯIMSI

	 * @param inParam
	 * @return ����Map
	 * @author WANGBIAO
	 * ���룺Map
	 * �����IMSI

	*/
	public Map getIMSIByProdId(Map inParam) throws Exception;

	/** 20080902 cuiyongzhi add
	 * ����CRM����ĵ������ն˹���ѯ��Ӧ���豸ID�����������Ʋ�����

	 * @param Map
	 * @return List
	 * @throws BssException
	 */
	public List getSwitchByAreaAndTerminalSpec(Map terminalDeviceInfo) throws Exception;

	/**��Դȷ��
	 * @param Map  cond
	 * key     value    description
	 * addrid         ��ַid����Ʒ��Ӧ�ĵ�ַid,���Ǳ�׼��ַid

	 * @return   
	 *       Map
	 *          String result    1/0    1:���óɹ�  0:����ʧ��
	 * @author wanbiao
	 * @since BSS 1.0
	 * @throws DAOException
	 */

	public String confirmResourceNew(Map cond) throws Exception;

	//		public void setAccessNumberAssigner(AccessNumberAssignerBMO assigner);

	/**���CDMA����
	 * @param String cdmaNbr
	 * @param String anTypeCd
	 * @return
	 * @throws Exception
	 * @author ��ӱ
	 */
	public String checkCDMANbr(String cdmaNbr, String anTypeCd) throws Exception;

	/**
	* �ж��Ƿ���ѡ�Žӿ�
	* @param areaId(��newAddressId���������)
	* @param prodId
	* @param phoneNumber
	* @param oldAddressId
	* @param newAddressId
	* @return  �����Ƿ���Ҫ�ĺű�ʶ
	* @throws BssException
	*/
	public String isJumpTmlSelNum(Integer areaId, Long prodId, String phoneNumber, Long oldAddressId, Long newAddressId)
			throws Exception;

	/**
	*根据用户地址查局�??
	* @param addrId 用户地址
	* @return  �??向例�?? 每个MAP有两个元素：“NAME”：�??向名�?? “TML_ID”：�??向ID	
	* @author panjb
	*/
	public List findTmlByAddrId(Long addrId) throws Exception;
	
	/**
	 * Ӫ������Ԥռ����
	 * ��ռ����״̬Ϊ ��������������Ԥռʧ��
	 * @param List {[anIds]}
	 * @return [ RES: Y �ɹ�  N ʧ��
	 *               		 MSG��ʧ��ԭ������] 
	 */
	public Map maketingSelectAn(List anIds) throws Exception;
	
	/**
	 * ��Σ�phoneNumberId ��ѡC������ID������Ϊ�սڵ㡣
	 *	<terminalDevice>
	 *	<ESN></ESN>
	 *	<phoneNumberId></phoneNumberId>
	 *	</terminalDevice>
	 * @param xml
	 * @return
	 * ���أ���UIM��У�鷵�ظ�ʽ����
	 */
	public String allocAnByEsn(String xml);
	
	/**
	 *�����û���ַ������������������Ϣ
	 * @param addrId �û���ַ
	 * @return  MAP
	 *             KEY       TML_LIST            ���������
	 *                         XZ_TML_LIST       �����������б�
	 *       �б���Ԫ��ΪMAP��ÿ��MAP������Ԫ�أ���NAME������������ ��TML_ID��������ID
	 *
	 */
	public Map findTmlInfoByAddrId(Long addrId) throws Exception;
			
	/**��Դ�ṩcrm��������У���ն˽ӿ�
	 * @author shisw
	 * @date 2009-9-21
	 * @version BSS 2.0
	 * @param  String inXml 
	 *    <root>
	 *      <termiDevAccCheck>
	 *         <accNbr>�ֻ���</accNbr>
	 *         <cardType>�����</cardType>
	 *         <terminalCode>���к�</terminalCode>
	 *      </termiDevAccCheck>
	 *    </root>
	 * @return String returnXml
	 * @throws BssException
	 */
	public String termiDevAccCheck(String inXml) throws Exception;
	
	/**��Դ�ṩcrm���ڶ���д��ҳ��У���ն˽ӿ�
	 * @author shisw
	 * @date 2009-9-21
	 * @version BSS 2.0
	 * @param  String inXml 
	 *    <root>
	 *      <termiDevCheck>
	 *         <nbrElement>�ֻ���ͷ</nbrElement>
	 *         <cardType>�����</cardType>
	 *         <terminalCode>���к�</terminalCode>
	 *      </termiDevCheck>
	 *    </root>
	 * @return String returnXml
	 * @throws BssException
	 */
	public String termiDevCheck(String inXml) throws Exception;
	
	/**crmд����Ϻ������Դ�ӿ�termiDevComfirm
	 * @author shisw
	 * @date 2009-9-21
	 * @version BSS 2.0
	 * @param  String inXml 
	 *    <root>
	 *      <termiDevComfirm>
	 *         <terminalCode>���к�</terminalCode>
	 *         <imsiCode>imsi��</imsiCode>
	 *         <writeFlag>д����ʶ��1�ɹ���0ʧ�ܣ�</writeFlag>
	 *         <isAcc>�Ƿ���������Y ��N</isAcc>
	 *      </termiDevComfirm>
	 *    </root>
	 * @return String returnXml
	 * @throws BssException
	 */
	public String termiDevComfirm(String inXml) throws Exception;
	
	/**��Դ�ṩcrm��ȡ��Ȩ��Ϣ�ӿ�getCardAuthInfo
	 * @author shisw
	 * @date 2009-10-14
	 * @version BSS 2.0
	 * @param  String inXml 
	 *<root>
     *  <getCardAuthInfo>
     *     <serialNum>�����к�</serialNum> 
     *     <iccidCode>iccid</iccidCode>
     *     <cImsiCode>cImsi</cImsiCode>
     *     <gImsiCode>CG˫ģ��Ҫ�ṩgImsi</gImsiCode>
     *  </getCardAuthInfo>
     *</root>  
	 * @return String returnXml
	 * @throws BssException
	 */
	public String getCardAuthInfo(String inXml) throws Exception;	
	
	/**��Դ�ṩcrm�ɿ����ݻ��սӿ�recycleResourceData
	 * @author shisw
	 * @date 2009-10-14
	 * @version BSS 2.0
	 * @param  String inXml 
	 *<root>
	 *  <recycleResourceData>
	 *     <serialNum>�����к�</serialNum> 
	 *     <iccidCode>iccid</iccidCode>
	 *     <cImsiCode>cImsi</cImsiCode>
	 *     <gImsiCode>CG˫ģ��Ҫ�ṩgImsi</gImsiCode>
	 *  </recycleResourceData>
	 *</root>   
	 * @return String returnXml
	 * @throws BssException
	 */
	public String recycleResourceData(String inXml) throws Exception;

	/**
	 * �̻�ѡ�ź�,�жϴ˹̻��������һ��˫��,������Դ�ӿڷ��ض�Ӧ��PHS��Ա��anId,
	 * ���й̻�����һ��˫�����,������Դ�ӿڷ��ض�ӦPHS��Ա��anId.
	 * @param areaId
	 * @param anTypeCd
	 * @param inPhyNum
	 * @return Long
	 * @throws Exception
	 */
	public Long createPhsNum(Integer areaId,Integer anTypeCd, String inPhyNum) throws Exception;
	
	/**
	 * ITV��Ʒ�ƻ�,�������������Ƿ����Ҫ����������ϵ�����Դ�ӿ������µ����ӿں��롣
	 * @param in_area_Id
	 * @param in_prod_specId
	 * @param in_an_type_cd
	 * @return String
	 */
	public String getProdSpecAccessNumber(Integer in_area_Id, Integer in_prod_specId, Integer in_an_type_cd);

	/**
	 * �ж��Ӳ�Ʒ����������ʱ�ж�2���Ƿ���ͬһ��������,�������,��Ҫ��������.
	 * ���̻�/PHS�������еĳ�Ա�ĺ�ʱ������Ƿ�Ϊͬһ��������,���������Ҫ���ơ�
	 * @param phoneNumber
	 * @param compProdId
	 * @return String
	 * @throws Exception
	 */
	public String checkIsInOneOffice(Long phoneNumber, Long compProdId) throws Exception;
	
	/**
	 * iTV��װ/�ƻ�����������ʣ�ITV���������ʱ������Դ�ӿ��ж������Ƿ�����
	 * @param prodInfos
	 * @return String
	 * @throws Exception
	 */
	public String checkItvNeedSpeedforCrm(String prodInfos) throws Exception;

	/**
	 * �����û���ѡ��ķ��� �����ն˼���ʱ��У�鿨�Ƿ��п�����֧���˺�
	 * @param in_term_dev_id
	 * @return
	 * @throws Exception
	 */
	public String checkWPayAccountByTermDevId(Long in_term_dev_id) throws Exception;
	/**
	* ��ѯ�ֻ�����id(�����õ�)
	* @param phoneNumber
	* @return
	*/
	public String queryPhoneNumberIdByPhoneNumber(String phoneNumber);
    /**
	 * �����ֻ������ȡ�ִ�Ῠ��
	 * @param String pn
	 * ���Σ����صĲ�ѯ��Ϣ
	 	�������ͣ�String��xml��ʽ�ģ�
			 XML�Ľڵ�˵����
				outFlag����ѯ��ʶ��1����ʾ��ѯ�ɹ���0����ʾ��ѯʧ��
				outMsg����ѯ�����Ϣ
				tdCode���ֻ�����󶨵��ִ�Ῠ�ţ���ѯ�ɹ���ʱ��Ż᷵�ظýڵ���Ϣ��
	
		 ʵ����
			��ѯ�ɹ���
				<?xml version="1.0" encoding="UTF-8"?>
			<outInfo>
			<outFlag>1</outFlag>
			<outMsg>��ѯ�ɹ�</outMsg>
			<tdCode>8986031090527048100</tdCode>
			</outInfo>
					��ѯʧ�ܣ�
						<?xml version="1.0" encoding="UTF-8"?>
			<outInfo>
			<outFlag>0</outFlag>
			<outMsg>�����ֻ������ѯ�����󶨵��ִ�Ῠ</outMsg>
			</outInfo>
	 */
	public String getVodafoneTdByPn(String pn) throws Exception;
	
	
	/**
	  * ������Ϣ��ѯ�ӿڣ����ع̶��绰���룬PHS�����CDMA���������Ϣ,����״̬Ϊ1���� 5����
	  * startNbr����Ϊ8λ�򷵻ع̶��绰�����PHS���룬11λ�򷵻�CDMA����
	  * @param startNbr ����Ϊ�գ�����Ϊ8λ��11λ
	  * @param endNbr   ����Ϊ�գ�����ͬstartNbr
	  * @return List: {Map:[PHONE_NUMBER_ID ����ID��AN_TYPE_CD ��������CD��AN_TYPE_NAME ������������
	  *                     RSC_STATUS_CD ����״̬CD��RSC_STATUS_NAME ����״̬������POOL_NAME ���������
	  *                     PN_LEVEL_NAME ����ȼ������� PN_LEVEL_DES ����ȼ���ע��PHONE_NUMBER ����
	  *                     DESCRIPTION ��������, PN_LEVEL_ID ����ȼ�ID   ] }
	  * @author zhangr 2010-1-9
	  */
	 public List queuePhoneNumberInfo(String startNbr, String endNbr);
	/**
	 * Ӫ��������������
	 * ����������״̬Ϊ ���л��������������ʧ��
	 * @param an List{[anId]}
	 * @return Map: [ RES: Y �ɹ�  N ʧ��
	 *                MSG��ʧ��ԭ������] 
	 * @author zhangr 2010-1-9                
	 */
	 public Map maketingBlockAn(List an);
	
}
