
class AmazonPrime {
	
	String subType = "Monthly";
	float price = 299.00f;
	int noOfMovies = 300;

	void watchingMovie() {
		
		System.out.println("-------Watching Movie---------");
		String mName = "The Kerala Story";
		float imdbRating = 8.2f;

		System.out.println(mName);
		System.out.println(imdbRating);
	}
}

class User {
	
	public static void main(String[] args) {
		
		AmazonPrime obj = new AmazonPrime();

		obj.watchingMovie();
	}
}
