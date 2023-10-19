/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabre
 */
//Vithoria Cabreira - 2410400

public class Quantico extends Computador implements Preco {
        private double qtdBits;
        private String nome;
        private String dono;
        
        //metodo construtor
        public Quantico(){
            qtdBits = 0;
            nome = "";
            dono = "";
        }  
    
    //getter e setter
    public double getQtdBits() {
        return qtdBits;
    }

    public void setQtdBits(double qtdBits) {
        this.qtdBits = qtdBits;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    //metodo implementado
    @Override
    public boolean portatil() {
      return false;
    }
    
    //interface implementada
    @Override
    public double calculadora() {
        return 0;
    }
    
}
