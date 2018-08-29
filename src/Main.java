import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame freame = new JFrame();
        Login login = new Login();
        freame.setContentPane(login.getMainPanel());
        freame.pack();
        freame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        freame.setVisible(true);
    }
}
