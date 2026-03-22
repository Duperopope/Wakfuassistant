/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAU
 */
public class bau_1
extends ayw_2<bCA> {
    private static final ayv_2 jFL = new ayv_2(new bav_2());

    public bCA dNo() {
        bat_1 bat_12;
        try {
            bat_12 = (bat_1)jFL.borrowObject();
            bat_1.a(bat_12, jFL);
        }
        catch (Exception exception) {
            bat_1.jFK.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bat_12 = new bat_1();
        }
        return bat_12;
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

