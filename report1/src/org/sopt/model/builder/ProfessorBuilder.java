package org.sopt.model.builder;

import org.sopt.model.Professor;

public class ProfessorBuilder {
    private int profId;             //교수 고유번호
    private String profName;        //교수 이름
    private String profDept;      //교수 학과
    private String profPhone;       //교수 전화번호
    private String profClass;       //교수 담당과목

    public ProfessorBuilder setProfId(int profId) {
        this.profId = profId;
        return this;
    }

    public ProfessorBuilder setProfName(String profName) {
        this.profName = profName;
        return this;
    }

    public ProfessorBuilder setProfDept(String profDept) {
        this.profDept = profDept;
        return this;
    }

    public ProfessorBuilder setProfPhone(String profPhone) {
        this.profPhone = profPhone;
        return this;
    }

    public ProfessorBuilder setProfClass(String profClass) {
        this.profClass = profClass;
        return this;
    }

    public Professor build(){
        return new Professor(this.profId, this.profName, this.profDept
                , this.profPhone, this.profClass);
    }
}
