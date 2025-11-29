package JavaInterviewDemoQuestions4ForInterview;

import java.util.ArrayList;

public class FirstAndLastElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Elderberry");

        String firstElement = arrayList.getFirst();
        String lastElement = arrayList.getLast();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
    }
}
