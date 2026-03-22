/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from eMm
 */
class emm_0 {
    private final emn_0 qMy;
    private final int qMz;

    public String clY() {
        if (this.qMy == emn_0.qMA) {
            return "effect.description.merged.mastery";
        }
        if (this.qMy == emn_0.qMB) {
            return "effect.description.merged.resistance";
        }
        return "";
    }

    @Generated
    public emm_0(emn_0 emn_02, int n) {
        this.qMy = emn_02;
        this.qMz = n;
    }

    @Generated
    public emn_0 fAj() {
        return this.qMy;
    }

    @Generated
    public int cWC() {
        return this.qMz;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof emm_0)) {
            return false;
        }
        emm_0 emm_02 = (emm_0)object;
        if (!emm_02.C(this)) {
            return false;
        }
        if (this.cWC() != emm_02.cWC()) {
            return false;
        }
        emn_0 emn_02 = this.fAj();
        emn_0 emn_03 = emm_02.fAj();
        return !(emn_02 == null ? emn_03 != null : !((Object)((Object)emn_02)).equals((Object)emn_03));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof emm_0;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.cWC();
        emn_0 emn_02 = this.fAj();
        n2 = n2 * 59 + (emn_02 == null ? 43 : ((Object)((Object)emn_02)).hashCode());
        return n2;
    }
}

