/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBg
 */
public class bbg_2
extends ayw_2<bCA> {
    private static final ayv_2 jFW = new ayv_2(new bbh_2());

    public bCA dNo() {
        bbe_2 bbe_22;
        try {
            bbe_22 = (bbe_2)jFW.borrowObject();
            bbe_2.a(bbe_22, jFW);
        }
        catch (Exception exception) {
            bbe_2.jFU.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bbe_22 = new bbe_2();
        }
        return bbe_22;
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

