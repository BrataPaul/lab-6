class ContDeEconomii extends ContBancar{


    @Override
    public void deposit(int amount) {
        total = total + amount;
        System.out.println("Bani din cont: "+getBalance(total));
    }

    @Override
    public void withdraw(int amount) {
            if(amount >= total){
                System.out.println("nu sunt suficienti bani ");
            }else {
                total -= amount;
                System.out.println("Bani ramasi: "+getBalance(total));
            }
    }
}
