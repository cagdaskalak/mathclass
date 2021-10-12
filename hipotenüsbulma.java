import java.util.Scanner;
public class hipotenüsbulma {
    public static void main(String[] args) throws Exception {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter the side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));

        System.out.println("The hypotenuse is : " + z);

        scanner.close();
    }
}
