/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBA
 */
public class bba_1
extends ayw_2<bCA> {
    private static final ayv_2 jGo = new ayv_2(new bbb_1());

    public bCA dNo() {
        bby_0 bby_02;
        try {
            bby_02 = (bby_0)jGo.borrowObject();
            bby_0.a(bby_02, jGo);
        }
        catch (Exception exception) {
            bby_0.jGk.error((Object)("Erreur lors de l'extraction d'un " + bby_0.class.getName() + " du pool"), (Throwable)exception);
            bby_02 = new bby_0();
        }
        return bby_02;
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

