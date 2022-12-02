package BL;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameBoardTest {
    int row = 40;
    int col = 100;


    @Test
    public void checkingRows(){
        GameBoard board = new GameBoard(row,col);
        assertEquals(row, board.getRowSize());
    }

    @Test
    public void checkingColumns(){
        GameBoard board = new GameBoard(row,col);
        assertEquals(col, board.getColSize());
    }

    @Test
    public void checkNeighbours(){
        GameBoard board = new GameBoard(row,col);
        board.Pattern();
        assertEquals(4,board.check_neighbor(21,51));
    }

}