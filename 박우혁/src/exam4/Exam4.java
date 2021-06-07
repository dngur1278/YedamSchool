package exam4;

public class Exam4 {

	public static void main(String[] args) {
		String[] arr = {"010102-2", "991012-1", "960304-1", "881012-2", "040403-1"};
		int man = 0;
		int wom = 0;
		int ten = 0;
		int twe = 0;
		int tre = 0;
		int fore = 0;
		
		for (int i=0; i < arr.length; i++) {
			int n = Integer.parseInt(arr[i].substring(0, 2));
			if (n < 21) {
				n += 2000;
			}else {
				n += 1900;
			}
			
			if(2021-n+1>=40) {
				fore+=1;
			} else if (2021-n+1>=30) {
				tre +=1;
			} else if (2021-n+1>=20) {
				twe += 1;
			} else if (2021-n+1>=10) {
				ten += 1;
			}
		}
		
		for (int j = 0; j < arr.length; j++) {
			int m = Integer.parseInt(arr[j].substring(7));
			
			if (m == 1) {
				man += 1;
			} else {
				wom += 1;
			}
		}
		
		System.out.printf("남 %d   여 %d\n", man, wom );
		System.out.printf("10대    %d명\n", ten );
		System.out.printf("20대    %d명\n", twe );
		System.out.printf("30대    %d명\n", tre );
		System.out.printf("40대    %d명", fore );
		
	}

}
