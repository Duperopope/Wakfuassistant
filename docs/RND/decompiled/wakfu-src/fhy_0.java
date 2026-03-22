/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fhY
 */
public class fhy_0 {
    public static final ffS[] src = new ffS[0];
    @NotNull
    private static fgr srd = fgr.sjA;
    private boolean sre = true;
    private final short srf;
    private fhy_0 srg;
    private final short srh;
    private final azl_2<fhy_0> sri = new azl_2();
    private ffS[] srj;
    private ffS[] srk = null;
    private boolean srl = false;
    private boolean srm = false;
    private boolean emE = false;
    private short emF = (short)-1;

    public static void a(@NotNull fgr fgr2) {
        srd = fgr2;
    }

    public fhy_0(short s, short s2, ffS[] ffSArray) {
        this.srf = s;
        this.srh = s2;
        this.srj = ffSArray;
        if (s == 611) {
            this.srj = (ffS[])ArrayUtils.add((Object[])this.srj, (Object)ffS.sgZ);
        }
    }

    public short aIi() {
        return this.srf;
    }

    public short cpX() {
        return this.srh;
    }

    public fhy_0 fZm() {
        return this.srg;
    }

    public fhy_0 fZn() {
        return this.cpX() == 0 ? this : this.fZm().fZn();
    }

    public void n(fhy_0 fhy_02) {
        this.srg = fhy_02;
    }

    protected boolean fZo() {
        return this.sri.aVo() != 0;
    }

    public azl_2<fhy_0> fZp() {
        return this.sri;
    }

    public void o(fhy_0 fhy_02) {
        this.sri.M(fhy_02);
    }

    public boolean p(fhy_0 fhy_02) {
        if (this == fhy_02) {
            return true;
        }
        for (fhy_0 fhy_03 = this.srg; fhy_03 != null; fhy_03 = fhy_03.fZm()) {
            if (fhy_03 != fhy_02) continue;
            return true;
        }
        return false;
    }

    @NotNull
    public ffS[] fZq() {
        if (!this.fZr() && this.fZm() != null) {
            return this.fZm().fZq();
        }
        return this.srj != null ? this.srj : src;
    }

    public boolean fZr() {
        return this.srj != null && this.srj.length > 0;
    }

    public void c(ffS[] ffSArray) {
        this.srj = ffSArray;
        if (this.srf == 611) {
            this.srj = (ffS[])ArrayUtils.add((Object[])this.srj, (Object)ffS.sgZ);
        }
    }

    public boolean v(ffS ffS2) {
        ffS[] ffSArray = this.fZq();
        for (int i = ffSArray.length - 1; i >= 0; --i) {
            if (ffSArray[i] != ffS2) continue;
            return true;
        }
        return false;
    }

    public ffS[] fZs() {
        return this.srk != null ? this.srk : src;
    }

    public void d(ffS[] ffSArray) {
        this.srk = ffSArray;
    }

    public boolean cpZ() {
        return this.srl;
    }

    public boolean cnk() {
        return this.cpZ();
    }

    public void nq(boolean bl) {
        this.srl = bl;
    }

    public boolean q(fhy_0 fhy_02) {
        return fhy_02.aIi() == this.srf || this.srg != null && this.srg.q(fhy_02);
    }

    public boolean cpY() {
        fhy_0 fhy_02 = this;
        while (!fhy_02.fZr()) {
            if ((fhy_02 = fhy_02.fZm()) != null) continue;
            return false;
        }
        return fhy_02.srm;
    }

    public void nr(boolean bl) {
        this.srm = bl;
    }

    public boolean fZt() {
        return this.sre;
    }

    public void ns(boolean bl) {
        this.sre = bl;
    }

    public boolean cqc() {
        return this.emE;
    }

    public void nt(boolean bl) {
        this.emE = bl;
    }

    public short cqd() {
        return this.emF;
    }

    public void fe(short s) {
        this.emF = s;
    }

    public String getName() {
        return this.gP(false);
    }

    public String gP(boolean bl) {
        return srd.getName(this.srf, bl);
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{" + this.srf + "=" + this.getName() + "}";
    }
}

