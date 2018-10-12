package org.sopt.model;

public class Student extends Department {
    private int stuId; //학번
    private String stuName; //이름
    private String stuGrade; // 학년
    private String stuDepart; // 학과
    private String stuEmail; //이메일
    private String stuAdr; //주소
    private String stuAge; //나이
    private String stuState; //현재 상태(휴학, 재학, 군휴학, 취업계)

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuGrade='" + stuGrade + '\'' +
                ", stuDepart='" + stuDepart + '\'' +
                ", stuEmail='" + stuEmail + '\'' +
                ", stuAdr='" + stuAdr + '\'' +
                ", stuAge='" + stuAge + '\'' +
                ", stuState='" + stuState + '\'' +
                '}';
    }

    public Student(){
        this.stuId = 123;
        this.stuName = "하나";
        this.stuGrade = "1학년";
        this.stuDepart = "미디어";
        this.stuEmail = "123@naver.com";
        this.stuAdr = "서울시 중구";
        this.stuAge = "20";
        this.stuState = "재학";
    }

    public Student(int stuId, String stuName, String stuGrade, String stuDepart, String stuEmail,
                   String stuAdr, String stuAge, String stuState) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuGrade = stuGrade;
        this.stuDepart = stuDepart;
        this.stuEmail = stuEmail;
        this.stuAdr = stuAdr;
        this.stuAge = stuAge;
        this.stuState = stuState;
    }

    public Student(int deptId, String deptName, String deptCallNum, String deptType, int stuId, String stuName, String stuGrade, String stuDepart, String stuEmail, String stuAdr, String stuAge, String stuState) {
        super(deptId, deptName, deptCallNum, deptType);
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuGrade = stuGrade;
        this.stuDepart = stuDepart;
        this.stuEmail = stuEmail;
        this.stuAdr = stuAdr;
        this.stuAge = stuAge;
        this.stuState = stuState;
    }

    public Student(int uniId, String uniName, String uniCallNum, String uniAdr, int deptId, String deptName, String deptCallNum, String deptType, int stuId, String stuName, String stuGrade, String stuDepart, String stuEmail, String stuAdr, String stuAge, String stuState) {
        super(uniId, uniName, uniCallNum, uniAdr, deptId, deptName, deptCallNum, deptType);
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuGrade = stuGrade;
        this.stuDepart = stuDepart;
        this.stuEmail = stuEmail;
        this.stuAdr = stuAdr;
        this.stuAge = stuAge;
        this.stuState = stuState;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(String stuGrade) {
        this.stuGrade = stuGrade;
    }

    public String getStuDepart() {
        return stuDepart;
    }

    public void setStuDepart(String stuDepart) {
        this.stuDepart = stuDepart;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail;
    }

    public String getStuAdr() {
        return stuAdr;
    }

    public void setStuAdr(String stuAdr) {
        this.stuAdr = stuAdr;
    }

    public String getStuAge() {
        return stuAge;
    }

    public void setStuAge(String stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuState() {
        return stuState;
    }

    public void setStuState(String stuState) {
        this.stuState = stuState;
    }
}
