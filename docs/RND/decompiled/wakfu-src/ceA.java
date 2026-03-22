/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Optional;
import org.apache.log4j.Logger;

public class ceA
implements aaq_2<csL> {
    private static final Logger lSl = Logger.getLogger(ceA.class);

    @Override
    public boolean a(csL csL2) {
        if (csL2.eBA().aHz()) {
            lSl.error((Object)("[Enchantment] An error occurred when removing sublimation: " + String.valueOf(csL2)));
            byi_1.a(byh_1.lAw, bNG.Ip(csL2.evL()), new Object[0]);
            return false;
        }
        Optional<bEe> optional = bEe.x(csL2.eBD(), csL2.exc());
        if (optional.isEmpty()) {
            return false;
        }
        ceE.b(optional.get().dRT(), csL2.eBE());
        if (cui_1.eQx()) {
            cui_1.eRw().C(optional.get().dRT());
        }
        optional.get().dRS();
        return false;
    }

    @Override
    public int bkq() {
        return 13581;
    }
}

