public class Employee{
    private int empid;
public void setempid(int eid){
    empid=eid;
}
public int getempid(){
    return empid;
}
    
}

class company{
    public static void main(String[] args) {
        Employee e= new Employee();// here to acheive employee class data need to create emplloyee class object
        e.setempid(101);
        System.out.println(e.getempid());
    }
}
