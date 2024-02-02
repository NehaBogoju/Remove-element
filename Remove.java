public class Remove{
    public static void main(String[] args) {
		int[] a= {1,2,3,2,3,1,0};
		int target = 3;
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=target) {
				a[k]=a[i];
				k++;
			}
		}
		System.out.println(k);
		for(int m=0;m<k;m++) {
			System.out.print(a[m]+" ");
		}
	}

}




