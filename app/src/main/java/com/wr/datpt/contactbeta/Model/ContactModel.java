package com.wr.datpt.contactbeta.Model;

/**
 * Created by DatPT on 03/07/2018.
 */

public class ContactModel {
    private String  id_Contact;
    private String name_Contact;
    private String number_Contact;
    private int type_Phone;

    public ContactModel() {
    }

    public ContactModel(String  id_Contact, String name_Contact, String number_Contact, int type_Phone) {
        this.id_Contact = id_Contact;
        this.name_Contact = name_Contact;
        this.number_Contact = number_Contact;
        this.type_Phone = type_Phone;
    }

    public String  getId_Contact() {
        return id_Contact;
    }

    public void setId_Contact(String  id_Contact) {
        this.id_Contact = id_Contact;
    }

    public String getName_Contact() {
        return name_Contact;
    }

    public void setName_Contact(String name_Contact) {
        this.name_Contact = name_Contact;
    }

    public String getNumber_Contact() {
        return number_Contact;
    }

    public void setNumber_Contact(String number_Contact) {
        this.number_Contact = number_Contact;
    }

    public int getType_Phone() {
        return type_Phone;
    }

    public void setType_Phone(int type_Phone) {
        this.type_Phone = type_Phone;
    }
}
