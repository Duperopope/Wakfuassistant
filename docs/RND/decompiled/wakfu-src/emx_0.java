/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eMx
 */
public class emx_0
extends emq_0 {
    public static final emv_0 qMQ = new emx_0();
    private static final Logger qMR = Logger.getLogger(emx_0.class);

    private emx_0() {
    }

    @Override
    Object[] c(enk_0 enk_02, short s) {
        Object[] objectArray = super.c(enk_02, s);
        if (enk_02.fAn() < 3) {
            qMR.error((Object)("Unable to compute exponential parameters : need 3 values, only " + enk_02.fAn() + " available"));
            return objectArray;
        }
        float f2 = enk_02.x(0, s);
        float f3 = enk_02.x(1, s);
        float f4 = enk_02.x(2, s);
        double d2 = (double)f2 + (double)f3 * Math.pow(s, f4);
        double d3 = f3 >= 0.0f ? Math.floor(d2) : Math.ceil(d2);
        objectArray[0] = new GF((long)d3, d2);
        return objectArray;
    }
}

