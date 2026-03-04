import java.util.Scanner;

public class hwss0202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
            switch(n) {
                case 1:
                    System.out.println("có 31 ngày");
                    break;
                case 2:
                    System.out.println("có 28 hoặc 29 ngày");
                    break;
                case 3:
                    System.out.println("có 31 ngày");
                    break;
                case 5:
                    System.out.println("có 31 ngày");
                    break;
                case 7:
                    System.out.println("có 31 ngày");
                    break;
                case 8:
                    System.out.println("có 31 ngày");
                    break;
                case 10:
                    System.out.println("có 31 ngày");
                    break;
                case 12:
                    System.out.println("có 31 ngày");
                    break;
                case 4:
                    System.out.println("có 30 ngày");
                    break;
                case 6:
                    System.out.println("có 30 ngày");
                    break;
                case 9:
                    System.out.println("có 30 ngày");
                    break;
                case 11:
                    System.out.println("có 30 ngày");
                    break;
                default:
                    System.out.println("Tháng không hợp lệ.");
                    break;
            }
    }
}
