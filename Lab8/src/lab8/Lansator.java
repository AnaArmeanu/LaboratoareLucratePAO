package lab8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lansator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList();
		List list2 = list;
		list.add(2);//compilatorul adauga Integer.valueof(2) ca sa il aiba pe Object ca parinte 
		//list2.add("sir");//string il are deja pe Object ca parinte
		//!!!s-a adaugat si in list
		//dif intre array list vs linked list: inserare array => O(1); list => O(n) ;;
		/*for(int i=0;i<list.size();i++)
		{
			
		}
		mai jos: for each*/
		for (Integer obj:list)//da eroare la runtime, nu la compilare
		{
			System.out.println(obj+5);//ca s-a declarat ca Integer
		}
		System.out.println(5+(Integer)list.get(0));//get returneaza Object => trebuie convertit la Integer
		//out unboxing
		
		
		Map map = new HashMap();
		map.put("baiat", 2);//pe pozitia "baiat", valoarea 2
		map.put("fata", 3); //pe poz "fata", valoarea 3
		System.out.println(map.get("baiat"));
		map.put(2, "baiat");//autoboxing => 2 devine object => devine cheie
		System.out.println(map.get(2));
		
		Map<String,Integer> m1 = new HashMap();//cheie de tip string, val integer
		//m1.put(2, "baiat"); eroare
		
		
		//Colectia Set
		Set set = new HashSet();//HashSet e o implementare a interfetei/coectiei Set
		set.add("baiat");
		set.add("fata");
		set.add("fata");
		set.add("fata");
		set.add("fata");//Retine o singura fata!
		for (Object obj:set)
		{
			System.out.println(obj);
		}
		
		
		
		
	}

}
