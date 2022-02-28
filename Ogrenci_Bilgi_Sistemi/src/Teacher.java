public class Teacher {
    String name;
    String phoneNum;
    String branch;

    public Teacher(String name, String phoneNum, String branch) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.branch = branch;
    }
    void print(){
        System.out.println("Adı: "+this.name);
        System.out.println("Telefon: "+ this.phoneNum);
        System.out.println("Bölümü: "+this.branch);
    }
}
