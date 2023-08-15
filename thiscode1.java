class Demo{
private int jerseyNo = 0;
    private String name = null;

    public Player(int jerseyNo, String name) {
        this.jerseyNo = jerseyNo;
        this.name = name;

        System.out.println(jerseyNo + " = " + name);
    }

    public void info() {
        System.out.println("Jersey No: " + jerseyNo);
        System.out.println("Name: " + name);
    }
}
class Client {
    public static void main(String[] args) {
        Player obj1 = new Player(18, "Virat");
        obj1.info();

        Player obj2 = new Player(7, "MsDhoni");
        obj2.info();

        Player obj3 = new Player(45, "Rohit");
        obj3.info();
    }
}

























