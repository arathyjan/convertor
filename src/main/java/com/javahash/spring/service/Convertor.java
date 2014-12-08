package com.javahash.spring.servicece;

import org.yaml.snakeyaml.Yaml;

import java.lang.ClassLoader;import java.lang.String;import java.util.Map;

public class Convertor {
    public static final String YML_FILE = "conversionFactor.yaml";
    private Map<String, Map<String, String>> conversionFactors;

    private void readFromYml() {
        Yaml yaml = new Yaml();
        conversionFactors = (Map<String, Map<String, String>>) yaml.load(ClassLoader.getSystemResourceAsStream(YML_FILE));
    }

    public void convertor() {

    }
}
