/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.base.Function;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ni
 */
public class ni_2 {
    private final int Ng;
    private final long Nh;

    public ni_2(int n, long l) {
        this.Ng = n;
        this.Nh = l;
    }

    public int apw() {
        return this.Ng;
    }

    public long apx() {
        return this.Nh;
    }

    @NotNull
    public static Function<ni_2, Integer> apu() {
        return new nj_1();
    }

    public String toString() {
        return "HistoryData{m_achievementId=" + this.Ng + ", m_unlockTime=" + this.Nh + "}";
    }
}

