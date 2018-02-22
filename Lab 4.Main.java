import java.util.Scanner;


public class Main {


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // scanner
        String hexadecimal;
        int testLength;
        long finalValue = 0;
        int power = 1;
        char A = 'A';
        char a = 'a';
        char B = 'B';
        char C = 'C';
        char D = 'D';
        char E = 'E';
        char F = 'F';
        char b = 'b';
        char c = 'c';
        char d = 'd';
        char e = 'e';
        char f = 'f';
        char x = 'x';
        char X = 'X';
        System.out.print("Enter a hexadecimal number: ");
        hexadecimal = scanner.next();
        testLength = hexadecimal.length();

        while (power <= testLength)
        {
            if ((hexadecimal.charAt(testLength - power) == a) || (hexadecimal.charAt(testLength - power) == A))
            {
                finalValue += Character.getNumericValue(hexadecimal.charAt(testLength - power)) * Math.pow(16, power - 1);
            }
            else if ((hexadecimal.charAt(testLength - power) == b) || hexadecimal.charAt(testLength - power) == B)
            {
                finalValue += Character.getNumericValue(hexadecimal.charAt(testLength - power)) * Math.pow(16, power - 1);
            }
            else if (hexadecimal.charAt(testLength - power) == c || hexadecimal.charAt(testLength - power) == C)
            {
                finalValue += Character.getNumericValue(hexadecimal.charAt(testLength - power)) * Math.pow(16, power - 1);
            }
            else if (hexadecimal.charAt(testLength - power) == d || hexadecimal.charAt(testLength - power) == D)
            {
                finalValue += Character.getNumericValue(hexadecimal.charAt(testLength - power)) * Math.pow(16, power - 1);
            }
            else if (hexadecimal.charAt(testLength - power) == e || hexadecimal.charAt(testLength - power) == E)
            {
                finalValue += Character.getNumericValue(hexadecimal.charAt(testLength - power)) * Math.pow(16, power - 1);
            }
            else if (hexadecimal.charAt(testLength - power) == f || hexadecimal.charAt(testLength - power) == F)
            {
                finalValue += Character.getNumericValue(hexadecimal.charAt(testLength - power)) * Math.pow(16, power - 1);
            }
            else if (hexadecimal.charAt(testLength - power) == '1' || hexadecimal.charAt(testLength - power) == '2' ||
                    hexadecimal.charAt(testLength - power) == '3' || hexadecimal.charAt(testLength - power) == '4' ||
                    hexadecimal.charAt(testLength - power) == '5' || hexadecimal.charAt(testLength - power) == '6' ||
                    hexadecimal.charAt(testLength - power) == '7' || hexadecimal.charAt(testLength - power) == '8' ||
                    hexadecimal.charAt(testLength - power) == '9' || hexadecimal.charAt(testLength - power) == '0')
            {

                finalValue += Character.getNumericValue(hexadecimal.charAt(testLength - power)) * Math.pow(16, power - 1);

            }
            else if (hexadecimal.charAt(testLength - power) == x || hexadecimal.charAt(testLength - power) == X)
             {
               power = testLength + 1;
            }
            power++;
        }

        System.out.println("Your number is " + finalValue + "in decimal");
    }
}

