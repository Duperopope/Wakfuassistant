/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAF
 */
public class baf_1
extends ayw_2<bCA> {
    private static final ayv_2 jFm = new ayv_2(new bag_1());

    public bCA dNo() {
        bad_1 bad_12;
        try {
            bad_12 = (bad_1)jFm.borrowObject();
            bad_1.a(bad_12, jFm);
        }
        catch (Exception exception) {
            bad_1.jFk.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bad_12 = new bad_1();
        }
        return bad_12;
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

