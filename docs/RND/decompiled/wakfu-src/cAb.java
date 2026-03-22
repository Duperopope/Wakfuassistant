/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class cAb
implements aaq_2<cvq_0> {
    private static final Logger mnt = Logger.getLogger(cAb.class);

    @Override
    public boolean a(cvq_0 cvq_02) {
        yy_2 yy_22 = cvq_02.eDU();
        if (bLe.ecw().dR(yy_22.getX(), yy_22.getY())) {
            mnt.error((Object)("Resource " + yy_22.acs() + " at " + yy_22.getX() + ":" + yy_22.getY() + ":" + yy_22.NN() + " already exist on client"));
        } else {
            bKV bKV2;
            bKT bKT2 = (bKT)bKU.eca().YN(yy_22.acs());
            bKV bKV3 = bKV2 = bKT2 instanceof bKQ ? bKR.a(yy_22.getX(), yy_22.getY(), (short)yy_22.NN(), yy_22.acs(), (byte)yy_22.awE(), true, yy_22.awG(), yy_22.awI(), yy_22.awK()) : bKV.a(yy_22.getX(), yy_22.getY(), (short)yy_22.NN(), yy_22.acs(), (byte)yy_22.awE(), true, yy_22.awG(), yy_22.awI(), yy_22.awK());
            if (bKV2 != null) {
                bLe.ecw().o(bKV2);
                bKV2.bpH();
            }
        }
        return false;
    }

    @Override
    public int bkq() {
        return 12544;
    }
}

