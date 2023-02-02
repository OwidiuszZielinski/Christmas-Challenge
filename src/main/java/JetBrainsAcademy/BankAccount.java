package JetBrainsAcademy;

import java.util.Objects;

class BankAccount {

    protected String number;
    protected Long balance;

    public BankAccount(String number, Long balance) {
        this.number = number;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(number ,that.number) && Objects.equals(balance ,that.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number ,balance);
    }
}