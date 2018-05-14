package model;
// Generated 21.02.2018 13:40:03 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * PnzData generated by hbm2java
 */
public class PnzData  implements java.io.Serializable {


     private Integer pnzDataId;
     private Pnz pnz;
     private Date pnzDateTime;
     private Double bsh;
     private Double ds;
     private Double sr;
     private Double ou;
     private Double do_;
     private Double oa;
     private Double ozon;
     private Double serovodorod;
     private Double fenol;
     private Double fv;
     private Double hlor;
     private Double hv;
     private Double ammiak;
     private Double skIs;
     private Double formaldigid;
     private Double nsm;
     private Double hromSh;
     private Double sumU;

    /**
     *
     */
    public PnzData() {
    }
    
    /**
     *
     * @param bsh
     * @param ds
     * @param sr
     * @param ou
     * @param do_
     * @param oa
     * @param ozon
     * @param serovodorod
     * @param fenol
     * @param fv
     * @param hlor
     * @param hv
     * @param ammiak
     * @param skIs
     * @param formaldigid
     * @param nsm
     * @param hromSh
     * @param sumU
     */
    public PnzData(Double bsh, Double ds, Double sr, Double ou, Double do_, Double oa, Double ozon, Double serovodorod, Double fenol, Double fv, Double hlor, Double hv, Double ammiak, Double skIs, Double formaldigid, Double nsm, Double hromSh, Double sumU) {
       this.bsh = bsh;
       this.ds = ds;
       this.sr = sr;
       this.ou = ou;
       this.do_ = do_;
       this.oa = oa;
       this.ozon = ozon;
       this.serovodorod = serovodorod;
       this.fenol = fenol;
       this.fv = fv;
       this.hlor = hlor;
       this.hv = hv;
       this.ammiak = ammiak;
       this.skIs = skIs;
       this.formaldigid = formaldigid;
       this.nsm = nsm;
       this.hromSh = hromSh;
       this.sumU = sumU;
    }

    /**
     *
     * @param pnzDataId
     * @param pnz
     * @param pnzDateTime
     * @param bsh
     * @param ds
     * @param sr
     * @param ou
     * @param do_
     * @param oa
     * @param ozon
     * @param serovodorod
     * @param fenol
     * @param fv
     * @param hlor
     * @param hv
     * @param ammiak
     * @param skIs
     * @param formaldigid
     * @param nsm
     * @param hromSh
     * @param sumU
     */
    public PnzData(int pnzDataId, Pnz pnz, Date pnzDateTime, Double bsh, Double ds, Double sr, Double ou, Double do_, Double oa, Double ozon, Double serovodorod, Double fenol, Double fv, Double hlor, Double hv, Double ammiak, Double skIs, Double formaldigid, Double nsm, Double hromSh, Double sumU) {
       this.pnzDataId = pnzDataId;
       this.pnz = pnz;
       this.pnzDateTime = pnzDateTime;
       this.bsh = bsh;
       this.ds = ds;
       this.sr = sr;
       this.ou = ou;
       this.do_ = do_;
       this.oa = oa;
       this.ozon = ozon;
       this.serovodorod = serovodorod;
       this.fenol = fenol;
       this.fv = fv;
       this.hlor = hlor;
       this.hv = hv;
       this.ammiak = ammiak;
       this.skIs = skIs;
       this.formaldigid = formaldigid;
       this.nsm = nsm;
       this.hromSh = hromSh;
       this.sumU = sumU;
    }
   
    /**
     *
     * @param pnz
     * @param pnzDateTime
     * @param bsh
     * @param ds
     * @param sr
     * @param ou
     * @param do_
     * @param oa
     * @param ozon
     * @param serovodorod
     * @param fenol
     * @param fv
     * @param hlor
     * @param hv
     * @param ammiak
     * @param skIs
     * @param formaldigid
     * @param nsm
     * @param hromSh
     * @param sumU
     */
    public PnzData(Pnz pnz, Date pnzDateTime, Double bsh, Double ds, Double sr, Double ou, Double do_, Double oa, Double ozon, Double serovodorod, Double fenol, Double fv, Double hlor, Double hv, Double ammiak, Double skIs, Double formaldigid, Double nsm, Double hromSh, Double sumU) {
       this.pnz = pnz;
       this.pnzDateTime = pnzDateTime;
       this.bsh = bsh;
       this.ds = ds;
       this.sr = sr;
       this.ou = ou;
       this.do_ = do_;
       this.oa = oa;
       this.ozon = ozon;
       this.serovodorod = serovodorod;
       this.fenol = fenol;
       this.fv = fv;
       this.hlor = hlor;
       this.hv = hv;
       this.ammiak = ammiak;
       this.skIs = skIs;
       this.formaldigid = formaldigid;
       this.nsm = nsm;
       this.hromSh = hromSh;
       this.sumU = sumU;
    }
    
