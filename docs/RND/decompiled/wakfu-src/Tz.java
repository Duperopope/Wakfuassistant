/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public class Tz {
    private final TF bsX;
    private final qm_0<?> bsY;

    public TF bhs() {
        return this.bsX;
    }

    public Tz(qm_0 qm_02, TF tF) {
        if (qm_02 == null || tF == null) {
            throw new IllegalArgumentException("aucun argument du constructeur de " + this.getClass().getSimpleName() + " ne doit \u00eatre null");
        }
        this.bsY = qm_02;
        this.bsX = tF;
    }

    public QQ em(long l) {
        QR qR = this.bsY.bai();
        return qR == null ? null : qR.do(l);
    }

    public QD en(long l) {
        if (this.bsY.bah() == null) {
            return null;
        }
        Iterator<qu_0> iterator = this.bsY.bae().ban();
        while (iterator.hasNext()) {
            QD qD;
            qu_0 qu_02 = iterator.next();
            if (qu_02.baz() == null || (qD = qu_02.baz().dm(l)) == null) continue;
            return qD;
        }
        return null;
    }
}

