// Snake by patrick
import java.awt.Color;
import java.awt.Graphics;
import java.util.*;

public class Food {

    private Node position;
    private boolean isSpecial = false;

    public void setIsSpecial(boolean isSpecial) {
        this.isSpecial = isSpecial;
    }

    public Food(Snake snake) {
        randomPositionFood(snake);
    }

    public void paint(Graphics g, int squareWidth, int squareHeight) {
        if (!isSpecial) {
            Util.drawSquare(g, position.getRow(), position.getCol(), squareWidth, squareHeight, new Color(255, 0, 0 ));
        } else {
            Util.drawSquare(g, position.getRow(), position.getCol(), squareWidth, squareHeight, new Color(0, 0, 0));
        }
        
    }

    
    
    public void randomPositionFood(Snake snake) {
        boolean goodPosition = false;
        List<Node> snakePosition = snake.getBody();

        while (!goodPosition) {
            int x = (int) (Math.random() * (Board.numRows));
            int y = (int) (Math.random() * (Board.numCols));
            position = new Node(x, y);
            for (Node checkUp : snakePosition) {
                if (checkUp == position) {
                    break;
                } else {
                    goodPosition = true;
                }
            }
        }
    }

    public Node getPosition() {
        return position;
    }
}
