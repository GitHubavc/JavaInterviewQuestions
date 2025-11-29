package JavaInterviewDemoQuestions4ForInterview;

import java.util.Objects;

public class HashcodeAndEquals {
    private int id;
    private String name;

    public HashcodeAndEquals(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int hashCode() {
        return Objects.hash(id,name);
    }

    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(obj==null || getClass() != obj.getClass())
            return false;
        HashcodeAndEquals hashEqual = (HashcodeAndEquals) obj;
        return id == hashEqual.id && Objects.equals(name,hashEqual.name);

    }

    public static void main(String[] args) {
        HashcodeAndEquals he1 = new HashcodeAndEquals(1,"Alice");
        HashcodeAndEquals he2 = new HashcodeAndEquals(2,"Ted");
        HashcodeAndEquals he3 = new HashcodeAndEquals(3,"Tom");

        System.out.println("he1.equals(he2) : " +he1.equals(he2));
        System.out.println("he1.equals(he3) : " +he1.equals(he3));

        System.out.println("Hashcode of he1: " +he1.hashCode());
        System.out.println("Hashcode of he2: " +he2.hashCode());
        System.out.println("Hashcode of he3: " +he3.hashCode());


    }
}
