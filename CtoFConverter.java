import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {

        double degreesFahrenheit;
        double degreesCelsius;
        String trash;
        Boolean correct = false;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("What is the temperature in Celsius?");
            if (in.hasNextDouble()) {
                correct=true;
                degreesCelsius = in.nextDouble();
                degreesFahrenheit = degreesCelsius * 1.8 + 32;
                System.out.printf("The temperature in fahrenheit is " + degreesFahrenheit + " degrees Fahrenheit");
            } else {
                trash = in.nextLine();
                System.out.println("ERROR:You have input an invalid temperature: " + trash + ". Please try again.");
            }
        }while(!correct);
    }
}
