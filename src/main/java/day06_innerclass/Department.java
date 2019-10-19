package day06_innerclass;

public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }
    
    class Job {
        private String name = "工作";
        public String getName() {
            String name = "寫程式";
            return String.format("%s 部門的 %s 是 %s", Department.this.name, this.name, name);
        }
        
        public String getLanguage() {
            return "Java";
        }
    }
    
}
