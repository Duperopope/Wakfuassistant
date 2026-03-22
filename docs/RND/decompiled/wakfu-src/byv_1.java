/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from byv
 */
public class byv_1
extends ayw_2<bCA> {
    private static final ayv_2 jCE = new ayv_2(new byw());

    public bCA dNo() {
        byu_0 byu_02;
        try {
            byu_02 = (byu_0)jCE.borrowObject();
            byu_0.a(byu_02, jCE);
        }
        catch (Exception exception) {
            byu_0.jCC.error((Object)("Erreur lors de l'extraction d'un " + byu_0.class.getName() + " du pool"), (Throwable)exception);
            byu_02 = new byu_0();
        }
        return byu_02;
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

