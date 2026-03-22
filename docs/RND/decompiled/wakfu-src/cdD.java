/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

class cdD
implements aaq_2<cxV> {
    private static final Logger lQQ = Logger.getLogger((String)cdD.class.getName());

    cdD() {
    }

    @Override
    public boolean a(cxV cxV2) {
        if (cxV2.eFh() == null || cxV2.getValue() == null) {
            lQQ.error((Object)("Error while running global variable update for variable : " + String.valueOf(cxV2.eFh() == null ? "null" : cxV2.eFh()) + " value : " + String.valueOf(cxV2.getValue() == null ? "null" : cxV2.getValue())));
            return false;
        }
        exu_1.rJd.a(cxV2.eFh(), cxV2.getValue());
        return false;
    }

    @Override
    public int bkq() {
        return 1123;
    }
}

