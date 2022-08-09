package uz.mxz.tnvet.tnved2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tnved")
public class Tnved implements Serializable {

    @Id
    private String id;

    @Column(name = "name", length = 2000)
    private String name;

    @Column(name = "unit1")
    private String unit1;

    @Column(name = "unit2")
    private String unit2;

    @Column(name = "license")
    private String license;

    @Column(name = "isdeleted")
    private String isDeleted;

    @Column(name = "startdate")
    private String startDate;

    @Column(name = "finishdate")
    private String finishDate;

    public Tnved() {
    }

    public Tnved(String id, String name, String unit1, String unit2, String license, String isDelete, String startDate, String finishDate) {
        this.id = id;
        this.name = name;
        this.unit1 = unit1;
        this.unit2 = unit2;
        this.license = license;
        this.isDeleted = isDeleted;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit1() {
        return unit1;
    }

    public void setUnit1(String unit1) {
        this.unit1 = unit1;
    }

    public String getUnit2() {
        return unit2;
    }

    public void setUnit2(String unit2) {
        this.unit2 = unit2;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }
}