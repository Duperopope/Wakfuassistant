/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.util.List;
import lombok.Generated;

/*
 * Renamed from bOn
 */
public class bon_2 {
    private final int kKr;
    private final int kKs;
    private final int kKt;
    private final List<bom_2> kKu;

    @Generated
    public bon_2(int n, int n2, int n3, List<bom_2> list) {
        this.kKr = n;
        this.kKs = n2;
        this.kKt = n3;
        this.kKu = list;
    }

    @Generated
    public int d() {
        return this.kKr;
    }

    @Generated
    public int wp() {
        return this.kKs;
    }

    @Generated
    public int bnd() {
        return this.kKt;
    }

    @Generated
    public List<bom_2> egM() {
        return this.kKu;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bon_2)) {
            return false;
        }
        bon_2 bon_22 = (bon_2)object;
        if (!bon_22.C(this)) {
            return false;
        }
        if (this.d() != bon_22.d()) {
            return false;
        }
        if (this.wp() != bon_22.wp()) {
            return false;
        }
        if (this.bnd() != bon_22.bnd()) {
            return false;
        }
        List<bom_2> list = this.egM();
        List<bom_2> list2 = bon_22.egM();
        return !(list == null ? list2 != null : !((Object)list).equals(list2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bon_2;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.d();
        n2 = n2 * 59 + this.wp();
        n2 = n2 * 59 + this.bnd();
        List<bom_2> list = this.egM();
        n2 = n2 * 59 + (list == null ? 43 : ((Object)list).hashCode());
        return n2;
    }

    @Generated
    public String toString() {
        return "GuideCategory(m_id=" + this.d() + ", m_index=" + this.wp() + ", m_iconId=" + this.bnd() + ", m_guides=" + String.valueOf(this.egM()) + ")";
    }
}

