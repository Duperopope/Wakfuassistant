/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Iterator;
import org.apache.log4j.Logger;

public class eRW
implements Iterator<QD> {
    protected static final Logger rjd = Logger.getLogger(eRW.class);
    private final QE rje;
    private final Iterator<QD> rjf;
    private QD bic;
    private final ffV rjg;
    private boolean bhZ;

    public eRW(QE qE, Iterator<QD> iterator, ffV ffV2) {
        this.rje = qE;
        this.rjf = iterator;
        this.rjg = ffV2;
        if (iterator == null || ffV2 == null) {
            if (iterator == null) {
                throw new UnsupportedOperationException("checkOut d'un iterator sans liste derri\u00e8re");
            }
            throw new UnsupportedOperationException("checkOut d'un LinkedToItemIterator sans item");
        }
    }

    @Override
    public boolean hasNext() {
        this.bhZ = true;
        if (!this.rjf.hasNext()) {
            return false;
        }
        while (this.rjf.hasNext()) {
            this.bic = this.rjf.next();
            Object EC = this.bic.bbf();
            if (EC == null || EC.bab() != 12 || !(EC instanceof ffV) || ((ffV)EC).LV() != this.rjg.LV()) continue;
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
        this.rjf.remove();
        this.rje.r(this.bic);
    }

    @Override
    public /* synthetic */ Object next() {
        return this.bcs();
    }
}

