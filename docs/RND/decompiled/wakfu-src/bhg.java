/*
 * Decompiled with CFR 0.152.
 */
final class bhg
extends eyj_0 {
    private final qt_2 ifS;
    final /* synthetic */ bgt_0 ifT;

    bhg(bgt_0 bgt_02, qt_2 qt_22) {
        this.ifT = bgt_02;
        this.ifS = qt_22;
        this.ifS.DM().a(this);
    }

    @Override
    public void zl() {
        bgt_0.dog().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void zm() {
        this.ifT.ieR.b(this.ifS);
    }
}

