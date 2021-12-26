package creational.prototype;
/*
* Prototype and Factory Method
* - To create a cell of board. We have 10 ms.
* - Factory to cache cell (black or white)
* - Because if you use cache data, it will change data when you change data of cell in cache data.
* -> Use prototype to clone an object from an object already exists. It will help us save time instead of having to create
*    a new object.
* */
public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Board chessBoard = new Board();
        long endTime = System.currentTimeMillis();
        System.out.print("Time to create the chess board: " );
        System.out.println(-startTime + endTime);
        chessBoard.print();
    }
}
