/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bZx
 */
final class bzx_1 {
    final int lDo;
    final int lDp;
    final int lDq;
    final int lDr;
    final int lDs;

    bzx_1(int n, int n2, int n3, int n4) {
        this.lDo = n;
        this.lDp = n2;
        this.lDq = n3;
        this.lDr = n4;
        this.lDs = this.lDo + this.lDp + this.lDq + this.lDr;
    }

    @NotNull
    aca eqa() {
        return new acc(this.lDo, this.lDp, this.lDq, this.lDr);
    }

    public String toString() {
        return "Duration{m_waitDuration=" + this.lDo + ", m_startDuration=" + this.lDp + ", m_middleDuration=" + this.lDq + ", m_endDuration=" + this.lDr + ", m_totalDuration=" + this.lDs + "}";
    }
}

