/*
 * Decompiled with CFR 0.152.
 */
public class bzk
extends ayw_2<ng_1> {
    private static final ayv_2 jDE = new ayv_2(new bzl());

    public bzj_0 dOH() {
        bzj_0 bzj_02;
        try {
            bzj_02 = (bzj_0)jDE.borrowObject();
            bzj_0.a(bzj_02, jDE);
        }
        catch (Exception exception) {
            bzj_0.aGi().error((Object)"Erreur lors de l'extraction d'un DimensionalBagView du pool", (Throwable)exception);
            bzj_02 = new bzj_0();
        }
        return bzj_02;
    }

    @Override
    public /* synthetic */ ayx_2 baw() {
        return this.dOH();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.dOH();
    }
}

