package com.linkage.webservice.intf.webService;

import java.rmi.RemoteException;

public interface ChargeService extends java.rmi.Remote{

	/**
	 * ��ѽӿ�
	 * @author fanxiang
	 * @param olId        ���ﳵID
	 * @param areaCode    �������루�磺025��
	 * @param channelId   ��������ID
	 * @param staffId     ����Ա��ID
	 * @return String JSON��ʽ��{resultCode :"",chargeTotal :"",resultMsg :""}   
	 */
	public String calChargeTotalInfo(String olId,String areaCode,
			String channelId,String staffId) throws RemoteException;
	
	/**
	 * �������ӿ�
	 * @param olId
	 * @param areaCode
	 * @param channelId
	 * @param staffId
	 * @return
	 * @throws RemoteException
	 */
	public String calChargeDetailInfo(String olId,String areaCode,
			String channelId,String staffId) throws RemoteException;
	
}
