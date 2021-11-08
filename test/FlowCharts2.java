package test;

public class FlowCharts2 {
	public static void main(String[] args) {
//		flowcharts();
//		flowchart2();
//		flowchart3();
//		flowchart();
		flowchart5();
	}

	private static void flowchart5() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println(i);
			}
		}
	}

	private static void flowchart() {
		// TODO Auto-generated method stub
		
	}

	private static void flowchart3() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10 ;i++) {
			for(int j=1;j<=10 ;j++) {
				System.out.println(j);
			}
		}
	}

	private static void flowchart2() {
		// TODO Auto-generated method stub
		int A = 100;
		while(A<=200) {
			if(A%2==0) {
			System.out.println("_");
			}else {
				System.out.println("*");
			}
			A++;
		}
	}

	private static void flowcharts() {
		// TODO Auto-generated method stub
		for(int A=100;A<=200;A++) {
			System.out.println("A");
		}

}}
