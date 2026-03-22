/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashSet;

/*
 * Renamed from QJ
 */
public final class qj_0 {
    public static final ThreadLocal<qj_0> bhM = ThreadLocal.withInitial(qj_0::new);
    private QL bhN;
    private final Collection<qk_0> bhO = new HashSet<qk_0>();

    qj_0() {
    }

    public QL a(int n, long l, long l2) {
        QL qL = new QL(n, l, l2);
        if (this.bhN != null) {
            this.bhN.a(qL);
        }
        this.bhN = qL;
        this.bhO.add(new qk_0(n, l, l2));
        return qL;
    }

    void bcp() {
        QL qL = this.bhN;
        if (this.bhN.bcr() != null) {
            qL.bcr().b(this.bhN);
        }
        this.bhN = this.bhN.bcr();
        this.bhO.remove(new qk_0(qL.aZH(), qL.Qw(), qL.Qy()));
        qL.clear();
    }

    public boolean g(int n, long l) {
        if (this.bhN == null) {
            return false;
        }
        if (this.bhN.aZH() == n && this.bhN.Qy() == l) {
            return true;
        }
        return this.bhN.h(n, l);
    }

    QL bcq() {
        return this.bhN;
    }

    public void clear() {
        this.bhN = null;
        this.bhO.clear();
    }

    public String toString() {
        if (this.bhN == null) {
            return "empty";
        }
        return this.bhN.toString();
    }

    public boolean b(int n, long l, long l2) {
        return this.bhO.contains(new qk_0(n, l, l2));
    }
}

