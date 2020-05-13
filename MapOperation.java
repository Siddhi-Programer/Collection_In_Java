import java.nio.file.CopyOption;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;   

// Auther : Sidheshwari 

public class MapOperation {
    public static void main(String[] args) {
    	System.out.println("HashMap operations....");
    	
    	HashMap hm = new HashMap();
    	hm.put("Siddhi",25);
    	hm.put("Aadi", 50);
    	hm.put("Shiva", 30);
    	hm.put("Dhanush",35);
    	hm.put("Kiran", 23);
    	System.out.println(hm);
    	hm.put("Siddhi", 30);
    	System.out.println(hm);
    	
    	System.out.println(hm.remove("Aadi"));
    	System.out.println(hm);
    	
    	Set kSet = hm.keySet();
    	System.out.println(kSet);
    	
    	Collection c = hm.values();
    	System.out.println(c);
    	
    	Set entrySet = hm.entrySet();
    	
    	System.out.println(entrySet);
    	
    	Iterator itr = entrySet.iterator();
    	
    	while(itr.hasNext()) {
          Map.Entry me = (Entry) itr.next();
          System.out.println(me.getKey() + "----" + me.getValue());
          
          if (me.getKey().equals("Siddhi")) {
			 me.setValue(26);
		   }
    	}
    	
    	System.out.println(hm);
    	TreeMapOperation tmp = new TreeMapOperation();
    	tmp.treeMapCreation();
    	tmp.treeMapCreationWithCustomizedSorting();
    	
    	// Hashtable Creation 
    	
    	HashTableOperation ht = new HashTableOperation();
    	ht.createHashTable();
    	
    	
    }
}

class TreeMapOperation {
	
	public void treeMapCreation() {
		TreeMap tm = new TreeMap();
		tm.put(100, "Aaa");
		tm.put(101,"AaA");
		tm.put(99, "Kiya");
		
		System.out.println("\nNatural Sorting using TreeMap :--->");
		System.out.println(tm);
		
	}
	
	public void treeMapCreationWithCustomizedSorting() {
		TreeMap tm = new TreeMap(new MyComparator());
		tm.put(100, "Aaa");
		tm.put(101,"AaA");
		tm.put(99, "Kiya");
		
		System.out.println("\nCustom Sorting using TreeMap :--->");
		System.out.println(tm);
		
	}
	
}

class HashTableOperation{
	
	public void createHashTable() {
		 Hashtable ht = new Hashtable();
		 ht.put("Ajju", 101);
		 ht.put("Kiran", 102);
		 ht.put("Aiya",103);
		 ht.put("ajinkya", 109);
		 ht.put("abc", 105);
		 // java.lang.NullPointerException
		 //  ht.put("abcd", null) 
		 System.out.println("\nHashTable creation ....");
		 System.out.println(ht);
	}
}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		
		return -i1.compareTo(i2);
	}
	
} 

class MyComparatorFotHashtable implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		 String s1 = o1.toString();
	     String s2 = o2.toString();
	     
	     return -s1.compareTo(s2);
	}
	
}