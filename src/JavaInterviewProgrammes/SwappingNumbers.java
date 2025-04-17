package JavaInterviewProgrammes;

public class SwappingNumbers {
    public static void main(String[] args) {
        int temp,a=10,b=20;
        System.out.println( "Before Swapping a= "+a+" b= "+b);
        temp=a;
        a =b;
        b=temp;
        System.out.println( "After Swapping a= "+a+" b= "+b);

    }
}
