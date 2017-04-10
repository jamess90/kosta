package myjava;

public class FunctionExam3_upyo {

   public static void main(String[] args) {

      /*1.   
       * 1���� 999������ 100���� ������ ���� �̷���� �迭�� �־����� ��, ���� ����� �Լ����� ���� �����Ѵ�.
         a. �迭�� ������ �� �ٿ� 10���� ����ϴ� �Լ�, �̶� �� ������ ���� �������� ��
         b. Ȧ���鸸 ����ϴ� �Լ�, ��µǴ� ����� a�� ������
         c. �ε����� Ȧ���� ������ ����ϴ� �Լ�, ��µǴ� ����� a�� ������
         d. ¦���� ������ ��ȯ�ϴ� �Լ�
         e. �迭�� ������ ���� ��ȯ�ϴ� �Լ�
         f. ���� ���� ���� ��ġ(�ε���)�� ��ȯ�ϴ� �Լ�
         g. ���� ū ���� ��ġ�� ��ȯ�ϴ� �Լ�
         h. 3�� ��� ��θ� ���ο� �迭�� �����ϴ� �Լ�
         
         "\n\t" // n => new Line, t => tab
         */
      int[] num_list = new int[100];
      for(int i=0; i<num_list.length; i++) {
         num_list[i] = (int) ((Math.random()*999) + 1);
      }
      
      // a. �迭�� ������ �� �ٿ� 10���� ����ϴ� �Լ�, �̶� �� ������ ���� �������� ��
      printLine(num_list);
      System.out.println("\n");
      // b. Ȧ���鸸 ����ϴ� �Լ�
      printOdd(num_list);
      System.out.println("\n");
      // c. �ε����� Ȧ���� ������ ����ϴ� �Լ�
      printIndexOdd(num_list);
      System.out.println("\n");
      // d. ¦���� ������ ��ȯ�ϴ� �Լ�
      int cnt = evenCnt(num_list);
      System.out.println("¦�� ����: " + cnt);
      // e. �迭�� ������ ���� ��ȯ�ϴ� �Լ�
      int sum = listSum(num_list);
      System.out.println("�迭�� ����: " + sum);
      // f. ���� ���� ���� ��ġ(�ε���)�� ��ȯ�ϴ� �Լ�
      int minIdx = minIndex(num_list);
      System.out.println("���� ���� ���� ��ġ: " + minIdx);
      // g. ���� ū ���� ��ġ�� ��ȯ�ϴ� �Լ�
      int maxIdx = maxIndex(num_list);
      System.out.println("���� ū ���� ��ġ: " + maxIdx);
      // h. 3�� ��� ��θ� ���ο� �迭�� �����ϴ� �Լ�
      int[] three = copyArray(num_list);
   }

   private static int[] copyArray(int[] num_list) {
      int t_cnt = 0;
      for(int i=0; i<num_list.length; i++) {
         if(num_list[i]%3==0) {
            t_cnt++;
         }
      }   // ���� �迭�� 3�ǹ�� �� ���� ���ϱ�
      
      int[] three = new int[t_cnt];
      int cnt = 0;
      for(int i=0; i<three.length; i++) {
         
         for(int j=cnt; j<num_list.length; j++) {
            if(num_list[j]%3==0) {
               three[i] = num_list[j];
               cnt = j+1;
               break;
            }
         }
         
      }
      return three;
   }// h. copyArray() end

   private static int maxIndex(int[] num_list) {
      int index = 0;                        // �ִ밪 �ε��� ��������
      int maximum = 0;                     // �ִ밪 ����
      for(int i=0; i<num_list.length; i++) {
         for(int j=0; j<num_list.length; j++) {
            if(maximum < num_list[j]) {
               maximum = num_list[j];
               index = j;
            }
         }
      }
      return index;
      
   }// g. maxIndex() end 

   private static int minIndex(int[] num_list) {
      int index = 0;                        // �ּҰ� �ε��� ��������
      int minimum = 999;                     // �ּҰ� ����
      for(int i=0; i<num_list.length; i++) {
         for(int j=0; j<num_list.length; j++) {
            if(minimum > num_list[j]) {
               minimum = num_list[j];
               index = j;
            }
         }
      }
      return index;
      
   }// f. minIndex() end

   private static int listSum(int[] num_list) {
      int sum = 0;
      for(int i=0; i<num_list.length; i++) {
         sum = sum + num_list[i];
      }
      return sum;
      
   } // e. listSum() end

   private static int evenCnt(int[] num_list) {
      int cnt = 0;                           // ¦������ ī����
      for(int i=0; i<num_list.length; i++) {
         if(num_list[i]%2==0) {
            cnt++;
         }
      }
      return cnt;
   } // d. evenCount() end 

   private static void printIndexOdd(int[] num_list) {
      int cnt = 0;                            // �ε��� ī����
      for(int i=0; i<num_list.length; i++) {
         if(i%2!=0) {
            if(cnt%10==0 && cnt!=0) {
               System.out.println();
            }
            cnt = cnt + 1;
            System.out.print(num_list[i] + "\t");
         }
      }
      
   }// c. indexOddPrint() end

   private static void printOdd(int[] num_list) {
      int cnt = 0;
      for(int i=0; i<num_list.length; i++) {
         if(num_list[i]%2!=0) {
            if(cnt%10==0 && cnt!=0) {
               System.out.println();
            }
            cnt = cnt + 1;
            System.out.print(num_list[i] + "\t");
         }
      }
      
   } // b. oddPrint() end

   private static void printLine(int[] num_list) {
      for(int i=0; i<num_list.length; i++) {
         if(i%10==0 && i!=0) {
            System.out.println();
         }
         System.out.print(num_list[i] + "\t");
      }
      
   }// a. linePrint() end

}