package resolucaouri;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class I1002 {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("0.0000");

        double π = (double) 3.14159;
        double raio = in.nextDouble();
        double area = raio * raio * π;

        System.out.println("A=" + form.format(area));

    }

}
