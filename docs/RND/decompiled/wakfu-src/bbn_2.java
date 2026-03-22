/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBn
 */
public class bbn_2
extends ayw_2<bCA> {
    public static final ayv_2 jGb = new ayv_2(new bbo_2());

    public bCA dNo() {
        bbl_1 bbl_12;
        try {
            bbl_12 = (bbl_1)jGb.borrowObject();
            bbl_1.a(bbl_12, jGb);
        }
        catch (Exception exception) {
            bbl_1.jFZ.error((Object)"Error extracting PvpExtraction of pool", (Throwable)exception);
            bbl_12 = new bbl_1();
        }
        return bbl_12;
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

