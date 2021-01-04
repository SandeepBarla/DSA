import java.util.*;
class screen{
	String screen_name;
	int no_of_rows;
	int seats_per_row;
	int ss[][]=new int[no_of_rows][seats_per_row];
	screen(String screen_name,int no_of_rows,int seats_per_row){
		this.screen_name=screen_name;
		this.no_of_rows=no_of_rows;
		this.seats_per_row=seats_per_row;
		for(int i=0;i<no_of_rows;i++) {
			for(int j=0;i<this.seats_per_row;j++) {
				ss[i][j]=0;
			}
		}
		System.out.println("success");
	}
	void reserve(String screen_name,int row_number,int seats[]) {
		if(this.screen_name.screen_name) {
			
		}
	}
	void unreserved(String screen_name,int row_number) {
		
	}
}
public class movietheatre {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of lines:");
		int n=sc.nextInt();
		String in[]=new String[n];
		for(int i=0;i<n;i++) {
			in[i]=sc.nextLine();
		}
		for(int i=0;i<n;i++) {
			if(in[i].charAt(0)=='a') {
				
			}
		}
	}

}
