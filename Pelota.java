import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;



public class Pelota {
    private int ancho=15, largo=15;
    private int x;
    private int y;
    private int dx=1, dy=1;
    public Pelota(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Rectangle2D getPelota(){
        ///las caracteristicas de la pelota
        return new Rectangle2D.Double(x, y, ancho, largo);
    }

    public void mover(Rectangle limites,boolean colisionR1, boolean colisionR2) {
        ///le das los valores para que  no se salga derecha, arriba, abajo iz
        ///izquierda
        x+=dx;
        y+=dy;
        if(colisionR1){
            dx=-dx;
            x=25;
        }
        if(colisionR2){
            dx=-dx;
            x=755;
        }
        if (x>=limites.getMaxX()){
            dx=-dx;
        }
            
        if (y>limites.getMaxY()){
            dy=-dy;
        }
        
        if (y<=0){
            dy=-dy;
        }
        
        if (x<0){
            dx=-dx;
        }
    }
}
