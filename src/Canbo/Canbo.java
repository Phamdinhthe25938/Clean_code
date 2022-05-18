package Canbo;

import java.util.Date;

public abstract class Canbo {
    private String name;
    private String date;
    private String gender;
    private String address;

    public Canbo() {
    }

    public Canbo(String name, String date, String gender, String address) {
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public abstract void nameJobManager();

    @Override
    public String toString() {
        return " Name:"+getName()+
                " Date:"+getDate()+
                " Gender:"+getGender()+
                " Address:"+getAddress();
    }
}
