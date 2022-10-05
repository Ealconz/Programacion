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
public enum Juegos {
    Indie(283, 586025),
    RPG(345, 3745645),
    Pelea(79, 534528),
    Shooter(468, 63429242),
    Casual(133, 5437),
    Carreras(45,639523),
    Aventuras(485, 549825);
    
    private final int juegos;
    private final int Ventas;

    private Juegos(int juegos, int Ventas) {
        this.juegos = juegos;
        this.Ventas = Ventas;
    }

    public int getJuegos() {
        return juegos;
    }

    public int getVentas() {
        return Ventas;
    }
    
    
}
