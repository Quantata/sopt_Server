package org.sopt.model.builder;

import org.sopt.model.Department;

public class DepartmentBuilder {
    private int deptId;                 //학과 번호
    private String deptName;            //학과 이름
    private String deptCallNum;         //학과 전화번호
    private String deptType;            //학과 타입(공대, 자연대, ...)

    public DepartmentBuilder setDeptId(int deptId) {
        this.deptId = deptId;
        return this;
    }

    public DepartmentBuilder setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    public DepartmentBuilder setDeptCallNum(String deptCallNum) {
        this.deptCallNum = deptCallNum;
        return this;
    }

    public DepartmentBuilder setDeptType(String deptType) {
        this.deptType = deptType;
        return this;
    }

    public Department build(){
        return new Department(this.deptId, this.deptName, this.deptCallNum, deptType);
    }
}
