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
 * Renamed from Rd
 */
public final class rd_0
extends Enum<rd_0>
implements re_0 {
    public static final /* enum */ rd_0 bjA = new rd_0(0);
    public static final /* enum */ rd_0 bjB = new rd_0(1);
    public static final /* enum */ rd_0 bjC = new rd_0(2);
    public static final /* enum */ rd_0 bjD = new rd_0(3);
    public static final /* enum */ rd_0 bjE = new rd_0(4);
    private static final rd_0[] bjF;
    public static final List<rd_0> bjG;
    public static final List<rd_0> bjH;
    public static final int bjI;
    private final byte bjJ;
    private static final /* synthetic */ rd_0[] bjK;

    public static rd_0[] values() {
        return (rd_0[])bjK.clone();
    }

    public static rd_0 valueOf(String string) {
        return Enum.valueOf(rd_0.class, string);
    }

    private rd_0(int n2) {
        this.bjJ = (byte)n2;
    }

    @Override
    public byte aJr() {
        return this.bjJ;
    }

    @Nullable
    public static rd_0 O(byte by) {
        for (rd_0 rd_02 : bjF) {
            if (rd_02.bjJ != by) continue;
            return rd_02;
        }
        return null;
    }

    @Nullable
    public static rd_0 di(@NotNull String string) {
        for (rd_0 rd_02 : bjF) {
            if (!rd_02.name().equalsIgnoreCase(string)) continue;
            return rd_02;
        }
        return null;
    }

    public ra_0<rd_0> T(short s) {
        return new ra_0<rd_0>(this, s);
    }

    private static /* synthetic */ rd_0[] bdr() {
        return new rd_0[]{bjA, bjB, bjC, bjD, bjE};
    }

    static {
        bjK = rd_0.bdr();
        bjF = rd_0.values();
        bjG = List.of(bjB, bjC, bjD);
        bjH = List.of(bjB, bjC, bjD, bjE);
        bjI = bjF.length;
    }
}

