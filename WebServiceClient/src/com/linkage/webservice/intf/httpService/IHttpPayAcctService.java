package com.linkage.webservice.intf.httpService;

import java.util.Map;

/**
 * ֧���˺���ط���
 * 
 * @author 
 */
public interface IHttpPayAcctService {

	public Map<String, Object>  queryPayAcctByAcctId(String areaCode, String sysFlag, String operator, String uuid,
			String authCode, String ip, String funName, long paymentAccountId);


}
