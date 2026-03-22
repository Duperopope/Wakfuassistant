/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBE
 */
public class bbe_1
extends ayw_2<bCA> {
    private static final ayv_2 jGs = new ayv_2(new bbf_2());

    public bCA dNo() {
        bbc_1 bbc_12;
        try {
            bbc_12 = (bbc_1)jGs.borrowObject();
            bbc_1.a(bbc_12, jGs);
        }
        catch (Exception exception) {
            bbc_1.jGp.error((Object)"Erreur lors de l'extraction d'un SeedSpreader du pool", (Throwable)exception);
            bbc_12 = new bbc_1();
        }
        return bbc_12;
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

