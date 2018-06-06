import com.company.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BoardTest {

    @Test
    public void TestDictionary(){

        Board board = new Board("s2ferw_nx346ty5odiupq#lmz8ajhgcvk79b", "tk5j23tq94_gw9c#lhzs");
        Position ep1 = board.dictionary.get('c');
        Position ep2 = board.dictionary.get('#');
        Position ep3 = board.dictionary.get('z');
        Position ep4 = board.dictionary.get('q');
        Position ep5 = board.dictionary.get('a');

        assertEquals( ep1.xpos,0);
        assertEquals( ep1.ypos,2);

        assertEquals( ep2.xpos,0);
        assertEquals( ep2.ypos,0);

        assertEquals( ep3.xpos,5);
        assertEquals( ep3.ypos,5);

        assertEquals( ep4.xpos,2);
        assertEquals( ep4.ypos,4);

        assertEquals( ep5.xpos,4);
        assertEquals( ep5.ypos,1);


    }

    @Test
    public void TestBoardConstructor(){
        Board board = new Board("s2ferw_nx346ty5odiupq#lmz8ajhgcvk79b", "tk5j23tq94_gw9c#lhzs");

        assertEquals('s',board.tiles[0][0].character);
        assertEquals('c',board.tiles[5][0].character);
        assertEquals('w',board.tiles[0][5].character);
        assertEquals('b',board.tiles[5][5].character);

    }

    @Test
    public void TestBoardDefaultMarkerPos(){
        Board board = new Board("s2ferw_nx346ty5odiupq#lmz8ajhgcvk79b", "tk5j23tq94_gw9c#lhzs");

        assertEquals(0,board.markerPos.xpos);
        assertEquals(0,board.markerPos.ypos);

    }


}
