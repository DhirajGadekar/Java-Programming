class Binary{
	
	static int search(int arr[] ,int target){
	
		if(arr[0] > target ){
			
			return 0;
		}else if(arr[arr.length - 1] < target) {
			
			return arr.length;
		}else if(arr.length == 2){
			
			int store = 0;
			if(arr[0] < target && arr[1] > target){
				
				store = 0;
			}
			return store;
		}else{
				
			int start = 1;
			int end = arr.length - 1;
			int store = 0;
			while(start <= end){
				
				int mid = (start + end) /2;

				if(arr[mid] == target) {
					
					store = mid;
					break;
				}else if(arr[mid - 1] < target && arr[mid + 1] > target) {
					
					store =  mid;
					break;
				}
				if(arr[mid] > target){
					
					end = mid - 1;
				}
				if(arr[mid] < target){
					
					start = mid + 1;
				}
					
			}	
			return store;
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {1,3};

		int ret = search(arr,2);
		System.out.println(ret);
	}
}
