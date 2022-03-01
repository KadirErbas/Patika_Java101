public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    int tax(){
        if (this.salary > 1000.0){
            return (int)(this.salary * 0.03);
        }
        return this.salary;
    }

    int bonus(){
        if (this.workHours > 40){
            return  (workHours-40) * 30;
        }
        return 0;
    }

    int raiseSalary(){
        int totalYear = 2021-this.hireYear;
        if(totalYear < 10){
            return (int)(this.salary * 0.05);
        }
        else if (totalYear < 20 && totalYear >= 10){
            return (int)(this.salary * 0.10);
        }
        else if (totalYear >= 20){
            return (int)(this.salary * 0.15);
        }
        return this.salary;
    }
    void printInfos(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma saati: "+this.workHours);
        System.out.println("Başlangıç yılı: "+this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: "+ bonus());
        System.out.println("Maaş Artışı: "+ raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: "+ (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş: "+ (this.salary + raiseSalary()));
    }
}
