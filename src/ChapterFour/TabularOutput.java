package ChapterFour;
/*
N       N2      N3        N4
1       1       1          1
2       4       8          16
3       9       27         81
4       16      64         256
5       25      125        625
 */
public class TabularOutput {

    public static void main(String[] args) {

        int count = 1;
        System.out.println("N\tN2\tN3\tN4");

        while (count <= 5) {
            //System.out.print(count);
            System.out.print(count + "\t");
            System.out.print(count * count + "\t");
            System.out.print(count * count * count + "\t");
            System.out.println(count * count * count * count + "\t");

            count++;
        }
    }
}


        /*
        for(int i =1; i <=5; i++){
            System.out.print(i + "\t");
            System.out.print(i * i + "\t");
            System.out.print(i * i * i + "\t");
            System.out.println(i * i * i * i );
        }
*/
