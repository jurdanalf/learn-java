public class OperatorAritmatika {
    public static void main(String[] args) {

        int var1 = 7;
        int var2 = 3;
        int hasil;

        // Penjumlahan
        hasil = var1 + var2;
        System.out.printf("%d + %d = %d \n", var1, var2, hasil);

        // Pengurangan
        hasil = var1 - var2;
        System.out.printf("%d - %d = %d \n", var1, var2, hasil);

        // Perkalian
        hasil = var1 * var2;
        System.out.printf("%d x %d = %d \n", var1, var2, hasil);

        // Pembagian
        hasil = var1 / var2;
        System.out.printf("%d : %d = %d \n", var1, var2, hasil);
        // hasil bulat karna variable hasil adalah integer, yaitu bilangan bulat, bukan float/double yaitu bilangan desimal

        // Modulus (sisa pembagian)
        hasil = var1 % var2;
        System.out.printf("%d %% %d = %d", var1, var2, hasil);

    }
}
