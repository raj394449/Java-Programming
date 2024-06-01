import java.applet.*;
import java.awt.Graphics;

@SuppressWarnings("removal")
public class SimpleApplet extends Applet {

    @Override
    public void paint(Graphics g) {
        g.drawString("Welcome to Java Applets!", 50, 50);
    }
}
