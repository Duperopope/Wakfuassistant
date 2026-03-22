/*
 * Decompiled with CFR 0.152.
 */
public class bzH
extends ayw_2<bCA> {
    private static final ayv_2 jEg = new ayv_2(new bzi_0());

    public bCA dNo() {
        bzG bzG2;
        try {
            bzG2 = (bzG)jEg.borrowObject();
            bzG.a(bzG2, jEg);
        }
        catch (Exception exception) {
            byu_0.jCC.error((Object)("Error extracting " + byu_0.class.getName() + " of pool"), (Throwable)exception);
            bzG2 = new bzG();
        }
        return bzG2;
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

