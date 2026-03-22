/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eTQ
 */
public class etq_0
implements Comparable {
    private Long rqr;
    private Short rqs;
    protected static final Logger rqt = Logger.getLogger(etq_0.class);

    public etq_0(Long l, Short s) {
        this.rqr = l;
        this.rqs = s;
    }

    public Long fJu() {
        return this.rqr;
    }

    public void M(Long l) {
        this.rqr = l;
    }

    public Short fJv() {
        return this.rqs;
    }

    public void k(Short s) {
        this.rqs = s;
    }

    public int compareTo(@NotNull Object object) {
        if (!(object instanceof etq_0)) {
            throw new ClassCastException();
        }
        etq_0 etq_02 = (etq_0)object;
        int n = this.rqs.compareTo(etq_02.fJv());
        return n;
    }

    public boolean equals(Object object) {
        if (!(object instanceof etq_0)) {
            return false;
        }
        etq_0 etq_02 = (etq_0)object;
        return this.fJu().equals(etq_02.fJu());
    }
}

