/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from MM
 */
class mm_1
extends mn_1 {
    private final long[] aXd;

    mm_1(long ... lArray) {
        this.aXd = (long[])lArray.clone();
    }

    @Override
    int Fq() {
        return this.aXf == null ? this.aXe + this.aXd.length - 1 : this.aXf;
    }

    @Override
    public long[] aVk() {
        return (long[])this.aXd.clone();
    }
}

