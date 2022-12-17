
public class Hilo extends Thread{
    TableroJuego lamina;
    public Hilo(TableroJuego lamina){
        this.lamina = lamina;
    }   
    @Override 
    public void run(){
        while(true){
            try {
                Thread.sleep(8);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }            
            lamina.repaint();  
        }
    }
    
}
