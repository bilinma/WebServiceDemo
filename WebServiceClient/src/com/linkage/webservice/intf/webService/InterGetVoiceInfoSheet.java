/**
 * InterGetVoiceInfoSheet_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.linkage.webservice.intf.webService;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterGetVoiceInfoSheet extends Remote {
	
	/**
	 * ��Ϊ����ͨ����ʷ��ѯ�ӿڣ���Ϊ���������ʼ��������Դ
	 * @param beginDateTime
	 * @param endDateTime
	 * @param userType
	 * @param cityCode
	 * @param userGrade
	 * @return
	 * @throws RemoteException
	 */
    public String getEmergencyQTVoice(String beginDateTime, String endDateTime, String userType, String cityCode, String userGrade) throws RemoteException;
}
