
public class Encapsulation {
    public static void main(String[] args) {

        Rohit obj = new Rohit();
        obj.setId(2);
        obj.setName("Krishna");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}

class Rohit {

    private int id;
    private String name;
    // private variables are accessed using getter and setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
