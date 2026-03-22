/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aHi
 */
public class ahi_2
implements ahg_2 {
    private static final Logger dON = Logger.getLogger(ahi_2.class);
    private apm_1 dOO;
    private final String[] dOP;

    public ahi_2(String ... stringArray) {
        this.dOP = stringArray;
    }

    public void a(apm_1 apm_12) {
        this.dOO = apm_12;
    }

    @Override
    public ahz_1 hE(long l) {
        if (this.dOO == null) {
            dON.error((Object)"PakFile non d\u00e9finie !");
            return null;
        }
        String string = this.dOO.bFU() + "!/";
        int n = this.dOP.length;
        for (int i = 0; i < n; ++i) {
            String string2 = l + "." + this.dOP[i];
            fr_0.bR(string + string2);
            if (!this.dOO.fB(string2)) continue;
            return new ahg_1(this.dOO, string2, string + string2);
        }
        return null;
    }
}

