/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bVb
 */
public class bvb_2
extends agj_2 {
    private final long lrP;
    private final short lrQ;

    public bvb_2(long l, short s) {
        this.lrP = l;
        this.lrQ = s;
    }

    @Override
    public short aIi() {
        return 1;
    }

    @Override
    public afp_2 cbr() {
        return null;
    }

    @Override
    public int hashCode() {
        return new Long(this.lrP * (long)this.lrQ).hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof bvb_2) {
            bvb_2 bvb_22 = (bvb_2)object;
            return this.lrP == bvb_22.lrP && this.lrQ == bvb_22.lrQ;
        }
        return false;
    }
}

