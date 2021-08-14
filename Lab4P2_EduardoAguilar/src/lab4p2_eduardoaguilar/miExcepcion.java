package lab4p2_eduardoaguilar;

import java.awt.Color;

public class miExcepcion extends Exception{
    private Color color;

    public miExcepcion() {
        super();
    }

    public miExcepcion(Color color, String string) {
        super(string);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+"miExcepcion{" + "color=" + color + '}';
    }
    

}
