
public class CEDNumberException extends Exception {
 
	private  String getErrorMessge;
	CEDNumberException(){
		this.getErrorMessge ="Zero or Negative number";
	}
	CEDNumberException(int n){
		if(n <= 0) this.getErrorMessge ="Zero or Negative number:"+n ;
		else this.getErrorMessge = "Error"+n;
	}
		public String getErrorMessge(){
		return this.getErrorMessge;
	}
 
 
 
}
