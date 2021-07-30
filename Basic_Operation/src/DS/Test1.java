package DS;

public class Test1 {
public static void main(String[]args){
Test1 t=new Test1();
t.m1(2,2);
}
void m1(short a,short b){
	System.out.println("short");
}
void m1(int a,int b){
	System.out.println("int");
}
void m1(long a,long b){
	System.out.println("long");
}
void m1(byte a,byte b){
	System.out.println("byte");
}
}
