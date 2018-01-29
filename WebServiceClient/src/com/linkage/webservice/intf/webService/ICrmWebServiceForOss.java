package com.linkage.webservice.intf.webService;

public interface ICrmWebServiceForOss {
	
	
	
	/**
	 * �������߸�������ʵ��ID��CRM��ȡ���ﳵ��Ϣ����
	 * @param requestxml
	 * @return
	 */
	public String getOrderListByFlowInstId(String requestxml);
	/**
	 * ������Ʒ��Ϣ
	 * @param requestXml:channelId,termDevSpecId,termCode
	 * @return RESULT,OUTMSG
	 */
	public String validateTerminalCoupon(String requestXml);
	
	/**
	 * �������߸���CRM�ͻ�ID��CRM��ȡ�ͻ���Ϣ���ݡ�
	 * @param requestxml
	 * @return
	 */
	public String  getCustInfoByPartyId(String requestxml); 
	
	
	/**
	 * CRM�ṩ��OSS�������˵��ӿ�
	 * @param requestXml
	 * @return xml
	 */
	public String boReplyMsg(String requestXml);
	
	 /**
	  * �����������߸���CRM��Ʒʵ��ID��CRM��ȡ����Ʒ��Ϣ���ݡ�
	  * @param requestxml
	  * @return
	  */
   public String getProdOffferInfoByProdId(String requestxml);
   
   
   /**
    * �������߸���CRM��Ʒʵ��ID��CRM��ȡ�˻���Ϣ
    * @param requestxml
    * @return
    */
	public String getAccountInfoByProdId(String requestxml);
}
