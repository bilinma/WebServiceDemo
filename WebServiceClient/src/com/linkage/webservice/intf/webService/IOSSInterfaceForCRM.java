
package com.linkage.webservice.intf.webService;
/**
 * 
 * @author Ma_xbin
 *
 */
public interface IOSSInterfaceForCRM {
	/**
	 * 2.18	Ӫ������ռ�ú���
	 * @param xmlStr
	 * @return
	 */
	public String maketingSelectAn(String xmlStr);
	/**
	 * ѡַ��ѡ��ҳ����Ϣ����
	 * @param areaCode
	 * @param uuId
	 * @return
	 */
	public String getPageReturnVal(String areaCode, String uuId);
	/**
	 * CRM��������ѧ��E�е�ҵ��ʱУ���˺ţ���Դϵͳ�ж��˺��Ƿ���ڣ��粻�����������˺ţ��������������˺ţ�
	 * ������򷵻�У��Ľ������ͬ�Ĳ�Ʒ�ڵ�����Դ�ӿ�У���˺�ʱ���벻ͬ���˺����͡�
	 * @param xmlStr
	 * @return
	 */
	public String addAn(String xmlStr);
	/**
	 * ռ�ú���
	 * CRMӪҵ����ѡ��ȷ��ʱ����һ������Ĺ���������ѡ�ź���ʱԤռ����ţ��������״̬����Ϊռ�ã�������ִ�еĽ����
	 * ͬʱ�������������ﳵ�����Ҳ��Ҫ���ú���ռ�ýӿ�
	 * @param xmlStr
	 * @return
	 */
	public String allocAn(String xmlStr);
	/**
	 * �̶��绰��̻��������Ƿ�ͬһ������
	 * @param busiNumber
	 * @param anTypeCd
	 * @param compProdId
	 * @param areaCode
	 * @return
	 */
	public String queryIsInOneBureau(String busiNumber,String anTypeCd,String compProdId,String areaCode);
	/**
	 * 2.15	Ӫ��������ѯ����
	 * @param areaCode
	 * @param startNbr
	 * @param endNbr
	 * @return
	 */
	public String queuePhoneNumberInfo(String areaCode,String startNbr,String endNbr);
	/**
	 * 2.22	�����PUK���ѯ
	 * @param busiNumber
	 * @param areaCode
	 * @return
	 */
	public String getTerminalDeviceCode(String busiNumber,String areaCode);
	/**
	 * 2.4	����������ݽ���ŷ��ؽ����ID
	 * @param accessNumber
	 * @param anTypeCd
	 * @param areaCode
	 * @return
	 */
	public String queryAnIdByAccessNum(String accessNumber,String anTypeCd,String areaCode);
	/**
	 * 2.6	�ͷ�ռ�����
	 * CRMӪҵ��������ύʱ������ѡ�ź�ռ�õ���ţ�����״̬Ϊ�޸ģ���
	 * ����ռ��ʱ������Ĺ������ع����������ҵ��״̬����Ϊ���У�����״̬Ϊ��������������ִ�еĽ����
	 * @param xmlStr
	 * @return
	 */
	public String releaseAn(String xmlStr);
	/**
	 * CRMӪҵ����ȡ����У����˺Ż��߷����ύʱ����Դϵͳɾ���˺�У��ʱ�������˺š�
	 * @param xmlStr
	 * @return
	 */
	public String deleteAn(String xmlStr);
	/**
	 * CRM����CDMA��PHS���ƶ�ҵ��ʱ����UIM��/PHS�������У�飬��Դϵͳ��UIM����״̬����Ϊռ��״̬������״̬Ϊ�޸ģ���
	 * IMSI�Ÿ���Ϊռ�ã�����״̬Ϊ�޸ģ����ڲ��Ƿ�2�����Ȳ�ѯ�Ƿ����UIM�������ڣ������allocNbr�ӿ��޸�״̬�������ڣ��򷵻�ʧ��ԭ��
	 * �������������ϱ����
	 * @param xmlStr
	 * @return
	 */
	public String getTerminalDevice(String xmlStr);
	/**
	 *	Ӫ������Ԥռ����
	 * @param xmlStr
	 * @return
	 */
	public String marketingBlockNbr(String xmlStr);
	/**
	 * 2.21	�����жϣ��̻��ƻ��Ƿ���
	 * @param busiNumber
	 * @param prodId
	 * @param areaCode
	 * @param oldAddrId
	 * @param newAddrId
	 * @return
	 */
	public String queryIsSlopoverBureau(String busiNumber,String prodId,String areaCode, String oldAddrId, String newAddrId);
	/**
	 * 2.12	UIM��У��
	 * @param xmlStr
	 * @return
	 */
	public String allocNbr(String xmlStr);
	/**
	 * 	ҵ�����/��������Զ�����
	 * �������ɿ������š�������ҵ�����š����������Ʒ�Ľ���ŵ�
	 * @param xmlStr
	 * @return
	 */
	public String getAn(String xmlStr);
	
	/**
	 * �ͷ�IP
	 * @param woId
	 * @return
	 * @throws java.lang.RuntimeException
	 */
	public String releaseIP (String areaCode,String woId) throws java.lang.RuntimeException;
	/**
	 * ռ��ѡ��IP��Դ
	 * @param areaCode
	 * @param woId
	 * @return
	 * @throws Java.lang.RuntimeException
	 */
	public String occupyIP (String areaCode,String woId) throws java.lang.RuntimeException;
	
	/**
	 * Զ��д��--���������Դ���ݣ���ȡ����Դ��Ϣ��
	 * @param reqXml
	 * @return
	 */
	public String termiDevAccCheck(String reqXml);
	
	/**
	 * Զ��д��--д�����¼д���¼����հ׿���д��
	 * @param reqXml
	 * @return
	 */
	public String termiDevComfirm(String reqXml);
	
	/**
	 * 2.41	C����������ѯ�ӿ�
	 * @param xml
	 * @return
	 */
	public String getSwitchByAreaAndTerminalSpec(String xml);
	
	/**
	 * 2.42	CDMA����Ϸ���У��ӿ�
	 * @param xml
	 * @return
	 */
	public String checkCDMANbr (String xml);
	
	/**
	 * 2.43	Я����������ESNУ��UIM���ӿ�
	 * @param xml
	 * @return
	 */
	public String allocAnByEsn (String xml);
	/**
	 * 2.52	�ο���Žӿ�
	 * ��ѡ���������
	 * @param xml
	 * @return
	 */
	public String assignAnByRefAn (String xml);	
	/**
	 * �����������Դ�ж�
	 * @param areaId
	 * @param addrId
	 * @param prodSpecId
	 * @param prodId
	 * @param orderTypeId
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public String showRscCapaForCrm(String areaCode, Long addrId, Integer prodSpecId, Long prodId,
			Integer orderTypeId, String value);	
	
	
	public String isTmlCoveredByAddressId(String xml);
}
