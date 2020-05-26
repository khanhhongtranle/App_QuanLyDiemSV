package quanlydiemsv.views;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame implements ActionListener {
    //protected JFrame frame;
    //protected JLabel loginLabel;
    protected JLabel userNameLabel;
    protected JLabel passwordLabel;
    protected JTextField userNameField;
    protected JPasswordField passwordField;
    protected JButton loginButton;

    public void initComponents(){
        this.setTitle("Quản lý sinh viên");
        this.setSize(400,300);
        this.setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //loginLabel = new JLabel("Login");
        userNameLabel = new JLabel("User name");
        passwordLabel = new JLabel("Password");
        userNameField = new JTextField(16);
        passwordField = new JPasswordField(16);
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        JPanel panel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);
        panel.setBorder(new EmptyBorder(new Insets(150,200,150,200)));
        panel.add(userNameLabel);
        panel.add(userNameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);


        this.add(panel);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    protected void processEvent(AWTEvent e) {
        super.processEvent(e);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void addLoginListener(ActionListener listener){
        loginButton.addActionListener(listener);
    }

    public void showMessage(String message){
        JOptionPane.showMessageDialog(this, message);
    }
}
