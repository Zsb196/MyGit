package aaa.entity;

import javax.persistence.Table;

public class studen {
    private Integer sid;
    private String sname;
    private String sex;
    private String address;
    private Integer cid;


    @Override
    public String toString() {
        return "studen{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", cid=" + cid +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public studen(Integer sid, String sname, String sex, String address, Integer cid) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.address = address;
        this.cid = cid;
    }

    public studen(){

    }
}
