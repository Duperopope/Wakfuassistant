/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpt
 */
public class bpt_0
implements aeh_2 {
    public static final String iVE = "text";
    public static final String iVF = "selected";
    public static final String iVG = "hasTopMargin";
    @NotNull
    private final bps_0 iVH;
    private boolean bWn = false;

    public bpt_0(@NotNull bps_0 bps_02) {
        this.iVH = bps_02;
    }

    @NotNull
    public bps_0 dCS() {
        return this.iVH;
    }

    public void a(@NotNull bps_0 bps_02) {
        this.bWn = bps_02 == this.iVH;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iVE -> aum_0.cWf().c(this.iVH.clY(), new Object[0]);
            case iVF -> this.bWn;
            case iVG -> this.iVH != bps_0.iVs && this.iVH == this.iVH.dCQ();
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return new String[]{iVE, iVF, iVG};
    }
}

