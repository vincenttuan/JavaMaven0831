package day06_innerclass;

public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }
    
    class Job {
        public String getName() {
            return name + "部門, 工作是寫程式";
        }
        
        public String getLanguage() {
            return "Java";
        }
    }
    
}
