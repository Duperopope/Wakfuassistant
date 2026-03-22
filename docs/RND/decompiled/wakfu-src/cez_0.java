/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cez
 */
public class cez_0
implements aaq_2<csK> {
    private static final Logger lSk = Logger.getLogger(cez_0.class);

    @Override
    public boolean a(csK csK2) {
        if (csK2.eBA().aHz()) {
            lSk.error((Object)("[Enchantment] An error occurred when adding sublimation: " + String.valueOf(csK2)));
            byi_1.a(byh_1.lAw, bNG.Ip(csK2.evL()), new Object[0]);
            return false;
        }
        Optional<bEe> optional = bEe.x(csK2.eBD(), csK2.exc());
        if (optional.isEmpty()) {
            return false;
        }
        fhi_0 fhi_02 = ceE.b(optional.get().dRT(), csK2.eBE());
        cAY.eHc().nP(600205L);
        if (cui_1.eQx()) {
            fhr_0 fhr_02 = cez_0.a(optional.get().dRT(), fhi_02);
            cui_1.eRw().c(optional.get().dRT(), fhr_02);
        }
        optional.get().dRS();
        return false;
    }

    @NotNull
    private static fhr_0 a(@NotNull ffV ffV2, @NotNull fhi_0 fhi_02) {
        boolean bl;
        boolean bl2 = bl = fhi_02.ahA() != ffV2.eAZ().ahA();
        if (bl) {
            return ffV2.dwg() == fgj.siF ? fhr_0.sqy : fhr_0.sqx;
        }
        return fhr_0.sqz;
    }

    @Override
    public int bkq() {
        return 12885;
    }
}

