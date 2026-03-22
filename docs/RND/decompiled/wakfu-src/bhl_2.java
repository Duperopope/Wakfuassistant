/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from bHL
 */
public class bhl_2
extends bhi_1 {
    private final String kcF;
    private final String kcG;
    private final int kcH;

    public bhl_2(String string, bhl_1 bhl_12) {
        this(string, -1, bhl_12);
    }

    public bhl_2(String string, int n, bhl_1 bhl_12) {
        super(bhl_12::dVc);
        this.kcF = string;
        this.kcG = BH.aT(string).strip();
        this.kcH = n;
    }

    @Override
    public bhh_1 dWS() {
        return bhh_1.kcp;
    }

    @Override
    public void b(fiu_0 fiu_02) {
        if (this.kcG.isBlank()) {
            fiu_02.sN(null).ny(false).E(null);
        } else {
            fiu_02.sN(this.kcG).E(cwl_1.eVJ());
            if (bid_1.b(bsn_1.lkL)) {
                fiu_02.ny(this.kcH != -1).We(-1);
            } else {
                fiu_02.ny(false).We(this.kcH);
            }
        }
    }

    @Override
    public void c(fiu_0 fiu_02) {
        fiu_02.We(-1).sN(null).ny(false).E(null);
    }

    @Override
    public boolean isValid() {
        return !this.kcG.isBlank();
    }

    @Override
    public String dDG() {
        if (this.kcH != -1) {
            return "\"" + bgv_2.Dm(this.kcH) + "\"";
        }
        return "\"" + this.kcG + "\"";
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bhl_2)) {
            return false;
        }
        bhl_2 bhl_22 = (bhl_2)object;
        if (!bhl_22.C(this)) {
            return false;
        }
        if (this.kcH != bhl_22.kcH) {
            return false;
        }
        String string = this.getName();
        String string2 = bhl_22.getName();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        String string3 = this.kcG;
        String string4 = bhl_22.kcG;
        return !(string3 == null ? string4 != null : !string3.equals(string4));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bhl_2;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.kcH;
        String string = this.getName();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        String string2 = this.kcG;
        n2 = n2 * 59 + (string2 == null ? 43 : string2.hashCode());
        return n2;
    }

    @Generated
    public String getName() {
        return this.kcF;
    }
}

