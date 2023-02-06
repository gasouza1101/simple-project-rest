package br.com.erudio.utils;

public class NumericTreatment {
    public Double convertDouble(String number) {
        if(number==null) return 0D;
        String num = number.replaceAll(",",".");
        if(isNumeric(num)) return Double.parseDouble(num);
        return 0D;
    }

    public boolean isNumeric(String number) {
        if(number==null) return false;
        String num = number.replaceAll(",",".");
        return num.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
