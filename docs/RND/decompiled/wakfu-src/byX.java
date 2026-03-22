/*
 * Decompiled with CFR 0.152.
 */
public class byX
extends ayw_2<bCA> {
    private static final ayv_2 jDr = new ayv_2(new byY());

    public bCA dNo() {
        byv_0 byv_02;
        try {
            byv_02 = (byv_0)jDr.borrowObject();
            byv_0.a(byv_02, jDr);
        }
        catch (Exception exception) {
            byv_0.jDi.error((Object)("Erreur lors de l'extraction d'un " + byv_0.class.getName() + " du pool"), (Throwable)exception);
            byv_02 = new byv_0();
        }
        return byv_02;
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

