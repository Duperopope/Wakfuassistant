/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  org.apache.log4j.Logger
 */
import java.util.List;
import javax.inject.Inject;
import org.apache.log4j.Logger;

/*
 * Renamed from cAr
 */
final class car_0
implements caq_0 {
    private final List<cap_0> moG;
    private final Logger moH = Logger.getLogger(car_0.class);

    @Inject
    car_0(List<cap_0> list) {
        this.moG = list;
    }

    @Override
    public void eGx() {
        for (cap_0 cap_02 : this.moG) {
            this.moH.info((Object)("Starting " + String.valueOf(cap_02) + "..."));
            cap_02.start();
        }
    }

    @Override
    public void eGy() {
        for (cap_0 cap_02 : this.moG) {
            this.moH.info((Object)("Stopping " + String.valueOf(cap_02) + "..."));
            cap_02.bhk();
        }
    }
}

