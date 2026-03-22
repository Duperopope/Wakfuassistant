/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAN
 */
public class ban_0
extends ayw_2<bCA> {
    private static final ayv_2 jFB = new ayv_2(new bao_0());

    public bCA dNo() {
        bal_0 bal_02;
        try {
            bal_02 = (bal_0)jFB.borrowObject();
            bal_0.a(bal_02, jFB);
        }
        catch (Exception exception) {
            bal_0.jFw.error((Object)"Erreur lors de l'extraction d'un MarketBoard du pool", (Throwable)exception);
            bal_02 = new bal_0();
        }
        return bal_02;
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

