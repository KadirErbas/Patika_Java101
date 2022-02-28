import java.sql.SQLOutput;

public class Course {
    String name;
    String code;
    String prefix;
    int examNote;
    int oralNote;
    Teacher teacher;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;

    }
    void printTeacherInfo(){
        this.teacher.print();
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;

        }
        else {
            System.out.println("Branşlar uyuşmuyor!");
        }
    }

}
