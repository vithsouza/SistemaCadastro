/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cabre
 */
//Vithoria Cabreira - 2410400

public class Tstcomp {

    
    public static void main(String[] args) {
       Leitura l = new Leitura();
       Pc p1 = new Pc();
       Notebook n1 = new Notebook();
       Quantico q1 =  new Quantico();
       
       p1.setCPU(l.ColetaD("\nCPU: "));
       p1.setPlaca_video(l.ColetaD("\nPlaca de video: "));
       p1.setPlaca_mae(l.ColetaD("\nPlaca mae:"));
       
       n1.setAPU(l.ColetaD("\nAPU: "));
       n1.setPeso(Double.parseDouble(l.ColetaD(("\nPeso: "))));
       n1.setTamTela(Double.parseDouble(l.ColetaD("\nTamanho da tela: ")));
       
       q1.setQtdBits(Double.parseDouble(l.ColetaD(("\nQud de Bits: "))));
       q1.setNome(l.ColetaD("\nNome"));
       q1.setDono(l.ColetaD("\nDono"));
       
       
       int potencia = Integer.parseInt(l.ColetaD("\nPotencia: "));
       int voltagem = Integer.parseInt(l.ColetaD("\nVoltagem: "));
       Energia bat = new Energia(potencia, voltagem);
       
       p1.setMarca(l.ColetaD("\nMarca:"));
       p1.setAno_compra(Integer.parseInt("\nAno de compra: "));
       
       
       
    }
    
}
