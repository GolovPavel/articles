class Calculator {

	public static void main(String[] args){
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);

		int result = 0;
		for (int i = 0; i < 10000; i++){
			result = makeCalculation(a, b);
		}
		System.out.println(result);
	}

	private static int makeCalculation(int a, int b) {
		return a + b;
	}
}
