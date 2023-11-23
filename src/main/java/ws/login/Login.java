package ws.login;

import com.formdev.flatlaf.FlatClientProperties;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class Login extends JPanel {
    public Login(){
        init();
    }
    public void init(){
        setLayout(new MigLayout("Fill,insets 20","[center]","[center]"));
        txtUsername=new JTextField();
        txtPassword=new JPasswordField();
        chRememberMe=new JCheckBox("Remember me.");
        cmdLogin=new JButton("Login");

        JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45","fill,250:280"));
        panel.putClientProperty(FlatClientProperties.STYLE, "arc:20;[light]background:darken(@background,3%);[dark]background:lighten(@background,3%);");

        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT,"Enter your username of email");
        txtPassword.putClientProperty(FlatClientProperties.STYLE,"showRevealButton:true");

        JLabel lbTitle=new JLabel("Welcome back!");
        JLabel desc=new JLabel("Please sign in to access your account");

        lbTitle.putClientProperty(FlatClientProperties.STYLE,"font:blod +10");
        desc.putClientProperty(FlatClientProperties.STYLE,"[light]foreground:lighten(@foreground,30%);[dark]foreground:darken(@foreground,30%)");

        panel.add(lbTitle);
        panel.add(desc);
        panel.add(new JLabel("Username : "),"gapy 8");
        panel.add(txtUsername);
        panel.add(new JLabel("Password : "),"gapy 8");
        panel.add(txtPassword);
        panel.add(chRememberMe,"grow 0");
        panel.add(cmdLogin,"gapy 10");
        panel.add(createSignupLabel(),"gapy 10");

        add(panel);
    }

    private Component createSignupLabel(){
        JPanel panel=new JPanel();
        panel.putClientProperty(FlatClientProperties.STYLE,"background:null");
        JButton cmdRegister=new JButton("<html><a href=\"#\">Sign Up</a></html>");
        cmdRegister.putClientProperty(FlatClientProperties.STYLE,"border:3,3,3,3");
        cmdRegister.setContentAreaFilled(false);
        cmdRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmdRegister.addActionListener(e->{
            System.out.println("Go to Sign Up");
        });
        JLabel label=new JLabel("Don't have  an account ? ");
        label.putClientProperty(FlatClientProperties.STYLE,"[light]foreground:lighten(@foreground,30%);[dark]foreground:darken(@foreground,30%)");

        panel.add(label);
        panel.add(cmdRegister);
        return panel;
    }

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JCheckBox chRememberMe;
    private JButton cmdLogin;
}
