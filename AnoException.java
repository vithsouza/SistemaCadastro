/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */

/**
 *
 * @author cabre
 */
public class AnoException extends Exception {

    Leitura l = new Leitura();
    
    //metodo que informa o problema
    public void AnoPeq(){
        System.out.println("\nO ano deve ter 4 digitos!");
    }
    
    //metodo que resolve o problema
    public Computador ajustAno(Computador p2){
    
        try{
            p2.setAno_compra(Integer.parseInt(l.ColetaD("\nNovo Ano: ")));
        }
        catch(AnoException ae){
            AnoPeq();
            p2 = ajustAno(p2);
        }
        return p2;
    }
}
