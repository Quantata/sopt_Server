package org.sopt.model;

public class Department extends University {
    private int deptId;                 //학과 번호
    private String deptName;            //학과 이름
    private String deptCallNum;         //학과 전화번호
    private String deptType;            //학과 타입(공대, 자연대, ...)

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptCallNum='" + deptCallNum + '\'' +
                ", deptType='" + deptType + '\'' +
                '}';
    }

    public Department(){
        deptId = 0001;
        deptName = "컴퓨터학과";
        deptCallNum = "02-1234-5678";
        deptType = "공대";
    }

    public Department(int deptId, String deptName, String deptCallNum, String deptType) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptCallNum = deptCallNum;
        this.deptType = deptType;
    }

    public Department(int uniId, String uniName, String uniCallNum, String uniAdr, int deptId, String deptName, String deptCallNum, String deptType) {
        super(uniId, uniName, uniCallNum, uniAdr);
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptCallNum = deptCallNum;
        this.deptType = deptType;
    }


    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptCallNum() {
        return deptCallNum;
    }

    public void setDeptCallNum(String deptCallNum) {
        this.deptCallNum = deptCallNum;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }
}
