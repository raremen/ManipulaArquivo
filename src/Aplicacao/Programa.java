package Aplicacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa {


	public static void main(String[] args) {

		// Cria arquivo e escreve dentro
		
		String [] sLinhas = new String [] { "Bom dia!", "Oh! Você por aqui!"};
		String sCaminho = "C:\\Users\\rafael.souza\\Desktop\\"
				+ "eclipse-jee-photon-R-win32-x86_64\\ProjetosDoCurso\\Manipulando_Arquivos\\T.txt";
		
		try (BufferedWriter criaArquivo  = new BufferedWriter(new FileWriter(sCaminho, true))){ // true para escrever sem deletar
			for (String sLinha : sLinhas) {
				criaArquivo.write(sLinha);
				criaArquivo.newLine(); // salta linha dentro do arquivo
			}
			
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}
}
