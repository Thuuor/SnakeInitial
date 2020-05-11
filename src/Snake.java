
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

// Snake by patrick

public class Snake {
    
    private Direction direction;
    private List<Node> body;
    private int remainingNodesToCreate = 0;
    
    
    public Snake(int row, int col, int size) { // Initial position of the head of the snake and number of inital nodes
        body = new ArrayList<Node>();
    }
    
    public boolean canMove(int row, int col) {
        
        return true;
    }
    
    public void paint(Graphics g, int squareWidth, int squareHeight) {
        boolean firstNode = true; // To print the head, first Node
        for (Node node: body) {
            if(firstNode) {
                firstNode = false;
                Util.drawSquare(g, squareWidth, squareHeight, node.getCol(),node.getRow() , new Color(12, 96, 94));
            } else {
                Util.drawSquare(g, squareWidth, squareHeight, node.getCol(),node.getRow() , new Color(70, 39, 204));
            }
        }
    }
    
    public void move() {
        // Finish this method
    }

    void setDirection(Direction direction) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
