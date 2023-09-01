package Fundamentos;

public class Wrappers {
    public static void main(String[] args) {

        // Byte
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; // int
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(i);

        Float f = 123.23F;
        System.out.println(f);

        Double d = 1234.123123;
        System.out.println(d);

        Boolean boo = Boolean.parseBoolean("true");
        System.out.println(boo);
        System.out.println(boo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c + "...");

    }
}
