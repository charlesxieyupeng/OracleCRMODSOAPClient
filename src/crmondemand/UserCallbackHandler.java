
/**
 * UserCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 19, 2008 (10:13:39 LKT)
 */

    package crmondemand;

    /**
     *  UserCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class UserCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public UserCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public UserCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for UserQueryPage method
            * override this method for handling normal response from UserQueryPage operation
            */
           public void receiveResultUserQueryPage(
                    crmondemand.UserStub.UserQueryPage_Output result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from UserQueryPage operation
           */
            public void receiveErrorUserQueryPage(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for UserInsert method
            * override this method for handling normal response from UserInsert operation
            */
           public void receiveResultUserInsert(
                    crmondemand.UserStub.UserInsert_Output result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from UserInsert operation
           */
            public void receiveErrorUserInsert(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for UserExecute method
            * override this method for handling normal response from UserExecute operation
            */
           public void receiveResultUserExecute(
                    crmondemand.UserStub.UserExecute_Output result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from UserExecute operation
           */
            public void receiveErrorUserExecute(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for UserUpdate method
            * override this method for handling normal response from UserUpdate operation
            */
           public void receiveResultUserUpdate(
                    crmondemand.UserStub.UserUpdate_Output result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from UserUpdate operation
           */
            public void receiveErrorUserUpdate(java.lang.Exception e) {
            }
                


    }
    