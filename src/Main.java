import com.sun.security.auth.module.Krb5LoginModule;

import java.util.*;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> A = new ArrayList<>();
        System.out.println("Введите 5 слов для списка А");
        for (int i = 0; i < 5; i++) {
            System.out.println("Строка "+ (i+1)+ ":");
            A.add(scanner.nextLine());
        }

        System.out.println("Список А: " + A);

        ArrayList<String> B = new ArrayList<>();
        System.out.println("Введите 5 слов для списка B");
        for (int i = 0; i < 5; i++) {
            System.out.println("Строка "+ (i+1)+ ":");
            B.add(scanner.nextLine());
        }

        System.out.println("Список B: " + B);

        List<String> C = new ArrayList<>();
        C.add(A.get(0));
        C.add(B.get(4));
        C.add(A.get(1));
        C.add(B.get(3));
        C.add(A.get(2));
        C.add(B.get(2));
        C.add(A.get(3));
        C.add(B.get(1));
        C.add(A.get(4));
        C.add(B.get(0));

        System.out.println("До сортировки: " + C);

        Collections.sort(C, Comparator.comparingInt(String::length));
        System.out.println("Сортировка от наименьшого количества " +
                "символов : " + C);
    }
}
