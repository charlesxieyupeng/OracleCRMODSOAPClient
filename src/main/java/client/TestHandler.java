package client;

import javax.xml.namespace.QName;
import javax.xml.rpc.handler.GenericHandler;
import javax.xml.rpc.handler.MessageContext;
import javax.xml.rpc.handler.soap.SOAPMessageContext;

import org.apache.axis.utils.ByteArrayOutputStream;

public class TestHandler extends GenericHandler {
	 private static final long serialVersionUID = -1088299597212448917L;

	@Override
	public QName[] getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}
	 @Override
	       public boolean handleFault(MessageContext context) {
	            System.out.println("_fault: " + getStringMessage(context));
	            
	            return super.handleFault(context);
	        }
	 private String getStringMessage(MessageContext context){
		            String res = null;
		           
		            try {
		                SOAPMessageContext ctx = (SOAPMessageContext) context;
		                
		                ByteArrayOutputStream stream = new ByteArrayOutputStream();
		                ctx.getMessage().writeTo(stream);
		                byte[] items = stream.toByteArray();
		                
		                res = new String(items);
		            }
		            catch(Exception e){
		                // nothing - just ensuring the method will not throw an exception in case something is wrong.
		            }
		    
		            return res;
		        }
	   @Override
	         public boolean handleRequest(MessageContext context) {
	              System.out.println( "_request: " + getStringMessage(context));
	              
	              return super.handleRequest(context);
	          }
	      
	          @Override
	          public boolean handleResponse(MessageContext context) {
	              System.out.println( "_response: " + getStringMessage(context));
	              
	              return super.handleResponse(context);
	          }
}
