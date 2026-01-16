/*
Question:
Create a program to find bonus of 10 employees based on years of service.

Hint =>
>5 years → 5% bonus
<=5 years → 2% bonus
Use 2D array to store salary and service years
*/

class EmployeeBonus {

    public static double[][] generateEmployeeData() {
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000;
            data[i][1] = (int) (Math.random() * 10) + 1;
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[10][3];

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = salary + bonus;
        }
        return result;
    }

    public static void main(String[] args) {

        double[][] data = generateEmployeeData();
        double[][] result = calculateBonus(data);

        System.out.println("OldSalary\tBonus\tNewSalary");
        for (double[] r : result) {
            System.out.println(r[0] + "\t" + r[1] + "\t" + r[2]);
        }
    }
}
