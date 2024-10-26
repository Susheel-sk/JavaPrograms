
public class IntersectionofTwoArr {

	public static void main(String[] args) {
		int myarr1[]= {1,2,3,4,5};
		int myarr2[]= {3,4,9,7,8};
		System.out.println("intersection of two arrays are:");
		for(int i=0;i<myarr1.length;i++) {
			for(int j=0;j<myarr2.length;j++) {
				if(myarr1[i] == myarr2[j]) {
					System.out.print(myarr1[i]+" ");   
				}
			}
		}
	}

}
