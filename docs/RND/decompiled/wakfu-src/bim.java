/*
 * Decompiled with CFR 0.152.
 */
final class bim
extends eyj_0 {
    private final sx_1 iko;
    final /* synthetic */ bhJ ikp;

    bim(bhJ bhJ2, sx_1 sx_12) {
        this.ikp = bhJ2;
        this.iko = sx_12;
        this.iko.DM().a(this);
    }

    @Override
    public void zl() {
        bhJ.aGR().error((Object)"L'xp ne devrait pas \u00e9tre s\u00e9rialis\u00e9e par le client.");
    }

    @Override
    public void zm() {
        this.ikp.CR(this.iko.YL);
    }
}

