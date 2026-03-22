/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from fLK
 */
public class flk_2
extends fiq_1 {
    private fcv_1 ncb = null;
    private Object aGT = null;
    private int cxt;
    private boolean bWn;

    public flk_2(fhv_1 fhv_12, fcv_1 fcv_12, Object object, int n, boolean bl) {
        this.uBe = fhv_12;
        this.ncb = fcv_12;
        this.aGT = object;
        this.bWn = bl;
        this.cxt = n;
    }

    public flk_2(fhv_1 fhv_12) {
        this.uBe = fhv_12;
    }

    @Override
    public fzq_0 gBy() {
        return fzq_0.tJI;
    }

    @Generated
    public fcv_1 gDZ() {
        return this.ncb;
    }

    @Generated
    public Object getValue() {
        return this.aGT;
    }

    @Generated
    public int wp() {
        return this.cxt;
    }

    @Generated
    public boolean bqr() {
        return this.bWn;
    }

    @Generated
    public void C(fcv_1 fcv_12) {
        this.ncb = fcv_12;
    }

    @Generated
    public void setValue(Object object) {
        this.aGT = object;
    }

    @Generated
    public void tr(int n) {
        this.cxt = n;
    }

    @Generated
    public void setSelected(boolean bl) {
        this.bWn = bl;
    }

    @Override
    @Generated
    public String toString() {
        return "ListSelectionChangedEvent(m_renderableContainer=" + String.valueOf(this.gDZ()) + ", m_value=" + String.valueOf(this.getValue()) + ", m_index=" + this.wp() + ", m_selected=" + this.bqr() + ")";
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof flk_2)) {
            return false;
        }
        flk_2 flk_22 = (flk_2)object;
        if (!flk_22.C(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        if (this.wp() != flk_22.wp()) {
            return false;
        }
        if (this.bqr() != flk_22.bqr()) {
            return false;
        }
        fcv_1 fcv_12 = this.gDZ();
        fcv_1 fcv_13 = flk_22.gDZ();
        if (fcv_12 == null ? fcv_13 != null : !fcv_12.equals(fcv_13)) {
            return false;
        }
        Object object2 = this.getValue();
        Object object3 = flk_22.getValue();
        return !(object2 == null ? object3 != null : !object2.equals(object3));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof flk_2;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        n2 = n2 * 59 + this.wp();
        n2 = n2 * 59 + (this.bqr() ? 79 : 97);
        fcv_1 fcv_12 = this.gDZ();
        n2 = n2 * 59 + (fcv_12 == null ? 43 : fcv_12.hashCode());
        Object object = this.getValue();
        n2 = n2 * 59 + (object == null ? 43 : object.hashCode());
        return n2;
    }
}

