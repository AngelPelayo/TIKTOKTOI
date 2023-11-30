import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App extends JFrame {

    // dimensiones de la ventana
    int HEIGHT = 800;
    int WIDTH = 800;
    int tcelda = 150;
    int desplazamineto = 170;

    BufferedImage bi = new BufferedImage(this.WIDTH, this.HEIGHT, BufferedImage.TYPE_4BYTE_ABGR);
    Graphics gbi = bi.getGraphics();

    // constructor
    public App() {
        // funcion del JFrame Para el tamono de la ventana
        this.setSize(WIDTH, HEIGHT);
        this.setVisible(true);
        //
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("El Juego Del Gato");

    }

    public void pintarFondo(Graphics g) {
        for (int i = 0; i < 100; i++) {
            Color c = new Color(26 + i, 188, 156);
            g.setColor(Color.BLUE);
            g.fillRect(10, 10, this.WIDTH, this.HEIGHT);
        }

    }

    public void PintarSimbolo() {

    }

    public void Paint(Graphics g) {
        this.pintarFondo(2d);
        g.drawImage(bi, 10, 10, this.WIDTH, this.HEIGHT, this);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando Juego");
        App juego = new App();
    }

    @Override
    // defef
    public void run() {
        while (true) {
            try {
                Thread.sleep(1503);
            } catch (InterruptedException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
