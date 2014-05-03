package client;

import java.math.BigInteger;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.rpc.handler.HandlerInfo;
import javax.xml.rpc.handler.HandlerRegistry;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axis.message.MessageElement;
import org.apache.axis.message.PrefixedQName;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.context.OperationContext;

import crmondemand.UserStub;
import crmondemand.UserStub.ListOfUserData;
import crmondemand.UserStub.QueryType;
import crmondemand.UserStub.UserData;
import crmondemand.ws.contact.Default_Binding_Contact;

/** This sample code demonstrates Stateless web services request authenticated using UserName and Password provided in the SOAP security header (Using WSSE Version 1.0 Namespace).
 * It invokes ContactQueryPage web method to query 2 Contact records and prints the Contact IDs to the console.
 **/
public class StatelessAuthUsernamePassword {
    //WSSE Workspace definition
    public static final String WSSE_WS = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
    
    //CRMOD Integration URL
    protected static String LOCATION = "https://secure-ausomxoua.crmondemand.com/Services/Integration";

    public StatelessAuthUsernamePassword() {
        super();
    }

    public static void main(String[] args) {
        StatelessAuthUsernamePassword cRMOD_Authenticate_Stateless = new StatelessAuthUsernamePassword();
        String name = "BLOWL/CXIE";
        String pw = "Charles108";
        
        try {
            //Open dialog for user to enter username and password
            System.out.println("Getting login credentials...");
//            CredentialsDialog dialog = new CredentialsDialog();
            
            //do not allow program to continue execution until setVisible is set back to false or dialog is disposed
//            dialog.setModal(true);
//            dialog.setVisible(true);
            
            //get the username/password entered by the user through the dialog box
//            name = dialog.getUserName();
//            pw = dialog.getPassword();           
            
            //if name and password is not empty then send soap request            
            if (!"".equals(name) && !"".equals(pw)) {
                //init the URL
                URL urlAddr =  new java.net.URL(LOCATION);            
                System.out.println("Sending Soap request...");
                //create and send soap request to query Contacts in CRMOD based on the URL, username and password credentials.
                cRMOD_Authenticate_Stateless.queryPageContact(urlAddr, name, pw);  
//                cRMOD_Authenticate_Stateless.queryPageUser(LOCATION, name, pw);
            } else {
                System.out.println("Credentials dialog closed...");
//                dialog.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    /*
    * Create the SOAP security header element with the username and password to be sent with the soap request
    *     
    * @param userName - On Demand user name (email address) of the user we are logging
    * in as
    * @param password - password that corresponds to the userName parameter 
    * @return A SOAPHeaderElement with the username and password tokens
    */
    private SOAPHeaderElement createSoapHeaderWsse(String uName, String pWord) throws Exception{        
        SOAPHeaderElement wsseSecurity = new SOAPHeaderElement(new PrefixedQName(WSSE_WS,"Security", "wsse"));
        wsseSecurity.setActor(null);
        
        MessageElement usernameToken = new MessageElement(WSSE_WS, "wsse:UsernameToken");
        
        MessageElement username = new MessageElement(WSSE_WS, "wsse:Username");
        username.setObjectValue(uName);
        usernameToken.addChild(username);
        
        MessageElement password = new MessageElement(WSSE_WS, "wsse:Password");        
        password.setObjectValue(pWord);
        password.addAttribute("","Type","http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
        usernameToken.addChild(password);
                
        wsseSecurity.addChild(usernameToken);
        wsseSecurity.setMustUnderstand(true);
        
        return wsseSecurity;
    }
                    
    /*
    * Build the SOAP header element for the clientname to be sent with the soap request
    * 
    * @return A SOAPHeaderElement with the ClientName
    */
    private SOAPHeaderElement createSoapHeaderClientName() throws Exception{        
        SOAPHeaderElement clientName = new SOAPHeaderElement(new PrefixedQName("urn:crmondemand/ws","ClientName", ""));
        clientName.setObjectValue("TestClient,Hello2");            
        clientName.setActor(null);
        
        return clientName;
    }                                

    /*
    * Setup stub and build the SOAP security header to sent with the soap request for stateless authentication
    * 
    * @param urlAddr - the location of the web services provider
    * @param userName - On Demand user name (email address) of the user we are logging
    * in as
    * @param password - password that corresponds to the userName parameter    
    */
    private crmondemand.ws.contact.Default_Binding_Contact  getAndSetupContactStub(URL urlAddr, String userName, String passWord) throws Exception {
        //setup stub
        crmondemand.ws.contact.Contact service = new crmondemand.ws.contact.ContactLocator();
        crmondemand.ws.contact.Default_Binding_Contact stub = service.getDefault(urlAddr);     
        
//        HandlerRegistry handlerRegistry = service.getHandlerRegistry();
//        QName qname = new QName("https://secure-ausomxoua.crmondemand.com/Services/Integration");
//        List<HandlerInfo> chain = handlerRegistry.getHandlerChain(qname);
//        HandlerInfo info = new HandlerInfo();
//        info.setHandlerClass(TestHandler.class);
//        chain.add(info);
        //create the SOAP security header elements for username and password
        SOAPHeaderElement wsseSecurity = createSoapHeaderWsse(userName, passWord);
        //create the SOAP security header element for specifying the clientname
//        SOAPHeaderElement clientName = createSoapHeaderClientName();

        
        //===========Add headers to the stub================//
        ((org.apache.axis.client.Stub)stub).setHeader(wsseSecurity);
//        ((org.apache.axis.client.Stub)stub).setHeader(clientName);
        
        return stub;
    }    

    
    /*
    * Create a stateless SOAP request to invoke ContactQueryPage method to return 2 Contacts.
    * 
    * @param urlAddr - the location of the web services provider
    * @param userName - On Demand user name (email address) of the user we are logging
    * in as
    * @param password - password that corresponds to the userName parameter    
    */
    public void queryPageContact(URL urlAddr, String userName, String passWord) throws Exception {
        try{
    	//Setup stub and build the Soap security header using the url, username, and password provided
        crmondemand.ws.contact.Default_Binding_Contact stub = getAndSetupContactStub(urlAddr, userName, passWord);
    	 //setup stub
//        crmondemand.ws.contact.Contact service = new crmondemand.ws.contact.ContactLocator();
//        crmondemand.ws.contact.Default_Binding_Contact stub = service.getDefault(urlAddr);     
        
//        HandlerRegistry handlerRegistry = service.getHandlerRegistry();
//        QName qname = new QName("https://secure-ausomxoua.crmondemand.com/Services/Integration","OracleCRM");
//        List<HandlerInfo> chain = handlerRegistry.getHandlerChain(qname);
//        HandlerInfo info = new HandlerInfo();
//        info.setHandlerClass(TestHandler.class);
//        chain.add(info);
        //create the SOAP security header elements for username and password
        SOAPHeaderElement wsseSecurity = createSoapHeaderWsse(userName, passWord);
        //create the SOAP security header element for specifying the clientname
//        SOAPHeaderElement clientName = createSoapHeaderClientName();
//        crmondemand.ws.contact.Default_Binding_Contact stub = (Default_Binding_Contact) service.getPort(qname,Default_Binding_Contact.class);
       
        //===========Add headers to the stub================//
        ((org.apache.axis.client.Stub)stub).setHeader(wsseSecurity);
        
        //creates the input and output message objects                                              
        crmondemand.ws.contact.ContactWS_ContactQueryPage_Input contactlist =
            new crmondemand.ws.contact.ContactWS_ContactQueryPage_Input();
        crmondemand.ws.contact.ContactWS_ContactQueryPage_Output outlist =
            new crmondemand.ws.contact.ContactWS_ContactQueryPage_Output();
        crmondemand.xml.contact.Contact[] contacts = new crmondemand.xml.contact.Contact[1];
        crmondemand.xml.contact.Contact contact = new crmondemand.xml.contact.Contact();
    
        //return these fields in the output message
        contact.setContactId("");
        contact.setExternalSystemId("");
        contact.setContactFirstName("");
        contact.setContactEmail("");
        
        contacts[0] = contact;
        contactlist.setListOfContact(contacts);
        contactlist.setPageSize("10");   //only return 2 Contacts
        contactlist.setStartRowNum("0");  //starting at row 0
        //invoke contactQueryPage using the contactlist input message
        outlist = stub.contactQueryPage(contactlist);
        
        //gets the response
        crmondemand.xml.contact.Contact[] results = new crmondemand.xml.contact.Contact[1];
        crmondemand.xml.contact.Contact result = new crmondemand.xml.contact.Contact();
        results = outlist.getListOfContact();
        for (int i = 0; i < results.length; i++)
        {
            result = results[i];
            //prints the contact ids for the 2 contacts
            System.out.println(result.getContactId());
            System.out.println(result.getContactFirstName());
            System.out.println(result.getContactEmail());
        }
        }catch(Exception e){
        	 System.out.println(e);
        }
    }
//    public void createSoapHeaderWsseAxis2(String uName, String pWord) throws Exception{
//    	
//    }
    public void queryPageUser(String urlAddr, String userName, String passWord) throws Exception {
    	 System.out.println("");
    	//set up stub and add the WSEE header
		crmondemand.UserStub stub = new crmondemand.UserStub();    
		
		//add authentification header to stub
		OMFactory omFactory = OMAbstractFactory.getOMFactory();
		OMElement omSecurityElement = omFactory.createOMElement(new QName(WSSE_WS, "Security", "wsse"), null);
		OMElement omusertoken = omFactory.createOMElement(new QName(WSSE_WS, "UsernameToken", "wsse"), null);

		OMElement omuserName = omFactory.createOMElement(new QName("", "Username", "wsse"), null);
		omuserName.setText(userName);

		OMElement omPassword = omFactory.createOMElement(new QName("", "Password", "wsse"), null);
		omPassword.addAttribute("Type","http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText",null );
		omPassword.setText(passWord);
		omusertoken.addChild(omuserName);
		omusertoken.addChild(omPassword);
		omSecurityElement.addChild(omusertoken);
		stub._getServiceClient().addHeader(omSecurityElement);
	    
		//creates the input and output message objects 
		crmondemand.UserStub.UserQueryPage_Input userquerypageInput = new crmondemand.UserStub.UserQueryPage_Input();
		crmondemand.UserStub.UserQueryPage_Output userquerypageOutput = new crmondemand.UserStub.UserQueryPage_Output();
		crmondemand.UserStub.ListOfUserQuery lUserQuery = new crmondemand.UserStub.ListOfUserQuery();
		crmondemand.UserStub.ListOfUser lUser= new crmondemand.UserStub.ListOfUser();
		crmondemand.UserStub.UserQuery userQry = new crmondemand.UserStub.UserQuery();
		
		//return these fields in the output message
		QueryType qt = new QueryType();
		qt.setString("");
		userQry.setId(qt);
		userQry.setFirstName(qt);
		lUserQuery.setUser(userQry);
		lUserQuery.setPagesize(BigInteger.valueOf(10));
		lUserQuery.setStartrownum(BigInteger.valueOf(0));
		
		userquerypageInput.setListOfUser(lUserQuery);
		try{
		  userquerypageOutput = stub.UserQueryPage(userquerypageInput);
		}catch(Exception e){
			 System.out.println("stub.UserQueryPage Exception. ");
		}
		OperationContext operationContext = stub._getServiceClient().getLastOperationContext();
		if (operationContext != null) {
            MessageContext outMessageContext = operationContext.getMessageContext("Out");
            if (outMessageContext != null) {
                System.out.println("OUT SOAP: "+outMessageContext.getEnvelope().toString());
            }
            MessageContext inMessageContext = operationContext.getMessageContext("In");
            if (inMessageContext != null) {
                System.out.println("IN SOAP: "+ inMessageContext.getEnvelope().toString());
            }
        }
		ListOfUserData result = userquerypageOutput.getListOfUser();
		UserData[] results = result.getUser();
		UserData ud;
		 for (int i = 0; i < results.length; i++)
	        {
			 	ud = results[i];
	            //prints the contact ids for the 2 contacts
	            System.out.println(ud.getId());
	        }
	}
}
