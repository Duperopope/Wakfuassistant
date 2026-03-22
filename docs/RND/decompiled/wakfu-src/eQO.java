/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class eQO {
    private static final Logger rgI = LoggerFactory.getLogger(eQO.class);

    public static eQN a(int n, qm_0<enk_0> qm_02, acd_1 acd_12) {
        eSS eSS2 = eTo.fIZ().iY(n);
        if (eSS2 == null) {
            NullPointerException nullPointerException = new NullPointerException("Unknown effect area for following id : " + n);
            rgI.error(nullPointerException.getMessage(), (Throwable)nullPointerException);
            throw nullPointerException;
        }
        int n2 = eSS2.aeV();
        if (n2 == etm_0.rnt.aHp()) {
            return eqt_0.a(qm_02, acd_12, n);
        }
        if (n2 == etm_0.rns.aHp()) {
            return eQH.a(qm_02, acd_12, n);
        }
        if (n2 == etm_0.rnr.aHp()) {
            return eqq_0.a(qm_02, acd_12, n);
        }
        if (n2 == etm_0.rnz.aHp()) {
            return eqi_0.a(qm_02, acd_12, n);
        }
        return eQN.a(qm_02, acd_12, n);
    }
}

