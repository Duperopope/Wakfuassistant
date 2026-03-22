/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBY
 */
public class bby_1
extends ayw_2<bCA> {
    private static final ayv_2 jGN = new ayv_2(new bbz_0());

    public bCA dNo() {
        bbw_1 bbw_12;
        try {
            bbw_12 = (bbw_1)jGN.borrowObject();
            bbw_1.a(bbw_12, jGN);
        }
        catch (Exception exception) {
            bbw_1.jGL.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bbw_12 = new bbw_1();
        }
        return bbw_12;
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

