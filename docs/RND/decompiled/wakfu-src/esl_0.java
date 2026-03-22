/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eSl
 */
public class esl_0
implements Qo {
    private static final Logger rjw = Logger.getLogger(esl_0.class);
    private final qm_0 rjx;
    private final long rjy;
    private final QD rjz;

    public esl_0(QD qD, qm_0 qm_02, long l) {
        this.rjx = qm_02;
        this.rjy = l;
        this.rjz = qD;
    }

    @Override
    public boolean a(QD qD) {
        if (!(qD instanceof eQN)) {
            return false;
        }
        eQN eQN2 = (eQN)qD;
        long l = eQN2.RD();
        if (l != this.rjy) {
            return false;
        }
        QQ qQ = this.rjx.bai().do(l);
        if (qQ == null) {
            rjw.error((Object)("Could not re-link effect to its container using effectArea id " + l + " ; orphaned RE : " + String.valueOf(this.rjz)));
            return false;
        }
        this.rjz.a(qQ);
        return true;
    }
}

