package beatlsql.demo;



public class Account {

    private int id ;
    private String name ;
    private double money;

    public void setMoney(double money) {
        this.money = money;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }
}
