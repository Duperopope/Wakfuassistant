/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bzB
 */
public class bzb_0
extends ayw_2<bCA> {
    private static final ayv_2 jEc = new ayv_2(new bzC());

    public bCA dNo() {
        bzz bzz2;
        try {
            bzz2 = (bzz)jEc.borrowObject();
            bzz.a(bzz2, jEc);
        }
        catch (Exception exception) {
            bzz.jDV.error((Object)("Erreur lors de l'extraction d'un " + bzz.class.getName() + " du pool"), (Throwable)exception);
            bzz2 = new bzz();
        }
        return bzz2;
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

