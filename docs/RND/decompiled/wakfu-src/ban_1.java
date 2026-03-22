/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAn
 */
public class ban_1
extends ayw_2<bCA> {
    private static final ayv_2 jES = new ayv_2(new bao_1());

    public bCA dNo() {
        bal_1 bal_12;
        try {
            bal_12 = (bal_1)jES.borrowObject();
            bal_1.a(bal_12, jES);
        }
        catch (Exception exception) {
            bal_1.jEQ.error((Object)"Erreur lors de l'extraction d'un DimensionalBagExitTrigger du pool", (Throwable)exception);
            bal_12 = new bal_1();
        }
        return bal_12;
    }

    @Override
    public /* synthetic */ ayx_2 baw() {
        return this.dNo();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.dNo();
    }
}

