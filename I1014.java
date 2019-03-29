
package resolucaouri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Resolucao1014 {
    
    public static void main(String [] args) throws IOException{
    
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.000");
               
        int x = Integer.parseInt(reader.readLine());
        float y = Float.parseFloat(reader.readLine());
        
        float valor = x/y;
        
        System.out.println(df.format(valor) + " km/l");
       
    } 
    
}
