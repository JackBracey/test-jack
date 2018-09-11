package hello;

public class Employee {

    private String id;
    private String title;
    private String forename;
    private String surname;

    public Employee() {

    }

    public Employee(String id, String title, String forename, String surname) {
        this.id = id;
        this.title = title;
        this.forename = forename;
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
