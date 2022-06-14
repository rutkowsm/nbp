package com.nbp.nbp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class CurrencyRate {
    @Id
    private String no;
    private Date effectiveDate;
    private double mid;

    public CurrencyRate() {
    }

    public CurrencyRate(String no, Date effectiveDate, double mid) {
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.mid = mid;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public double getMid() {
        return mid;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "CurrencyRate{" +
                "no='" + no + '\'' +
                ", effectiveDate=" + effectiveDate +
                ", mid=" + mid +
                '}';
    }
}
