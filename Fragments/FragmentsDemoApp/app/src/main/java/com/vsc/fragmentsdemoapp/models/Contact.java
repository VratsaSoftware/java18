package com.vsc.fragmentsdemoapp.models;

public class Contact {

    private String contactName;
    private String contactPhone;
    private boolean isInPhone;

    public Contact(String contactName, String contactPhone, boolean isInPhone) {
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.isInPhone = isInPhone;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public boolean isInPhone() {
        return isInPhone;
    }

    public void setInPhone(boolean inPhone) {
        isInPhone = inPhone;
    }
}
