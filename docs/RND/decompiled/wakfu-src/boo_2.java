/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from bOo
 */
public class boo_2 {
    private final int kKv;
    private final int kKw;
    private final String kKx;

    @Generated
    public boo_2(int n, int n2, String string) {
        this.kKv = n;
        this.kKw = n2;
        this.kKx = string;
    }

    @Generated
    public int d() {
        return this.kKv;
    }

    @Generated
    public int wp() {
        return this.kKw;
    }

    @Generated
    public String cod() {
        return this.kKx;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof boo_2)) {
            return false;
        }
        boo_2 boo_22 = (boo_2)object;
        if (!boo_22.C(this)) {
            return false;
        }
        if (this.d() != boo_22.d()) {
            return false;
        }
        if (this.wp() != boo_22.wp()) {
            return false;
        }
        String string = this.cod();
        String string2 = boo_22.cod();
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof boo_2;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.d();
        n2 = n2 * 59 + this.wp();
        String string = this.cod();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }

    @Generated
    public String toString() {
        return "GuideElement(m_id=" + this.d() + ", m_index=" + this.wp() + ", m_iconName=" + this.cod() + ")";
    }
}

