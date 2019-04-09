import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Resolucao1042 {
 
    public static void main(String[] args) throws IOException {
 
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
            String line = reader.readLine();      
            String array[] = line.split(" ");  
           
            int x = 0,y = 0,z = 0;
            
            x = Integer.parseInt(array[0]);
            y = Integer.parseInt(array[1]);
            z = Integer.parseInt(array[2]);
            
            int inx = x;int iny = y;int inz = z;
            
            int maior = Math.max(x, Math.max(y, z));
            int medio = 0, menor = 0;
            if(x == maior){
                medio = Math.max(y, z); 
                menor = Math.min(y, z);
            }else if(y == maior){
                medio = Math.max(x, z);
                menor = Math.min(x, z);
            } else if (z == maior){
                medio = Math.max(x, y);
                menor = Math.min(x, y);
            }
            
            System.out.println(menor);
            System.out.println(medio);
            System.out.println(maior);
            System.out.print("\n");
            System.out.println(inx);
            System.out.println(iny);
            System.out.println(inz);   
         
 
    }
 
}
