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
 * Renamed from ne
 */
public class ne_2 {
    private final int MZ;
    private boolean Na;
    private boolean Nb;
    private boolean Nc;
    private Long Nd;
    private Long Ne;

    public ne_2(int n, boolean bl, boolean bl2, Long l, Long l2, boolean bl3) {
        this.MZ = n;
        this.Na = bl;
        this.Nb = bl2;
        this.Nd = l;
        this.Ne = l2;
        this.Nc = bl3;
    }

    public int d() {
        return this.MZ;
    }

    public boolean apo() {
        return this.Na;
    }

    public boolean app() {
        return this.Nb;
    }

    public Long apq() {
        return this.Nd;
    }

    public Long apr() {
        return this.Ne;
    }

    public boolean aps() {
        return this.Ne != null && this.Ne > 0L;
    }

    public boolean apt() {
        return this.Nd != null && this.Nd > 0L;
    }

    @NotNull
    public static Function<ne_2, Integer> apu() {
        return new nf_2();
    }

    public void T(boolean bl) {
        this.Na = bl;
    }

    public void U(boolean bl) {
        this.Nb = bl;
    }

    public void a(Long l) {
        this.Nd = l;
    }

    public void b(Long l) {
        this.Ne = l;
    }

    public boolean apv() {
        return this.Nc;
    }

    public String toString() {
        return "AchievementData{m_id=" + this.MZ + ", m_active=" + this.Na + ", m_complete=" + this.Nb + ", m_lastCompletedTime=" + this.Nd + ", m_startTime=" + this.Ne + "}";
    }
}

