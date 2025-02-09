package org.hbrs.se1.ss24.uebung1.businesslogic;

public class RomanNumberTransformer extends Transformer {

    public String transformNumber(int number) {
        super.transformNumber(number);
        String[] romanSymbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] romanValues = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        StringBuilder romanNumeral = new StringBuilder();
        for (int i = romanValues.length - 1; i >= 0; i--) {
            while (number >= romanValues[i]) {
                romanNumeral.append(romanSymbols[i]);
                number -= romanValues[i];
            }
        }
        return romanNumeral.toString();
    }

    public String getTransformerType() {
        return "Transformer für römische Zahlen";
    }

}
