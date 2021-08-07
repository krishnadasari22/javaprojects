package MeritCampusPgms;

import java.util.*;

public class IndependenceDay {

	public static void main(String[] args) {
		GregorianCalendar gc=new GregorianCalendar(2014,8,15,21,69,55);
		p(gc, Calendar.YEAR);
		p(gc, Calendar.MONTH);
		p(gc, Calendar.DATE);
		p(gc, Calendar.DAY_OF_WEEK);
		p(gc, Calendar.DAY_OF_WEEK_IN_MONTH);
		p(gc, Calendar.DAY_OF_YEAR);
		p(gc, Calendar.HOUR);
		p(gc, Calendar.HOUR_OF_DAY);
		p(gc, Calendar.MINUTE);
		p(gc, Calendar.SECOND);
		

	}
	static void p(Calendar c,int type) {
		System.out.print(c.get(type)+"-");
	}

}
