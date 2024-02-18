package com.tutorial;

public class DataType {
    public static void main(String[] args) {

        // tipe data primitif adalah tipe data yang besar ukurannya FIX
        // tipe data primitif : integer, long, byte, short, double, char, boolean, float

        // byte (satuan)
        byte b = 15;
        System.out.println("==== BYTE ====");
        System.out.println("Nilai byte i adalah " + b);
        System.out.println("Nilai max i adalah " + Byte.MAX_VALUE);
        System.out.println("Nilai min i adalah " + Byte.MIN_VALUE);
        System.out.println("Besar byte i adalah " + Byte.BYTES + " bytes");
        System.out.println("Besar byte i adalah " + Byte.SIZE + " bit");

        System.out.println("\n");

        // short (satuan)
        short s = 12;
        System.out.println("==== SHORT ====");
        System.out.println("Nilai short i adalah " + s);
        System.out.println("Nilai max i adalah " + Short.MAX_VALUE);
        System.out.println("Nilai min i adalah " + Short.MIN_VALUE);
        System.out.println("Besar short i adalah " + Short.BYTES + " bytes");
        System.out.println("Besar short i adalah " + Short.SIZE + " bit");

        System.out.println("\n");

        // integer (satuan)
        int i = 10;
        System.out.println("==== INTEGER ====");
        System.out.println("Nilai integer i adalah " + i);
        System.out.println("Nilai max i adalah " + Integer.MAX_VALUE);
        System.out.println("Nilai min i adalah " + Integer.MIN_VALUE);
        System.out.println("Besar integer i adalah " + Integer.BYTES + " bytes");
        System.out.println("Besar integer i adalah " + Integer.SIZE + " bit");

        System.out.println("\n");

        // long (satuan)
        long l = 10L;
        // boleh dikasih "L" boleh tidak, hanya untuk menandakan
        System.out.println("==== LONG ====");
        System.out.println("Nilai long i adalah " + l);
        System.out.println("Nilai max i adalah " + Long.MAX_VALUE);
        System.out.println("Nilai min i adalah " + Long.MIN_VALUE);
        System.out.println("Besar long i adalah " + Long.BYTES + " bytes");
        System.out.println("Besar long i adalah " + Long.SIZE + " bit");

        System.out.println("\n");

        // double (desimal, koma, bilangan real)
        double d = 3.54d;
        // boleh dikasih "d" boleh tidak, hanya untuk menandakan
        System.out.println("==== DOUBLE ====");
        System.out.println("Nilai double i adalah " + d);
        System.out.println("Nilai max i adalah " + Double.MAX_VALUE);
        System.out.println("Nilai min i adalah " + Double.MIN_VALUE);
        System.out.println("Besar double i adalah " + Double.BYTES + " bytes");
        System.out.println("Besar double i adalah " + Double.SIZE + " bit");

        System.out.println("\n");

        // float (desimal, koma, bilangan real)
        float f = 35.4f;
        // harus dikasih "f", hanya untuk menandakan
        System.out.println("==== FLOAT ====");
        System.out.println("Nilai float i adalah " + f);
        System.out.println("Nilai max i adalah " + Float.MAX_VALUE);
        System.out.println("Nilai min i adalah " + Float.MIN_VALUE);
        System.out.println("Besar float i adalah " + Float.BYTES + " bytes");
        System.out.println("Besar float i adalah " + Float.SIZE + " bit");

        System.out.println("\n");

        // char (karakter) berdasarkan ASCII
        char c = 'c';
        System.out.println("==== CHAR ====");
        System.out.println("Nilai char i adalah " + c);
        System.out.println("Nilai max i adalah " + Character.MAX_VALUE);
        System.out.println("Nilai min i adalah " + Character.MIN_VALUE);
        System.out.println("Besar char i adalah " + Character.BYTES + " bytes");
        System.out.println("Besar char i adalah " + Character.SIZE + " bit");

        System.out.println("\n");

        // boolean (true | flase)
        boolean val = true;
        System.out.println("==== BOOLEAN ====");
        System.out.println("Nilai boolean i adalah " + val);
        System.out.println("Nilai max i adalah " + Boolean.TRUE);
        System.out.println("Nilai min i adalah " + Boolean.FALSE);

    }
}
