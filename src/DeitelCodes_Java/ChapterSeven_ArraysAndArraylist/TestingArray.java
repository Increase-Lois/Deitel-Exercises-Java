package DeitelCodes_Java.ChapterSeven_ArraysAndArraylist;

import java.util.ArrayList;
import java.util.List;

public class TestingArray {

        public static void main(String args[]) {
            List<String> list = new ArrayList<String>();

            list.add("Hello");
            list.add("Simple");
            list.add("Testing");

            String[] newStringArray = new String[list.size()];

            list.toArray(newStringArray );
            System.out.println("String into String Array: ");

            for(int j = 0; j<newStringArray.length; j++) {
                System.out.println(newStringArray[j]);
            }
        }
    }


