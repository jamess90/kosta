package day3;

// ����� �۾����� """�����"""��� �θ���.  
// ������ �۾����� """�ĺ���"""��� �θ���. 
/*
 * �ĺ���(Identifiet)
 * 
 * �ĺ��ڶ� ���� ���ؼ� �̸��̴�.
 * ����, ���, �޼ҵ�, �迭 ���� �̸��̴�.
 * ���� �ĺ��ڴ� ��ġ�� �ȵǰ�
 * �ĺ��ڸ� ���� ������ �׿� ���õ� ��Ģ�� �ִ�.
 * 
 * �����(Reserverd Word)
 * 
 * ������ �̸� �ڹٿ��� �����Ͽ� ����ϰ� �ִ�
 * 50�� ������ �ܾ���� ���Ѵ�.
 * �������� �ĺ��ڵ�� ����� �Ұ����ϴ�.
 * abstract	assert		boolean		break		byte		case		catch		char		class		const
 * continue		default		do		double		else		enum		extend		final		finally		float
 * for		goto		if		implements		import		instanceof		int		interface		long		native
 * new		package		private		protected		public		return		short		static		strictfp		super
 * switch		synchronized		this		throw		throws		transient		try		void		volatile		while
 * ��ó: http://fishithead.tistory.com/entry/04�ĺ���-�����-����-�ڷ��� [��������]
 * 
 */

public class VariableTest {

	int count;
	static int totalCount;
	public static void main(String[] args) {
		int count;
		try {
			int amount = 600;
		} catch (Exception e) {
//			amount = 5000;					//	amount�� try�� �������� ���Ǵ� �ӽú����̱� ������ ������ �� ����.
		}
		for(int i = 0;;){
			break;
		}
//		i = 500;								//	for�������� ���Ǵ� �ӽú����̱� ������ ������ �� ����.
	}
	
	void print(){
		count = 1000;
	}
	
}
