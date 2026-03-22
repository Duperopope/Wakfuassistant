/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhQ
 */
final class bhq_0
extends eyj_0 {
    private final pa_2 ijv;
    final /* synthetic */ bhJ ijw;

    bhq_0(bhJ bhJ2, pa_2 pa_22) {
        this.ijw = bhJ2;
        this.ijv = pa_22;
        this.ijv.DM().a(this);
    }

    @Override
    public void zl() {
        throw new UnsupportedOperationException("Pas de serialisation dans le client (Server->Client only)");
    }

    @Override
    public void zm() {
        this.ijw.fgM().b(this.ijv.Se);
    }
}

