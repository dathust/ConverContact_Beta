package com.wr.datpt.contactbeta.Model;

public class SupportModel {

    private int id_Sp;
    private String name;
    private String url;

    public SupportModel() {

    }

    public SupportModel(int id_Sp, String name, String url) {
        this.id_Sp = id_Sp;
        this.name = name;
        this.url = url;
    }

    public int getId_Sp() {
        return id_Sp;
    }

    public void setId_Sp(int id_Sp) {
        this.id_Sp = id_Sp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
