/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bze
 */
public class bze_0
extends ayw_2<bCA> {
    private static final ayv_2 jDA = new ayv_2(new bzf());

    public bCA dNo() {
        bzd_0 bzd_02;
        try {
            bzd_02 = (bzd_0)jDA.borrowObject();
            bzd_0.a(bzd_02, jDA);
        }
        catch (Exception exception) {
            bzd_0.jDy.error((Object)("Erreur lors de l'extraction d'un " + String.valueOf(bzd_0.class) + " du pool"), (Throwable)exception);
            bzd_02 = new bzd_0();
        }
        return bzd_02;
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

