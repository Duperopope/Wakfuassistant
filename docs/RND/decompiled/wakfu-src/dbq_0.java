/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from dbQ
 */
public class dbq_0
extends dae_0 {
    private final long odW;
    @Nullable
    private bgx_1 odS;
    @Nullable
    private Long odX;

    public dbq_0(long l) {
        this.odW = l;
    }

    public long eAV() {
        return this.odW;
    }

    @Nullable
    public bgt_0 fbb() {
        if (this.odS != null) {
            return this.odS.dUF();
        }
        if (this.odX != null) {
            return (bgt_0)fcI.ac(bbs_2.xl(), this.odX);
        }
        return null;
    }

    @NotNull
    public List<ffV> fba() {
        if (this.odS != null) {
            return this.odS.dUG();
        }
        if (this.odX != null) {
            ffV ffV2 = fcI.aj(bbs_2.xl(), this.odX);
            return ffV2 != null ? List.of(ffV2) : List.of();
        }
        return List.of();
    }

    public void a(@NotNull bgx_1 bgx_12) {
        this.odS = bgx_12;
    }

    public void oU(long l) {
        this.odX = l;
    }

    @Override
    public int d() {
        return 16793;
    }
}

