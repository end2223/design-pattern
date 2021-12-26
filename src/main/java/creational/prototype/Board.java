package creational.prototype;

public class Board {
    public static final int NO_OF_ROWS = 8;
    public static final int NO_OF_COLUMN = 8;
    private final Cell[][] board;

    public Board() {
        this.board = new Cell[NO_OF_ROWS][NO_OF_COLUMN];
        Cell cell;
        for(int i=0; i<NO_OF_ROWS; i++){
            for (int j=0; j<NO_OF_COLUMN; j++){
                if((i+j)%2==0){
                    cell = CellFactory.getCell(Color.WHITE);
                }
                else {
                    cell = CellFactory.getCell(Color.BLACK);
                }
                cell.setCoordinate(String.format("%dx%d", i+1, j+1));
                board[i][j] = cell;
            }
        }
    }

    public void print(){
        for (int i=0; i<NO_OF_ROWS; i++){
            for (int j=0; j<NO_OF_COLUMN; j++){
                System.out.print(board[i][j]+"; ");
            }
            System.out.println();
        }
    }
}
