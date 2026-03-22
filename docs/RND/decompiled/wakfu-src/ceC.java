/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Optional;
import org.apache.log4j.Logger;

public class ceC
implements aaq_2<cso_0> {
    private static final Logger lSn = Logger.getLogger(ceC.class);

    @Override
    public boolean a(cso_0 cso_02) {
        if (cso_02.eBA().aHz()) {
            lSn.error((Object)("[Enchantment] An error occurred during slot action: " + String.valueOf(cso_02)));
            byi_1.a(byh_1.lAw, bNG.Ip(cso_02.evL()), new Object[0]);
            return false;
        }
        Optional<bEe> optional = bEe.x(cso_02.eBD(), cso_02.exc());
        if (optional.isEmpty()) {
            return false;
        }
        fhi_0 fhi_02 = ceE.b(optional.get().dRT(), cso_02.eBE());
        ceE.c(cso_02.eBE(), fhi_02);
        if (cui_1.eQx()) {
            cui_1.eRw().a(optional.get().dRT(), fhi_02, cso_02.eBC());
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13335;
    }
}

