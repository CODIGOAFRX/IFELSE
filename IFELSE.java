/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelse;

/**
 *
 * @author AlumnoT
 */
public class IFELSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota1 = 4 ;
        int nota2 = 7 ;
        int nota3 = 5 ;       
        double promedio ;
                
        promedio = (nota1 + nota2 + nota3) /3 ;
        
        if(promedio >= 5) {
            System.out.println("Pass, tu nota es " + promedio);
            
        }
        else { 
            System.out.println("FAIL, tu nota es " + promedio);
        }
    }
    
}
