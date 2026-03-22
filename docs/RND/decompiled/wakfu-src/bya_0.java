/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bya
 */
public class bya_0
extends ayw_2<ng_1> {
    private static final ayv_2 jCg = new ayv_2(new byb());

    public bxz_0 dNY() {
        bxz_0 bxz_02;
        try {
            bxz_02 = (bxz_0)jCg.borrowObject();
            bxz_0.a(bxz_02, jCg);
        }
        catch (Exception exception) {
            bxz_0.aGi().error((Object)"Erreur lors de l'extraction d'un CharacterStatueViewFactory du pool", (Throwable)exception);
            bxz_02 = new bxz_0();
        }
        return bxz_02;
    }

    @Override
    public /* synthetic */ ayx_2 baw() {
        return this.dNY();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.dNY();
    }
}

