/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bqp
 */
public class bqp_1 {
    @NotNull
    private bpr_1 iVR;
    @NotNull
    private final Map<bpr_1, bqo_1> iZy = new EnumMap<bpr_1, bqo_1>(bpr_1.class);
    @Nullable
    private bpg_1 iZz;

    @NotNull
    public bpr_1 dEh() {
        return this.iVR;
    }

    public void b(@NotNull bpr_1 bpr_12) {
        this.iVR = bpr_12;
    }

    public bqo_1 d(@NotNull bpr_1 bpr_12) {
        return this.iZy.get((Object)bpr_12);
    }

    public void a(@NotNull bpr_1 bpr_12, @NotNull bqo_1 bqo_12) {
        this.iZy.put(bpr_12, bqo_12);
    }

    @Nullable
    public bpg_1 dEi() {
        return this.iZz;
    }

    public void a(@Nullable bpg_1 bpg_12) {
        this.iZz = bpg_12;
    }

    public String toString() {
        return "EncyclopediaState{m_currentPanel=" + String.valueOf((Object)this.iVR) + ", m_panelStates=" + String.valueOf(this.iZy) + ", m_openMonsterPage=" + String.valueOf(this.iZz) + "}";
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bqp_1 bqp_12 = (bqp_1)object;
        return this.iVR == bqp_12.iVR && Objects.equals(this.iZy, bqp_12.iZy) && Objects.equals(this.iZz, bqp_12.iZz);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.iVR, this.iZy, this.iZz});
    }
}

