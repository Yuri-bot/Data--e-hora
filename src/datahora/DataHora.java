
package datahora;

import java.util.Calendar;


public class DataHora {

    public static void main(String[] args) {
       
   Calendar c = Calendar.getInstance();
  
  
   int h = c.get(Calendar.HOUR_OF_DAY);
   if(h>=00 && h<12){
       System.out.println("bom dia");
    }
   else if(h>=12 && h<18){
        System.out.println("boa tarde");
}
   else if(h>=18 && h<=24){}
            System.out.println("Boa noite");
    }}