/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxs
 */
public class bxs_0
extends ayw_2<bCA> {
    public static final ayv_2 jBl = new ayv_2(new bxt());

    public bCA dNo() {
        bxq bxq2;
        try {
            bxq2 = (bxq)jBl.borrowObject();
            bxq.a(bxq2, jBl);
        }
        catch (Exception exception) {
            bxq.jBi.error((Object)"Erreur lors de l'extraction d'une GuildMachine du pool", (Throwable)exception);
            bxq2 = new bxq();
        }
        return bxq2;
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

