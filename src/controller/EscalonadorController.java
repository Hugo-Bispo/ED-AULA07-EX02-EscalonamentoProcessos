package controller;

import br.edu.fateczl.hugobispo.filastring.Fila;

public class EscalonadorController {

	public void Escalonador(Fila fila) {
		String name = "";
		if(fila.size() == 0) {
			System.out.println("Tamanho fila Invalida");
		}
		try {
			name = fila.remove();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String num [] = name.split(";");
		int qtdvezes = Integer.parseInt(num[1]);
		System.out.println(qtdvezes);
	}

}
