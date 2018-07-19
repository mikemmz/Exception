
public class Testmain {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		IntCalculator x;
		try{
		x = new IntCalculator (1,0);
		
		x.displayDetail();
		}
		catch (CEDNumberException e){ 
			
			System.err.println (e.getErrorMessge());
		}
		
		catch (CEDDividedByZeroException e) {
			String msg = e.getErrorMessge();
			System.err.println(msg);
			
		}
		catch (ArithmeticException ae){
			System.err.println("divide by Zero");
		}
		catch (Exception e) {
			System.err.println("CATCH in EXCEPTION");
			System.err.println(e.getClass());
		}
	}	
}		
														
														


