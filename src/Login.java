import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField txt_userLogin;
    private JPasswordField txt_Userpass;
    private JButton btn_submit;
    private JButton btn_clear;
    private JPanel MainPanel;


    public Login() {
        btn_submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,txt_userLogin.getText()+" "
                        + new String(txt_Userpass.getPassword()));
            }
        });
        btn_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_userLogin.setText(" ");
                txt_Userpass.setText("");
            }
        });
    }

    public JPanel getMainPanel (){
        return MainPanel;

    }
}
