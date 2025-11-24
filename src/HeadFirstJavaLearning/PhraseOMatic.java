package HeadFirstJavaLearning;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"Apple", "Banana", "Mango", "Orange", "Pineapple", "Grapes", "Watermelon", "Papaya", "Strawberry", "Blueberry", "Guava", "Cherry", "Kiwi", "Pear", "Peach", "Pomegranate", "Lemon", "Lychee", "Dragon Fruit", "Coconut"};
        String[] wordListTwo = {"Beautiful", "Brave", "Calm", "Clever", "Delightful", "Eager", "Faithful", "Gentle", "Happy", "Honest", "Kind", "Lively", "Magnificent", "Nice", "Optimistic", "Polite", "Quick", "Strong", "Thoughtful", "Wise"};
        String[] wordListThree = {"Aarav", "Vihaan", "Ishaan", "Aditya", "Krishna", "Arjun", "Sara", "Diya", "Anaya", "Aarohi", "Reyansh", "Vivaan", "Myra", "Aanya", "Kabir", "Advika", "Rhea", "Dhruv", "Tara", "Neil"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " +wordListTwo[rand2] + " "+wordListThree[rand3];

        System.out.println("what we need is a " +phrase);

    }
}
