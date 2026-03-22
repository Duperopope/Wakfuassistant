/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

class eHG
implements Comparable<eHG> {
    private final long qsP;
    private final ux_0 qsQ;
    private final uw_0 qsR = new uw_0(uw_0.bvJ);

    eHG(long l, ux_0 ux_02) {
        this.qsP = l;
        this.qsQ = ux_02;
    }

    public long xl() {
        return this.qsP;
    }

    public void b(eHC eHC2) {
        this.qsR.f(this.qsQ);
        this.qsR.a(eHC2.fvN());
    }

    public boolean O(ux_0 ux_02) {
        return this.qsR.h(ux_02);
    }

    public int c(@NotNull eHG eHG2) {
        if (eHG2 == null) {
            return 0;
        }
        if (this.qsR.g(eHG2.qsR)) {
            return -1;
        }
        return 1;
    }

    public String toString() {
        return "LevelListElement{m_accountId=" + this.qsP + "}";
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.c((eHG)object);
    }
}

