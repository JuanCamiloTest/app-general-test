package services;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class LogicaTestService {
	
	public void useValidationDataType() {
		System.out.println("\n\n-----------Get Data Type :)!!!-----------");
		Integer myInteger = 0;
		int myInt = 1;
		String myStr = "Hellow world!!!";
		
		System.out.println("is type "
				+ myInteger.getClass().getSimpleName());
		System.out.println("is type "
				+ ((Object)myInt).getClass().getSimpleName());// obligatior realizar el casteo a Object por ser un dato primitivo.
		System.out.println("is type "
				+ myStr.getClass().getSimpleName());
		
		System.out.println("\n\n-----------Instanceof :)!!!-----------");
		System.out.println("is instanceof: " + ((Object)myInt instanceof Integer));// se debe casteeear como Object por ser un dato primitivo y el operador instanceof funciona solo con tipos de datos como objetos.
		System.out.println("is instanceof: " + (myInteger instanceof Integer));
		System.out.println("is instanceof: " + (myStr instanceof String));
		System.out.println("is instanceof: " + ((Object)myInt instanceof String));
		System.out.println("is instanceof: " + ((Object)myInteger instanceof String));// apesar de ser un Integer, es obligatiorio el casteo a Object, la razón por la diferencia de tipo de dato.

	}

	public void useSwitchExpresion() {
		System.out.println("\n\n-----------Swich expresion :)!!!-----------");
		String strSwitchExpresion = switch (1) {
		case 1: {
			yield "Hellow Case 1 :)!!!";
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		};

		String strSwitchExpresionLamda = switch (33) {
		case 11 -> "Hellow Case lamda 1 :)!!!";
		case 22 -> {
			yield "Hellow Case lamda 2 :)!!!";
		}
		case 33 -> "Hellow Case lamda 3 :)!!!";

		default -> throw new IllegalArgumentException("Unexpected value: ");
		};

		System.out.println("switch 1: " + strSwitchExpresion);
		System.out.println("switch 2: " + strSwitchExpresionLamda);
	}

	public void useForEachLoops() {
		System.out.println("\n\n-----------For :)!!!-----------");
		String[] names = {"Juan", "Pedro", "maría"};
		int dimArrayNames = names.length;
		
		for (int i = 0; i < dimArrayNames; i++) {
			System.out.println("\nname " + i + " : "  + names[i]);
		}
		
		System.out.println("\n\n-----------ForEach {} :)!!!-----------");
		for (String name : names) {
			System.out.println("\nname: " + name);
		}
		
		System.out.println("\n\n-----------.ForEach() :)!!!-----------");
		Stream<Integer> stream1 = Stream.of(7, 4, 3, 1, 6, 2);
		String[] stringArray = {"one", "two", "three"};
		Stream<String> stream2 = Arrays.stream(stringArray);
		
		System.out.println("data type: " + stringArray.getClass().getSimpleName());
		System.out.println("is Array String: " + (stringArray instanceof String[]));
		
		stream1
		.forEach(value -> System.out.println("Stream of numbers: " + value));
		
		Stream.of(7, 4, 3, 1, 6, 2)
		.map(v -> "Stream of numbers copy: " + v)
		.forEachOrdered(System.out::println);//Método llamado por referencia.
		
		stream2.forEach(System.out::println);
		//stream2.forEach(value -> System.out.println(value));// error, no se puede utilizar el mismo stream más de una vez
		
	}

	public void useStream() {
		System.out.println("\n\n-----------Stream class :)!!!-----------");
		Stream<String> stream1 = Stream.empty();		
		System.out.println("method count of Stream: " + stream1.count());
		
		System.out.println("\n");
		
		Stream.of(1,2,3,4,5,6,7,8,9)
		.peek(x -> System.out.println("peek: "))
		.peek(System.out::println)
		.takeWhile(num -> num != 3)
		.forEach(x -> System.out.println("Stream 2: " + x));
		
		System.out.println("\n");
		
		Stream.of(1,2,3,4,5,6,7,8,9)
		.peek(x -> System.out.println("peek: "))
		.peek(System.out::println)
		.takeWhile(num -> num != 3)
		.filter(num -> num == 2)
		.forEach(x -> System.out.println("Stream 3: " + x));
		
		System.out.println("\n");
		
		Stream.of(1,2,3,4,5,6,7,8,9)
		.peek(x -> System.out.println("peek: "))
		.peek(System.out::println)
		.takeWhile(num -> num != 8)
		.filter(num -> num == 4)
		.map(String::valueOf)
		.forEach(x -> System.out.println("Stream 4: " + x));
		
		System.out.println("\n\n-----------stream() method :)!!!-----------");
	}

	public void useCollections() {
		System.out.println("\n\n-----------TypeData[] :)!!!-----------");
		System.out.println("\n\n-----------TypeData[][] :)!!!-----------");
		System.out.println("\n\n-----------Map<> :)!!!-----------");
		System.out.println("\n\n-----------Set<> :)!!!-----------");
		System.out.println("\n\n-----------List<> :)!!!-----------");
	}

	public void useTypesDataAtomics() {
		System.out.println("\n\n-----------AtomicInteger :)!!!-----------");
		AtomicInteger countDefault = new AtomicInteger();
		AtomicInteger count = new AtomicInteger(17);
		
		System.out.println("\n\n-----------AtomicBoolean :)!!!-----------");
		AtomicBoolean notDefault = new AtomicBoolean();
		AtomicBoolean yes = new AtomicBoolean(true);
	}

	public void useTypesDataLiterals() {
		System.out.println("\n\n-----------Long :)!!!-----------");
		System.out.println("\n\n-----------Float :)!!!-----------");
	}

	public void useMethodForReference() {
		System.out.println("\n\n-----------Long :)!!!-----------");
		System.out.println("\n\n-----------Float :)!!!-----------");
	}
	
	public void useTypeFunctionLamdaAndPredicate() {
		System.out.println("\n\n-----------Function Lamda :)!!!-----------");
		// Function<T, R> methodLamda = name -> name;
		Function<Integer, String> methodLamda = name -> "Juan";
		Function<String, String> methodLamda2 = name -> {
			return "Juan";
		};
		
		System.out.println("\n\n-----------Predicate Lamda :)!!!-----------");
		// Predicate<T> methodPredicate = name -> name; // da error, debe devolver solo un boolean
		Predicate<String> methodPredicate = name -> name == "Hellow";
		Predicate<Integer> methodPredicate2 = id -> id == 789;
	}
	
	public void useTypeFunctionAndPredicate() {
		System.out.println("\n\n-----------Function Lamda :)!!!-----------");
		// Function<T, R> methodLamda = name -> name;
		Function<Integer, String> methodLamda = name -> "Juan";
		Function<String, String> methodLamda2 = name -> {
			return "Juan";
		};
	}

}
