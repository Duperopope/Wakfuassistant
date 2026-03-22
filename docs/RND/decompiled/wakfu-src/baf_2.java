/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAf
 */
public class baf_2
extends ayw_2<bCA> {
    public static final ayv_2 jEM = new ayv_2(new bag_2());

    public bCA dNo() {
        bad_2 bad_22;
        try {
            bad_22 = (bad_2)jEM.borrowObject();
            bad_2.a(bad_22, jEM);
        }
        catch (Exception exception) {
            bad_2.jEI.error((Object)"Erreur lors de l'extraction d'une CharacterStatue du pool", (Throwable)exception);
            bad_22 = new bad_2();
        }
        return bad_22;
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

