/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifesspa.exerciciosfixacao;

/**
 *
 * @author massa
 */
public class Retangulo {
    public double w;
    public double h;
    
    
    public double calcularArea(){
        return w * h;
    }
    
    public double calcularPerimetro(){
        return (w * 2) + (h * 2);
    }
    
    public double calcularDiagonal(){
        return Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
    }
    
    public String toString(){
        return "AREA = " +
                String.format("%.2f", calcularArea()) +
                "\nPERIMETRO = " +
                String.format("%.2f", calcularPerimetro()) +
                "\nDiagonal = " +
                String.format("%.2f", calcularDiagonal());
    }
}
