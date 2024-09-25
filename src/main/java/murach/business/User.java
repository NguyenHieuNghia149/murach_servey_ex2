package murach.business;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private Date date;
    private String sourceInfor;
    private String offer;
    private String contact;


    public User() {
        firstName = "";
        lastName = "";
        email = "";
        date = new Date();
        sourceInfor = "";
        offer = "";
        contact = "";


    }

    public User(String firstName, String lastName, String email, Date date, String sourceInfor, String offer, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.date = date;
        this.sourceInfor = sourceInfor;
        this.offer = offer;
        this.contact = contact;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date.toString();
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSourceInfor(String sourceInfor) {
        this.sourceInfor = sourceInfor;
    }

    public String getSourceInfor() {
        return sourceInfor;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public String getOffer() {
        return offer;
    }
}

