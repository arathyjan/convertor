package com.javahash.spring.modelel;

import java.lang.Double;import java.lang.String;public class Conversion {
    private Double from;
    private Double to;
    private String form;

    public Conversion() {
    }

    public Conversion(Double from, Double to, String form) {
        this.from = from;
        this.to = to;
        this.form = form;
    }

    public Double getFrom() {
        return from;
    }

    public void setFrom(Double from) {
        this.from = from;
    }

    public Double getTo() {
        return to;
    }

    public void setTo(Double to) {
        this.to = to;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }
}
