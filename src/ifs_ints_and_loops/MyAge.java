package ifs_ints_and_loops;

public class MyAge {
	int yearborn=2019;
	void getmyage() {
		for(int i=75;i>49;i--) {
		System.out.println(i);
			//System.out.println("year born; "+(yearborn-i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyAge age=new MyAge();
age.getmyage();
	}

}
