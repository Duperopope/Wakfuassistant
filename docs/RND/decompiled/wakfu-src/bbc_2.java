/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBc
 */
public class bbc_2
extends ayw_2<bCA> {
    private static final ayv_2 jFT = new ayv_2(new bbd_1());

    public bCA dNo() {
        bbb_2 bbb_22;
        try {
            bbb_22 = (bbb_2)jFT.borrowObject();
            bbb_2.a(bbb_22, jFT);
        }
        catch (Exception exception) {
            bbb_2.jFP.error((Object)("Erreur lors de l'extraction d'un " + bbb_2.class.getName() + " du pool"), (Throwable)exception);
            bbb_22 = new bbb_2();
        }
        return bbb_22;
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

