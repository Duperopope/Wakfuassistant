/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.Set;
import org.apache.log4j.Logger;

public class eyw {
    protected static final Logger pji = Logger.getLogger(eyw.class);
    private static final eyw pjj = new eyw();
    private static final Set<Integer> pjk = Set.of(Integer.valueOf(196));
    private final TIntObjectHashMap<eyv> pjl = new TIntObjectHashMap();

    public void a(eyv eyv2) {
        int n = eyv2.cqy();
        if (!this.pjl.containsKey(n)) {
            this.pjl.put(n, (Object)eyv2);
        } else {
            pji.warn((Object)"tentative de surchage de la d\u00e9finition d'une famille dans le MonsterFamilyManager");
        }
    }

    public eyv OW(int n) {
        return (eyv)this.pjl.get(n);
    }

    public TIntObjectIterator<eyv> ekN() {
        return this.pjl.iterator();
    }

    public eyv b(eyv eyv2) {
        return this.a(eyv2, eyx.pjm);
    }

    public eyv c(eyv eyv2) {
        return this.a(eyv2, eyx.pjn);
    }

    public eyv d(eyv eyv2) {
        return this.a(eyv2, eyx.pjo);
    }

    private eyv a(eyv eyv2, eyx eyx2) {
        TIntObjectIterator tIntObjectIterator = this.pjl.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            eyv eyv3 = (eyv)tIntObjectIterator.value();
            if (eyv3.fii() != eyv2.cqy() || eyv3.fij() != eyx2) continue;
            return eyv3;
        }
        return null;
    }

    public boolean OX(int n) {
        int n2 = n;
        while (this.pjl.containsKey(n2)) {
            eyv eyv2 = (eyv)this.pjl.get(n2);
            if (pjk.contains(n2)) {
                return true;
            }
            n2 = eyv2.fii();
        }
        return false;
    }

    public static eyw fik() {
        return pjj;
    }
}

