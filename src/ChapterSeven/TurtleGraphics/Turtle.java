package ChapterSeven.TurtleGraphics;

import static ChapterSeven.TurtleGraphics.PenState.*;
/*
(Turtle Graphics) The Logo language made the concept of turtle graphics famous. Imagine
a mechanical turtle that walks around the room under the control of a Java application. The turtle
holds a pen in one of two positions, up or down. While the pen is down, the turtle traces out shapes
as it moves, and while the pen is up, the turtle moves about freely without writing anything. In this
problem, youll simulate the operation of the turtle and create a computerized sketchpad.
Use a 20-by-20 array floor that’ is initialized to zeros. Read commands from an array that con-
tains them. Keep track of the current position of the turtle at all times and whether the pen is cur-
rently up or down. Assume that the turtle always starts at position (0, 0) of the floor with its pen
up. The set of turtle commands your application must process are shown in Fig. 7.29.
Command Meaning
1 Pen up
2 Pen down
3 Turn right
4 Turn left
5,10 Move forward 10 spaces (replace 10 for a different number of spaces)
6 Display the 20-by-20 array
9 End of data (sentinel)

Suppose that the turtle is somewhere near the center of the floor. The following program
would draw and display a 12-by-12 square, leaving the pen in the up position:
2
5,12
3
5,12
3
5,12
3
5,12
1
6
9
As the turtle moves with the pen down, set the appropriate elements of array floor to 1 s. When the
6 command (display the array) is given, wherever theres a 1 in the array, display an asterisk or any
character you choose. Wherever theres a 0 , display a blank.
Write an application to implement the turtle graphics capabilities discussed here. Write several
turtle graphics programs to draw interesting shapes. Add other commands to increase the power of
your turtle graphics language.
 */

public class Turtle {

   private Pen bic = new Pen();
   private Direction currentDirection = Direction.EAST;
   private Position currentPosition = new Position(0,0);

    public Pen getPen(){
        return bic;
    }

    public void penDown(){
        bic.setState(DOWN);
    }

    public void penUp(){
        bic.setState(UP);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == Direction.EAST) face(Direction.SOUTH);
        else if (currentDirection == Direction.SOUTH) face(Direction.WEST);
        else if (currentDirection == Direction.WEST) face(Direction.NORTH);
        else if (currentDirection == Direction.NORTH) face(Direction.EAST);
    }

//            switch (currentDirection){
//                case SOUTH -> face(WEST);
//                case EAST -> face(SOUTH);}

    public void turnLeft() {
        if (currentDirection == Direction.EAST) face(Direction.NORTH);
        else if(currentDirection == Direction.SOUTH) face(Direction.EAST);
        else if(currentDirection == Direction.NORTH) face (Direction.WEST);
        else if(currentDirection == Direction.WEST) face(Direction.SOUTH);
    }

    private void face(Direction direction){

        currentDirection = direction;
    }

    public void moveWithoutWriting(int numberOfSteps) {
        if (currentDirection == Direction.EAST) increaseColumnBy(numberOfSteps-1);
        if (currentDirection == Direction.SOUTH) increaseRowBy(numberOfSteps-1);
    }

    private void increaseRowBy(int increase) {
        int currentRow = currentPosition.getRow();
        currentPosition.setRow(currentRow + increase);
    }

    private void increaseColumnBy(int increase) {
        int currentColumn = currentPosition.getColumn();
        currentPosition.setColumn(currentColumn + increase);
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }


    public void move(int noOfSteps, SketchPad sketchPad) {
        validateMove(noOfSteps, sketchPad);
        if(bic.getState().equals(DOWN)){
           write(noOfSteps,sketchPad);
        }
       moveWithoutWriting(noOfSteps);
    }

    private void validateMove(int noOfSteps, SketchPad sketchPad)  {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        switch (currentDirection){
            case EAST -> {
                int newMove = column + noOfSteps;
                int sketchPadColumnLength = sketchPad.getFloor()[row].length;
                if(newMove > sketchPadColumnLength) throw new InvalidMoveException("turtle don fall");
            }
        }
    }
//

    private void write(int noOfSteps, SketchPad sketchPad) {
        int[] [] floor = sketchPad.getFloor();
       int row = currentPosition.getRow();
       int column = currentPosition.getColumn();
        switch (currentDirection){
            case EAST -> {
                for (int i = column; i < column+ noOfSteps; i++){
                    floor[row][i] = 1;
                }
            }
//            case WEST -> {
//                for (int i = column; i<column+noOfSteps-1; i++){
//                    floor[row][i] = 1;
//                }
            }
        }

    }


