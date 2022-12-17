import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;

public class Raqueta {
    private int x, y;
    public static final int ancho=10, alto = 25;

    ///se instancian las coordenadas de la raqueta

    public Raqueta(int x, int y){
        this.x=x;
        this.y=y;
    }

    ///retorno de las coordenadas de la raquerta
    public Rectangle2D getRaqueta(){
        return new Rectangle2D.Double(x, y, ancho, alto);
    }
    
    ///movimiento de las raquetas según su tecla
    public void moverR1(Rectangle limites) {
        if(EventoTeclado.w && y >limites.getMinY()){
            y--;
        }
        if(EventoTeclado.s && y < limites.getMaxY()){
            y++;
        }
    }

    
    public void moverR2(Rectangle limites) {
        if(EventoTeclado.up && y>limites.getMinY()){
            y--;
        }
        if(EventoTeclado.down && y < limites.getMaxY()){
            y++;
        }
    }

}
