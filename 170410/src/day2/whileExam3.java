package day2;

public class whileExam3 {

	public static void main(String[] args) {
		
		int random = (int) (Math.random()*100);
		/*
		 * ������ ���ڸ� �߻���ų �� 99�� ��� ����
		 * �� ���� �߻����״��� ����Ѵ�.
		 * ��,  �Ź� �߻���Ų ���ڸ� ����Ѵ�.
		 * �� ��°������ ����Ѵ�.
		 */
		int count = 0;
		while(random != 99){
			 random = (int) (Math.random()*100);
			 System.out.print("�߻��� ���� : ");
			 System.out.println(random);
			 System.out.println("���� ī��Ʈ : " + count);
			 
			 count++;
		}
	}
}
