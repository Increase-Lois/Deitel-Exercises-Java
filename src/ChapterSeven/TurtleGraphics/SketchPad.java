package ChapterSeven.TurtleGraphics;

public class SketchPad {
    int[][] floor;
    public SketchPad(int row,int column){
        floor = new int[row][column];
    };

    public int[][] getFloor() {
        return floor;
    }
    public void display(){
        for (int[] row: floor){
            for (int column: row){
                if(column==1){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
