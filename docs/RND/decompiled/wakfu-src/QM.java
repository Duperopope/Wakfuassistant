/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Iterator;
import org.apache.log4j.Logger;

public class QM
implements Iterator<QD> {
    protected static final Logger bhX = Logger.getLogger(QM.class);
    private final QE bhY;
    private boolean bhZ;
    private final Iterator<QD> bia;
    private final Qk bib;
    private QD bic;

    public QM(QE qE, Iterator<QD> iterator, Qk qk) {
        if (iterator == null) {
            throw new UnsupportedOperationException("checkOut d'un iterator sans liste derri\u00e8re");
        }
        if (qk == null) {
            throw new UnsupportedOperationException("checkOut d'un  LinkedToEffectContainerIterator sans container");
        }
        this.bhY = qE;
        this.bia = iterator;
        this.bib = qk;
    }

    @Override
    public boolean hasNext() {
        this.bhZ = true;
        if (!this.bia.hasNext()) {
            return false;
        }
        while (this.bia.hasNext()) {
            this.bic = this.bia.next();
            if (this.bic.bbf() == null || this.bic.bbf().bab() != this.bib.bab() || this.bic.bbf().QF() != this.bib.QF()) continue;
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
        this.bhY.r(this.bic);
    }

    @Override
    public /* synthetic */ Object next() {
        return this.bcs();
    }
}

