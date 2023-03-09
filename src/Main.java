import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = {1,3,5,2,3,4};
        int[] newNum = new int[num.length + 1];
        System.out.println("Nhập số bạn muốn thêm vào mảng : ");
        int addNum = scanner.nextInt();
        System.out.println("Nhập vị trí bạn muốn thêm vào mảng : ");
        int index = scanner.nextInt();
        do {
            System.arraycopy(num, 0,newNum, 0, index);
            newNum[index] = addNum;
            System.arraycopy(num, index,newNum, index+1, num.length -  index);
            System.out.println("mảng cũ là : "+ Arrays.toString(num));
            System.out.println("mảng cũ là : "+ Arrays.toString(newNum));
        }while (index<0 || index>num.length);

    }
}