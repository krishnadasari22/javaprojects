package javaTpoint;

public class Pattern {

	public static void main(String[] args) {
		int i,j,rows=5;
       for(i=rows;i>=0;i--) {
    	   for(j=1;j<=i;j++) {
    		   System.out.print(j+"");
    	   }
    	   System.out.println();
       }
	}
}