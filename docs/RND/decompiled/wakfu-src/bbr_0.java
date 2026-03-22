/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBR
 */
public class bbr_0
extends ayw_2<bCA> {
    private static final ayv_2 jGI = new ayv_2(new bbs_1());

    public bCA dNo() {
        bbo_1 bbo_12;
        try {
            bbo_12 = (bbo_1)jGI.borrowObject();
            bbo_1.a(bbo_12, jGI);
        }
        catch (Exception exception) {
            bbo_1.jGC.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bbo_12 = new bbo_1();
        }
        return bbo_12;
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

