package GUI;
public class Student {
    private String ID;
    private String name;
    private String dob;
    private String email;
    private String address;

    public Student(String ID, String name, String dob, String email, String address) {
        this.ID = ID;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
@Override
    public String toString() {
        return "ID: " + ID + "\nName: " + name + "\nDOB: " + dob +
               "\nEmail: " + email + "\nAddress: " + address;}
    
}
