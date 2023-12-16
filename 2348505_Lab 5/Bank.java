interface BankInterface
{
    abstract double getBalance();
    abstract double getInterestRate();
}
class BankA implements BankInterface
{
    public double getBalance()
    {
        return 10000;
    }
    public double getInterestRate()
    {
        return 7;
    }
}
class BankB implements BankInterface
{
    public double getBalance()
    {
        return 150000;
    }
    public double getInterestRate()
    {
        return 7.4;
    }
}
class BankC implements BankInterface
{
    public double getBalance()
    {
        return 200000;
    }
    public double getInterestRate()
    {
        return 7.9;
    }
}
class Bank 
{
    public static void main(String args[])
    {
        BankA obj1 = new BankA();
        BankB obj2 = new BankB();
        BankC obj3 = new BankC();
        System.out.println("The balance in Bank A: Rs."+obj1.getBalance());
        System.out.println("The interest rate of Bank A: "+obj1.getInterestRate()+"%");
        System.out.println("The balance in Bank B: Rs."+obj2.getBalance());
        System.out.println("The interest rate of Bank B: "+obj2.getInterestRate()+"%");
        System.out.println("The balance in Bank C: Rs."+obj3.getBalance());
        System.out.println("The interest rate of Bank C: "+obj3.getInterestRate()+"%");        
    }
}
