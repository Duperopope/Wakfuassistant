/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class aZZ
implements afl {
    private static final Logger hyF = LoggerFactory.getLogger(aZZ.class);

    public void a(WL wL) {
        aqb_1.bGD().a(new aOd(), aOd2 -> {
            Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap(aOd2.ctX().length);
            for (aOe aOe2 : aOd2.ctX()) {
                byte by = aOe2.ctT();
                Optional<ftp_0> optional = ftp_0.hJ(by);
                if (optional.isEmpty()) {
                    hyF.error("Unable to parse {} with following id {} from initialStateId of {}, we can't register this {} (id related : {})", new Object[]{ftp_0.class.getSimpleName(), by, aOd.class.getSimpleName(), ftm_0.class.getSimpleName(), aOe2.ctY()});
                    continue;
                }
                byte by2 = aOe2.ctZ();
                Optional<ftp_0> optional2 = ftp_0.hJ(by2);
                if (optional2.isEmpty()) {
                    hyF.error("Unable to parse {} with following id {} from initialStateId of {}, we can't register this {} (id related : {})", new Object[]{ftp_0.class.getSimpleName(), by, aOd.class.getSimpleName(), ftm_0.class.getSimpleName(), aOe2.ctY()});
                    continue;
                }
                Int2IntOpenHashMap int2IntOpenHashMap = new Int2IntOpenHashMap(aOe2.cua().length);
                for (aOf aOf2 : aOe2.cua()) {
                    int2IntOpenHashMap.put(aOf2.azv(), aOf2.oP());
                }
                int2ObjectOpenHashMap.put(aOe2.ctY(), (Object)new ftm_0(aOe2.ctY(), optional.get(), optional2.get(), int2IntOpenHashMap));
            }
            fto_0.glX().a(new ftn_0(aOd2.d(), (Int2ObjectOpenHashMap<ftm_0>)int2ObjectOpenHashMap));
        });
        wL.b(this);
    }

    @Override
    public String getName() {
        return "contentLoader.ranchBridges";
    }
}

