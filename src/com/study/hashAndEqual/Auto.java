/**
 * 
 */
package com.study.hashAndEqual;

/**
 * Car(Auto in German) class
 * 
 * @author
 *
 */
public class Auto {
	int regNummer;
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegNummer() {
		return regNummer;
	}

	public void setRegNummer(int regNummer) {
		this.regNummer = regNummer;
	}

	public Auto(int regNummer, String name) {
		this.regNummer = regNummer;
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		if (this == o) {
			return true;
		}
		Auto auto = (Auto) o;
		if (this.getName() == auto.getName() && this.getRegNummer() == auto.getRegNummer()) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.getRegNummer();
	}

}
