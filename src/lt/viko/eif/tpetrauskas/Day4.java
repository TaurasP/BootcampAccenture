package lt.viko.eif.tpetrauskas;

import java.io.File;
import java.io.FilenameFilter;
import java.util.*;

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

    public void task3() {
        // EXERCISES FROM https://www.w3resource.com/java-exercises/collection/index.php

        // Java Collection: ArrayList Exercises
        // Exercise 1
        List<String> colorsList = new ArrayList<>();
        colorsList.add("black");
        colorsList.add("white");
        colorsList.add("red");
        colorsList.add("green");
        colorsList.add("blue");

        // Exercise 2
        System.out.print("Array List of colors: ");
        for(String s : colorsList) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Exercise 3
        colorsList.add(0, "pink");
        System.out.println("Array List of colors: " + colorsList);

        // Exercise 4
        System.out.println(colorsList.get(2));

        // Exercise 5
        colorsList.set(0, "yellow");
        System.out.println("Array List of colors: " + colorsList);

        //Java Collection: LinkedList Exercises
        // Exercise 1
        LinkedList<String> colorsLinkedList = new LinkedList<>();
        colorsLinkedList.add("black");
        colorsLinkedList.add("white");
        colorsLinkedList.add("red");
        colorsLinkedList.add("green");
        colorsLinkedList.add("blue");

        // Exercise 2
        System.out.print("LinkedList of colors: ");
        for(String s : colorsLinkedList) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Exercise 3
        int from = 2;
        int to = 4;
        System.out.print("LinkedList of colors (range from " + from + " - " + " to): ");
        for(int i = from; i <= to; i++) {
            System.out.print(colorsLinkedList.get(i) + " ");
        }
        System.out.println();

        // Exercise 4
        System.out.print("LinkedList of colors (in reverse order): ");
        for(int i = colorsLinkedList.size() - 1; i >= 0; i--) {
            System.out.print(colorsLinkedList.get(i) + " ");
        }
        System.out.println();

        // Exercise 5
        colorsLinkedList.add(0, "grey");
        System.out.println("Linked List of colors: " + colorsLinkedList);

        // Java Collection: HashSet Exercises
        // Exercise 1
        HashSet<String> hashSetOfColors = new HashSet<>();
        hashSetOfColors.add("black");
        hashSetOfColors.add("white");
        hashSetOfColors.add("red");
        hashSetOfColors.add("green");
        hashSetOfColors.add("blue");
        System.out.println("The Hash Set of colors: " + hashSetOfColors);

        // Exercise 2
        System.out.print("The Hash Set of colors: ");
        Iterator<String> iterator = hashSetOfColors.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Exercise 3
        System.out.println("Hash Set consists of " + hashSetOfColors.size() + " elements.");

        // Exercise 4
        hashSetOfColors.removeAll(hashSetOfColors);
        System.out.println("The Hash Set of colors: " + hashSetOfColors);

        // Exercise 5
        if(hashSetOfColors.isEmpty()) {
            System.out.println("Hash Set is empty.");
        } else {
            System.out.println("Hash Set is not empty, it has " + hashSetOfColors.size() + " elements inside.");
        }

        // Java Collection: TreeSet Exercises
        // Exercise 1
        TreeSet<String> treeSetOfColors = new TreeSet<>();
        treeSetOfColors.add("black");
        treeSetOfColors.add("white");
        treeSetOfColors.add("red");
        treeSetOfColors.add("green");
        treeSetOfColors.add("blue");
        System.out.println("Tree Set of colors: " + treeSetOfColors);

        // Exercise 2
        System.out.print("Tree Set of colors: ");
        iterator = treeSetOfColors.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Exercise 3
        TreeSet<String> anotherTreeSetOfColors = new TreeSet<>();
        anotherTreeSetOfColors.addAll(treeSetOfColors);
        System.out.println("The another Tree Set of colors: " + anotherTreeSetOfColors);

        // Exercise 4
        System.out.print("Tree Set of colors (in reverse order): ");
        Iterator iteratorInReverse = treeSetOfColors.descendingIterator();
        while (iteratorInReverse.hasNext()) {
            System.out.print(iteratorInReverse.next() + " ");
        }
        System.out.println();

        // Exercise 5
        System.out.println("First element in a tree set: " + treeSetOfColors.first());
        System.out.println("Last element in a tree set: " + treeSetOfColors.last());

        // Java Collection: PriorityQueue Exercises
        // Exercise 1
        PriorityQueue<String> priorityQueueOfColors = new PriorityQueue<>();
        priorityQueueOfColors.add("black");
        priorityQueueOfColors.add("white");
        priorityQueueOfColors.add("red");
        priorityQueueOfColors.add("green");
        priorityQueueOfColors.add("blue");
        System.out.println("Priority Queue of colors: " + priorityQueueOfColors);

        // Exercise 2
        System.out.print("Priority Queue of colors: ");
        iterator = priorityQueueOfColors.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Exercise 3
        PriorityQueue<String> anotherPriorityQueueOfColors = new PriorityQueue<>();
        anotherPriorityQueueOfColors.addAll(priorityQueueOfColors);
        System.out.println("The another Priority Queue of colors: " + anotherPriorityQueueOfColors);

        // Exercise 4
        priorityQueueOfColors.offer("pink");
        System.out.println("Priority Queue of colors: " + priorityQueueOfColors);

        // Exercise 5
        priorityQueueOfColors.clear();
        System.out.println("Priority Queue of colors: " + priorityQueueOfColors);

        // Java Collection: HashMap Exercises
        // Exercise 1
        HashMap<Integer, String> hashMapOfColors = new HashMap<>();
        hashMapOfColors.put(1, "black");
        hashMapOfColors.put(2, "white");
        hashMapOfColors.put(3, "red");
        hashMapOfColors.put(4, "green");
        hashMapOfColors.put(5, "blue");

        System.out.print("Hash Map of colors: ");
        for(Map.Entry m : hashMapOfColors.entrySet()) {
            System.out.print(m.getKey() + " = " + m.getValue() + " | ");
        }
        System.out.println();

        // Exercise 2
        System.out.print("Hash Map size: " + hashMapOfColors.size());
        System.out.println();

        // Exercise 3
        HashMap<Integer, String> anotherHashMapOfColors = new HashMap<>();
        anotherHashMapOfColors.put(6, "lavender");
        anotherHashMapOfColors.put(7, "purple");
        anotherHashMapOfColors.putAll(hashMapOfColors);
        System.out.println("Another Hash Map of colors: " + anotherHashMapOfColors);

        // Exercise 4
        anotherHashMapOfColors.clear();
        System.out.println("Another Hash Map of colors: " + anotherHashMapOfColors);

        // Exercise 5
        if(anotherHashMapOfColors.isEmpty()) {
            System.out.println("Another Hash Map is empty.");
        } else {
            System.out.println("Another Hash Set is not empty, it has " + anotherHashMapOfColors.size() + " pairs inside.");
        }

        // Java Collection: TreeMap Exercises
        // Exercise 1
        TreeMap<Integer, String> treeMapOfColors = new TreeMap<>();
        treeMapOfColors.put(1, "black");
        treeMapOfColors.put(2, "white");
        treeMapOfColors.put(3, "red");
        treeMapOfColors.put(4, "green");
        treeMapOfColors.put(5, "blue");

        System.out.print("Tree Map of colors: ");
        for(Map.Entry m : treeMapOfColors.entrySet()) {
            System.out.print(m.getKey() + " = " + m.getValue() + " | ");
        }
        System.out.println();

        // Exercise 2
        TreeMap<Integer, String> anotherTreeMapOfColors = new TreeMap<>();
        anotherTreeMapOfColors.put(6, "marble");
        anotherTreeMapOfColors.put(7, "pink");
        anotherTreeMapOfColors.putAll(treeMapOfColors);
        System.out.print("Tree Map of colors: " + anotherTreeMapOfColors);
        System.out.println();

        // Exercise 3
        int key = 1;
        System.out.println("Value of key " + key + " at another Tree Map of colors: " + anotherTreeMapOfColors.get(key));

        // Exercise 4
        String value = "pink";
        System.out.print("Tree Map of colors: ");
        for(Map.Entry m : anotherTreeMapOfColors.entrySet()) {
            if(value.equals(m.getValue())) {
                System.out.println("Value's " + value + " key: " + m.getKey());
            } else {
                System.out.println("Value's " + value + " key was not found.");
            }
        }

        // Exercise 5
        System.out.print("Another Tree Map of colors Set of keys: ");
        Set<Integer> keys = anotherTreeMapOfColors.keySet();
        for(Integer i : keys) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public void task4() {
        // EXERCISES FROM https://www.w3resource.com/java-exercises/io/index.php

        // Java Input-Output Exercises
        // Exercise 1
        System.out.println("List of this project's directory names: ");
        File file = new File("/Users/tauras/Documents/Projects/Java/BootcampAccenture/");
        String[] fileList = file.list();
        for(String name : fileList) {
            System.out.println(name);
        }
        System.out.println();

        // Exercise 2
        System.out.println("List of .md files: ");
        File[] fileListMD = file.listFiles((d,f)-> f.toLowerCase().endsWith(".md"));

        for(File f : fileListMD) {
            System.out.println(f.getAbsolutePath());
        }

        // Alternative way by implementing FileNameFilter as an anonymous class
        System.out.println("List of .gitignore files: ");
        File[] fileListGitIgnore = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".gitignore"))
                    return true;
                else
                    return false;
            }
        });

        for(File f : fileListGitIgnore) {
            System.out.println(f.getAbsolutePath());
        }

        // Exercise 3
        File fileReadMe = new File("/Users/tauras/Documents/Projects/Java/BootcampAccenture/README.md");
        System.out.println(file.exists() ? "File " + fileReadMe.getName() + " exists." : "File" + fileReadMe.getName() + " does not exist.");

        // Exercise 4
        if(file.canWrite() || fileReadMe.canRead()) {
            if(file.canWrite() && fileReadMe.canRead()) {
                System.out.println(file.getAbsolutePath() + " has read and write permissions.");
            }
            else if(file.canWrite()) {
                System.out.println(file.getAbsolutePath() + " has write permissions.");
            }
            else if(file.canRead()) {
                System.out.println(file.getAbsolutePath() + " has read permissions.");
            }
        } else {
            System.out.println(fileReadMe.getAbsolutePath() + " has no write or read permissions.");
        }

        // Exercise 5
        System.out.println(file.isFile() ? file.getAbsolutePath() + " is a file." : file.getAbsolutePath() + " is a directory.");
        System.out.println(fileReadMe.isFile() ? fileReadMe.getAbsolutePath() + " is a file." : fileReadMe.getAbsolutePath() + " is a directory.");
    }

}
