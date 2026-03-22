/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from baa
 */
public class baa_0
implements afl {
    private static final Logger hyG = LoggerFactory.getLogger(baa_0.class);

    public void a(WL wL) {
        boolean bl;
        ArrayList arrayList = new ArrayList();
        aqb_1.bGD().a(new aoi_0(), aoi_02 -> arrayList.add(new bab(aoi_02.d(), aoi_02.cud(), aoi_02.cnG())));
        do {
            bl = true;
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                bab bab2 = (bab)iterator.next();
                Optional<bkc_0> optional = bab2.cYZ();
                if (!optional.isPresent()) continue;
                iterator.remove();
                bkd_0.ebG().b(optional.get());
                bl = false;
            }
        } while (!arrayList.isEmpty() && !bl);
        if (!arrayList.isEmpty()) {
            hyG.error("Unable to register following categories because they are unresolvable (cyclic parents and/or missing parents) : {}", arrayList.stream().map(bab::cZa).toList());
        }
        wL.b(this);
    }

    @Override
    public String getName() {
        return "contentLoader.ranchBuildingCategories";
    }
}

