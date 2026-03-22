/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxo
 */
public class bxo_0
extends ayw_2<bCA> {
    private static final ayv_2 jBh = new ayv_2(new bxp_0());

    public bCA dNo() {
        bxn bxn2;
        try {
            bxn2 = (bxn)jBh.borrowObject();
            bxn.a(bxn2, jBh);
        }
        catch (Exception exception) {
            bxn.jBd.error((Object)("Erreur lors de l'extraction d'un " + bxn.class.getName() + " du pool"), (Throwable)exception);
            bxn2 = new bxn();
        }
        return bxn2;
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

