
import java.awt.Color;
import java.awt.Graphics;

// Snake by patrick

public class Food {
    private Node position;
    private boolean isSpecial;
    
    public Food(Snake snake) { 
        // We pass Snake to the constructor because if the randomnly generated food
        // falls on the Snake you have to create another position for the food
        
    }
    
    public void paint(Graphics g, int squareWidth, int squareHeight) {
        Util.drawSquare(g, squareWidth, squareWidth, squareWidth, squareHeight, Color.green);
    }
    
}
