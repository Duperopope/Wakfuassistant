/*
 * Decompiled with CFR 0.152.
 */
final class bhb
extends eyj_0 {
    private final ox_2 ifJ;

    bhb(ox_2 ox_22) {
        this.ifJ = ox_22;
        this.ifJ.DM().a(this);
    }

    @Override
    public void zl() {
        bgt_0.doo().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void zm() {
        bgd.diV().a(this.ifJ.RZ);
    }
}

