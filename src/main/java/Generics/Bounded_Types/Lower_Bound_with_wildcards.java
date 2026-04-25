package Generics.Bounded_Types;

import java.util.List;

public class Lower_Bound_with_wildcards {
	public static void addNumbers(List<? super Integer> list) {
		list.add(10); // safe
		list.add(20);
	}

}

/*
 * Lower bounds are used with wild-cards: ? super Integer means the list can
 * hold Integer or its superclasses (Number, Object).
 * 
 */