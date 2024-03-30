public abstract class Member<T> implements Prioritezed{

    String title;
    Member next;
    Member prev;

    T pair;
    public Member()

    {
    }

    public String getTitle(){
        return this.title;
    }

    public abstract T getNext();

    public abstract T getPrev();

    public abstract void setNext(T member);

    public abstract void setPrev(T member);

    public abstract void setNext(Men member);

    public abstract void setPrev(Men member);

    public abstract T getPair();

    public abstract void setPair(T member);

    public abstract void setPriority();
}
