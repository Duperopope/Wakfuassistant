/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBk
 */
class abk_1
extends abi_2 {
    protected final long dyv;

    abk_1(Runnable runnable, long l) {
        super(runnable);
        this.dyv = l;
    }

    @Override
    public long hp(long l) {
        this.dys = l + this.dyv;
        return this.dys;
    }
}

