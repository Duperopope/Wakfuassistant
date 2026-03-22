/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAv
 */
public class bav_1
extends ayw_2<bCA> {
    public static final ayv_2 jFb = new ayv_2(new baw_2());
    private final fre_0 jFc;

    public bav_1(fre_0 fre_02) {
        this.jFc = fre_02;
    }

    public bCA dNo() {
        bat_0 bat_02;
        try {
            bat_02 = (bat_0)jFb.borrowObject();
            bat_0.a(bat_02, jFb);
        }
        catch (Exception exception) {
            bat_0.jEX.error((Object)"Erreur lors de l'extraction du pool", (Throwable)exception);
            bat_02 = new bat_0();
        }
        bat_02.jFc = this.jFc;
        return bat_02;
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

