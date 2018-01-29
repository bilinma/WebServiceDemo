package com.linkage.webservice.intf.webService;

public interface InterOAProccessSheet {

	/**
	 * 
	 * @param serSupplier
	 * @param sheettype
	 * @return
	 */
	public String isAlive(String serSupplier, String sheettype);

	
	/**
	 * 
	 * @param serialNo      �ͷ�������ˮ��
	 * @param serSupplier   �����ṩ��
	 * @param serCaller     ������÷�
	 * @param callTime      �������ʱ��
	 * @param callerPwd     ������÷�����/����
	 * @param replyCorp     �ظ���λ
	 * @param replyPerson   �ظ���
	 * @param replyDepart   �ظ�����������
	 * @param replyContact  �ظ�����ϵ��ʽ
	 * @param replyTime     �ظ�ʱ��
	 * @param endResult     ���մ�����
	 * @return
	 * @throws Exception 
	 */
	public String replyWorkSheet(String serialNo, String serSupplier,
			String serCaller, String callTime, String callerPwd,
			String replyCorp, String replyPerson, String replyDepart,
			String replyContact, String replyTime, String endResult) throws Exception;
	
	
	/**
	 * 
	 * @param serialNo      �ͷ�������ˮ��
	 * @param serSupplier   �����ṩ��
	 * @param serCaller     ������÷�
	 * @param callTime      �������ʱ��
	 * @param callerPwd     ������÷�����/����
	 * @param replyCorp     �ظ���λ
	 * @param replyPerson   �ظ���
	 * @param replyDepart   �ظ�����������
	 * @param replyContact  �ظ�����ϵ��ʽ
	 * @param replyTime     �ظ�ʱ��
	 * @param endResult     �׶δ�����
	 * @return
	 * @throws Exception 
	 */
	public String notifyWorkfSheet(String serialNo, String serSupplier,
			String serCaller, String callTime, String callerPwd,
			String replyCorp, String replyPerson, String replyDepart,
			String replyContact, String replyTime, String endResult)throws Exception;
	
	/**
	 * 
	 * @param serialNo      �ͷ�������ˮ��
	 * @param serSupplier   �����ṩ��
	 * @param serCaller     ������÷�
	 * @param callTime      �������ʱ��
	 * @param callerPwd     ������÷�����/����
	 * @param replyCorp     �˵��ظ���λ
	 * @param replyPerson   �˵��ظ���
	 * @param replyDepart   �˵��ظ�����������
	 * @param replyContact  �˵��ظ�����ϵ��ʽ
	 * @param replyTime     �˵��ظ�ʱ��
	 * @param endResult     �˵�������
	 * @return
	 * @throws Exception 
	 */
	public String untreadWorkSheet(String serialNo, String serSupplier,
			String serCaller, String callTime, String callerPwd,
			String replyCorp, String replyPerson, String replyDepart,
			String replyContact, String replyTime, String endResult)throws Exception;

}
