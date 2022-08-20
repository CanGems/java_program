class vararg{
    void show(String...a){
        System.out.println("this is a var arg method ");
        
        for(String x:a){
           System.out.println(x);  
        }
    }
    public static void main(String[] args) {
        vararg v= new vararg();
         v.show("subha","candy","jesus","gagul");
    }
} 
