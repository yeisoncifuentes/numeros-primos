public class Main{

	public static void main(String[] arg){
		System.out.println("");
		System.out.println("clase de programacion II");
		System.out.println("EJERCICIO NUMERO PRIMOS");
		System.out.println("");
		System.out.println("\n\n\t\t");
		System.out.println("");
		System.out.println("");
		
		int primos[] = {-7,-2,1,99};		
		
	    for (int i=0; i<4;i+=1){
               if(primos[i]>=-3 && primos[i]<=3 ){
                   primos[i]=1;
		}else{
			if  (primos[i]%2==0){
		    
                            primos[i]=0;
		        }else{
		    		if (primos[i]%3==0){
	 	   			primos[i]=0;			
                   		}else{
		   			primos[i]=1;
		   		}
		  
		             }
                    }
	    }
	    
           for(int i=0;i<4;i+=1){
              if(primos[i]==1){
               System.out.println("el numero en la posicion"+ (i+1)+ " es primo");
              }else{
               System.out.println("el numero en la posicion"+ (i+1)+" no es primo");
              }

	   }

	}

}