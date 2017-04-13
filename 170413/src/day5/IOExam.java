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
	         for(ProductVO vo : list){
	            System.out.println(vo);
	         }
	      } catch (IOException e) {
	         System.out.println(e.getMessage());
	      }
	}

	private static List<ProductVO> getProduct(String name) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader(name));
		String str = "";
		List<ProductVO> list = new ArrayList<>();

		while ((str = br.readLine()) != null) {
			String[] info = str.split(",");
			list.add(new ProductVO(info[0], Integer.parseInt(info[1]), info[2]));
		}
		br.close();
		return list;
	}
	
	public static String getFilePath(String name) {
		return  "C:\\Users\\James\\KOSTA\\kosta\\170413\\src\\day5\\" + name;
	}
}

class ProductVO {

	String name;
	int price;
	String company;

	public ProductVO(String name, int price, String company) {
		this.name = name;
		this.price = price;
		this.company = company;
		this.toString();
	}

	@Override
	public String toString() {
		return "name = " + this.name + "\nprice = " 
					+ this.price + "\ncompany = " + company + "\n";
	}
}
