import java.util.ArrayList;

public class Men extends Member implements Humans{

    int age;

    int buty;

    boolean academic;

    int bank_budget = 0;

    int salary;
    float height;

    boolean is_fit;



    Men next;

    Men prev;

    Woman pair = null;

    ArrayList<Woman> priority = null;


    public Men() {
        super();
        this.next = null;
        this.prev = null;
        this.priority = new ArrayList<Woman>();
    }

    @Override
    public Men getNext() {
        return this.next;
    }

    @Override
    public Men getPrev() {
        return this.prev;
    }

    @Override
    public void setNext(Object member) {
        if (member instanceof Men) {
            this.next = (Men) member;
        }

    }

    @Override
    public void setPrev(Object member) {
        if (member instanceof Men) {
            this.prev = (Men) member;
        }
    }

    @Override
    public void setNext(Men member) {

    }

    @Override
    public void setPrev(Men member) {

    }

    @Override
    public Woman getPair() {
        return null;
    }

    @Override
    public void setPair(Object member) {
        ;
    }

    @Override
    public Woman getPriority() {
        return null;
    }

    @Override
    public void setPriority(Object member) {

    }

    @Override
    public void setPriority() {
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public boolean is_academic() {
        return this.academic;
    }

    @Override
    public float getHeight() {
        return this.height;
    }
}
