public class MembersGroup<T extends Member> implements VolumeLimited{

    int volume;
    T head;
    T tail;
    public MembersGroup(){
        this.head = null;
        this.tail = this.head;
        this.volume = 1;

    }

    public int getVolume(){
        return volume;
    }


    private void addMember(T member){
        if (this.head == null){
            this.head = member;
            this.tail = member;
        }
        else{
            this.tail.setNext(member);


        }

    }
}
