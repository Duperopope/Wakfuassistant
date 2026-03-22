/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.util.List;
import lombok.Generated;

/*
 * Renamed from fdQ
 */
public class fdq_0 {
    private final int rYd;
    private final int rYe;
    private final int rYf;
    private final List<fdo_0> rYg;
    private final List<fdo_0> rYh;
    private final short rYi;

    @Generated
    public static fdr_0 fUg() {
        return new fdr_0();
    }

    @Generated
    public fdq_0(int n, int n2, int n3, List<fdo_0> list, List<fdo_0> list2, short s) {
        this.rYd = n;
        this.rYe = n2;
        this.rYf = n3;
        this.rYg = list;
        this.rYh = list2;
        this.rYi = s;
    }

    @Generated
    public int d() {
        return this.rYd;
    }

    @Generated
    public int cxR() {
        return this.rYe;
    }

    @Generated
    public int cxS() {
        return this.rYf;
    }

    @Generated
    public List<fdo_0> fUh() {
        return this.rYg;
    }

    @Generated
    public List<fdo_0> fUi() {
        return this.rYh;
    }

    @Generated
    public short cxT() {
        return this.rYi;
    }

    @Generated
    public String toString() {
        return "SteleRewardTier(m_id=" + this.d() + ", m_requiredDifficulty=" + this.cxR() + ", m_freeRewardsCount=" + this.cxS() + ", m_staticRewards=" + String.valueOf(this.fUh()) + ", m_dynamicRewards=" + String.valueOf(this.fUi()) + ", m_dynamicRewardsCount=" + this.cxT() + ")";
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fdq_0)) {
            return false;
        }
        fdq_0 fdq_02 = (fdq_0)object;
        if (!fdq_02.C(this)) {
            return false;
        }
        if (this.d() != fdq_02.d()) {
            return false;
        }
        if (this.cxR() != fdq_02.cxR()) {
            return false;
        }
        if (this.cxS() != fdq_02.cxS()) {
            return false;
        }
        if (this.cxT() != fdq_02.cxT()) {
            return false;
        }
        List<fdo_0> list = this.fUh();
        List<fdo_0> list2 = fdq_02.fUh();
        if (list == null ? list2 != null : !((Object)list).equals(list2)) {
            return false;
        }
        List<fdo_0> list3 = this.fUi();
        List<fdo_0> list4 = fdq_02.fUi();
        return !(list3 == null ? list4 != null : !((Object)list3).equals(list4));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof fdq_0;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.d();
        n2 = n2 * 59 + this.cxR();
        n2 = n2 * 59 + this.cxS();
        n2 = n2 * 59 + this.cxT();
        List<fdo_0> list = this.fUh();
        n2 = n2 * 59 + (list == null ? 43 : ((Object)list).hashCode());
        List<fdo_0> list2 = this.fUi();
        n2 = n2 * 59 + (list2 == null ? 43 : ((Object)list2).hashCode());
        return n2;
    }
}

