// Snake by patrick

public class Node {

    
    private int row;
    private int col;
    
    // Create the constructor and all the methods you need here
    
    public Node(int row,int col){
        this.row = row;
        this.col = col;
    }
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
    
}
