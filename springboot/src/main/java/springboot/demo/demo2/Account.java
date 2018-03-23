package springboot.demo.demo2;

public class Account {
    private int id ;
    private String name ;
    private double money;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public int getId() {
        return id;
    }
}
