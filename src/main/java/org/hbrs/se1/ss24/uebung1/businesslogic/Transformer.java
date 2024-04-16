package org.hbrs.se1.ss24.uebung1.businesslogic;

public abstract class Transformer implements NumberTransformer {
    public String transformNumber(int number) {
        if (number < 1 || number > 3000) {
            throw new IllegalArgumentException("Fehler: Nur Zahlen zwischen 1 und 3000 erlaubt");
        } else {
            return "";
        }
    }
}
