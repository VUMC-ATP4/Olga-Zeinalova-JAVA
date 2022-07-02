package homework.oop_homework;

public class Customer {

    private String name;
    private Boolean member = false;
    private String memberType;

    public Customer (String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public Boolean isMember(){
        return member;
    }

    public String getMemberType(){
        return memberType;
    }
    public void setMemberType(String memberType){
        this.memberType = memberType;
    }

    public void setMember(Boolean member) {
        this.member = member;
    }

    @Override
    public String toString(){
        return "Customer{" +
                "name-'" + name + '\''+
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}
