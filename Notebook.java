/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabre
 */
//Vithoria Cabreira - 2410400

public final class Notebook extends Computador implements Preco{
    private String APU;
    private double peso;
    private double tamTela;
    
    public Notebook(){
        APU = "";
        peso = 0;
        tamTela = 0;
    }
    
    //getter e setters
    public String getAPU() {    
        return APU;
    }

    public void setAPU(String APU) {
        this.APU = APU;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamTela() {
        return tamTela;
    }

    public void setTamTela(double tamTela) {    
        this.tamTela = tamTela;
    }

    //metodo implementado
    @Override
    public boolean portatil() {
        return true;
    }
    
    //interface implementada
    @Override
    public double calculadora() {
        tam_ano = ano_compra.lenght();
    }
    
}
