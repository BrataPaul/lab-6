class ContDeCredit extends ContBancar{



    @Override
    public void deposit(int amount) {
            credit += amount;
        System.out.println("Bani actuali: "+getBalance(credit));
    }

    @Override
    public void withdraw(int amount) {
        if (amount >= credit){
            System.out.println("nu sunt suficienti bani");
        }else {
            credit -= amount;
            System.out.println("Credit ramas: "+getBalance(credit));
            System.out.println("Trebuie sa depuneti inapoi " +amount);
        }

    }
}
