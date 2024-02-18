public class Loop {
    public static void main(String[] args) {
        // looping for
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.println( i + " adalah bilangan Prima");
            }
        }

        for (int s = 1; s <= 10; s++) {
            System.out.print("o ");
        }
        System.out.println("\n");

        // looping dengan foreach
        String[] cars = {"Honda","Toyota","Hyundai","Wuling"};
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
