package ws.main;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import ws.login.Login;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    public Application(){
        init();
    }

    public void init(){
        setTitle("FlatLaf Demo v.1.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(1200,700));
        setLocationRelativeTo(null);
        setContentPane(new Login());
    }

    public static void main(String[] args) {
        FlatRobotoFont.install();
        UIManager.put("defaultFont",new Font(FlatRobotoFont.FAMILY,Font.PLAIN,13));
        FlatLaf.registerCustomDefaultsSource("ws.themes");


        FlatMacDarkLaf.setup();
//        FlatMacLightLaf.setup();
        EventQueue.invokeLater(()-> new Application().setVisible(true));
    }

}
