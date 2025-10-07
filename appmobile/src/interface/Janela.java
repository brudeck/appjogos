
import java.awt.CardLayout;
import java.security.Principal;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame{
    public Janela(){
        this.setBounds(0,0,1920,1080);
        CardLayout controleTela = newCardLayout();
        JPanel telas = JPanel(controleTela);
        LoginPanel LoginPanel = newLoginPanel(telas, this);
        PrincipalPanel PrincipalPanel = newPrincipalPanel(telas, this);

        this.add(telas);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setVisible(true);

    }
}
