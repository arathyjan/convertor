package com.springapp.mvc.service;

import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class convertor {
    public static final String YML_FILE = "conversionFactor.yaml";
    private Map<String, Map<String, String>> conversionFactors;

    private void readFromYml() {
        Yaml yaml = new Yaml();
        conversionFactors = (Map<String, Map<String, String>>) yaml.load(ClassLoader.getSystemResourceAsStream(YML_FILE));
    }

    public void convertor() {

    }
}
