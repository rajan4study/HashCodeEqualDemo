/**
 * 
 */
package com.study.hashAndEqual;

/**
 * Car registraion Office(in German)
 * 
 * @author
 *
 */
public class KfzZulassungsstelle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Auto auto1 = new Auto(0, "Rajan");
		Auto auto2 = new Auto(0, "Rajan");
		System.out.println(auto1.hashCode());
		System.out.println(auto2.hashCode());
		System.out.println(auto1 == auto2);// false- without override hashcode and equal method
		System.out.println(auto1.equals(auto2));// false- without override hashcode and equal method
	}

}
