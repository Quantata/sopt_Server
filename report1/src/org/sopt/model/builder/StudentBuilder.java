package org.sopt.model.builder;

import org.sopt.Main;
import org.sopt.model.Student;

public class StudentBuilder {
    private int stuId; //학번
    private String stuName; //이름
    private String stuGrade; // 학년
    private String stuDepart; // 학과
    private String stuEmail; //이메일
    private String stuAdr; //주소
    private String stuAge; //나이
    private String stuState; //현재 상태(휴학, 재학, 군휴학, 취업계)


    public StudentBuilder setId(final int stuId){
        this.stuId = stuId;
        return this;
    }

    public StudentBuilder setStuName(String stuName) {
        this.stuName = stuName;
        return this;
    }

    public StudentBuilder setStuGrade(String stuGrade) {
        this.stuGrade = stuGrade;
        return this;
    }

    public StudentBuilder setStuDepart(String stuDepart) {
        this.stuDepart = stuDepart;
        return this;
    }

    public StudentBuilder setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail;
        return this;
    }

    public StudentBuilder setStuAdr(String stuAdr) {
        this.stuAdr = stuAdr;
        return this;
    }

    public StudentBuilder setStuAge(String stuAge) {
        this.stuAge = stuAge;
        return this;
    }

    public StudentBuilder setStuState(String stuState) {
        this.stuState = stuState;
        return this;
    }

    public Student build(){
        return new Student(this.stuId, this.stuAdr, this.stuAge,
                this.stuDepart, this.stuEmail, this.stuGrade,
                this.stuName, this.stuState);
    }
}
