/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from byI
 */
public class byi_0
extends ayw_2<bCA> {
    private static final ayv_2 jCU = new ayv_2(new byJ());

    public bCA dNo() {
        byG byG2;
        try {
            byG2 = (byG)jCU.borrowObject();
            byG.a(byG2, jCU);
        }
        catch (Exception exception) {
            byG.jCS.error((Object)"Erreur lors de l'extraction d'un DimensionalBagAdminConsole du pool", (Throwable)exception);
            byG2 = new byG();
        }
        return byG2;
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

