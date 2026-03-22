/*
 * Decompiled with CFR 0.152.
 */
public class bzb
extends ayw_2<bCA> {
    private static final ayv_2 jDw = new ayv_2(new bzc_0());

    public byZ dOE() {
        byZ byZ2;
        try {
            byZ2 = (byZ)jDw.borrowObject();
            byZ.a(byZ2, jDw);
        }
        catch (Exception exception) {
            byZ.jDs.error((Object)"Erreur lors de l'extraction d'un LootChest du pool", (Throwable)exception);
            byZ2 = new byZ();
        }
        return byZ2;
    }

    @Override
    public /* synthetic */ ayx_2 baw() {
        return this.dOE();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.dOE();
    }
}

