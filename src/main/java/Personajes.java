import javax.swing.*;
import java.awt.*;

public class Personajes extends JFrame{

    private Image fondo;
    private JPanel PersonajesPanel;

    public Personajes(String titulo){
        super(titulo);
        this.setContentPane(PersonajesPanel);
        preInit();
    }

    private void preInit() {
        fondo = new ImageIcon("fondo.png").getImage();
    }

    public void paint(Graphics graphics){
        graphics.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
    }
}
