/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bLL
 */
public class bll_2
implements aeh_2 {
    protected static final Logger kuY = Logger.getLogger(bll_2.class);
    public static final String kuZ = "name";
    public static final String kva = "iconUrl";
    private final String kvb;
    private final blf_2 kvc;
    public static final String[] kvd = new String[]{"name", "iconUrl"};

    public bll_2(String string, blf_2 blf_22) {
        this.kvb = string;
        this.kvc = blf_22;
    }

    public String getName() {
        return this.kvb;
    }

    public blf_2 edP() {
        return this.kvc;
    }

    @Override
    public String[] bxk() {
        return kvd;
    }

    @Override
    public Object eu(String string) {
        if (string.equalsIgnoreCase(kuZ)) {
            return aum_0.cWf().c(this.getName(), new Object[0]);
        }
        if (string.equalsIgnoreCase(kva)) {
            // empty if block
        }
        return null;
    }
}

