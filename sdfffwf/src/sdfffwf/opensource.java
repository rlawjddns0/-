package sdfffwf;
import java.util.Scanner;
public class opensource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"����","����", "��"};
		
		String user;
		Scanner scanner=new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�");
		System.out.print("���� ���� ��!>>");
		user=scanner.nextLine();
		
		while(user.equals("�׸�")==false)
		{
			int i=(int)(Math.random()*3);
			if(user.equals("����"))
			{
				if(str[i].equals("����")) {
					System.out.println("�����="+user+",��ǻ�ʹ�="+str[i]+", �����ϴ�");
					
				}
				else if(str[i].equals("����")) {
					System.out.println("�����="+user+",��ǻ�ʹ�="+str[i]+", ��ǻ�Ͱ� �̰���ϴ�");
				}
				
				else {
					System.out.println("�����="+user+",��ǻ�ʹ�="+str[i]+", ����ڰ� �̰���ϴ�");
					}
				System.out.print("���� ���� ��!>>");
				user=scanner.nextLine();
			}
			else if(user.equals("����"))
			{
				if(str[i].equals("����")) {
					System.out.println("�����="+user+",��ǻ�ʹ�="+str[i]+", ��ǻ�Ͱ� �̰���ϴ�");
					
				}
				else if(str[i].equals("����")) {
					System.out.println("�����="+user+",��ǻ�ʹ�="+str[i]+", �����ϴ�");
					}
				else {
					System.out.println("�����="+user+",��ǻ�ʹ�="+str[i]+", ����ڰ� �̰���ϴ�");
					
				}
				System.out.print("���� ���� ��!>>");
				user=scanner.nextLine();
			}
			else if(user.equals("��"))
			{
				if(str[i].equals("����")) {
					System.out.println("�����="+user+",��ǻ�ʹ�="+str[i]+", ��ǻ�Ͱ� �̰���ϴ�");
				
				}
				else if(str[i].equals("����")) {
					System.out.println("�����="+user+",��ǻ�ʹ�="+str[i]+", ����ڰ� �̰���ϴ�");
				}
				else {
					System.out.println("�����="+user+",��ǻ�ʹ�="+str[i]+", �����ϴ�");
					}
				
				System.out.print("���� ���� ��!>>");
				user=scanner.nextLine();
			}
			
			
		}
		
	
			
		}	

	}
