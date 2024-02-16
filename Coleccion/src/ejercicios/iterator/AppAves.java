package ejercicios.iterator;

import java.util.Iterator;

public class AppAves {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //objetos de la clase AvesEnZoo

        AvesEnZoo az1 = new AvesEnZoo("Aguilas",35,10,25);
        AvesEnZoo az2 = new AvesEnZoo("Buitres",100,55,45);
        AvesEnZoo az3 = new AvesEnZoo("Halcones",80,25,55);
   
        AvesEnZoo[] pp = {az1,az2,az3};       
       GruposDeAvesZoos cp = new GruposDeAvesZoos(pp);
       
       Iterator<AvesEnZoo> it1=cp.iterator();
        System.out.println("TIPO"+"\t"+"TOTAL"+"\t"+"MACHOS"+"\t"+"HEMBRAS"+"\n");
        while(it1.hasNext()){
            AvesEnZoo tmp=it1.next();           
            System.out.println(tmp.toString());
        }
    }   
}