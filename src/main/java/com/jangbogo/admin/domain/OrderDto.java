package com.jangbogo.admin.domain;

import org.springframework.stereotype.Repository;

import java.util.Date;

public class OrderDto {
    // iv 선언
    Date ord_tm;                                                                                                        // 주문날짜 ORD_TM
    Integer idx;                                                                                                        // 주문번호  IDX
    String ordr_nm;                                                                                                     // 주문자이름 ORDR_NM
    String prod_nm;                                                                                                     // 주문상품명 CONCAT(PROD_NM, ' 외 ', PLIST_TOT)
    Integer tot_amt;                                                                                                    // 주문총금액 TOT_AMT
    Integer setl_mn_cd;                                                                                                 // 결제수단코드 SETL_MN_CD
    Integer state_cd;                                                                                                   // 주문상태코드 STATE_CD
    Date crt_tm;                                                                                                        // 최초등록일자 CRT_TM
    Integer crt_idx;                                                                                                    // 최초등록자식별번호 CRT_IDX
    Date upt_tm;                                                                                                        // 최종수정일자 UPT_TM
    Integer upt_idx;                                                                                                    // 최종수정자식별번호 UPT_IDX

    // Constructor
    public OrderDto(){}                                                                                                 // 기본생성자

    // Getter & Setter
    public Date getOrd_tm() {
        return ord_tm;
    }

    public void setOrd_tm(Date ord_tm) {
        this.ord_tm = ord_tm;
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getOrdr_nm() {
        return ordr_nm;
    }

    public void setOrdr_nm(String ordr_nm) {
        this.ordr_nm = ordr_nm;
    }

    public String getProd_nm() {
        return prod_nm;
    }

    public void setProd_nm(String prod_nm) {
        this.prod_nm = prod_nm;
    }

    public Integer getTot_amt() {
        return tot_amt;
    }

    public void setTot_amt(Integer tot_amt) {
        this.tot_amt = tot_amt;
    }

    public Integer getSetl_mn_cd() {
        return setl_mn_cd;
    }

    public void setSetl_mn_cd(Integer setl_mn_cd) {
        this.setl_mn_cd = setl_mn_cd;
    }

    public Integer getState_cd() {
        return state_cd;
    }

    public void setState_cd(Integer state_cd) {
        this.state_cd = state_cd;
    }

    public Date getCrt_tm() {
        return crt_tm;
    }

    public void setCrt_tm(Date crt_tm) {
        this.crt_tm = crt_tm;
    }

    public Integer getCrt_idx() {
        return crt_idx;
    }

    public void setCrt_idx(Integer crt_idx) {
        this.crt_idx = crt_idx;
    }

    public Date getUpt_tm() {
        return upt_tm;
    }

    public void setUpt_tm(Date upt_tm) {
        this.upt_tm = upt_tm;
    }

    public Integer getUpt_idx() {
        return upt_idx;
    }

    public void setUpt_idx(Integer upt_idx) {
        this.upt_idx = upt_idx;
    }

    // toString()
    @Override
    public String toString() {
        return "{" +
                "ord_tm=" + ord_tm +
                ", idx=" + idx +
                ", ordr_nm='" + ordr_nm + '\'' +
                ", prod_nm='" + prod_nm + '\'' +
                ", tot_amt=" + tot_amt +
                ", setl_mn_cd=" + setl_mn_cd +
                ", state_cd=" + state_cd +
                ", crt_tm=" + crt_tm +
                ", crt_idx=" + crt_idx +
                ", upt_tm=" + upt_tm +
                ", upt_idx=" + upt_idx +
                '}';
    }
}