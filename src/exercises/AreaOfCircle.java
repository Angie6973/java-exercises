package exercises;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main (String[]args) {
        Scanner in;

        double radius, pi, area;
        in = new Scanner(System.in);
        System.out.println(" Enter the radius:");
        radius= in.nextDouble();
        pi = 3.14;
        area = (radius * radius * pi);

        System.out.println("The area of your circle is: " + area + " square units");


        }
}

