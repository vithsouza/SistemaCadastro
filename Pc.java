/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabre
 */
//Vithoria Cabreira - 2410400

public final class Pc extends Computador implements Preco{
    private String CPU;
    private String placa_video;
    private String placa_mae;
    
    //metodo construtor
    public Pc(){
        CPU = "";
        placa_video = "";
        placa_mae = "";       
    }
    
    //getter e setter
    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getPlaca_video() {
        return placa_video;
    }

    public void setPlaca_video(String placa_video) {
        this.placa_video = placa_video;
    }

    public String getPlaca_mae() {
        return placa_mae;
    }

    public void setPlaca_mae(String placa_mae) {
        this.placa_mae = placa_mae;
    }
    
    //metodo implementado
    @Override
    public boolean portatil() {
      return false;
    }
    
    //interface implementada
    @Override
    public double calculadora() {
        tam_ano = ano_compra.lenght();
    }
 
    
}
