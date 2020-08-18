/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahora;
//import java.util.Date;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author monte
 */
public class DataHora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Date data = new Date();
        System.out.println("Data agora: " + data);*/
   Calendar c = Calendar.getInstance();
   Calendar d = Calendar.getInstance();
   String d = d.get(Calendar.DAY_OF_WEEK);
   int h = c.get(Calendar.HOUR_OF_DAY);
   if(h>=00 && h<12){
       System.out.println("bom dia");
    }
   if(h>=12 && h<=18){
        System.out.println("boa tarde");
}
   else if(h>=18 && h<=24){}
            System.out.println("Tenha uma ótima " + d);
    }}