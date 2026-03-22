/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bel
 */
public class bel_1
extends beh_2 {
    private final short hNe;

    public bel_1(enk_0 enk_02, short s) {
        super(enk_02);
        this.hNe = s;
    }

    public bel_1(bel_1 bel_12) {
        super(bel_12.hMZ);
        this.hNe = bel_12.hNe;
    }

    @Override
    public void p(bdj_2 bdj_22) {
        bdj_22.bh(this.hNe);
    }

    public float der() {
        return this.hNe;
    }

    public bel_1 des() {
        return new bel_1(this);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        bel_1 bel_12 = (bel_1)object;
        return bel_12.hNe == this.hNe;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + this.hNe;
        return n;
    }

    public /* synthetic */ beh_2 deb() {
        return this.des();
    }
}

