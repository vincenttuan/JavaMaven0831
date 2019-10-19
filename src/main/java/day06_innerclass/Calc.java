package day06_innerclass;

public class Calc {
    
    public double getBMI(double h, double w) {
        
        class BMI {
            private double bmi;
            public BMI() {
                this.bmi = w / Math.pow(h/100, 2); // 可以直接取方法區域變數來用
            }
            public double getBmi() {
                return bmi;
            }
        }
        
        BMI bmi = new BMI();
        return bmi.getBmi();
    }
    
    public static void main(String[] args) {
        
        Calc calc = new Calc();
        System.out.printf("bmi: %.2f\n", calc.getBMI(170, 60));
        
    }
    
    
}
