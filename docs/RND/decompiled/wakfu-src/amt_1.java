/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from amt
 */
public class amt_1
extends amm_1 {
    protected static final Logger cIo = Logger.getLogger(amt_1.class);
    amq_1 cIp;

    public amt_1(amq_1 amq_12) {
        this.cIp = amq_12;
    }

    public void d(amq_1 amq_12) {
        this.cIp = amq_12;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (this.cIp == null) {
            return -5;
        }
        try {
            Object object5 = this.cIp.c(object, object2, object3, object4);
            if (!(object5 instanceof Boolean)) {
                return -2;
            }
            if (((Boolean)object5).booleanValue()) {
                return 0;
            }
            return -1;
        }
        catch (aml_1 aml_12) {
            cIo.error((Object)"CriteriaException during getValidity", (Throwable)aml_12);
            return -3;
        }
    }
}

