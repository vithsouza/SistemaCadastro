
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabre
 */
//Vithoria Cabreira - 2410400

public class Leitura {
    public String ColetaD(String rotulo){
        System.out.println(rotulo);
        
    InputStreamReader teclado = new InputStreamReader(System.in);
    BufferedReader buffTec = new BufferedReader(teclado);

		String resp = "";

		try{
			resp = buffTec.readLine();
		}
		catch(IOException ioe){
			System.out.println("ERRO NA ENTRADA");
		}	
		
		return resp;    
        
    }
    
}
