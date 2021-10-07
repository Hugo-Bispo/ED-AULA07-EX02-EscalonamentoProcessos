package view;
import br.edu.fateczl.hugobispo.filastring.Fila;
import controller.EscalonadorController;


public class Principal {
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		EscalonadorController Econt = new EscalonadorController();
		String vetor[] = { "notepad.exe;14", "write.exe;35", "chrome.exe;27", "acrobat.exe;52", "firefox.exe;18",
				"word.exe;25" };
		for (int i = 0; i < vetor.length; i++) {
			fila.insert(vetor[i]);
		}
		Econt.Escalonador(fila);
	}
}
