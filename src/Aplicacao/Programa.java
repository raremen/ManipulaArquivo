package Aplicacao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		File arquivo = new File("C:\\Users\\rafael.souza\\Desktop\\"
				+ "eclipse-jee-photon-R-win32-x86_64\\ProjetosDoCurso\\Manipulando_Arquivos\\Entrada.txt");
		Scanner sc = null;
		
		try {
			
			sc = new Scanner(arquivo);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

			
		} catch (IOException e ) {
			System.out.println("Não encontrado o local do Arquivo Entrada.txt" + e.getMessage());
		} finally {
			if (sc != null) {
			sc.close();
			}
		}

	}

}
