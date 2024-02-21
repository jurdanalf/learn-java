public class KonversiTipeDataNumeric {
    public static void main(String[] args) {
        // konversi data
        int nilaiInt = 98;
        System.out.println("nilai int = " + nilaiInt);
        // ukuran tipe data int adalah 32 bit

        // kita ubah tipe data ke yang lebih besar yaitu long
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);

        // kalo kita ubah ke tipe data yang lebih kecil ukurannya, contoh : byte
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);

        float a = 10;
        int b = 4;
        float c = a/b;
        System.out.println(a + " / " + b + " = " + c);
        // agar hasil sesuai, bisa salah satu yang membagi atau dibagi di ubah menjadi float

        int x = 20;
        int y = 3;
        float z = (float) x/y;
        System.out.println(x + " / " + y + " = " + z);
        // agar hasil sesuai, bisa juga hasil nya di konversi menjadi float
    }
}
