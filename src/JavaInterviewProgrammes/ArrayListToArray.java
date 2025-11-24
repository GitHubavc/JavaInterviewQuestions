package JavaInterviewProgrammes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {

        List<String> a1 = new ArrayList<>();
        a1.add("aa");
        a1.add("bb");
        a1.add("cc");
        a1.add("dd");

        String[] normalArray = new String[a1.size()];
        normalArray = a1.toArray(normalArray);

        for (int i = 0; i<normalArray.length;i++){
            System.out.println(normalArray[i]);
        }

    }
}
