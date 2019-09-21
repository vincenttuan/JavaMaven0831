package day04_constructor;

public class Exam {
    private int sno; // 學號
    private int chineseScore; // 國文分數
    private int mathScore; // 數學分數
    private int englishScore; // 英文分數

    public Exam() {
    }
    
    public Exam(int sno, int chineseScore, int mathScore, int englishScore) {
        this.sno = sno;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }
    
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    @Override
    public String toString() {
        return "Exam{" + "sno=" + sno + ", chineseScore=" + chineseScore + ", mathScore=" + mathScore + ", englishScore=" + englishScore + '}';
    }
    
    
    
}
