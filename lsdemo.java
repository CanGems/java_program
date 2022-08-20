import java.util.*;

class lsdemo{
     public static void main(String[] args){
   LinkedList l=new LinkedList();
     l.add("subha");
     l.add("laxmi");
     l.add("candy");
     l.add("sandy");
  System.out.println(l);

 ListIterator lt= l.listIterator();
   while(lt.hasNext()){
      String s= (String) lt.next();
      if(s.equals("subha"))
          lt.remove();
      else if(s.equals("laxmi"))
          lt.add("subha");
      else if(s.equals("candy"))
          lt.set("gagul");
   }
  System.out.println(l);

}
}