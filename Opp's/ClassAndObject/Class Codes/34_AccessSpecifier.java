class Demo {
	
	private int x = 10;
	int y = 20;
	Demo() {
		
		System.out.println(this.x);
		System.out.println(this.y);
	}
}

/*
 Byte Code :

 class Demo {
  int y;     
		<------ Private instance variable cannot be declare here
  Demo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #7                  // Field x:I
      10: aload_0
      11: bipush        20
      13: putfield      #13                 // Field y:I
      16: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
      19: aload_0
      20: getfield      #7                  // Field x:I
      23: invokevirtual #22                 // Method java/io/PrintStream.println:(I)V
      26: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
      29: aload_0
      30: getfield      #13                 // Field y:I
      33: invokevirtual #22                 // Method java/io/PrintStream.println:(I)V
      36: return
}
 */
