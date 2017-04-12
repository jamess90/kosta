package day3;

// 보라색 글씨들은 """예약어"""라고 부른다.  
// 나머지 글씨들은 """식별자"""라고 부른다. 
/*
 * 식별자(Identifiet)
 * 
 * 식별자란 쉽게 말해서 이름이다.
 * 변수, 상수, 메소드, 배열 등의 이름이다.
 * 따라서 식별자는 겹치면 안되고
 * 식별자를 만들 때에도 그와 관련되 규칙이 있다.
 * 
 * 예약어(Reserverd Word)
 * 
 * 예약어는 미리 자바에서 지정하여 사용하고 있는
 * 50개 정도의 단어들을 말한다.
 * 예약어들은 식별자들오 사용이 불가능하다.
 * abstract	assert		boolean		break		byte		case		catch		char		class		const
 * continue		default		do		double		else		enum		extend		final		finally		float
 * for		goto		if		implements		import		instanceof		int		interface		long		native
 * new		package		private		protected		public		return		short		static		strictfp		super
 * switch		synchronized		this		throw		throws		transient		try		void		volatile		while
 * 출처: http://fishithead.tistory.com/entry/04식별자-예약어-변수-자료형 [물고기공방]
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
//			amount = 5000;					//	amount가 try블럭 내에서만 사용되는 임시변수이기 때문에 참조할 수 없다.
		}
		for(int i = 0;;){
			break;
		}
//		i = 500;								//	for문에서만 사용되는 임시변수이기 때문에 참조할 수 없다.
	}
	
	void print(){
		count = 1000;
	}
	
}
