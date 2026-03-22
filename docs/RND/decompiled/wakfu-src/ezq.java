/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

public class ezq {
    private static final Logger prA = Logger.getLogger(ezq.class);
    public static final ezq prB = new ezq();
    private final TIntObjectHashMap<eyr_2> prC = new TIntObjectHashMap();

    private ezq() {
    }

    public void d(eyr_2 eyr_22) {
        if (this.prC.contains(eyr_22.d())) {
            throw new IllegalArgumentException("bonus d\u00e9j\u00e0 ins\u00e9r\u00e9 avec l'id " + eyr_22.d());
        }
        this.prC.put(eyr_22.d(), (Object)eyr_22);
    }

    public eyr_2 Pe(int n) {
        return (eyr_2)this.prC.get(n);
    }
}

