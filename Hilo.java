
public class Hilo extends Thread{
    TableroJuego lamina;

    /// instancias la lamina creando el metodo hilo
    public Hilo(TableroJuego lamina){
        this.lamina = lamina;
    }
    ///run, es el motor del juego, actualiza y repinta la lamina a la velocidad que le pongas
    @Override 
    public void run(){
        while(true){
            try {
                ///
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }            
            lamina.repaint();  
        }
    }
    
}
