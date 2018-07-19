
public class CEDDividedByZeroException extends Exception {
	
	private String getErrorMessge;
	
	CEDDividedByZeroException(){
		this.getErrorMessge ="x/y : DividedByZero";					
	}
	
	
	public String getErrorMessge(){
		return this.getErrorMessge;
	}
}
