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
 * Renamed from bDK
 */
public class bdk_0
implements aeh_2 {
    public static final String jLl = "masteries";
    public static final String jLm = "resistances";
    public static final String jLn = "canValidateElements";
    public static final String[] jLo = new String[]{"masteries", "resistances", "canValidateElements"};
    @NotNull
    private final ffV jLp;
    private final bez_0 jLq;
    private final bez_0 jLr;

    public bdk_0(@NotNull ffV ffV2) {
        this.jLp = ffV2;
        this.jLq = bez_0.c(ffV2, enf_0.qPQ.d());
        this.jLr = bez_0.c(ffV2, enf_0.qPR.d());
    }

    @NotNull
    public ffV getItem() {
        return this.jLp;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case jLl -> this.jLq;
            case jLm -> this.jLr;
            case jLn -> this.dRp();
            default -> null;
        };
    }

    public byte dRl() {
        return this.jLq.dTg();
    }

    public int dRm() {
        return this.jLq.bxW();
    }

    public byte dRn() {
        return this.jLr.dTg();
    }

    public int dRo() {
        return this.jLr.bxW();
    }

    public boolean dRp() {
        return this.jLq.dRp() && this.jLr.dRp();
    }

    public boolean dBJ() {
        if (this.jLp.fWs()) {
            return true;
        }
        fgy_0 fgy_02 = this.jLp.eAX();
        if (fgy_02 == null) {
            return true;
        }
        byte by = fgy_02.Vh(enf_0.qPQ.d());
        byte by2 = fgy_02.Vh(enf_0.qPR.d());
        return by != this.jLq.dTg() || by2 != this.jLr.dTg();
    }

    @Override
    public String[] bxk() {
        return jLo;
    }
}

