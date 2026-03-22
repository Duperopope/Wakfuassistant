/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.TByteHashSet;
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from eUZ
 */
public final class euz_0
implements eVb {
    private static final Logger ryY = Logger.getLogger(euz_0.class);

    @Override
    public boolean d(ety_0<? extends exP> ety_02) {
        boolean bl = false;
        TByteHashSet tByteHashSet = new TByteHashSet();
        Collection<? extends exP> collection = ety_02.fKi();
        for (exP exP2 : collection) {
            if (exP2.bcP() == -1) {
                ryY.error((Object)ety_02.sq("[FIGHT_REFACTOR] On a un fighter inPlay avec un teamId \u00e0 -1 " + String.valueOf(exP2) + " - " + adu_1.xg(8)));
                continue;
            }
            tByteHashSet.add(exP2.bcP());
            if (!(bl |= tByteHashSet.size() >= ety_02.fJY())) continue;
            break;
        }
        return bl;
    }
}

