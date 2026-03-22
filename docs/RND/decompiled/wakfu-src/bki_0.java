/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bKi
 */
public class bki_0
extends bjw_0 {
    private fpb kmX;

    bki_0() {
    }

    @Override
    public bkr_0 eaZ() {
        if (this.kmX == fpb.sNq) {
            return bkr_0.knz;
        }
        if (this.kmX == fpb.sNo) {
            return bkr_0.knA;
        }
        return bkr_0.kny;
    }

    public void b(fpb fpb2) {
        this.kmX = fpb2;
    }

    public fpb ebe() {
        return this.kmX;
    }

    public boolean equals(Object object) {
        if (!(object instanceof bki_0)) {
            return false;
        }
        bki_0 bki_02 = (bki_0)object;
        return bki_02.ebe() == this.ebe();
    }

    @Override
    public String[] aHm() {
        String[] stringArray = new String[]{String.valueOf(this.kmX.aJr())};
        return stringArray;
    }
}

