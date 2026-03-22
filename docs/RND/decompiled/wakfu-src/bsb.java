/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class bsb {
    private static final Logger jeK = Logger.getLogger(bsb.class);

    private bsb() {
    }

    public static String a(@NotNull eTw eTw2) {
        if (eTw2.fJg()) {
            return eTw2.bAD();
        }
        String string = "calendar.events.predefined.title." + eTw2.aFW() + "." + eTw2.eJz();
        return aum_0.cWf().c(string, new Object[0]);
    }

    public static String b(@NotNull eTw eTw2) {
        if (eTw2.fJg()) {
            return eTw2.getDescription();
        }
        String string = "calendar.events.predefined.desc." + eTw2.aFW() + "." + eTw2.eJz();
        return aum_0.cWf().c(string, new Object[0]);
    }
}

