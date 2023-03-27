/*Program 7: Calculate profit or Loss
 	     Write a program that takes the cost price and selling price
	     (take it hardcoded) and calculates profit or loss
 */

class ProfitOrLoss{

        public static void main(String[] args){

                float sellingPrice = 800.00f;
                float costPrice = 1200.00f;

		if(sellingPrice >= 0f && costPrice >= 0f){
                	if(sellingPrice > costPrice){
                        
				System.out.println("Profit is " + (sellingPrice - costPrice));
                	}else if(sellingPrice < costPrice){

                        	System.out.println("Loss is " + (costPrice - sellingPrice));
                	}else{

                        	System.out.println("No profit No Loss");
                	}
		}else{

                       	System.out.println("Invalid Price");
		}
        }
}
