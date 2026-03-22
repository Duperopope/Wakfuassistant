/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public final class fjd
extends Enum<fjd> {
    public static final /* enum */ fjd swB = new fjd(rd_0.bjA, 6);
    public static final /* enum */ fjd swC = new fjd(rd_0.bjB, 2);
    public static final /* enum */ fjd swD = new fjd(rd_0.bjC, 3);
    public static final /* enum */ fjd swE = new fjd(rd_0.bjD, 4);
    public static final /* enum */ fjd swF = new fjd(rd_0.bjE, 5);
    public static final /* enum */ fjd swG = new fjd(fjd.swF.swK + 1, 1);
    public static final /* enum */ fjd swH = new fjd(fjd.swG.swK + 1, 0);
    public static final List<fjd> swI;
    public static final int swJ;
    private final int swK;
    private final rd_0 swL;
    private final int swM;
    private static final /* synthetic */ fjd[] swN;

    public static fjd[] values() {
        return (fjd[])swN.clone();
    }

    public static fjd valueOf(String string) {
        return Enum.valueOf(fjd.class, string);
    }

    private fjd(int n2, int n3) {
        this.swK = n2;
        this.swL = null;
        this.swM = n3;
    }

    private fjd(rd_0 rd_02, int n2) {
        this.swK = rd_02.aJr();
        this.swL = rd_02;
        this.swM = n2;
    }

    @NotNull
    public static fjd Wu(int n) {
        for (fjd fjd2 : fjd.values()) {
            if (fjd2.swK != n) continue;
            return fjd2;
        }
        return swB;
    }

    @NotNull
    public static List<fjd> bj(@NotNull List<Integer> list) {
        ArrayList<fjd> arrayList = new ArrayList<fjd>();
        for (Integer n : list) {
            arrayList.add(fjd.Wu(n));
        }
        return arrayList;
    }

    @Generated
    public int d() {
        return this.swK;
    }

    @Generated
    public rd_0 gaH() {
        return this.swL;
    }

    @Generated
    public int dju() {
        return this.swM;
    }

    private static /* synthetic */ fjd[] gaI() {
        return new fjd[]{swB, swC, swD, swE, swF, swG, swH};
    }

    static {
        swN = fjd.gaI();
        swI = List.of(swC, swD, swE, swF);
        swJ = fjd.values().length;
    }
}

