package com.linkage.webservice.intf.webService;

public interface IOrderLock extends java.rmi.Remote{

	/**
	 * ����
	 * @param requestXml
	 * @return
	 */
	public String orderLock(String requestXml);
	
	/**
	 * ����
	 * @param requestXml
	 * @return
	 */
	public String orderUnLock(String requestXml);
	/**
	 * ������Զ�����
	 * @param inXml
	 * @return
	 */
	public String assignAn(String inXml);
	
	public String getActiveProdServOrder(String requestXml);
}
