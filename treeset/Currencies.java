package com.xworkz.collection.treeset;

import java.util.Collection;
import java.util.TreeSet;

public class Currencies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		String c1="indian rupee";
		String c2="us Doller";
		String c3="srilank rupee";
		String c4="pakisthan rupee";
		String c5="belarus rubel";
		String c6="bermuda doller";
		String c7="brezil real";
		String c8="Egypt pound";
		String c9="hongkong doller";
		String c10="iceland krona";
		String c11="iran rial";
		String c12="japan yen";
		String c13="kazakhethan tenge";
		String c14="korea won";
		String c15="malayesia rengith";
		String c16="mexico peso";
		String c17="nepal rupee";
		String c18="oman rial";
		String c20="philipene peso";
		String c21="poland zloty";
		String c22="rusia rubel";
		String c23="sudi aribiya riyal";
		String c24="singapur doller";
		String c25="uk pound";
		String c26="vietnum dong";
		
		
		Collection<String> curr=new TreeSet<String>();
		curr.add(c1);
		curr.add(c2);
		curr.add(c3);
		curr.add(c4);
		curr.add(c5);
		curr.add(c6);
		curr.add(c7);
		curr.add(c8);
		curr.add(c9);
		curr.add(c10);
		curr.add(c26);
		curr.add(c25);
		curr.add(c24);
		curr.add(c24);
		curr.add(c23);
		curr.add(c22);
		curr.add(c22);
		curr.add(c21);
		curr.add(c20);
		curr.add(c18);
		curr.add(c17);
		curr.add(c16);
		curr.add(c15);
		curr.add(c14);
		curr.add(c13);
		curr.add(c12);
		curr.add(c11);
		
		System.out.println("no of currencies " + curr.size());
		
		curr.clear();
		
		System.out.println("After clear method");
		
		System.out.println("no of currencies " + curr.size());
		
		
		

	}

}
