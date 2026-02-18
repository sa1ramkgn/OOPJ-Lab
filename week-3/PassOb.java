class Test {

int a;
int b;

Test(int i,int j){
  a = i;
  b = j;
}
boolean equals(Test Ob) {
 if(Ob.a == a && Ob.b == b) {
  return true;
}
 else {
return false;
}
}
}
class PassOb {
	public static void main(String[] args) 
	{
     Test Ob1 = new Test(100,22);
	 Test Ob2 = new Test(100,22);
     Test Ob3 = new Test(-1,-1);
		System.out.println("Ob1 == Ob2: " + Ob1.equals(Ob2));
        System.out.println("Ob1 == Ob3: " + Ob1.equals(Ob3));
	}
}

