/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bzh
 */
public class bzh_0
extends ayw_2<bCA> {
    private static final ayv_2 jDC = new ayv_2(new bzi());

    public bzg_0 dOG() {
        bzg_0 bzg_02;
        try {
            bzg_02 = (bzg_0)jDC.borrowObject();
            bzg_0.a(bzg_02, jDC);
        }
        catch (Exception exception) {
            bzg_0.jDB.error((Object)"Erreur lors de l'extraction d'un DimensionalBagShelf du pool", (Throwable)exception);
            bzg_02 = new bzg_0();
        }
        return bzg_02;
    }

    @Override
    public /* synthetic */ ayx_2 baw() {
        return this.dOG();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.dOG();
    }
}

