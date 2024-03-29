import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.lang.Math;



public class Pelota {
    private int ancho=15, largo=15;
    private int x;
    private int y;
    private int dx=2, dy=2;
    private Integer puntuaje1=0, puntuaje2=0;
    public static boolean finJuego = false; 
    
    
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
        ///colisiones con raquetas
        if(colisionR1){
            dx=-dx;
            x=25;
        }
        if(colisionR2){
            dx=-dx;
            x=755;
        }
        ///colisiones con las porterías

        if(x < limites.getMinX()){
            puntuaje2++;
            x= (int) limites.getCenterX();
            y= (int) limites.getCenterY();
            dx = -dx;
        }
        if(x+ancho >= limites.getMaxX()){
            puntuaje1++;
            x= (int) limites.getCenterX();
            y=(int) limites.getCenterY();
            dx= -dx; 
        }
        ///colisiones con las paredes arriba y abajo
        if(y < limites.getMinY()) {
            y = (int) limites.getMinY();
            dy = -dy;
        }
        if(y + largo>= limites.getMaxY()){
            y = (int) (limites.getMaxY()-largo);
            dy= -dy;    
        }
        if(finJuego){
            dx=0;
            dy=0;
        }
    }


    ///funciones para obtener el puntuaje
    public int getScore1(){
        return puntuaje1;
    }
    public int getScore2(){
        return puntuaje2;
    }
}
