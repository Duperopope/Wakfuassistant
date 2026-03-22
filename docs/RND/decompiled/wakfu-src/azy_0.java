/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.HashSet;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from aZY
 */
public class azy_0
implements afl {
    private static final Logger hyE = LoggerFactory.getLogger(azy_0.class);

    public void a(WL wL) {
        aqb_1.bGD().a(new aNY(), aNY2 -> {
            Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap(aNY2.ctO().length);
            for (aOc aOc2 : aNY2.ctO()) {
                HashSet<VN> object = new HashSet<VN>(aOc2.ctV().length);
                for (aob_0 aob_02 : aOc2.ctV()) {
                    object.add(new VN(aob_02.getX(), aob_02.getY()));
                }
                int2ObjectOpenHashMap.put(aOc2.d(), (Object)new ftl_0(aOc2.d(), object, aOc2.ctW()));
            }
            Int2ObjectOpenHashMap int2ObjectOpenHashMap2 = new Int2ObjectOpenHashMap(aNY2.ctP().length);
            for (anz_0 anz_02 : aNY2.ctP()) {
                HashSet hashSet = new HashSet(anz_02.ctU().length);
                for (aOa aOa2 : anz_02.ctU()) {
                    hashSet.add(new VN(aOa2.getX(), aOa2.getY()));
                }
                int n = anz_02.ctT();
                ftp_0 ftp_02 = ftp_0.hJ((byte)n).orElseGet(() -> azy_0.aZ((byte)n));
                int n2 = anz_02.ctS();
                Optional<ftn_0> optional = fto_0.glX().aal(n2);
                if (optional.isEmpty()) {
                    hyE.error("Unable to parse {} with following id {} from bridgeRefId of {}, we can't register this {} (id related : {})", new Object[]{ftn_0.class.getSimpleName(), n2, aNY.class.getSimpleName(), fti_0.class.getSimpleName(), anz_02.ctR()});
                    continue;
                }
                int2ObjectOpenHashMap2.put(anz_02.ctR(), (Object)new fti_0(anz_02.ctR(), optional.get(), anz_02.conn(), anz_02.getX(), anz_02.getY(), ftp_02, hashSet));
            }
            ftk_0.glR().b(new ftj_0(aNY2.d(), aNY2.blh(), (Int2ObjectOpenHashMap<ftl_0>)int2ObjectOpenHashMap, (Int2ObjectOpenHashMap<fti_0>)int2ObjectOpenHashMap2, aNY2.ctQ(), aNY2.cnG()));
        });
        wL.b(this);
    }

    @Override
    public String getName() {
        return "contentLoader.ranchBiomes";
    }

    private static /* synthetic */ ftp_0 aZ(byte by) {
        hyE.warn("Unable to parse {} with following id {}, we use {} instead", new Object[]{ftp_0.class.getSimpleName(), by, ftp_0.tfH});
        return ftp_0.tfH;
    }
}

