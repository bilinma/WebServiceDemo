package com.linkage.webservice.intf.webService;


/**
 * ͳһ��֤ƽ̨���ṩ����ӿ�,
 * @author ��С��
 *
 */
public interface IUamSyncIntfWSClient {
	/**
	 * 1.7	���ò�Ʒ��������
	 * @param reqXml
	 * @return
	 */
	public String setProdPwd(String reqXml);
	
	/**
	 * 1.13	�����޸Ľӿ�
	 * @param reqXml
	 * @return
	 */
	public String modifyPassword(String reqXml);
	
	/**
	 * 1.15	�������ýӿ�
	 * @param reqXml
	 * @return
	 */
	public String resetPassword(String reqXml);
	
	/**
	 * 1.9	���ù����ʺ�
	 * @param reqXml
	 * @return
	 */
	public String modifyManager(String reqXml);
	
}
