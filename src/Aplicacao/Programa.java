package Aplicacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Programa {


	public static void main(String[] args) {

		String sCaminho = "C:\\Users\\rafael.souza\\Desktop\\"
				+ "eclipse-jee-photon-R-win32-x86_64\\ProjetosDoCurso\\Manipulando_Arquivos\\Entrada.txt";

		try ( BufferedReader lerEscrita = new BufferedReader(new FileReader(sCaminho))) {
			String sLinha = lerEscrita.readLine();
			
			while (sLinha != null) {
				System.out.println(sLinha);
				sLinha = lerEscrita.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Arquivo não encontrado: \n" + e.getMessage() + " Erro que aconteceu");
		}
		
	}
}
