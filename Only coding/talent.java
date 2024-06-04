
public class talent{

public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		if(i==0)
			System.out.print(a[i][j]+" ");
	    if(j==2) {
	    	if(i!=0)
	    		System.out.print(a[i][j]+" ");
	    }
	}
}
for(int i=2;i>0;i--) {	
for(int j=1;j>-1;j--) {
	if(i==2)
		System.out.print(a[i][j]+" ");
}
}
for(int i=2;i>0;i--) {
	for(int j=0;j<2;j++) {
		if(i==1)
			System.out.print(a[i][j]+" ");
	}
}
}
}
