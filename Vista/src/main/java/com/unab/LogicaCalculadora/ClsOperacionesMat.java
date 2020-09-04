/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.LogicaCalculadora;

/**
 *
 * @author USUARIO
 */
public class ClsOperacionesMat {
    private Double Dato1;
    private Double Dato2;

    public Double getDato1() {
        return Dato1;
    }

    public void setDato1(Double Dato1) {
        this.Dato1 = Dato1;
    }

    public Double getDato2() {
        return Dato2;
    }

    public void setDato2(Double Dato2) {
        this.Dato2 = Dato2;
    }

    public Double Suma(Double Dato1, Double Dato2) {
        this.Dato1 = Dato1;
        this.Dato2 = Dato2;
        
        
        return Dato1+Dato2;
    }
    
    
}
