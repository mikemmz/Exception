
public class IntCalculator {
	protected int x;
	protected int y; 
	

  //**Default Constructor///
IntCalculator()throws CEDNumberException  {  //�¹仵��
	  this.setX(x);
	  this.setY(y);
}
IntCalculator(int x, int y) throws CEDNumberException {  //�¹仵��
	 this.setXY(x, y);
}

	  
	  
	  
	//**Set Propery***//
	  

 public void setX(int x)throws CEDNumberException {
	 
	 if(x >= 0)this.x = x;
	 else{
		 CEDNumberException cne = new CEDNumberException (x); // ��� x  ����ʴ��� �Ţ ���Դź  �����¹ 
		throw cne;
	 }
	 //this.x =x;
	 
	 }
 public void setY(int y) throws CEDNumberException {
	 if (y >=0) this.y =y;
	 else throw new CEDNumberException (y); // ��� y ����ʴ��� �Ţ ���Դź  ���� �¹
	 //this.y =y;
	 
 }
 public void setXY(int x , int y) throws CEDNumberException{
	 this.setX(x);
	 this.setY(y);
 }


 //**get**//
 public int getX(){
	 return this.x;
 }
 public int getY(){
	 return this.y;
 }
public int getAdd(){
	return this.add();
}
public int getsubtract(){
	return this.subtract();
}
 public int getmultiply(){
	 return this.multiply();
 }
 public int getdivide() throws CEDDividedByZeroException  {
 return this.divide();
 }
 
 //* Calculate*///
 public int add (){
	
	 return  x+y ; 
	 
 }
 public int subtract(){
	 return x-y ; 

 }
 public int  multiply (){
	 return x*y ;
	 
 }
 public int divide()throws CEDDividedByZeroException{ 
		if(y==0) 
			throw new CEDDividedByZeroException();
		int divide=0;
		divide =x/y;
		return divide;
	}
 							
 
 public void displayDetail() throws CEDDividedByZeroException  {
	
		System.out.println("-------------------------------");
		System.out.println("add x+y :\t"+this.add());
		System.out.println("subtract x-y :\t"+this.subtract());
		System.out.println("multiply x*y :\t"+this.multiply());
		System.out.println("divide x/y :\t"+this.divide());
		System.out.println("-------------------------------");
		
 }
}
//Prasin Phechatanakun 