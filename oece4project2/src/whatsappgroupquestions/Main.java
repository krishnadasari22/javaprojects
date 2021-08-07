package whatsappgroupquestions;

public class Main {

	public static void main(String[] args) {
		int[] a= {10,98,3,33,12,22,21,11};
		arrange(a);
		for(int n:a) {
			System.out.println(n+" ");
			
		}

	}
	static void arrange(int[] a) {
		int i=0,j=a.length-1;
		while(i<j) {
			while(a[i] % 2 ==0) {
				i++;
				while(a[j] % 2 !=0) {
					j--;
					if(i<=j){
						int temp=a[i];
				        a[j]=temp;
				        j++;
				        j--;
					}
				}
			}
		}
	}

}

