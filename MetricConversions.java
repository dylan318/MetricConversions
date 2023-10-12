import java.util.Scanner;

public class MetricConversions{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to metric converter!");
        System.out.println("Please input your query. For example, 1 km = m.");
        System.out.println("Enter 'exit' or '-1' to exit the program");

        while (true) {
            System.out.print("Input: ");
            String input = scanner.nextLine();

            if (input.equals("exit") || input.equals("-1")) {
                break;
            }

            String[] parts = input.split(" ");

            if (parts.length != 3) {
                System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 kg = lb");
                continue;
            }

            double value = Double.parseDouble(parts[0]);
            String fromUnit = parts[1];
            String toUnit = parts[2];

            double result = 0;

            switch (fromUnit) {
                case "kg":
                    if (toUnit.equals("lb")) {
                        result = value * 2.20462;
                    } else {
                        System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 kg = lb");
                        continue;
                    }
                    break;
                case "g":
                    if (toUnit.equals("oz")) {
                        result = value * 0.035274;
                    } else {
                        System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 g = oz");
                        continue;
                    }
                    break;
                case "km":
                    if (toUnit.equals("mile")) {
                        result = value * 0.621371;
                    } else {
                        System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 km = mile");
                        continue;
                    }
                    break;
                case "mm":
                    if (toUnit.equals("inch")) {
                        result = value * 0.0393701;
                    } else {
                        System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 mm = inch");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 km = mile");
                    continue;
            }

            System.out.println(value + " " + fromUnit + " = " + result + " " + toUnit);
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}

   


   