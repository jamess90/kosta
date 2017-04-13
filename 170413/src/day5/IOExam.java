package day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOExam {

	public static void main(String[] args) throws Exception {
		System.out.println("파일 이름을 입력하세요. (phonelist.txt)");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		try {
			List<ProductVO> list = getProduct(getFilePath(name));
			for (ProductVO vo : list) {
				System.out.println(vo);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static List<ProductVO> getProduct(String name) throws Exception {

		BufferedReader br = null;
		List<ProductVO> list = new ArrayList<>();

		try {
			br = new BufferedReader(new FileReader(name));
			String _str = "";
			while ((_str = br.readLine()) != null) {
				String[] _info = _str.split(",");
				list.add(new ProductVO(_info[0], Integer.parseInt(_info[1]), _info[2]));
			}
		} catch (Exception e) {
		} finally {
			if (br != null)
				br.close();
		}
		return list;
	}

	public static String getFilePath(String name) {
		return "C:\\Users\\James\\KOSTA\\kosta\\170413\\src\\day5\\" + name;
	}
}

class ProductVO {

	String name;
	int price;
	String maker;

	public ProductVO(String name, int price, String maker) {
		this.name = name;
		this.price = price;
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "name = " + this.name 
				+ "\nprice = " + this.price 
				+ "\nmaker = " + this.maker 
				+ "\n";
	}
}
