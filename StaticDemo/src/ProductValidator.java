
public class ProductValidator {
	
	static {
		System.out.println("Static Blok �al��t�");
	}
	
	
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty() ) {
			return true;
		}else {
			return false;
			
		}
		}
		
	public void bise() {
		
	}//inner class
	
	public static class BaskaBirClass{
		public static void Sil() {
			
		}
	}
	
	}


