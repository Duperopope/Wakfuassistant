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
 * Renamed from fTf
 */
public class ftf_1 {
    private static final axb_2 vft = awx_2.dnG;
    private static final axb_2 vfu = awx_2.dnH;
    @NotNull
    private final List<Float> vfv;
    private final float @NotNull [] vfw;
    private final float @NotNull [] vfx;

    public ftf_1(@Nullable List<Float> list, @Nullable axb_2 axb_22, @Nullable axb_2 axb_23) {
        this.vfv = list != null ? list : List.of();
        this.vfw = (axb_22 != null ? axb_22 : vft).bQj();
        this.vfx = (axb_23 != null ? axb_23 : vfu).bQj();
    }

    public float acg(int n) {
        if (n >= this.vfv.size()) {
            return 0.0f;
        }
        return this.vfv.get(n).floatValue();
    }

    public float @NotNull [] gGB() {
        return this.vfw;
    }

    public float @NotNull [] gGC() {
        return this.vfx;
    }
}

