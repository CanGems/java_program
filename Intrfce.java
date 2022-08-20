interface Intrfce {

    int a=10;
    void show();
    default void disp(){
        System.out.println("this is defult method introduced in java 8.0");
    }
   public static void main(){
        System.out.println("this is static method also introduced in java 8 version");

    }
    private void dance(){
        System.out.println("this is the private method introduced in java 9.0 ");
    }
}
class test implements Intrfce{
   public void show(){ // here the acsess modifire must be public
       System.out.println("this is interface method but here it is concret");
    }
    public static void main(){
        System.out.println("this is test class concret method");
        
            //main() ;
        
        }
    
    public static void main(String[] args) {
        test t = new test();
        t.disp();
        t.show();
        test.main();
        
        
    }
}
