import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContDeEconomii eco = new ContDeEconomii();
        ContDeCredit crd = new ContDeCredit();

        int alegere;
        int alegere2;


        System.out.println("1)Cont de economii");
        System.out.println("2)Cont de credit");
        System.out.println("ce cont  alegeti: ");

        alegere = sc.nextInt();

        switch (alegere){
            case 1: //Cont Economii
                System.out.println("1)depozitare");
                System.out.println("2)retragere");
                System.out.println("ce alegeti: ");
                alegere2 = sc.nextInt();
                switch (alegere2){
                    case 1:
                        System.out.println("ce suma: ");
                        int x = sc.nextInt();
                        eco.deposit(x);
                        break;
                    case 2:
                        System.out.println("ce suma retrageti: ");
                        int z = sc.nextInt();
                        eco.withdraw(z);
                        break;
                }
                break;
            case 2: //Cont Credit
                System.out.println("1)depozitare");
                System.out.println("2)retragere");
                System.out.println("ce alegeti: ");
                alegere2 = sc.nextInt();
                switch (alegere2){
                    case 1:
                        System.out.println("ce suma: ");
                        int x = sc.nextInt();
                        crd.deposit(x);
                        break;
                    case 2:
                        System.out.println("ce suma retrageti: ");
                        int z = sc.nextInt();
                        crd.withdraw(z);
                        break;
                }
        }
    }
}