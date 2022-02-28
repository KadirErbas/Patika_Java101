public class Student {
    // name,stuNo,classes,course1,course2,course3,avarage,isPass
    String name;
    String stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double avarage;
    boolean isPass;

    public Student(String name,String classes,String stuNo,Course course1, Course course2,Course course3){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addExamNotes(int note1,int note2,int note3){
        if (note1 >= 0 && note1 <= 100)
            this.course1.examNote = note1;
        if (note2 >= 0 && note2 <= 100)
            this.course2.examNote = note2;
        if (note3 >= 0 && note3 <= 100)
            this.course3.examNote = note3;
    }

    void addOralNote(int oralnote1,int oralnote2,int oralnote3){
        if (oralnote1 >= 0 && oralnote1 <= 100)
            this.course1.oralNote = oralnote1;
        if (oralnote2 >= 0 && oralnote2 <= 100)
            this.course2.oralNote = oralnote2;
        if (oralnote3 >= 0 && oralnote3 <= 100)
            this.course3.oralNote = oralnote3;
    }
    void  printOralNote(){
        System.out.println(this.course1.name+" Sözlü Notu:\t"+this.course1.oralNote);
        System.out.println(this.course2.name+" Sözlü Notu:\t"+this.course2.oralNote);
        System.out.println(this.course3.name+" Sözlü Notu:\t"+this.course3.oralNote);
    }

    void printExamNote(){
        System.out.println(this.course1.name+" Sınav Notu:\t"+this.course1.examNote);
        System.out.println(this.course2.name+" Sınav Notu:\t"+this.course2.examNote);
        System.out.println(this.course3.name+" Sınav Notu:\t"+this.course3.examNote);
    }
    void calculateAvarage(){
        this.avarage = ((course1.oralNote*0.20 + course1.examNote*.80) + (course2.oralNote*0.20+course2.examNote*0.80)+ (course3.oralNote*0.20+course3.examNote*0.80))/3;
        System.out.println("Ortalama= "+this.avarage);
    }
    boolean isPass(){
        if (this.avarage > 55){
            this.isPass = true;
            return this.isPass;
        }
        else {
            this.isPass = false;
            return this.isPass;
        }

    }
}
