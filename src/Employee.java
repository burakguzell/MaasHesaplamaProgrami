public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double taxPrice;
        if (this.salary >= 1000) {
            taxPrice = this.salary * 0.03;
        } else {
            taxPrice = 0;
        }
        return taxPrice;
    }

    public int bonus() {

        int bonus;
        if (workHours >= 40) {
            bonus = (this.workHours - 40) * 30;
        } else {
            bonus = 0;
        }
        return bonus;
    }

    public double raiseSalary() {

        double raiseSalaryPrice = 0;
        if ((2021 - this.hireYear) < 10) {

            raiseSalaryPrice = this.salary * 0.05;
        } else if ((2021 - this.hireYear) > 9 && (2021 - this.hireYear) < 20) {
            raiseSalaryPrice = this.salary * 0.1;
        } else if ((2021 - this.salary) > 19) {
            raiseSalaryPrice = this.salary * 0.15;
        }
        return raiseSalaryPrice;
    }

    @Override
    public String toString() {

        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş : " + (this.salary + raiseSalary()));

        return super.toString();
    }
}
