/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author USUARIO
 */
public class ClsNegocio {

    public Double Resultado;
//    CREAMOS UN METODO PARA LOS PRIMEROS ATRIBUTOS.

    public void P1(Double Lab1, Double Par1) {

//     Ahora Realizamos el calculo del porcentaje.
        Resultado = (Lab1 * 0.40) + (Par1 * 0.60);
    }
//    CREAMOS UN METODO PARA LOS SEGUNDOS ATRIBUTOS.

    public void P2(Double Lab2, Double Par2) {

//     Ahora Realizamos el calculo del porcentaje.
        Resultado = (Lab2 * 0.40) + (Par2 * 0.60);
    }

//    CREAMOS UN METODO PARA LOS TERCEROS ATRIBUTOS.
    public void P3(Double Lab3, Double Par3) {

//     Ahora Realizamos el calculo del porcentaje.
        Resultado = (Lab3 * 0.40) + (Par3 * 0.60);
    }

    public Double RF;
//    CREAMOS UN METODO PARA EL RESULTADO.

    public void REF(Double re1, Double re2, Double re3) {

//     Ahora Realizamos el calculo del porcentaje.
        Resultado = re1 + re2 + re3;

        RF = Resultado / 3;
    }
//    CREAMOS UN METODO PARA LOS CONDICIONALES.
    public String AproRepro(Double RF) {

        if (RF >= 0 && RF < 6) {
            return "REPROBADO";

        } else {
            return "APROBADO";

        }
    }

}
