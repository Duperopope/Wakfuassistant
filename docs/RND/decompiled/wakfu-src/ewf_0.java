/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ewF
 */
public final class ewf_0
extends Enum<ewf_0> {
    public static final /* enum */ ewf_0 oIw = new ewf_0(0, "admin_channel");
    public static final /* enum */ ewf_0 oIx = new ewf_0(1, "all_channel");
    public static final /* enum */ ewf_0 oIy = new ewf_0(3, "trade");
    public static final /* enum */ ewf_0 oIz = new ewf_0(4, "community", Mv.aVk);
    public static final /* enum */ ewf_0 oIA = new ewf_0(5, "community", Mv.aVl);
    public static final /* enum */ ewf_0 oIB = new ewf_0(6, "community", Mv.aVm);
    public static final /* enum */ ewf_0 oIC = new ewf_0(7, "community", Mv.aVn);
    public static final /* enum */ ewf_0 oID = new ewf_0(8, "recruitment", Mv.aVk);
    public static final /* enum */ ewf_0 oIE = new ewf_0(9, "recruitment", Mv.aVl);
    public static final /* enum */ ewf_0 oIF = new ewf_0(10, "recruitment", Mv.aVm);
    public static final /* enum */ ewf_0 oIG = new ewf_0(11, "recruitment", Mv.aVn);
    public static final List<ewf_0> oIH;
    public static final List<ewf_0> oII;
    private final int oIJ;
    private final String oIK;
    private final Mv oIL;
    private static final /* synthetic */ ewf_0[] oIM;

    public static ewf_0[] values() {
        return (ewf_0[])oIM.clone();
    }

    public static ewf_0 valueOf(String string) {
        return Enum.valueOf(ewf_0.class, string);
    }

    private ewf_0(int n2, String string2) {
        this(n2, string2, null);
    }

    private ewf_0(int n2, String string2, Mv mv) {
        this.oIJ = n2;
        this.oIK = string2;
        this.oIL = mv;
    }

    public int d() {
        return this.oIJ;
    }

    public String ffb() {
        return this.oIK;
    }

    public Mv aUXX() {
        return this.oIL;
    }

    @Nullable
    public static ewf_0 Ow(int n) {
        for (ewf_0 ewf_02 : ewf_0.values()) {
            if (ewf_02.oIJ != n) continue;
            return ewf_02;
        }
        return null;
    }

    public boolean cak() {
        switch (this.ordinal()) {
            case 0: 
            case 1: {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public static ewf_0 ex(byte by) {
        for (ewf_0 ewf_02 : oIH) {
            if (ewf_02.oIL.aJr() != by) continue;
            return ewf_02;
        }
        return null;
    }

    @Nullable
    public static ewf_0 ey(byte by) {
        for (ewf_0 ewf_02 : oII) {
            if (ewf_02.oIL.aJr() != by) continue;
            return ewf_02;
        }
        return null;
    }

    private static /* synthetic */ ewf_0[] ffc() {
        return new ewf_0[]{oIw, oIx, oIy, oIz, oIA, oIB, oIC, oID, oIE, oIF, oIG};
    }

    static {
        oIM = ewf_0.ffc();
        oIH = List.of(oIz, oIA, oIB, oIC);
        oII = List.of(oID, oIE, oIF, oIG);
    }
}

