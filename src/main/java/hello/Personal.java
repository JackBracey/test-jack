package hello;

public class Personal {

    private String firstname;
    private String surname;
    private String address;
    private String phonenumber;

    public Personal() {

    }

    public Personal(String firstname, String surname, String address, String phonenumber) {
        this.firstname = firstname;
        this.surname = surname;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
