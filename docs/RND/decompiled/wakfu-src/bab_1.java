/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAb
 */
public class bab_1
extends ayw_2<bCA> {
    public static final ayv_2 jEH = new ayv_2(new bac_2());

    public bCA dNo() {
        bzz_0 bzz_02;
        try {
            bzz_02 = (bzz_0)jEH.borrowObject();
            bzz_0.a(bzz_02, jEH);
        }
        catch (Exception exception) {
            bzz_0.jEF.error((Object)"Erreur lors de l'extraction du pool", (Throwable)exception);
            bzz_02 = new bzz_0();
        }
        return bzz_02;
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

