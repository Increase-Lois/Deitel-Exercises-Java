package ChapterSeven;

import ChapterSeven.TurtleGraphics.Pen;
import ChapterSeven.TurtleGraphics.Position;
import ChapterSeven.TurtleGraphics.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


//
//import static ChapterSeven.Direction.*;
//import static ChapterSeven.PenState.DOWN;
//import static ChapterSeven.PenState.UP;
import static ChapterSeven.TurtleGraphics.Direction.*;
import static ChapterSeven.TurtleGraphics.PenState.DOWN;
import static ChapterSeven.TurtleGraphics.PenState.UP;
import static org.junit.jupiter.api.Assertions.*;

class TurtleGraphicsTest {

    Turtle turtle = new Turtle();

    @BeforeEach
    public void setUp(){
        turtle = new Turtle();
    }

    @Test
    public void turtleExistsTest(){
        assertNotNull(turtle);
    }

    @Test
    public void turtleHasAPenTest(){
        Pen bic = turtle.getPen();
        assertNotNull(bic);
    }

    @Test
    public void penIsUpByDefaultTest(){
        Pen bic = turtle.getPen();
        assertEquals(bic.getState(), UP);
    }

    @Test
    public void turtleCanMovePenDownTest(){

        Pen bic = turtle.getPen();
//        TODO Given
        assertSame(turtle.getPen().getState(), UP);
//        TODO when
        turtle.penDown();
//        TODO assert
        assertSame(turtle.getPen().getState(), DOWN);
//        TODO Instead of repeating PenState.UP Or DOWN... We import the static class

    }

    @Test
    public void turtleCanMovePenUpTest(){
//        TODO GIVEN
        turtle.penDown();
        assertSame(turtle.getPen().getState(), DOWN);
//        TODO WHEN
        turtle.penUp();
//        TODO ASSERT
        assertSame(turtle.getPen().getState(), UP);
    }

    @Test
    public void turtleCanTurnRight_WhileFacingEastTest(){
        assertSame(turtle.getCurrentDirection(), EAST);
//        TODO WHEN
        turtle.turnRight();
//        TODO ASSERT
        assertSame(turtle.getCurrentDirection(), SOUTH);
    }


    @Test
    public void turtleCanTurnRight_WhileFacingSouthTest(){
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(), SOUTH);
//        TODO WHEN
        turtle.turnRight();
//        TODO ASSERT
        assertSame(turtle.getCurrentDirection(), WEST);
    }


    @Test
    public void turtleCanTurnRight_WhileFacingNorthTest(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(),NORTH);
//        TODO WHEN
        turtle.turnRight();
//        TODO ASSERT
        assertSame(turtle.getCurrentDirection(), EAST);

    }

    @Test
    public void turtleCanTurnRight_WhileFacingWestTest(){
        turtle.turnRight();
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(),WEST);
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(),NORTH);
    }

    @Test
    public void turtleCanTurnLeft_whileFacingEastTest(){
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
    }
    //    todo face north,west and south
    @Test
    public void turtleCanTurnLeft_WhileFacingSouthTest(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(turtle.getCurrentDirection(),SOUTH);
        turtle.turnLeft();
        assertSame(turtle.getCurrentDirection(),EAST);
    }

    @Test
    public void turtleCanTurnLeft_WhileFacingNorthTest(){
        turtle.turnLeft();
        assertSame(turtle.getCurrentDirection(),NORTH);
        turtle.turnLeft();
        assertSame(turtle.getCurrentDirection(),WEST);
    }

    @Test
    public void turtleCanTurnLeft_WhileFacingWestTest(){
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(turtle.getCurrentDirection(),WEST);
        turtle.turnLeft();
        assertSame(turtle.getCurrentDirection(),SOUTH);
    }

//    @Test
//    public void turtleCanMove_whileFacingEastTest(){
//        turtle.move(5);
//        turtle.move(6);
//        Position expected = new Position(0,9);
////        Position turtlePosition = turtle.getCurrentPosition();
////        assertTrue(turtlePosition.equals(expected));
//        assertEquals(expected, turtle.getCurrentPosition());
//    }
//
//    @Test
//    public void turtleCanMove_whileFacingSouthTest(){
//        turtle.turnRight();
//        turtle.move(6);
//        Position expected = new Position(5,0);
////        Position turtlePosition = turtle.getCurrentPosition();
////        assertTrue(turtlePosition.equals(expected));
//        assertEquals(expected, turtle.getCurrentPosition());
//    }




}