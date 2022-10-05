/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeracion;

/**
 *
 * @author elias
 */
public enum Continentes {
    AFRICA(53, 4000),
    EUROPA(46, 40000),
    ASIA(44, 10000),
    AMERICA(34, 5000),
    OCEANIA(14,4999);
    
    private final int numPaises;
    private final int superficie;
    Continentes(int numPaises, int superficie) {
        this.numPaises = numPaises;
        this.superficie = superficie;
    }
    public int getNumPaises(){
        return numPaises;
    }

    public int getSuperficie() {
        return superficie;
    }
    
}
