import java.lang.reflect.Field;

public class Woman extends Member{

    int buty = 0;
    int age = 0;
    boolean is_academic = false;


    @Override
    public Object getNext() {
        return null;
    }

    @Override
    public Object getPrev() {
        return null;
    }

    @Override
    public void setNext(Object member) {

    }

    @Override
    public void setPrev(Object member) {

    }

    @Override
    public void setNext(Men member) {

    }

    @Override
    public void setPrev(Men member) {

    }

    @Override
    public Object getPair() {
        return null;
    }

    @Override
    public void setPair(Object member) {

    }

    @Override
    public void setPriority() {

    }

    @Override
    public Object getPriority() {
        return null;
    }

    @Override
    public void setPriority(Object member) {

    }
}
