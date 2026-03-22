/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bqe
 */
public final class bqe_0
extends Enum<bqe_0> {
    public static final /* enum */ bqe_0 iYS = new bqe_0(null);
    public static final /* enum */ bqe_0 iYT = new bqe_0(ezj_0.puo);
    public static final /* enum */ bqe_0 iYU = new bqe_0(ezj_0.psY);
    public static final /* enum */ bqe_0 iYV = new bqe_0(ezj_0.psW);
    public static final /* enum */ bqe_0 iYW = new bqe_0(ezj_0.ptc);
    private static final bqe_0[] iYX;
    private static final Set<ezj_0> iYY;
    @Nullable
    private final ezj_0 iYZ;
    private static final /* synthetic */ bqe_0[] iZa;

    public static bqe_0[] values() {
        return (bqe_0[])iZa.clone();
    }

    public static bqe_0 valueOf(String string) {
        return Enum.valueOf(bqe_0.class, string);
    }

    private bqe_0(ezj_0 ezj_02) {
        this.iYZ = ezj_02;
    }

    @NotNull
    public String gP(boolean bl) {
        return aum_0.cWf().c("encyclopedia.monster.type." + this.name(), bl ? 1 : 0);
    }

    @Nullable
    public ezj_0 dDU() {
        return this.iYZ;
    }

    public static boolean u(Collection<ezj_0> collection) {
        for (ezj_0 ezj_02 : collection) {
            if (!iYY.contains(ezj_02)) continue;
            return true;
        }
        return false;
    }

    @NotNull
    public static bqe_0 a(@NotNull EnumSet<ezj_0> enumSet) {
        for (bqe_0 bqe_02 : iYX) {
            if (bqe_02.iYZ == null || !enumSet.contains(bqe_02.iYZ)) continue;
            return bqe_02;
        }
        return iYS;
    }

    private static /* synthetic */ bqe_0[] dDW() {
        return new bqe_0[]{iYS, iYT, iYU, iYV, iYW};
    }

    static {
        iZa = bqe_0.dDW();
        iYX = bqe_0.values();
        iYY = Arrays.stream(iYX).map(bqe_0::dDU).filter(Objects::nonNull).collect(Collectors.toCollection(() -> EnumSet.noneOf(ezj_0.class)));
    }
}

