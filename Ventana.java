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
        setTitle("pong");///titulo de la ventana
        setSize(ancho, largo);///los tamaños de la ventana
        setLocationRelativeTo(null);///la localización de la ventana es relativa
        setResizable(false);///no se puede modificar su tamaño
        lamina = new TableroJuego();///se crea la lamina (clase tablero juego)
        add(lamina);///se añade la lamina encima de la ventana
        addKeyListener(new EventoTeclado());///se empieza a leer el teclado
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hilo = new Hilo(lamina);///motor del juego
        hilo.start();///se inicia el hilo

    }
    
}
