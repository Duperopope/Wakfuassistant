/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class bwr
implements aeh_2 {
    public static final String jya = "name";
    public static final String jyb = "characterLevel";
    public static final String jyc = "characterBreedIcon";
    public static final String jyd = "naturalState";
    public static final String jye = "isCompanion";
    public static final String jyf = "canEditBuild";
    public static final String jyg = "cantEditMessage";
    public static final String jyh = "buildSheetSetView";
    public static final String jyi = "hasUnsavedChanges";
    public static final String jyj = "isCurrentBuildNew";
    public static final String jyk = "equipments";
    public static final String jyl = "spells";
    public static final String jym = "aptitudes";
    public static final String jyn = "hideBuilds";
    public static final String jyo = "isReduced";
    private static final String[] jyp = new String[]{"name", "characterLevel", "characterBreedIcon", "naturalState", "isCompanion", "canEditBuild", "cantEditMessage", "buildSheetSetView", "hasUnsavedChanges", "isCurrentBuildNew", "equipments", "spells", "hideBuilds", "isReduced"};
    private bwi jxy;
    private bfE jyq;
    private bwn jyr;
    private bwp jys;
    private beq_2 jyt;
    private boolean jyu = false;

    private void u(String ... stringArray) {
        fse_1.gFu().a((aef_2)this, stringArray);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "name": {
                return this.jxy.getName();
            }
            case "characterLevel": {
                return aum_0.cWf().c("levelShort.custom", this.jxy.cmL());
            }
            case "naturalState": {
                return this.jxy.dmc() ? this.jxy.dLD().djG() : null;
            }
            case "isCompanion": {
                return this.jxy.aXd();
            }
            case "characterBreedIcon": {
                bgt_0 bgt_02 = this.jxy.dLD();
                return bgt_02 == null ? null : bgt_02.dkD().dgc();
            }
            case "canEditBuild": {
                return !this.dLX();
            }
            case "cantEditMessage": {
                if (eIp.pF(this.jxy.Xi())) {
                    return aum_0.cWf().c("build.cannot.edit.during.occupation", new Object[0]);
                }
                if (this.dLY()) {
                    return aum_0.cWf().c("build.cannot.edit.in.fight", new Object[0]);
                }
                if (!this.jxy.aXd()) {
                    return aum_0.cWf().c("build.cannot.edit.during.dungeon", new Object[0]);
                }
                return aum_0.cWf().c("build.companions.cant.update.spells", new Object[0]);
            }
            case "buildSheetSetView": {
                return this.jyq;
            }
            case "hasUnsavedChanges": {
                return cvu_2.eTO().dLQ();
            }
            case "isCurrentBuildNew": {
                return cvu_2.eTO().eUk();
            }
            case "equipments": {
                return this.jyr;
            }
            case "spells": {
                return this.jys;
            }
            case "aptitudes": {
                return this.jyt;
            }
            case "hideBuilds": {
                return this.jxy.aXd() || fse_1.gFu().dp("hideDownscaling");
            }
            case "isReduced": {
                return this.jyu;
            }
        }
        return null;
    }

    public void a(bwi bwi2) {
        this.jxy = bwi2;
        this.u(jya, jyb, jyc, jyd, jye, jyn);
        if (this.jxy.dmc()) {
            this.dLS();
        }
        this.dLZ();
        this.dMc();
        if (this.jxy.dmc()) {
            this.dMd();
        }
    }

    private void dLS() {
        this.jyq = new bfE(this.jxy.dLD());
        this.jyq.fA(true);
        this.u(jyh);
    }

    public void dLT() {
        this.FT(this.jyq.dgQ());
    }

    public void FT(int n) {
        this.jyq.BZ(n);
        this.dLU();
    }

    public void FU(int n) {
        this.jyq.u(n);
        this.dLU();
    }

    private void dLU() {
        this.jyq.aPg();
        this.dMa();
        this.hk(true);
        this.dMe();
        fse_1.gFu().a((aef_2)this.jyq, this.jyq.bxk());
        this.u(jyf, jyg);
    }

    public int dLV() {
        return this.jyq.dgQ();
    }

    public bfF dLW() {
        return this.jyq.Cd(this.dLV());
    }

    public boolean dLX() {
        return this.jxy == null || this.jxy.bbj() || this.jyq.dgR() || this.dLY() || eIp.pF(this.jxy.Xi());
    }

    private boolean dLY() {
        @Nullable ety_0 ety_02 = fcI.so(this.jxy.Xi()).dlK();
        return ety_02 != null && ety_02.dGp() != etw_0.rqT && ety_02.dGp() != etw_0.rqW;
    }

    private void dLZ() {
        this.jyr = this.jxy.dmc() ? new bwn(this.jxy, this.jyq.dgY(), this.jyr) : new bwn(this.jxy, new bgu_1(this.jxy.dLE()), this.jyr);
        this.u(jyk);
    }

    public void dMa() {
        this.jyr.a(this.jyq.dgY());
    }

    public void dMb() {
        for (bgp_1 bgp_12 : this.jyq.dgY().dTS().values()) {
            fse_1.gFu().a((aef_2)bgp_12, "additionalBorder");
        }
    }

    private void dMc() {
        if (this.jxy.dmc()) {
            this.jys = new bwp(this.jxy.dLD(), this.jyq.dgZ());
        } else {
            bMU bMU2 = new bMU();
            bMU2.k((bhx_0)this.jxy.dcP());
            this.jys = new bwp(bMU2);
        }
        this.u(jyl);
    }

    public void hk(boolean bl) {
        this.jys.a(this.jyq.dgZ());
        this.u(jyl);
        fse_1.gFu().a((aef_2)this.jys, "currentSpellDeck");
        if (bl) {
            bMV.a(this.jxy.dLD().dnM(), this.jxy.dLD().dkB(), this.jxy.dLD().dlG());
        }
    }

    private void dMd() {
        this.jyt = new beq_2(this.jyq.dha());
        this.u(jym);
    }

    private void dMe() {
        this.jyt.a(this.jyq.dha());
        this.u(jym);
    }

    public void dMf() {
        this.jyu = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.lkB);
        this.u(jyo);
    }

    public void dMg() {
        this.jyu = !this.jyu;
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lkB, this.jyu);
        this.u(jyo);
    }

    @Override
    public String[] bxk() {
        return jyp;
    }

    @Generated
    public bfE dMh() {
        return this.jyq;
    }

    @Generated
    public bwn dMi() {
        return this.jyr;
    }

    @Generated
    public bwp dMj() {
        return this.jys;
    }

    @Generated
    public beq_2 dMk() {
        return this.jyt;
    }
}

