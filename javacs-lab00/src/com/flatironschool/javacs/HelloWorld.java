package com.flatironschool.javacs;

public class HelloWorld {
    public static void main(String[] args) {
	    // you can test the output of getVersion() here
        System.out.println(Double.toString(getVersion()));
    }

    public static Double getVersion() {
        double version = 0.0;
        String vTemp = System.getProperty("java.specification.version");
        System.out.println(vTemp);
        version = Double.parseDouble(vTemp);
        return version;
    }
}
