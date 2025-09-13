package LEC10;
import java.util.*;
public class Student extends Human{
    private String sID;
    private int prtc;
    Scanner ss = new Scanner(System.in);
    public Student(String sID, int prtc, String name, String date, String gender, int ID){
        super(name,date,gender,ID);
        this.sID = sID;
        this.prtc = prtc;
    }
    public String getsID(){
        return sID;
    }
    public void setsID(String sID){
        this.sID = sID;
    }
    public int getPrtc(){
    return prtc;
}
    public void setPrtc(int prtc){
        this.prtc = prtc;
    }
    public void prEva(){
        System.out.print("Input practice evaluation(1:Gioi, 2:Kha, 3:TB, 4:Yeu): ");
        setPrtc(ss.nextInt());
        switch(prtc){
            case 1: System.out.println("Gioi"); break;
            case 2: System.out.println("Kha"); break;
            case 3: System.out.println("TB"); break;
            case 4: System.out.println("Yeu"); break;
        }
    }
    @Override
    public void input(){
        super.input();
        System.out.print("Input student ID: ");
        setsID(ss.nextLine());
        prEva();
        
    }
    public void output(){
        super.output();
        System.out.println("Student ID: " + getsID());
        System.out.println("Practice Evaluation: " + getPrtc());
    }
}
