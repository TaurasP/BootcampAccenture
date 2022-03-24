package lt.viko.eif.tpetrauskas;

import java.util.ArrayList;
import java.util.Arrays;

public class Day4 {
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

    }
}
