/*
 * Decompiled with CFR 0.152.
 */
final class bil
extends eyj_0 {
    private final sv_1 ikm;
    final /* synthetic */ bhJ ikn;

    bil(bhJ bhJ2, sv_1 sv_12) {
        this.ikn = bhJ2;
        this.ikm = sv_12;
        this.ikm.DM().a(this);
    }

    @Override
    public void zl() {
        bhJ.aGS().error((Object)"L'xp ne devrait pas \u00e9tre s\u00e9rialis\u00e9e par le client.");
    }

    @Override
    public void zm() {
        this.ikn.jF(this.ikm.YH);
    }
}

