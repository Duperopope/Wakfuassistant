/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxX
 */
public class bxx_0
extends ayw_2<bCA> {
    public static final ayv_2 jCe = new ayv_2(new bxy_0());

    public bCA dNo() {
        bxW bxW2;
        try {
            bxW2 = (bxW)jCe.borrowObject();
            bxW.a(bxW2, jCe);
        }
        catch (Exception exception) {
            bxW.jCb.error((Object)"Erreur lors de l'extraction d'une CharacterStatue du pool", (Throwable)exception);
            bxW2 = new bxW();
        }
        return bxW2;
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

