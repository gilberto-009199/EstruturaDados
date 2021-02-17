import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import ListaEncadeada.SimplesLinkedList;
import arranjos.Arranjo;
import test.ArranjoTest;

public class Main {

	public static void main(String[] args) {
		/* Arranjos
		Arranjo arranjo = new Arranjo();

		System.out.println("Resultados: ");
		System.out.println(" Min }> " + arranjo.menor());
		System.out.println(" Max }> " + arranjo.maior());
		System.out.println(" Sum }> " + arranjo.soma());
        // Chama o junit para testar 
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        Result result = junit.run(ArranjoTest.class);
        
        System.out.println("Resultado JUnit: "+
                            "\n Falhas: " + result.getFailureCount() +
                            "\n Testes Ignorados: " + result.getIgnoreCount() +
                            "\n Testes executados: " + result.getRunCount() +
                            "\n Tempo: " + result.getRunTime() + "ms");
		 */
		
		SimplesLinkedList<String> lista = new SimplesLinkedList<String>();
		
		lista.add("Bom dia");
		lista.add("Bom tarde");
		lista.add("Bom noite");
		
		System.out.println(lista.toString());
	}

}
