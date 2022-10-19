import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        int ans1 = sc.nextInt();
        if (sc.hasNextLine())
            switch (ans1) {
                case 18 -> System.out.println("Good at least u r old enough");
                case 17 -> System.out.println("Well no so usefull as 18 but we can work on it ");
                case 16 -> {
                    System.out.println("Nah kid get outa computer");
                    exit(0);
                }

            }
        System.out.println("Are u addicted or was addicted to any type of drugs? type 1 if yes or type 2 if no");
        int ans3 = sc.nextInt();
        if (sc.hasNextLine())
            switch (ans3) {
                case 1 -> System.out.println("Will all r it's fine");
                case 2 -> {
                    System.out.println("Good! keep it up but u r boring get out of test normie");
                    exit(0);
                }
            }
        System.out.println("What drug 1)alcohol 2)cigarettes 3) weed 4) meth (type number)");
        int ans2 = sc.nextInt();
        if (sc.hasNextLine())
            switch (ans2) {
                case 1 -> System.out.println("Not so intresting we all drink it");
                case 2 -> System.out.println("huh wb u stop it? it's not good for ur breathe at least");
                case 3 -> System.out.println("me to bro");
                case 4 ->
                        System.out.println("huh u r type of guy that want to get out of this shit as fast as possible, well Goodbye! Go get high again moron");
            }
        System.out.println("How many years u using or was using it?");
        int ans4 = sc.nextInt();
        sc.hasNextLine();
        {
            switch (ans4) {
                case 1 -> System.out.println("u still can throw it ");
                case 2 -> System.out.println("u still can throw it if u try");
                case 3 -> System.out.println("oh i bet u r thinking 'bout it even now");
                case 4 -> System.out.println("i bet u have easy life tatoo");
                case 5 -> System.out.println("Holy shit did ur mom set u on it crackhead");
            }
        }
        System.out.println("thank you for going throw my little test <3");
    }
}
