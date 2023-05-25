package com.cc.java;

public class App {

	public static void main(String[] args) {
	
	

	}

	

	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
public class Mitarbeiter {
    private String name;
    private String vorname;
    private String funktion;
    private int eintrittsjahr;

    public Mitarbeiter(String name, String vorname, String funktion, int eintrittsjahr) {
        this.name = name;
        this.vorname = vorname;
        this.funktion = funktion;
        this.eintrittsjahr = eintrittsjahr;
    }

    public String getInfo(String parameter) {
        if (parameter.equals("name")) {
            return this.name;
        } else if (parameter.equals("vorname")) {
            return this.vorname;
        } else if (parameter.equals("funktion")) {
            return this.funktion;
        } else if (parameter.equals("eintrittsjahr")) {
            return Integer.toString(this.eintrittsjahr);
        } else {
            return "Invalid parameter";
        }
    }
}

public class App {
    public static void main(String[] args) {
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Pan", "Peter", "Manager", 2020);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Pastore", "Mauri", "Entwicklerin", 2021);
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Kluster", "Karl", "Praktikant", 2022);

        System.out.println(mitarbeiter1.getInfo("name"));
        System.out.println(mitarbeiter2.getInfo("funktion"));
        System.out.println(mitarbeiter3.getInfo("eintrittsjahr"));
    }
}