package org.hbrs.se1.ss24.uebung1.businesslogic;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class GermanFormatNumberTransformer extends Transformer {

    public String transformNumber(int number) {
        super.transformNumber(number);
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(Locale.GERMANY);
        DecimalFormat f = new DecimalFormat("###,###", symbols);
        return f.format(number);
    }

    public String getTransformerType() {
        return "Transformer für deutsche Zahlenformatierungen";
    }
}
