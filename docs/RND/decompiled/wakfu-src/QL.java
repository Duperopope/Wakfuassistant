/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;

public final class QL {
    private final int bhS;
    private final long bhT;
    private final long bhU;
    private final Collection<QL> bhV = new ArrayList<QL>();
    private QL bhW;

    QL(int n, long l, long l2) {
        this.bhS = n;
        this.bhT = l;
        this.bhU = l2;
    }

    void a(QL qL) {
        this.bhV.add(qL);
        qL.bhW = this;
    }

    boolean b(QL qL) {
        return this.bhV.remove(qL);
    }

    boolean h(int n, long l) {
        if (this.bhW == null) {
            return false;
        }
        if (this.bhW.bhS == n && this.bhW.bhU == l) {
            return true;
        }
        return this.bhW.h(n, l);
    }

    boolean c(int n, long l, long l2) {
        if (this.bhW == null) {
            return false;
        }
        if (this.bhW.bhS == n && this.bhW.bhU == l && this.bhW.bhT == l2) {
            return true;
        }
        return this.bhW.c(n, l, l2);
    }

    public boolean c(QL qL) {
        return this.bhV.contains(qL);
    }

    public int aZH() {
        return this.bhS;
    }

    public QL bcr() {
        return this.bhW;
    }

    public long Qy() {
        return this.bhU;
    }

    public long Qw() {
        return this.bhT;
    }

    public void clear() {
        this.bhW = null;
        this.bhV.clear();
    }

    public String toString() {
        if (this.bhW == null) {
            return this.bhS + "( casterId = " + this.bhT + "), ( targetId = " + this.bhU + ")";
        }
        return this.bhS + "( casterId = " + this.bhT + "), ( targetId = " + this.bhU + ") <- " + this.bhW.toString();
    }
}

