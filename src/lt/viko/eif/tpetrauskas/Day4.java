package lt.viko.eif.tpetrauskas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Day4 {

    public final class Text {

        public static final String TEXT =
                "Polymorphism is the ability of an object to take on many forms The most common use of polymorphism in " +
                        "OOP occurs when a parent class reference is used to refer to a child class object\n" +
                        "\n" +
                        "Any Java object that can pass more than one IS-A test is considered to be polymorphic In Java all " +
                        "Java objects are polymorphic since any object will pass the IS-A test for their own type and for the class Object\n" +
                        "\n" +
                        "It is important to know that the only possible way to access an object is through a reference variable " +
                        "A reference variable can be of only one type Once declared the type of a reference variable cannot be changed\n" +
                        "\n" +
                        "The reference variable can be reassigned to other objects provided that it is not declared final The " +
                        "type of the reference variable would determine the methods that it can invoke on the object\n" +
                        "\n" +
                        "A reference variable can refer to any object of its declared type or any subtype of its declared type" +
                        " A reference variable can be declared as a class or interface type";

        private Text() {

        }
    }

    public void printStringArrayList(ArrayList<String> arrayList, String text) {
        System.out.print(text + ": ");
        for(String s : arrayList) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void task1() {
        String[] arrColors = new String[]{"white", "black", "red", "blue", "green", "grey", "yellow"};

        ArrayList<String> colors = new ArrayList<>();

        colors.addAll(Arrays.asList(arrColors));
        printStringArrayList(colors, "Elements copied from arrColors to colors");

        colors.remove(2);
        printStringArrayList(colors, "3rd element removed");

        colors.add("pink");
        printStringArrayList(colors, "New color added at the end");

        ArrayList<String> colorsSublist = new ArrayList<>();
        for(int i = 2; i <= 5; i++) {
            colorsSublist.add(colors.get(i));
        }
        printStringArrayList(colorsSublist, "Added elements (index 2 - 5) from colors to colorsSublist");
    }

    public void task2() {
        String[] words = Text.TEXT.split("\\s+");
        HashSet<String> uniqueWordsSet = new HashSet<>(Arrays.asList(words));

        int uniqueWordsCounter = 0;

        for(String s : uniqueWordsSet) {
            if(s.equalsIgnoreCase(s)) {
                uniqueWordsCounter++;
            }
        }
        System.out.println("Number of unique words (not case sensitive): " + uniqueWordsCounter);
    }
}
