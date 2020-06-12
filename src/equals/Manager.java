package equals;

public class Manager extends Employee {
        private double bonus;
        /*
        * @param n Name of worker
        * @param s Salary
        * @param year Hire Year
        * @param month Hire Month
        * @param day Hire Day
        * */
    public Manager (String n, double s, int year , int day, int month){
        super(n,s,year,day,month);
        bonus = 0;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary+ bonus;
    }

    public void setBonus (double b){
            bonus = b;
        }
        public boolean equals(Object OtheObject){

        if (!super.equals(OtheObject)) return false;
        Manager other = (Manager) OtheObject;
        //In method super.equals() checking, would obj belong to,
        //available by links this and other , and the same class
            return bonus == other.bonus;
    }
    public  int hashCode(){
        return super.hashCode() + 17 * new Double(bonus).hashCode();
    }
    public String toString(){
        return super.toString()+ "[bonus= " + bonus +"]";
    }
    }

