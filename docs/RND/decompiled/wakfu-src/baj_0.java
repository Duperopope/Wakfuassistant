/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAJ
 */
public class baj_0
extends ayw_2<bCA> {
    private static final ayv_2 jFv = new ayv_2(new bak_1());

    public bah_1 dPs() {
        bah_1 bah_12;
        try {
            bah_12 = (bah_1)jFv.borrowObject();
            bah_1.a(bah_12, jFv);
        }
        catch (Exception exception) {
            bah_1.jFn.error((Object)"Erreur lors de l'extraction d'un LootChest du pool", (Throwable)exception);
            bah_12 = new bah_1();
        }
        return bah_12;
    }

    @Override
    public /* synthetic */ ayx_2 baw() {
        return this.dPs();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.dPs();
    }
}

