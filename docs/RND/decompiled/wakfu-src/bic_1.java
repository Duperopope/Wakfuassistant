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
 * Renamed from bIc
 */
public final class bic_1
extends Enum<bic_1>
implements aeh_2 {
    public static final /* enum */ bic_1 kdP = new bic_1(0);
    public static final /* enum */ bic_1 kdQ = new bic_1(1);
    public static final /* enum */ bic_1 kdR = new bic_1(5);
    public static final /* enum */ bic_1 kdS = new bic_1(2);
    public static final /* enum */ bic_1 kdT = new bic_1(3);
    public static final /* enum */ bic_1 kdU = new bic_1(4);
    public static final String kdV = "name";
    public static final List<bic_1> kdW;
    public static final bic_1 kdX;
    public static final List<bic_1> kdY;
    public static final bic_1 kdZ;
    private static final bic_1[] kea;
    private final int keb;
    private static final /* synthetic */ bic_1[] kec;

    public static bic_1[] values() {
        return (bic_1[])kec.clone();
    }

    public static bic_1 valueOf(String string) {
        return Enum.valueOf(bic_1.class, string);
    }

    private bic_1(int n2) {
        this.keb = n2;
    }

    public int d() {
        return this.keb;
    }

    @NotNull
    public static bic_1 GV(int n) {
        for (bic_1 bic_12 : kea) {
            if (bic_12.keb != n) continue;
            return bic_12;
        }
        return kdQ;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kdV)) {
            return aum_0.cWf().c("market.options.keepFieldMode." + this.keb, new Object[0]);
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return new String[]{kdV};
    }

    private static /* synthetic */ bic_1[] dXo() {
        return new bic_1[]{kdP, kdQ, kdR, kdS, kdT, kdU};
    }

    static {
        kec = bic_1.dXo();
        kdW = List.of(kdP, kdR, kdQ, kdU);
        kdX = kdP;
        kdY = List.of(kdP, kdR, kdQ, kdS, kdT);
        kdZ = kdQ;
        kea = bic_1.values();
    }
}

