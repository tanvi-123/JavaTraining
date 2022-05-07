//prototype
	import java.util.ArrayList;

class Employees implements Cloneable {
    ArrayList<String> Employees;
    Employees(){
        Employees=new ArrayList<>();
    }
    Employees( ArrayList<String> Employees){
        this.Employees=Employees;
    }
    void loadData(){
        Employees.add("ram");
        Employees.add("tom");
        Employees.add("sham");
        Employees.add("jerry");
    }
    void showData(){
        for (String s:Employees){
            System.out.println(s);
        }
    }
    
    protected Object clone() throws CloneNotSupportedException {
       ArrayList<String> temp = new ArrayList<String>();
        for(String s : this.Employees){
            temp.add(s);
        }
        return new Employees(temp);

    }
}
public class DemoPattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees st1=new Employees();
        st1.loadData();
        Employees st2=(Employees)st1.clone();
        st1.showData() ;
        st2.showData();
    }
}

