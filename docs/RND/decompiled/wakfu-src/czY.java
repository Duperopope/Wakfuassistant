/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class czY
implements aaq_2<cvn> {
    private static final Logger mns = Logger.getLogger(czY.class);

    @Override
    public boolean a(cvn cvn2) {
        zc_1 zc_12 = cvn2.eDT();
        for (yy_2 yy_22 : zc_12.axe()) {
            if (bLe.ecw().dR(yy_22.getX(), yy_22.getY())) {
                mns.error((Object)("Resource " + yy_22.acs() + " at " + yy_22.getX() + ":" + yy_22.getY() + ":" + yy_22.NN() + " already exist"));
                continue;
            }
            bKT bKT2 = (bKT)bKU.eca().YN(yy_22.acs());
            bKV bKV2 = bKT2 instanceof bKQ ? bKR.a(yy_22.getX(), yy_22.getY(), (short)yy_22.NN(), yy_22.acs(), (byte)yy_22.awE(), false, yy_22.awG(), yy_22.awI(), yy_22.awK()) : bKV.a(yy_22.getX(), yy_22.getY(), (short)yy_22.NN(), yy_22.acs(), (byte)yy_22.awE(), false, yy_22.awG(), yy_22.awI(), yy_22.awK());
            if (bKV2 == null) continue;
            bLe.ecw().o(bKV2);
            bKV2.bpH();
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13408;
    }
}

