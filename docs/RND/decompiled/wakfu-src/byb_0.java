/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from byB
 */
public class byb_0
extends ayw_2<bCA> {
    private static final ayv_2 jCP = new ayv_2(new byC());

    public byx_0 dOq() {
        byx_0 byx_02;
        try {
            byx_02 = (byx_0)jCP.borrowObject();
            byx_0.a(byx_02, jCP);
        }
        catch (Exception exception) {
            byx_0.jCF.error((Object)"Erreur lors de l'extraction d'un Destructible du pool", (Throwable)exception);
            byx_02 = new byx_0();
        }
        return byx_02;
    }

    @Override
    public /* synthetic */ ayx_2 baw() {
        return this.dOq();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.dOq();
    }
}

