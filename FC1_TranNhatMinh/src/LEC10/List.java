package LEC10;
import java.util.*;
public class List {
    ArrayList<Human> list = new ArrayList<>();
    public void addList(Human h){
        h.input();
        list.add(h);
        System.out.println("Add successful!");
    }
    public void displayList(){
        if(list.size() == 0){
            System.out.println("Empty List!");
        } else {
            for(int i = 0;i < list.size();i++){
                list.get(i).output();
            }
        }
    }
}
