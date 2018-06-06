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

    @Test
    public void TestShiftRowRight(){
        Board board = new Board("s2ferw"+"_nx346"+"ty5odi"+"upq#lm"+"z8ajhg"+"cvk79b", "tk5j23tq94_gw9c#lhzs");

        board.ShiftRowRight(0);
        board.ShiftRowRight(3);
        board.ShiftRowRight(5);

        String testStringOne = "";
        String testStringTwo = "";
        String testStringThree = "";


        for(int i = 0;i<6;i++){
            testStringOne += board.tiles[0][i].character;
            testStringTwo += board.tiles[3][i].character;
            testStringThree += board.tiles[5][i].character;

        }


        assertEquals("ws2fer", testStringOne);
        assertEquals("mupq#l", testStringTwo);
        assertEquals("bcvk79", testStringThree);
    }

    @Test
    public void TestShiftColumnDown(){
        Board board = new Board("s2ferw"+"_nx346"+"ty5odi"+"upq#lm"+"z8ajhg"+"cvk79b", "tk5j23tq94_gw9c#lhzs");

        board.ShiftColumnDown(0);
        board.ShiftColumnDown(3);
        board.ShiftColumnDown(5);

        String testStringOne = "";
        String testStringTwo = "";
        String testStringThree = "";


        for(int i = 0;i<6;i++){
            testStringOne += board.tiles[i][0].character;
            testStringTwo += board.tiles[i][3].character;
            testStringThree += board.tiles[i][5].character;

        }


        assertEquals("cs_tuz", testStringOne);
        assertEquals("7e3o#j", testStringTwo);
        assertEquals("bw6img", testStringThree);

    }

    @Test
    public void TestFindTilePosition(){

        Board board = new Board("s2ferw"+"_nx346"+"ty5odi"+"upq#lm"+"z8ajhg"+"cvk79b", "tk5j23tq94_gw9c#lhzs");

        Position pos1 = new Position(2,0);
        Position pos2 = new Position(3,3);
        Position pos3 = new Position(5,5);


        assertEquals(pos1, board.FindTilePosition('t'));
        assertEquals(pos2, board.FindTilePosition('#'));
        assertEquals(pos3, board.FindTilePosition('b'));
    }

    @Test
    public void TestFindTargetCharacter(){
        assertTrue(false);
    }

    @Test
    public void TestUpdateMarkerPosition(){
        Board board = new Board("s2ferw"+"_nx346"+"ty5odi"+"upq#lm"+"z8ajhg"+"cvk79b", "tk5j23tq94_gw9c#lhzs");


        assertTrue(false);
    }


    @Test
    public void TestDecryptMessage(){
        assertTrue(false);
    }

    @Test
    public void TestEncryptMessage(){
        assertTrue(false);
    }


}
