/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
import java.util.List;
import javax.annotation.Nullable;
import lombok.Generated;

/*
 * Renamed from bOm
 */
public class bom_2 {
    private final int kKk;
    private final int kKl;
    private final int kKm;
    private final boolean kKn;
    @Nullable
    private final ang_2 kKo;
    @Nullable
    private final ang_2 kKp;
    private final List<boo_2> kKq;

    @Generated
    public bom_2(int n, int n2, int n3, boolean bl, @Nullable ang_2 ang_22, @Nullable ang_2 ang_23, List<boo_2> list) {
        this.kKk = n;
        this.kKl = n2;
        this.kKm = n3;
        this.kKn = bl;
        this.kKo = ang_22;
        this.kKp = ang_23;
        this.kKq = list;
    }

    @Generated
    public int d() {
        return this.kKk;
    }

    @Generated
    public int wp() {
        return this.kKl;
    }

    @Generated
    public int cjd() {
        return this.kKm;
    }

    @Generated
    public boolean cnZ() {
        return this.kKn;
    }

    @Nullable
    @Generated
    public ang_2 egJ() {
        return this.kKo;
    }

    @Nullable
    @Generated
    public ang_2 egK() {
        return this.kKp;
    }

    @Generated
    public List<boo_2> egL() {
        return this.kKq;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bom_2)) {
            return false;
        }
        bom_2 bom_22 = (bom_2)object;
        if (!bom_22.C(this)) {
            return false;
        }
        if (this.d() != bom_22.d()) {
            return false;
        }
        if (this.wp() != bom_22.wp()) {
            return false;
        }
        if (this.cjd() != bom_22.cjd()) {
            return false;
        }
        if (this.cnZ() != bom_22.cnZ()) {
            return false;
        }
        ang_2 ang_22 = this.egJ();
        ang_2 ang_23 = bom_22.egJ();
        if (ang_22 == null ? ang_23 != null : !ang_22.equals(ang_23)) {
            return false;
        }
        ang_2 ang_24 = this.egK();
        ang_2 ang_25 = bom_22.egK();
        if (ang_24 == null ? ang_25 != null : !ang_24.equals(ang_25)) {
            return false;
        }
        List<boo_2> list = this.egL();
        List<boo_2> list2 = bom_22.egL();
        return !(list == null ? list2 != null : !((Object)list).equals(list2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bom_2;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.d();
        n2 = n2 * 59 + this.wp();
        n2 = n2 * 59 + this.cjd();
        n2 = n2 * 59 + (this.cnZ() ? 79 : 97);
        ang_2 ang_22 = this.egJ();
        n2 = n2 * 59 + (ang_22 == null ? 43 : ang_22.hashCode());
        ang_2 ang_23 = this.egK();
        n2 = n2 * 59 + (ang_23 == null ? 43 : ang_23.hashCode());
        List<boo_2> list = this.egL();
        n2 = n2 * 59 + (list == null ? 43 : ((Object)list).hashCode());
        return n2;
    }

    @Generated
    public String toString() {
        return "Guide(m_id=" + this.d() + ", m_index=" + this.wp() + ", m_categoryId=" + this.cjd() + ", m_forcedDisplay=" + this.cnZ() + ", m_popupCriterion=" + String.valueOf(this.egJ()) + ", m_visibleCriterion=" + String.valueOf(this.egK()) + ", m_guideElements=" + String.valueOf(this.egL()) + ")";
    }
}

