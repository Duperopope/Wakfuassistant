/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from byP
 */
public class byp_1
extends ayw_2<bCA> {
    private static final ayv_2 jDc = new ayv_2(new byq_0());

    public bCA dNo() {
        byn_0 byn_02;
        try {
            byn_02 = (byn_0)jDc.borrowObject();
            byn_0.a(byn_02, jDc);
        }
        catch (Exception exception) {
            byn_0.jDa.error((Object)("Erreur lors de l'extraction d'un " + String.valueOf(byn_0.class) + " du pool"), (Throwable)exception);
            byn_02 = new byn_0();
        }
        return byn_02;
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

