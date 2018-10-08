package sdfffwf;
import java.util.Scanner;
public class opensource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"가위","바위", "보"};
		
		String user;
		Scanner scanner=new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다");
		System.out.print("가위 바위 보!>>");
		user=scanner.nextLine();
		
		while(user.equals("그만")==false)
		{
			int i=(int)(Math.random()*3);
			if(user.equals("가위"))
			{
				if(str[i].equals("가위")) {
					System.out.println("사용자="+user+",컴퓨터는="+str[i]+", 비겼습니다");
					
				}
				else if(str[i].equals("바위")) {
					System.out.println("사용자="+user+",컴퓨터는="+str[i]+", 컴퓨터가 이겼습니다");
				}
				
				else {
					System.out.println("사용자="+user+",컴퓨터는="+str[i]+", 사용자가 이겼습니다");
					}
				System.out.print("가위 바위 보!>>");
				user=scanner.nextLine();
			}
			else if(user.equals("바위"))
			{
				if(str[i].equals("가위")) {
					System.out.println("사용자="+user+",컴퓨터는="+str[i]+", 컴퓨터가 이겼습니다");
					
				}
				else if(str[i].equals("바위")) {
					System.out.println("사용자="+user+",컴퓨터는="+str[i]+", 비겼습니다");
					}
				else {
					System.out.println("사용자="+user+",컴퓨터는="+str[i]+", 사용자가 이겼습니다");
					
				}
				System.out.print("가위 바위 보!>>");
				user=scanner.nextLine();
			}
			else if(user.equals("보"))
			{
				if(str[i].equals("가위")) {
					System.out.println("사용자="+user+",컴퓨터는="+str[i]+", 컴퓨터가 이겼습니다");
				
				}
				else if(str[i].equals("바위")) {
					System.out.println("사용자="+user+",컴퓨터는="+str[i]+", 사용자가 이겼습니다");
				}
				else {
					System.out.println("사용자="+user+",컴퓨터는="+str[i]+", 비겼습니다");
					}
				
				System.out.print("가위 바위 보!>>");
				user=scanner.nextLine();
			}
			
			
		}
		
	
			
		}	

	}
