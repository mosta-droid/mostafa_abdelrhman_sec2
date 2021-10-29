package sec2_2;
public class student 
{
    String name;
    private int id;
    double gba;
    subject s1=new subject(2,"software",3);
    address a1=new address(3,"minia","egypt");

    public student() 
    {
        name="mostfa";
        id=3;
        gba=25;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGba(double gba) {
        this.gba = gba;
    }

    public void setS1(subject s1) {
        this.s1 = s1;
    }

    public void setA1(address a1) {
        this.a1 = a1;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGba() {
        return gba;
    }

    public subject getS1() {
        return s1;
    }

    public address getA1() {
        return a1;
    }
    

}
