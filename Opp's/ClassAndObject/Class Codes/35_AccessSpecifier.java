
class Demo {
	
	int x = 10;
	Demo() {
		
		System.out.println("Constructor");
	}
	private void fun() {
		
		System.out.println(x);
	}
}

/*
 Byte Code :
 class Demo {
  int x;

  Demo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #7                  // Field x:I
      10: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
      13: ldc           #19                 // String Constructor
      15: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      18: return
}

Private Instance method not present in byte Code

 */
