/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bzL
 */
public class bzl_0
extends ayw_2<bCA> {
    private static final ayv_2 jEs = new ayv_2(new bzM());

    public bCA dNo() {
        bzJ bzJ2;
        try {
            bzJ2 = (bzJ)jEs.borrowObject();
            bzJ.a(bzJ2, jEs);
        }
        catch (Exception exception) {
            bzJ.jEh.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bzJ2 = new bzJ();
        }
        return bzJ2;
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

