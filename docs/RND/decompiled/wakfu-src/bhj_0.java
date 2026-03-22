/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhj
 */
final class bhj_0
extends eyj_0 {
    private final sd_1 ifY;
    final /* synthetic */ bgt_0 ifZ;

    bhj_0(bgt_0 bgt_02, sd_1 sd_12) {
        this.ifZ = bgt_02;
        this.ifY = sd_12;
        this.ifY.DM().a(this);
    }

    @Override
    public void zl() {
        bgt_0.aGj().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void zm() {
        this.ifZ.ieQ.a(this.ifY);
        this.ifZ.ieQ.c(this.ifZ.hUL);
    }
}

