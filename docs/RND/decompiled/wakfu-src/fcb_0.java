/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fcb
 */
public class fcb_0
extends fbz_0 {
    private final short rTf;
    private final int rTg;

    public fcb_0(short s, short s2, int n, int n2, short s3) {
        super(s, n2, s3);
        this.rTf = s2;
        this.rTg = n;
    }

    public short fRN() {
        return this.rTf;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof fcb_0)) {
            return false;
        }
        fcb_0 fcb_02 = (fcb_0)object;
        return this.rTf == fcb_02.rTf;
    }

    public int hashCode() {
        return this.rTf;
    }

    @Override
    public String toString() {
        return super.toString() + "m_patchId=" + this.rTf;
    }

    @Override
    public int cmP() {
        return this.rTg;
    }
}

