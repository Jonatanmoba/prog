/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supuesto14;

public class Coche extends Vehiculo{
    private int numPuertas;
    
    public Coche(int numPuertas, String marca, String modelo, String matricula) {
        super(marca, modelo, matricula);
        this.numPuertas = numPuertas;
    } 

    @Override
    public String toString() {
        return "Coche{" + super.toString()+" numPuertas=" + numPuertas + '}';
    }   
}
