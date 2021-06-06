package challenge18;
//AGV
//6-5-2021

import java.util.Locale;
import java.util.Scanner;


public class Challenge18 {

    public static void main(String[] args) {


        Scanner inputs = new Scanner(System.in);

        String response = "Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.";
        OutputHere(response);
        String tempCS = inputs.nextLine();
        if(tempCS.equals("c")||tempCS.equals("C"))
        {
            response = "Your choice: C";
        }
        else
        {
            response = "Your choice: F";
        }
        OutputHere(response);
        response = "Please enter the temperature in Fahrenheit: ";
        OutputHere(response);

        response = inputs.nextLine();
        double tempCD = Double.parseDouble(response);

        if(tempCS.equals("c")||tempCS.equals("C"))
        {
            tempCD = (tempCD - 32) * 5 / 9;
            response = "The temperature in Celsius is " + tempCS.valueOf(tempCD);
            OutputHere(response);
        }
        else
        {
            tempCD = (tempCD * 9 / 5) + 32;
            response = "The temperature in Fahrenheit is " + tempCS.valueOf(tempCD);
            OutputHere(response);
        }

    }
    public static void OutputHere(String proxy)
    {
        System.out.println(proxy);
    }
}
