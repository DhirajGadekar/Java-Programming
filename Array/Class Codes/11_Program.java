//Passing array as an Argument :

class ArrayDemo{

        void fun(int arr[]) {

                for(int i : arr){
                        System.out.print(i + " ");
                }
                System.out.println();
		
		for(int i = 0; i < arr.length; i++){
			
			arr[i] = arr[i] + 50;
		}
        }

        public static void main(String[] args) {

                ArrayDemo obj = new ArrayDemo();
                int arr[] = {1,2,3,4,5,6};

                obj.fun(arr);
                
		for(int i : arr) {

                        System.out.print(i + " ");
                }
        }
}

