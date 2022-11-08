public class Account extends Customer implements Action {
    private int accnumber;
    private String acctype;
    private int credit;
    private int debt;

    public Account() {
    }

    public int getAccnumber() {
        return accnumber;
    }

    public void setAccnumber(int accnumber) {
        this.accnumber = accnumber;
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public int withdraw (int cash_wd){
        credit -= cash_wd;
        return cash_wd;
    }

    public void deposit(int cash_dp){
        credit += cash_dp;
    }

}
