package LEC10;
import java.util.*;
public class Teacher extends Human{
    private String tID;
    private int tRank;
    Scanner ss = new Scanner(System.in);
    public Teacher(String tID, int tRank, String name, String date, String gender, int ID){
        super(name,date,gender,ID);
        this.tID = tID;
        this.tRank = tRank;
    }
    public String gettID(){
        return tID;
    }
    public void settID(String tID){
        this.tID = tID;
    }
    public int gettRank(){
    return tRank;
}
    public void settRank(int tRank){
        this.tRank = tRank;
    }
    public void tRanks(){
        System.out.print("Input Teacher's rank(1:A, 2:B, 3:C): ");
        settRank(ss.nextInt());
        switch(tRank){
            case 1: System.out.println("Rank A"); break;
            case 2: System.out.println("Rank B"); break;
            case 3: System.out.println("Rank C"); break;
        }
    }
    @Override
    public void input(){
        super.input();
        System.out.print("Input teacher ID: ");
        settID(ss.nextLine());
        tRanks();
        
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Student ID: " + gettID());
        System.out.println("Practice Evaluation: " + gettRank());
        tRanks();
    }
}
