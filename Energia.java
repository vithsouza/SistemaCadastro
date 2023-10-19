/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabre
 */
public class Energia {
    private int potencia;
    private int voltagem;
    
    //metodo construtor

    public Energia(int potencia, int voltagem) {
        this.potencia = potencia;
        this.voltagem = voltagem;
    }
   

    //getter e setters
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    
}
