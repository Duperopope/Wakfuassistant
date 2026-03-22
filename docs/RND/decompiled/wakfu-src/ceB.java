/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Optional;
import org.apache.log4j.Logger;

public class ceB
implements aaq_2<csN> {
    private static final Logger lSm = Logger.getLogger(ceB.class);

    @Override
    public boolean a(csN csN2) {
        if (csN2.eBA().aHz()) {
            lSm.error((Object)("[Enchantment] An error occurred when sacrificing item: " + String.valueOf(csN2)));
            byi_1.a(byh_1.lAw, bNG.Ip(csN2.evL()), new Object[0]);
            return false;
        }
        Optional<bEe> optional = bEe.x(csN2.eBD(), csN2.exc());
        if (optional.isEmpty()) {
            return false;
        }
        ffV ffV2 = optional.get().dRT();
        fhi_0 fhi_02 = ceE.b(ffV2, csN2.eBE());
        if (csN2.eBB() == rb_0.bjq) {
            cAY.eHc().nP(600204L);
        } else {
            ceE.c(csN2.eBE(), fhi_02);
        }
        if (cui_1.eQx()) {
            cui_1.eRw().a(ffV2, fhi_02, csN2.eBB());
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13648;
    }
}

