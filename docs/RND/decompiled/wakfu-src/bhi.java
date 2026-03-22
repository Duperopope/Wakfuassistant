/*
 * Decompiled with CFR 0.152.
 */
final class bhi
extends eyj_0 {
    private final rr_1 ifW;
    final /* synthetic */ bgt_0 ifX;

    bhi(bgt_0 bgt_02, rr_1 rr_12) {
        this.ifX = bgt_02;
        this.ifW = rr_12;
        this.ifW.DM().a(this);
    }

    @Override
    public void zl() {
        bgt_0.doh().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void zm() {
        this.ifX.ieS.YW(this.ifW.WK);
    }
}

