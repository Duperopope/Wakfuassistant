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
 * Renamed from bjB
 */
public class bjb_1
implements aeh_2 {
    public static final String ioQ = "value";
    public static final String ioR = "popupText";
    public static final String ioS = "color";
    public static final String[] ioT = new String[]{"value", "popupText", "color"};
    public static final List<exx_2> ioU = List.of(exx_2.rGi, exx_2.rGj, exx_2.rGk, exx_2.rGl, exx_2.rHl, exx_2.rGn, exx_2.rGm, exx_2.rGo, exx_2.rGI, exx_2.rHm, exx_2.rGx, exx_2.rGC, exx_2.rGy, exx_2.rGD, exx_2.rGz, exx_2.rGE, exx_2.rGA, exx_2.rGF);
    @NotNull
    private final exx_2 ioV;
    private final boolean ioW;
    private final int ioX;
    private final int ioY;
    @Nullable
    private Integer ioZ = null;

    public bjb_1(@NotNull exx_2 exx_22, int n, int n2) {
        this.ioV = exx_22;
        this.ioW = ado_1.a(bgy.ibU, exx_22);
        this.ioX = n;
        this.ioY = n2;
    }

    public void x(@Nullable Integer n) {
        this.ioZ = n;
        fse_1.gFu().a((aef_2)this, ioQ);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case ioQ -> {
                if (this.ioZ != null) {
                    if (this.ioW) {
                        yield bjb_1.dt(this.ioZ, this.ioZ);
                    }
                    yield this.Du(this.ioZ);
                }
                if (this.ioW) {
                    yield bjb_1.dt(this.ioX, this.ioY);
                }
                if (this.ioX == this.ioY) {
                    yield this.Du(this.ioX);
                }
                yield this.Du(this.ioX) + bpu.dCT() + this.Du(this.ioY);
            }
            case ioR -> biK.g(this.ioV);
            case ioS -> bih_0.d(this.ioV);
            default -> null;
        };
    }

    private String Du(int n) {
        return aum_0.cWf().cQ(n) + (this.drL() ? "%" : "");
    }

    private boolean drL() {
        return this.ioV == exx_2.rGo || this.ioV == exx_2.rHm;
    }

    @NotNull
    private static String dt(int n, int n2) {
        int n3 = (int)Math.round(100.0 - esr_0.aa(n, false) * 100.0);
        if (n == n2) {
            return String.format("%s %%", n3);
        }
        int n4 = (int)Math.round(100.0 - esr_0.aa(n2, false) * 100.0);
        return String.format("%s %% %s %s %%", n3, bpu.dCT(), n4);
    }

    @Override
    public String[] bxk() {
        return ioT;
    }
}

