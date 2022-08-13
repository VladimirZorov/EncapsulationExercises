import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        Box box = new Box(length, width, height);


        if (length > 0 && width > 0 && height > 0) {
            System.out.printf("Surface Area - %.2f%n", box.surfaceArea());
            System.out.printf("Lateral Surface Area - %.2f%n", box.lateralSurfaceArea());
            System.out.printf("Volume - %.2f%n", box.volume());
        }


    }

}

