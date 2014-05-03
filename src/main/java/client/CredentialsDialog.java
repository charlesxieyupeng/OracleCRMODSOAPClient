package client;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**This class creates a JDialog box which asks the user to enter a username and password. * */
public class CredentialsDialog extends JDialog {
    private JButton jRunButton = new JButton();
    private JPasswordField jPasswordField = new JPasswordField();
    private JFormattedTextField jUsernameField = new JFormattedTextField();
    
    private JLabel messageLabel = new JLabel();
    private JLabel usernameLabel = new JLabel();
    private JLabel passwordLabel = new JLabel();
    private JLabel errorLabel = new JLabel();
    
    private String name =""; //holds user name entered in text field
    private String pw = ""; //holds password entered in text field
    

    public CredentialsDialog() {
        this(null, "", false);
    }

    public CredentialsDialog(Frame parent, String title, boolean modal) {
        super(parent, title, modal);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* Initializes the JDialog box. */
    private void jbInit() throws Exception {
        this.setSize(new Dimension(400, 212));
        this.getContentPane().setLayout( null );
        //init Run button
        jRunButton.setText("Run");
        jRunButton.setBounds(new Rectangle(15, 140, 75, 21));
        //set ActionListener
        jRunButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jRun_actionPerformed(e);
                }
            });
        
        //init text fields
        jPasswordField.setBounds(new Rectangle(85, 95, 140, 20));
        jUsernameField.setBounds(new Rectangle(85, 60, 250, 20));
        
        //init labels
        messageLabel.setText("Please enter your CRMOD username and password:");
        messageLabel.setBounds(new Rectangle(15, 20, 360, 30));
        messageLabel.setFont(new Font("Tahoma", 1, 12));
        usernameLabel.setText("UserName");
        usernameLabel.setBounds(new Rectangle(15, 60, 65, 15));
        usernameLabel.setFont(new Font("Tahoma", 1, 12));
        passwordLabel.setText("Password");
        passwordLabel.setBounds(new Rectangle(15, 100, 65, 15));
        passwordLabel.setFont(new Font("Tahoma", 1, 12));
        errorLabel.setBounds(new Rectangle(105, 140, 250, 15));
        
        //add labels
        this.getContentPane().add(errorLabel, null);
        this.getContentPane().add(passwordLabel, null);
        this.getContentPane().add(usernameLabel, null);
        this.getContentPane().add(messageLabel, null);
        
        //add text fields
        this.getContentPane().add(jUsernameField, null);
        this.getContentPane().add(jPasswordField, null);
        
        //add button
        this.getContentPane().add(jRunButton, null);
    }
    
    /*This method is invoked when the Run button is clicked.
     * It checks if the user entered username and password into the username and password fields. If either one is missing, an error will display on the dialog box. The dialog will remain until a value has been entered 
     * for both fields.
     * 
     * @param e The ActionEvent that was triggered
     */
    private void jRun_actionPerformed(ActionEvent e) {
        boolean accept = false;
        
        if ((jUsernameField.getText()!= null) && !( "".equals(jUsernameField.getText().trim()))) 
        {
            name = (String)jUsernameField.getText().trim();
            accept = true;
        } 
        
        if (accept) {
            try {
                pw = (String)String.valueOf(jPasswordField.getPassword()).trim();
                
                if ("".equals(pw)) {
                    accept = false;
                } else {
                    accept = true;
                }
                
            }catch(NullPointerException ex) {
                accept=false;
            }
        }
        
        if (!accept) {
            errorLabel.setText("Missing username and/or password...");
        } else {
            this.setVisible(false);
            this.dispose();
        }
    }
    
    /*
     * This method returns the UserName value.
     * @return String username entered by the User
     */
    public String getUserName() {
        return name;
    }
    
    /*
     * This method returns the Password value.
     * @return String password entered by the User
     */
    public String getPassword() {
        return pw;
    }
    
}
