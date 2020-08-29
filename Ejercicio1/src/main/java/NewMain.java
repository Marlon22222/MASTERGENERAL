
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        OBTENCION DE DATOS 
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String Nombre = sc.nextLine();
        System.out.println("ingrese su edad ");
        int Edad = sc.nextInt();
        System.out.println("ingrese su genero ");
        char Sexo = sc.next().charAt(0);
        System.out.println("ingrese su peso ");
        Double Peso = sc.nextDouble();
        System.out.println("ingrese su Altura ");
        Double Altura = sc.nextDouble();
        
        Persona persona1 = new Persona(Nombre, Edad, Sexo, Peso, Altura);
        System.out.println(persona1.toString());
        System.out.println(persona1.EsmayordeEdad());
        
        Persona persona2 = new Persona(persona1.getNombre(),persona1.getEdad(),persona1.getSexo());
        System.out.println(persona2.toString2());
        System.out.println(persona2.EsmayordeEdad());
        
        Persona persona3 = new Persona();
        persona3.setNombre(Nombre);
        persona3.setEdad(Edad);
        persona3.setSexo(Sexo);
        persona3.setPeso(Peso);
        persona3.setAltura(Peso);
        
        
        System.out.println(persona3.toString());
        System.out.println(persona3.EsmayordeEdad());
        
        
        
        
        
        

        
        

    }
    
}
