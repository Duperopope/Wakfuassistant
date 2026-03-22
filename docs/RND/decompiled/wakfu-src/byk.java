/*
 * Decompiled with CFR 0.152.
 */
public class byk
extends ayw_2<bCA> {
    public static final ayv_2 jCp = new ayv_2(new byl());

    public bCA dNo() {
        byi byi2;
        try {
            byi2 = (byi)jCp.borrowObject();
            byi.a(byi2, jCp);
        }
        catch (Exception exception) {
            byi.jCn.error((Object)"Erreur lors de l'extraction du pool", (Throwable)exception);
            byi2 = new byi();
        }
        return byi2;
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