    /**
     *
     * @return
     */
    public Integer getPnzDataId() {
        return this.pnzDataId;
    }
    
    /**
     *
     * @param pnzDataId
     */
    public void setPnzDataId(Integer pnzDataId) {
        this.pnzDataId = pnzDataId;
    }

    /**
     *
     * @return
     */
    public Pnz getPnz() {
        return this.pnz;
    }
    
    /**
     *
     * @param pnz
     */
    public void setPnz(Pnz pnz) {
        this.pnz = pnz;
    }

    /**
     *
     * @return
     */
    public Date getPnzDateTime() {
        return this.pnzDateTime;
    }
    
    /**
     *
     * @param pnzDateTime
     */
    public void setPnzDateTime(Date pnzDateTime) {
        this.pnzDateTime = pnzDateTime;
    }

    /**
     *
     * @return
     */
    public Double getBsh() {
        return this.bsh;
    }
    
    /**
     *
     * @param bsh
     */
    public void setBsh(Double bsh) {
        this.bsh = bsh;
    }

    /**
     *
     * @return
     */
    public Double getDs() {
        return this.ds;
    }
    
    /**
     *
     * @param ds
     */
    public void setDs(Double ds) {
        this.ds = ds;
    }

    /**
     *
     * @return
     */
    public Double getSr() {
        return this.sr;
    }
    
    /**
     *
     * @param sr
     */
    public void setSr(Double sr) {
        this.sr = sr;
    }

    /**
     *
     * @return
     */
    public Double getOu() {
        return this.ou;
    }
    
    /**
     *
     * @param ou
     */
    public void setOu(Double ou) {
        this.ou = ou;
    }

    /**
     *
     * @return
     */
    public Double getDo_() {
        return this.do_;
    }
    
    /**
     *
     * @param do_
     */
    public void setDo_(Double do_) {
        this.do_ = do_;
    }

    /**
     *
     * @return
     */
    public Double getOa() {
        return this.oa;
    }
    
    /**
     *
     * @param oa
     */
    public void setOa(Double oa) {
        this.oa = oa;
    }

    /**
     *
     * @return
     */
    public Double getOzon() {
        return this.ozon;
    }
    
    /**
     *
     * @param ozon
     */
    public void setOzon(Double ozon) {
        this.ozon = ozon;
    }

    /**
     *
     * @return
     */
    public Double getSerovodorod() {
        return this.serovodorod;
    }
    
    /**
     *
     * @param serovodorod
     */
    public void setSerovodorod(Double serovodorod) {
        this.serovodorod = serovodorod;
    }

    /**
     *
     * @return
     */
    public Double getFenol() {
        return this.fenol;
    }
    
    /**
     *
     * @param fenol
     */
    public void setFenol(Double fenol) {
        this.fenol = fenol;
    }

    /**
     *
     * @return
     */
    public Double getFv() {
        return this.fv;
    }
    
    /**
     *
     * @param fv
     */
    public void setFv(Double fv) {
        this.fv = fv;
    }

    /**
     *
     * @return
     */
    public Double getHlor() {
        return this.hlor;
    }
    
    /**
     *
     * @param hlor
     */
    public void setHlor(Double hlor) {
        this.hlor = hlor;
    }

    /**
     *
     * @return
     */
    public Double getHv() {
        return this.hv;
    }
    
    /**
     *
     * @param hv
     */
    public void setHv(Double hv) {
        this.hv = hv;
    }

    /**
     *
     * @return
     */
    public Double getAmmiak() {
        return this.ammiak;
    }
    
    /**
     *
     * @param ammiak
     */
    public void setAmmiak(Double ammiak) {
        this.ammiak = ammiak;
    }

    /**
     *
     * @return
     */
    public Double getSkIs() {
        return this.skIs;
    }
    
    /**
     *
     * @param skIs
     */
    public void setSkIs(Double skIs) {
        this.skIs = skIs;
    }

    /**
     *
     * @return
     */
    public Double getFormaldigid() {
        return this.formaldigid;
    }
    
    /**
     *
     * @param formaldigid
     */
    public void setFormaldigid(Double formaldigid) {
        this.formaldigid = formaldigid;
    }

    /**
     *
     * @return
     */
    public Double getNsm() {
        return this.nsm;
    }
    
    /**
     *
     * @param nsm
     */
    public void setNsm(Double nsm) {
        this.nsm = nsm;
    }

    /**
     *
     * @return
     */
    public Double getHromSh() {
        return this.hromSh;
    }
    
    /**
     *
     * @param hromSh
     */
    public void setHromSh(Double hromSh) {
        this.hromSh = hromSh;
    }

    /**
     *
     * @return
     */
    public Double getSumU() {
        return this.sumU;
    }
    
    /**
     *
     * @param sumU
     */
    public void setSumU(Double sumU) {
        this.sumU = sumU;
    }




}


