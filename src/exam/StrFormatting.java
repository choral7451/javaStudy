package exam;

public class StrFormatting {

	public static void main(String[] args) {
		// StrFormatting
		// ���ڿ� ������ : ���ڿ� �ȿ� ��� ���� �����ϴ� ���.
		 int money = 15000;
		 String day = "tomorrow";
		 System.out.println(String.format("i need %s money %d", day, money));	
		// ���ڿ� ���� �ڵ�
		// %s : ���ڿ�
		// %c : char
		// %d : ����
		// %f : �ε��Ҽ���
		// %o : 8����
		// %x : 16����
		// %% : ���� % �� ��ü 
		 
		// ����
		// ������ ������ ����غ�����
		// ����ҹ��� : error clean 95% 
		// ���� : ���ڴ� ���ڴ��, ���ڴ� ���ڴ�� Ÿ�� �������.
		 
		System.out.println(String.format("error clean %d%%", 95));
		
		// ������ �ڵ�� ���� ���
		// �����ڵ� + ������ ������� ������ ��� ����
		// ���ڿ������� ���� ó�� 
		System.out.println(String.format("%10s", "t"));
		// ���� �ڵ忡�� �����ڵ� ���� ������ �ǹ̴� ���̰� 10���� ���ڿ� ��������
		// ���Ե� ���� �������� �����ϰ� �������� �������� ���ܵζ�� �ǹ�
		
		// ���� ���ڰ� ������� ���Ե� ���� �������� ������ �������� �������� ó���Ѵ�.
		System.out.println(String.format("%-10sjm", "hi"));
		
		// format �޼��� ��� �Ʒ��� ���� ���·ε� ��� ����
		// �������� printf�� ����� ��¸� ����. format �޼���� ����� ��ȯ(����)
		System.out.printf("%-10sjm", "hi");
	}

}