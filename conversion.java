import java.util.Scanner;

public class conversion {

    public static float metricConverter(String sourceMetric, String targetMetric, float sourceNum) {
        float targetNum = 0;
        switch (sourceMetric) {
            case "m":
                switch (targetMetric) {
                    case "cm":
                        targetNum = sourceNum * 100;
                        System.out.printf("%.1f %s = %.1f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);

                        break;

                    case "mm":
                        targetNum = sourceNum * 1000;
                        System.out.printf("%.1f %s = %.1f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
                        break;
                    default:
                        System.out.println("Try again, input not valid.");

                }
                break;

            case "km":
                switch (targetMetric) {
                    case "m":
                        targetNum = sourceNum * 1000;
                        System.out.printf("%.1f %s = %.1f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
                        break;
                    default:
                        System.out.println("Try again, input not valid.");

                }
                break;

            case "lb":
                switch (targetMetric) {
                    case "oz":
                        targetNum = sourceNum * 16;
                        System.out.printf("%.1f %s = %.1f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
                        break;
                    default:
                        System.out.println("Try again, input not valid.");

                }
                break;
            default:
                System.out.println("Try again, input not valid.");

        }

        return targetNum;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str;
        String[] strArray;
        float sourceNum;
        String sourceMetric;
        String targetMetric;

        while (true) {
            System.out.println("Please enter the metric to be converted, for example, 1 lb = oz ");
            str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.println("Thank you for using, goodbye!");
                scanner.close();
                break;
            }

            strArray = str.split(" ");
            if (strArray.length != 4) {
                System.out.println("input not valid, reenter");
                continue;
            } else {
                sourceNum = Float.parseFloat(strArray[0]);
                sourceMetric = strArray[1];
                targetMetric = strArray[3];
                metricConverter(sourceMetric, targetMetric, sourceNum);

            }

        }
        scanner.close();

    }

}