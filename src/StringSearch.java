import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        System.out.println("Привет!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите контрольную строку");
        String controlStr = sc.nextLine();
        System.out.println("Введите ограничение на длину подстрок");
        int limit = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите подстроки. Конец ввода - пустая строка");
        String substr = sc.nextLine();
        while (!substr.isEmpty()) {
            if(substr.length() <= limit && controlStr.contains(substr))
                System.out.println("входит в контрольную строку");
            else if(substr.length() > limit && controlStr.contains(substr))
                System.out.println("входит в контрольную строку, но её длина больше установленного лимита");
            else
                System.out.println("не входит в контрольную строку");
            substr = sc.nextLine();
        }
    }
}