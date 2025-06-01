public class Oameni {
    private int cnp;
    private String name;

    public Oameni(int cnp, String name) {
        this.cnp = cnp;
        this.name = name;
    }

    public Oameni() {}

    public int getCnp() {
        return cnp;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Oameni{" +
                "cnp=" + cnp +
                ", name='" + name + '\'' +
                '}';
    }
}


