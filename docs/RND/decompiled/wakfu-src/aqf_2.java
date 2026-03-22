/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aqf
 */
public final class aqf_2
extends apw_1 {
    private static final Logger cQq = Logger.getLogger(aqf_2.class);
    private static final aqf_2 cQr = new aqf_2();

    public static aqf_2 bGr() {
        return cQr;
    }

    private aqf_2() {
        super("data.bdat", "indexes.bdat", true);
        this.setName("SimpleBinaryStorage");
    }

    public aqf_2(String string) {
        super("data.bdat", "indexes.bdat", true);
        this.setName(string);
    }
}

