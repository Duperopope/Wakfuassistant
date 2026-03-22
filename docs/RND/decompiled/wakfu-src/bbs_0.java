/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBs
 */
public class bbs_0
extends ayw_2<bCA> {
    public static final ayv_2 jGg = new ayv_2(new bbt_0());

    public bCA dNo() {
        bbr_1 bbr_12;
        try {
            bbr_12 = (bbr_1)jGg.borrowObject();
            bbr_1.a(bbr_12, jGg);
        }
        catch (Exception exception) {
            bbr_1.jGd.error((Object)"Erreur lors de l'extraction d'une RecycleMachine du pool", (Throwable)exception);
            bbr_12 = new bbr_1();
        }
        return bbr_12;
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

