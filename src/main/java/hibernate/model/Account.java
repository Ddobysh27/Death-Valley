package hibernate.model;

import javax.persistence.*;

@Entity
@Table(name= "Account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accountId")
    private int idAccount;

    @Column(name = "account")
    private double account;

    @Column(name = "userId")
    private int idUser;

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Account() {
    }


    public Account(double account, int idUser, User user) {
        this.account = account;
        this.idUser = idUser;
    }


    @Override
    public String toString() {
        return "Account{" +
                "idAccount=" + idAccount +
                ", account=" + account +
                ", idUser=" + idUser +
                '}';
    }
}
