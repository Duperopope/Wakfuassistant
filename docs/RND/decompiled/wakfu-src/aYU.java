/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class aYU
implements afl {
    private static final Logger hyc = Logger.getLogger(aYU.class);

    public void a(WL wL) {
        for (ezn ezn2 : ezn.values()) {
            eyr_2 eyr_22 = ezn2.fmw();
            if (ezr.e(eyr_22)) {
                ezq.prB.d(eyr_22);
                continue;
            }
            hyc.warn((Object)("Bonus de guilde mal saisi. id=" + eyr_22.d()), (Throwable)new Exception());
        }
        wL.b(this);
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.guildBonus", new Object[0]);
    }
}

