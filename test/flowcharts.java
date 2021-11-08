package test;

public class flowcharts {
	public static void main(String[] args) {
//		System.out.println(flowchart(1,1,true));
		flowchart2(4000);
	}

	private static void flowchart2(int A) {
		// TODO Auto-generated method stub
		if (A > 2000) {
			System.out.println("A");
			if (A > 6000) {
				if (A > 6000) {
					System.out.println("C");
				} else {
					System.out.println("B");
					if (A > 4000) {
						System.out.println("D");
					} else {
						System.out.println("E");
					}
				} if (A > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		}else {
			System.out.println("1");
			if (A > 100) {
				System.out.println("3");
				if (A > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (A > 500) {
						System.out.println("6");
					} else System.out.println("7");
				}
			} else {
				System.out.println("2");
			}
			
		}
	}

	private static int flowchart(int int1, int int2, boolean bool) {
		// TODO Auto-generated method stub
		if (bool == true) {
			return int1 + int2;
		} else {
			return int1 * int2;
		}
	}

}
