/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from exO
 */
public class exo_2 {
    protected static final Logger pfN = Logger.getLogger(exo_2.class);
    public static final exo_2 pfO = new exo_2();
    private long pfP = 0L;
    private long pfQ = System.currentTimeMillis() + 60000L;
    private long pfR;

    private exo_2() {
        while (this.pfQ < System.currentTimeMillis()) {
            this.ffD();
        }
        this.ffD();
    }

    private void ffD() {
        this.pfR = this.pfQ + (long)GC.mR(60000);
        this.pfQ += 60000L;
        pfN.info((Object)("Cacul du prochain loot special : " + BH.cl(this.pfR)));
    }

    public boolean pg(long l) {
        long l2 = System.currentTimeMillis();
        if (l2 < this.pfR) {
            return false;
        }
        if (l == this.pfP) {
            return false;
        }
        while (this.pfQ < l2) {
            this.ffD();
        }
        this.ffD();
        pfN.info((Object)("gift gagn\u00e9 par le playerId=" + l));
        this.pfP = l;
        return true;
    }
}

