package LEC10;
import java.util.*;
import java.lang.*;
public class Human {
    Scanner s = new Scanner(System.in);
    private String name;
    private String date;
    private String gender;
    private int ID;

    public Human(String name, String date, String gender, int ID) {
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.ID = ID;
    }
    public String getName(){
        return gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public void input(){
        System.out.print("Input name: ");
        setName(s.nextLine());
        System.out.print("Input birthday(MM/DD/YYYY): ");
        setDate(s.nextLine());
        System.out.print("Input gender: ");
        setGender(s.nextLine());
        System.out.print("Input ID: ");
        setID(s.nextInt());
    }
    public void output(){
        System.out.println("================INFORMATION================");
        System.out.println("Name: " + getName());
        System.out.println("Birthday: " + getDate());
        System.out.println("Gender: " + getGender());
        System.out.println("ID: " + getID());
    }
}
