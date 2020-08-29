/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Persona {
    private String Nombre;
    private int Edad;
    private char Sexo;
    private double Peso;
    private double Altura;

//    CONSTRUCTOR VACIO PARA RECIBIR DATOS POT TECLADO DEL OBJETO 3
    public Persona() {
    }
//    CONSTRUCTOR CON UNCIAMENTE LOS PARAEMTROS PARA LA PERSONA 2

    public Persona(String Nombre, int Edad, char Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }
//    CONSTRUCTOR CON TODOS LOS PARAMETROS PARA LA PERSONA 1
    

    public Persona(String Nombre, int Edad, char Sexo, double Peso, double Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        int edad = this.Edad;
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
//    METODO PARA SABER SI EL OBJETO ES MAYOR O MENOR DE EDAD 
    public String EsmayordeEdad(){
        
        int edad = this.Edad;
        if (edad<18){
        return "Es menor de edad";
        }
        else{
        return "Es mayor de edad";
        }
        
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
//  METODO TOSTRING UTILIZADO PARA PRESENTAR LOS ATRIBUTOS DE LA PERSONA 1
    public String toString() {
        return "persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Peso=" + Peso + ", Altura=" + Altura + '}';
    
    }
//  METODO TOSTRING UTILIZADO PARA PRESENTAR LOS ATRIBUTOS DE LA PERSONA 2
    public String toString2() {
        return "persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + '}';
    }

    
 
}
