/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class QN
implements ayx_2,
Iterator<QD> {
    protected static final Logger bid = Logger.getLogger(QN.class);
    private static final ayv_2 bie = new ayv_2(new qo_0());
    private QE bhY;
    private Iterator<QD> bia;
    private QD bic = null;
    private qu_0 bfr;
    private final List<QD> bif = new ArrayList<QD>();
    private boolean big = false;
    private boolean bhZ = false;

    @Override
    public void aVI() {
    }

    @Override
    public void aVH() {
        for (QD qD : this.bif) {
            this.bhY.r(qD);
        }
        this.bif.clear();
        this.bia = null;
        this.bic = null;
        this.bfr = null;
        this.bhY = null;
        this.big = false;
    }

    public static QN a(QE qE, Iterator<QD> iterator, qu_0 qu_02, boolean bl) {
        if (iterator != null && qu_02 != null) {
            QN qN;
            try {
                qN = (QN)bie.borrowObject();
            }
            catch (Exception exception) {
                qN = new QN();
                bid.error((Object)("erreur dans le checkOut de " + String.valueOf(qN.getClass())));
            }
            qN.bhY = qE;
            qN.bia = iterator;
            qN.bfr = qu_02;
            qN.big = bl;
            return qN;
        }
        if (iterator == null) {
            throw new UnsupportedOperationException("checkOut d'un iterator sans liste derri\u00e8re");
        }
        throw new UnsupportedOperationException("checkOut d'un  LinkedToEffectUserIterator sans effectUser");
    }

    @Override
    public boolean hasNext() {
        this.bhZ = true;
        if (!this.bia.hasNext()) {
            return false;
        }
        while (this.bia.hasNext()) {
            this.bic = this.bia.next();
            if ((this.bic.bbc() != this.bfr || this.big) && this.bic.bbd() != this.bfr) continue;
            return true;
        }
        return false;
    }

    public QD bcs() {
        if (!this.bhZ && !this.hasNext()) {
            throw new UnsupportedOperationException("Depassement de liste, cause probable : appel de next() sans v\u00e9rification");
        }
        this.bhZ = false;
        return this.bic;
    }

    @Override
    public void remove() {
        this.bia.remove();
        this.bif.add(this.bic);
    }

    public void aZp() {
        if (bie != null) {
            try {
                bie.returnObject(this);
            }
            catch (Exception exception) {
                bid.error((Object)"impossible");
            }
        } else {
            this.aVH();
        }
    }

    @Override
    public /* synthetic */ Object next() {
        return this.bcs();
    }
}

