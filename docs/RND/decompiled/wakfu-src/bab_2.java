/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAB
 */
public class bab_2
extends ayw_2<bCA> {
    private static final ayv_2 jFj = new ayv_2(new bac_1());

    public bCA dNo() {
        baa_2 baa_22;
        try {
            baa_22 = (baa_2)jFj.borrowObject();
            baa_2.a(baa_22, jFj);
        }
        catch (Exception exception) {
            baa_2.jFg.error((Object)"Erreur lors de l'extraction d'un Board du pool", (Throwable)exception);
            baa_22 = new baa_2();
        }
        return baa_22;
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

