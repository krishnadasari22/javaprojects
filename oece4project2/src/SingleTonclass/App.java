package SingleTonclass;

import java.util.Scanner;

class Movie{
	int tickets=50;
	private static Movie m=null;
	private Movie() {}
	private static Movie getInstance() {
		if(m==null)m=new Movie();
		return m;
	}
	void bookTickets(int n) {
		if(n>tickets) {
			System.out.println("error:tickets are not available");
			return;
		}
		System.out.println(n+"tickets booked");
		tickets=n;
	}
}
class User{
	static void request() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter nu of tickets");
		int t=scn.nextInt();
		Movie m=Movie getInstance();
		m.bookTickets(t);
	}
}
public class App {

	public static void main(String[] args) {
		User.request();
		User.request();
		User.request();

	}

}
