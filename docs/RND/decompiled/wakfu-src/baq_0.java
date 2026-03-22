/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAq
 */
public class baq_0
extends ayw_2<bCA> {
    private static final ayv_2 jEV = new ayv_2(new bar_0());

    public bCA dNo() {
        bap_1 bap_12;
        try {
            bap_12 = (bap_1)jEV.borrowObject();
            bap_1.a(bap_12, jEV);
        }
        catch (Exception exception) {
            bap_1.jET.error((Object)"Erreur lors de l'extraction d'un HavenWorldResourcesCollector du pool", (Throwable)exception);
            bap_12 = new bap_1();
        }
        return bap_12;
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

