package com.linkage.webservice.intf.webService;


/**
 * ͳһ��֤ƽ̨webservice����ӿ�,
 * Э���<���յ���ͳһ��֤ƽ̨����淶_�ܲ�20100613>
 * @author ��־��
 *
 */
public interface IUamWSClient {
	/**
	 * ������֤����ӿ�
	 * @param ReqContent
	 * @return
	 */
	public String authReq(String reqContent);
	
	/**
	 * �������ýӿ�
	 * @param reqContent
	 * @return
	 */
	public String pwdReset(String reqContent);
}
