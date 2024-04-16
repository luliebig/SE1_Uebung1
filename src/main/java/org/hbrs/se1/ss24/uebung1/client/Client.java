package org.hbrs.se1.ss24.uebung1.client;

import static org.hbrs.se1.ss24.uebung1.businesslogic.TransformerFactory.getRomanNumberTransformer;

public class Client {
    public void printTransformation(int number) {
        String result = getRomanNumberTransformer().transformNumber(number);
        System.out.println("Die römische Schreibweise der Zahl " + number + " ist: " + result);
    }
}
