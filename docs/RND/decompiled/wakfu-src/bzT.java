/*
 * Decompiled with CFR 0.152.
 */
public class bzT
extends ayw_2<bCA> {
    public static final ayv_2 jEA = new ayv_2(new bzu_0());

    public bCA dNo() {
        bzS bzS2;
        try {
            bzS2 = (bzS)jEA.borrowObject();
            bzS.a(bzS2, jEA);
        }
        catch (Exception exception) {
            bzS.jEz.error((Object)"Erreur lors de l'extraction du pool", (Throwable)exception);
            bzS2 = new bzS();
        }
        return bzS2;
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

