/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabre
 */
//Vithoria Cabreira - 2410400
public abstract class Computador {
       private String marca;
       private int ano_compra;
       private Energia bat;
       
       //metodo não implementado
    public abstract boolean portatil();
       
       //metodo construtor
    public Computador(){
        marca = "";
        ano_compra = 0;
           
       }

    public Computador(Energia bat) {
        this.bat = bat;
    }
       
      
    //getter e setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno_compra(int ano_compra) throws AnoException{
            if(tam_ano > 4 || tam_ano < 4){
                System.out.println("O ano deve ter 4 digitos");
                throw new AnoException;
            }
            else{
                this.ano_compra = ano_compra;
            }
        }

    public int getAno_compra() {
        return ano_compra;
    }

    public Energia getBat() {
        return bat;
    }

    public void setBat(Energia bat) {
        this.bat = bat;
    }


}
