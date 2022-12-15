import javax.swing.JFrame;

import java.awt.event.*;


public class Ventana extends JFrame{

    private TableroJuego lamina;
    private final int ancho=800, largo=500;
    private Hilo hilo;
    /**
     * 
     */
    public Ventana(){
        setTitle("pong");
        setSize(ancho, largo);
        setLocationRelativeTo(null);
        setResizable(false);
        lamina = new TableroJuego();
        add(lamina);
        addKeyListener(new EventoTeclado());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hilo = new Hilo(lamina);
        hilo.start();

    }
    
}
