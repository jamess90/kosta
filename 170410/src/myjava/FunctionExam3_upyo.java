package myjava;

public class FunctionExam3_upyo {

   public static void main(String[] args) {

      /*1.   
       * 1부터 999까지의 100개의 임의의 수로 이루어진 배열이 주어졌을 때, 다음 기능의 함수들을 각각 구현한다.
         a. 배열의 수들을 한 줄에 10개씩 출력하는 함수, 이때 각 수들은 줄이 맞춰져야 함
         b. 홀수들만 출력하는 함수, 출력되는 방식은 a와 동일함
         c. 인덱스가 홀수인 수들을 출력하는 함수, 출력되는 방식은 a와 동일함
         d. 짝수의 개수를 반환하는 함수
         e. 배열의 수들의 합을 반환하는 함수
         f. 가장 작은 수의 위치(인덱스)를 반환하는 함수
         g. 가장 큰 수의 위치를 반환하는 함수
         h. 3의 배수 모두를 새로운 배열에 복사하는 함수
         
         "\n\t" // n => new Line, t => tab
         */
      int[] num_list = new int[100];
      for(int i=0; i<num_list.length; i++) {
         num_list[i] = (int) ((Math.random()*999) + 1);
      }
      
      // a. 배열의 수들을 한 줄에 10개씩 출력하는 함수, 이때 각 수들은 줄이 맞춰져야 함
      printLine(num_list);
      System.out.println("\n");
      // b. 홀수들만 출력하는 함수
      printOdd(num_list);
      System.out.println("\n");
      // c. 인덱스가 홀수인 수들을 출력하는 함수
      printIndexOdd(num_list);
      System.out.println("\n");
      // d. 짝수의 개수를 반환하는 함수
      int cnt = evenCnt(num_list);
      System.out.println("짝수 갯수: " + cnt);
      // e. 배열의 수들의 합을 반환하는 함수
      int sum = listSum(num_list);
      System.out.println("배열의 총합: " + sum);
      // f. 가장 작은 수의 위치(인덱스)를 반환하는 함수
      int minIdx = minIndex(num_list);
      System.out.println("가장 작은 수의 위치: " + minIdx);
      // g. 가장 큰 수의 위치를 반환하는 함수
      int maxIdx = maxIndex(num_list);
      System.out.println("가장 큰 수의 위치: " + maxIdx);
      // h. 3의 배수 모두를 새로운 배열에 복사하는 함수
      int[] three = copyArray(num_list);
   }

   private static int[] copyArray(int[] num_list) {
      int t_cnt = 0;
      for(int i=0; i<num_list.length; i++) {
         if(num_list[i]%3==0) {
            t_cnt++;
         }
      }   // 기존 배열에 3의배수 총 갯수 구하기
      
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
      int index = 0;                        // 최대값 인덱스 보관변수
      int maximum = 0;                     // 최대값 변수
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
      int index = 0;                        // 최소값 인덱스 보관변수
      int minimum = 999;                     // 최소값 변수
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
      int cnt = 0;                           // 짝수갯수 카운터
      for(int i=0; i<num_list.length; i++) {
         if(num_list[i]%2==0) {
            cnt++;
         }
      }
      return cnt;
   } // d. evenCount() end 

   private static void printIndexOdd(int[] num_list) {
      int cnt = 0;                            // 인덱스 카운터
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