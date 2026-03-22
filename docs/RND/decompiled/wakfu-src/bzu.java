/*
 * Decompiled with CFR 0.152.
 */
public class bzu
extends ayw_2<bCA> {
    private static final ayv_2 jDT = new ayv_2(new bzv_0());

    public bCA dNo() {
        bzs_0 bzs_02;
        try {
            bzs_02 = (bzs_0)jDT.borrowObject();
            bzs_0.a(bzs_02, jDT);
        }
        catch (Exception exception) {
            bzs_0.jDQ.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bzs_02 = new bzs_0();
        }
        return bzs_02;
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

