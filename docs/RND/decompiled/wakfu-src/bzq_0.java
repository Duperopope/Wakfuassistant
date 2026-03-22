/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bzQ
 */
public class bzq_0
extends ayw_2<bCA> {
    private static final ayv_2 jEy = new ayv_2(new bzr_0());

    public bzo_0 dPb() {
        bzo_0 bzo_02;
        try {
            bzo_02 = (bzo_0)jEy.borrowObject();
            bzo_0.a(bzo_02, jEy);
        }
        catch (Exception exception) {
            bzo_0.jEv.error((Object)"Erreur lors de l'extraction d'un LootChest du pool", (Throwable)exception);
            bzo_02 = new bzo_0();
        }
        return bzo_02;
    }

    @Override
    public /* synthetic */ ayx_2 baw() {
        return this.dPb();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.dPb();
    }
}

