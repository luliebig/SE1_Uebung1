package org.hbrs.se1.ss24.uebung1.businesslogic;

public class TransformerFactory {

    public static Transformer getRomanNumberTransformer() {
        return new RomanNumberTransformer();
    }

    public static Transformer getGermanFormatTransformer() {
        return new GermanFormatNumberTransformer();
    }
}
