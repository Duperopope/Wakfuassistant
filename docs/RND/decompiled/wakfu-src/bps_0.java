/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bps
 */
public final class bps_0
extends Enum<bps_0> {
    public static final /* enum */ bps_0 iVs = new bps_0("build.sort.name.asc", bpr_1.values());
    public static final /* enum */ bps_0 iVt = new bps_0("build.sort.name.desc", iVs);
    public static final /* enum */ bps_0 iVu = new bps_0("build.sort.level.asc", bpr_1.values());
    public static final /* enum */ bps_0 iVv = new bps_0("build.sort.level.desc", iVu);
    public static final /* enum */ bps_0 iVw = new bps_0("items.sort.rarity.asc", bpr_1.iVm, bpr_1.iVn);
    public static final /* enum */ bps_0 iVx = new bps_0("items.sort.rarity.desc", iVw);
    public static final bps_0[] iVy;
    public static final bps_0 iVz;
    @NotNull
    private final String iVA;
    @Nullable
    private final bps_0 iVB;
    @NotNull
    private final Set<bpr_1> iVC;
    private static final /* synthetic */ bps_0[] iVD;

    public static bps_0[] values() {
        return (bps_0[])iVD.clone();
    }

    public static bps_0 valueOf(String string) {
        return Enum.valueOf(bps_0.class, string);
    }

    private bps_0(String string2, bpr_1 ... bpr_1Array) {
        this.iVA = string2;
        this.iVB = null;
        this.iVC = Arrays.stream(bpr_1Array).collect(Collectors.toSet());
    }

    private bps_0(String string2, bps_0 bps_02) {
        this.iVA = string2;
        this.iVB = bps_02;
        this.iVC = bps_02.iVC;
    }

    @NotNull
    public String clY() {
        return this.iVA;
    }

    @NotNull
    public bps_0 dCQ() {
        return this.iVB == null ? this : this.iVB;
    }

    public boolean a(bpr_1 bpr_12) {
        return this.iVC.contains((Object)bpr_12);
    }

    private static /* synthetic */ bps_0[] dCR() {
        return new bps_0[]{iVs, iVt, iVu, iVv, iVw, iVx};
    }

    static {
        iVD = bps_0.dCR();
        iVy = bps_0.values();
        iVz = iVs;
    }
}

