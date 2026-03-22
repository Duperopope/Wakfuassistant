/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ceh
 */
public class ceh_0
implements aaq_2<csH> {
    private static final Logger lRX = Logger.getLogger(ceh_0.class);

    @Override
    public boolean a(csH csH2) {
        csb_1.nEA.fY(false);
        if (csH2.eBn() != ejv_0.qzL) {
            lRX.error((Object)("[Account chest] Error when swapping compartments=" + String.valueOf((Object)csH2.eBn())));
            csb_1.a(csH2.eBn());
            return false;
        }
        bkx_1 bkx_12 = csb_1.nEA.eNF();
        if (bkx_12 == null) {
            return false;
        }
        bkx_12.af(csH2.eBv(), csH2.eBw());
        return false;
    }

    @Override
    public int bkq() {
        return 12029;
    }
}

