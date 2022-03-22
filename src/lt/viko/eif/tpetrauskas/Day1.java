package lt.viko.eif.tpetrauskas;

public class Day1 {

    byte byteExample;
    short shortExample;
    int intExample;
    long longExample;
    float floatExample;
    double doubleExample;
    boolean booleanExample;
    char charExample;

    public void task1() {
        byteExample = 100;
        shortExample = 10000;
        intExample = 100000;
        longExample = 1000000000;
        floatExample = 123.4f;
        doubleExample = 123.4;
        booleanExample = true;
        charExample = 'c';

        System.out.println("Primitive data types:"
                + "\n\tbyte = " + byteExample
                + "\n\tshort = " + shortExample
                + "\n\tint = " + intExample
                + "\n\tlong = " + longExample
                + "\n\tfloat = " + floatExample
                + "\n\tdouble = " + doubleExample
                + "\n\tboolean = " + booleanExample
                + "\n\tchar = " + charExample);
    }
}