package farmyard;

public class aSheep extends animal {

    private String lastSheared;

    public aSheep(String lastSheared, String name, int age) {
        super(name, "sheep", age);
        this.lastSheared = lastSheared;

    }

    @Override

    public String toString() {
        return name + ", " + type + ", " + age;
    }

    public String getLastSheared() {
        return lastSheared;
    }

    public void setLastSheared(String lastSheared) {
        this.lastSheared = lastSheared;
    }

}
