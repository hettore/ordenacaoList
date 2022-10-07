package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entities.Gato;

public class ExemploOrdenaçãoList {

	public static void main(String[] args) {

		List<Gato> meusGatos = new ArrayList<>() {
			{
				add(new Gato("Jon", 18, "preto"));
				add(new Gato("Simba", 6, "tigrado"));
				add(new Gato("Jon", 12, "amarelo"));
			}
		};

		// mostrar na ordem inserida.
		System.out.println(meusGatos);

		System.out.println();

		// organizar em ordem aleatoria
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);

		System.out.println();
		
		// ordem natural.
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println();
		
		// ordenar por idade (as duas formas funcionam)
		//Collections.sort(meusGatos, new ComparatorIdade() );
		 meusGatos.sort(new ComparatorIdade());
		
		System.out.println(meusGatos);
		
		System.out.println();
		
		// ordem cor.
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
		
		System.out.println();
		
		// ordenar por cor/nome/idade.
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
	}
}
