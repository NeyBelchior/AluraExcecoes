package Pilha;

public class FluxoComTratamento {
                                              ///checked
	 public static void main(String[] args)  {
	        System.out.println("Ini do main");
	        try {
	        	   metodo1();
		        }catch(
		        		
		        		Exception e) {
		        
		        	String msg = e.getMessage();
		        	System.out.println(msg);
		        	e.printStackTrace();
		        	
		        }
		    
	          System.out.println("Fim do main");
	 }

	    private static void metodo1() throws MinhaExcecaoHerdandoDiretoDeException  {
	        System.out.println("Ini do metodo1");
	    
	        
				metodo2();
			
	  
	        System.out.println("Fim do metodo1");
	    }
                                          
	    private static void metodo2() throws MinhaExcecaoHerdandoDiretoDeException {
	        System.out.println("Ini do metodo2");	            	       	        
	        
	       
	        // ArithmeticException execption = new ArithmeticException ("Deu errado");
	        //throw execption;
	         //Maneira simplificada
	        throw new MinhaExcecaoHerdandoDiretoDeException("Deu ruim");
	       
	           //uncheked não são verificados pelo compilador
	       // throw new MinhaExcecao("Deu errado");
	        //System.out.println("Fim do metodo2!");
	    }
	
}
