abstract class a1{
    
    void disp(){
        System.out.println("this is abstract class concret method");
    }
    abstract void show();

}
class test extends a1{
    void show(){
        System.out.println("this is abstact class extends method that here is a concret class");
    }
    void disp(){
        super.disp();
        System.out.println("this is child class disp method");
    }
    public static void main(String[] args) {
        test t = new test();
        t.disp();
        t.show();
    }
}
