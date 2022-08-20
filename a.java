interface l1{
    abstract void disp();
}
abstract class test{
       void show(){
        System.out.println("candy");
       }
}
    

class a implements l1{
   public void disp(){}

    void show(){
        System.out.println("subha");
    }
    public static void main(String[] args) {
        
        a A = new a();
        A.show();
        A.disp();
    }
}