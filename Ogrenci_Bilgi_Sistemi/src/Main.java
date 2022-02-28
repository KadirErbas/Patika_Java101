public class Main {

    public static void main(String[] args){

        Teacher teacher1 = new Teacher("Mahmut","05333333333","TRH");
        Teacher teacher2 = new Teacher("Albert Einstein","0522222222","FZK");
        Teacher teacher3 = new Teacher("Ali Veli","05333333333","KMY");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(teacher1);
        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(teacher2);
        Course kimya = new Course("Kimya", "103","KMY");
        kimya.addTeacher(teacher3);

        Student student1 = new Student("Ahmet","1","200444003",tarih,fizik,kimya);
        System.out.println(student1.name);
        student1.addExamNotes(50,50,60);
        student1.addOralNote(70,70,70);
        student1.printExamNote();
        student1.printOralNote();
        student1.calculateAvarage();
        System.out.println(student1.name+" Geçti mi? "+student1.isPass());

        Student student2 = new Student("Ayşe","1","200444013",tarih,fizik,kimya);
        System.out.println("\n"+student2.name);
        student2.addExamNotes(60,30,80);
        student2.addOralNote(100,90,100);
        student2.printExamNote();
        student2.printOralNote();
        student2.calculateAvarage();
        System.out.println(student2.name+" Geçti mi? "+student2.isPass());

    }
}
