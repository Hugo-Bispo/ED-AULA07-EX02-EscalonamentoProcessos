package controller;

import br.edu.fateczl.hugobispo.filastring.Fila;

public class EscalonadorController {

	public void Escalonador(Fila fila) {
		String name = "";
		while (fila.size() != 0) {
			try {
				name = fila.remove();
			} catch (Exception e) {
				e.printStackTrace();
			}
			String num[] = name.split(";");
			int valor_processo = Integer.parseInt(num[1]);
			System.out.println("Processo " + num[0] + " Valor atual: " + num[1]);
			valor_processo--;
			if (valor_processo > 1) {
				fila.insert(num[0]+";"+valor_processo);
			}
		}
	}

}
