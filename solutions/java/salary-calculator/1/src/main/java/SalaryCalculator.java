public class SalaryCalculator {
    double base = 1000.0;
    double maxSalary = 2000.0;
    
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1.0; 
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        int multiplier = bonusMultiplier(productsSold);
        return multiplier == 13 ? multiplier*productsSold : multiplier*productsSold; 
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = base * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return salary > maxSalary ? maxSalary : salary;
    } 
}
