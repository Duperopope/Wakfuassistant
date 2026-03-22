/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from byL
 */
public class byl_0
extends ayw_2<bCA> {
    private static final ayv_2 jCZ = new ayv_2(new bym_0());

    public bCA dNo() {
        byk_0 byk_02;
        try {
            byk_02 = (byk_0)jCZ.borrowObject();
            byk_0.a(byk_02, jCZ);
        }
        catch (Exception exception) {
            byk_0.jCV.error((Object)("Erreur lors de l'extraction d'un " + byk_0.class.getName() + " du pool"), (Throwable)exception);
            byk_02 = new byk_0();
        }
        return byk_02;
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

