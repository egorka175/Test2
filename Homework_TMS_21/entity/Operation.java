package by.tms.Homework_TMS_21.entity;

public class Operation {
    private double num1;
    private double num2;
    private  String operation;
    private double rez;
    private User user;

    public Operation(double num1, double num2, String operation, double rez, User user) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
        this.rez = rez;
        this.user=user;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", operation='" + operation + '\'' +
                ", rez=" + rez +
                ", user=" + user +
                '}';
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getRez() {
        return rez;
    }

    public void setRez(double rez) {
        this.rez = rez;
    }
}
