package W3SchoolsJavaLearning;

//filename: Main.java
public class Test {
    int modelYear;
    String modelName;

    public Test(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public static void main(String[] args) {
        Test myCar = new Test(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}

