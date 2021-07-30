package thread;

class Parent{
    protected int x=10;
   void incrementX(){
     System.out.println("parent x "+ x++);
}}
class Child extends Parent{
      void incrementX(){
       System.out.println("child x "+ ++x);
}}
class Test{
public static void main(String[] args){
  Parent p=new Child();
  Child c=new Child();
   p.incrementX();
   c.incrementX();
}}


