/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import java.util.HashMap;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class bac
implements afl {
    private static final Logger hyK = LoggerFactory.getLogger(bac.class);

    public void a(WL wL) {
        aqb_1.bGD().a(new aOg(), aOg2 -> {
            HashMap<abi_1, fts_0> hashMap = new HashMap<abi_1, fts_0>(aOg2.cub().length);
            for (aOh aOh2 : aOg2.cub()) {
                abi_1 abi_12 = abi_1.wG(aOh2.getDirection());
                if (abi_12 == abi_1.dzt) {
                    hyK.warn("Unkown {} with following index : {} for following {} (id related : {})", new Object[]{abi_1.class.getName(), aOh2.getDirection(), ftq_0.class.getName(), aOg2.d()});
                    continue;
                }
                hashMap.put(abi_12, new fts_0(abi_12, aOh2.conn()));
            }
            Optional<ftg_0> optional = aOg2.cuc().flatMap(n -> {
                Optional<ftg_0> optional = fth_0.glI().aai((int)n);
                if (optional.isEmpty()) {
                    hyK.warn("Unknown {} with following index : {}. So can't provide {} for following {} (id related : {})", new Object[]{ftg_0.class.getName(), n, ftg_0.class.getName(), ftq_0.class.getName(), aOg2.d()});
                }
                return optional;
            });
            ftq_0 ftq_02 = new ftq_0(aOg2.d(), hashMap, optional);
            ftr_0.gmc().a(ftq_02);
            bkd_0.ebG().a(aOg2.cjd(), ftq_02);
        });
        wL.b(this);
    }

    @Override
    public String getName() {
        return "contentLoader.ranchBuildings";
    }
}

