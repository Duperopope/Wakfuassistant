/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Optional;
import org.apache.log4j.Logger;

public class ceD
implements aaq_2<csq_0> {
    private static final Logger lSo = Logger.getLogger(ceD.class);

    @Override
    public boolean a(csq_0 csq_02) {
        if (csq_02.eBA().aHz()) {
            lSo.error((Object)("[Enchantment] An error occurred when updating slot bonuses: " + String.valueOf(csq_02)));
            byi_1.a(byh_1.lAw, bNG.Ip(csq_02.evL()), new Object[0]);
            return false;
        }
        Optional<bEe> optional = bEe.x(csq_02.eBD(), csq_02.exc());
        if (optional.isEmpty()) {
            return false;
        }
        fhi_0 fhi_02 = ceE.b(optional.get().dRT(), csq_02.eBE());
        if (cui_1.eQx()) {
            cui_1.eRw().c(optional.get().dRT(), fhi_02);
        }
        optional.get().dRS();
        return false;
    }

    @Override
    public int bkq() {
        return 12255;
    }
}

