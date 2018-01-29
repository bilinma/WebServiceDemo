package com.linkage.webservice.intf.webService;

/**
 * �ֳ�д���籾�����������
 * @author tangminjun
 *
 */
public interface MakeCardService extends java.rmi.Remote {
	
    /**
     * ����д�������ҽ������б�
     * @param terminalSpec : 1��С��ͨ  2��CDMA��
     * @param switchAreaId
     * @return
     * @throws java.rmi.RemoteException
     */
    public java.lang.String findSwitchList(java.lang.String terminalSpec, java.lang.String switchAreaId) throws java.rmi.RemoteException;
    
	/**
	 * �ֳ�д��--����д��У���ն˽ӿ�
	 * @param   xml:
	 *          	<root>
	 *  			   <termiDevCheck>
	 *  			      <swtId>������</swtId> 
	 * 				      <cardType>�����ͣ���Ӧ��Ʒ���ID��</cardType>
	 *				      <terminalCode>�����к�</terminalCode> 
	 *				   </termiDevCheck>
	 *				</root>
	 * @author  hts
	 * @version 2009-9-28
	 */
    public java.lang.String termiDevCheck(java.lang.String xml) throws java.rmi.RemoteException;
    
    /**
     * ����д����д������ӿ�
     * @param xml
     * @return
     * @throws java.rmi.RemoteException
     */
    public java.lang.String termiDevComfirm(java.lang.String xml) throws java.rmi.RemoteException;
    
    /**
     * ʡ��������·��ӿ�
     * @param xml
     * @return
     * @throws java.rmi.RemoteException
     */
    public java.lang.String updateCardDllInfo(java.lang.String xml) throws java.rmi.RemoteException;
    
	/**
	 * �ֳ�д��--����д��У���ն˽ӿ�
	 * @param   xml:
	 *          	<root>
	 *  			   <termiDevAccCheck>
	 *  			      <accNbr>�ֻ���</accNbr> 
	 * 				      <cardType>�����ͣ���Ӧ��Ʒ���ID��</cardType>
	 *				      <terminalCode>�����к�</terminalCode> 
	 *				   </termiDevAccCheck>
	 *				</root>
	 * @author  hts
	 * @version 2009-10-05
	 */
    public java.lang.String termiDevAccCheck(java.lang.String xml) throws java.rmi.RemoteException;
    
	/**
	 * ��Ƭ���ʱ����Դ��ȡ����Ȩ��Ϣ
	 * @author  xuejuan
	 * @version 2009-11-03
     * @throws java.rmi.RemoteException
	 */
	public String getCardAuthInfo(String reqxml) throws java.rmi.RemoteException;
	
	/** ��Ƭ��Դ����
	 * @param reqXml
	 * @return
     * @throws java.rmi.RemoteException
	 */
	public String recycleResourceData(String reqXml)throws java.rmi.RemoteException;
	
	/**
	 * ȥ��Դ���п��ն�У��
	 * 
	 * @param xml�������ʽ�����RM�ṩ��CRM���õ�д���ӿ��ĵ�.doc��
	 * @return�������ʽ�����RM�ṩ��CRM���õ�д���ӿ��ĵ�.doc��
	 * @throws BssException
	 * @author ���P͢ 2010-6-16�������
	 */
	public String getTerminalDevice(String reqXml)throws java.rmi.RemoteException;
	
	/**
	 * ȥ��Դ����imsi��Ԥռ
	 * 
	 * @param xml�������ʽ�����RM�ṩ��CRM���õ�д���ӿ��ĵ�.doc��
	 * @return�������ʽ�����RM�ṩ��CRM���õ�д���ӿ��ĵ�.doc��
	 * @throws BssException
	 * @author ���P͢ 2010-6-16�������
	 */
	public String  allocAn(String reqXml)throws java.rmi.RemoteException;
	
}
