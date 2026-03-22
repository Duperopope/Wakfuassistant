/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKH
 */
public class bkh_0
implements aeh_2 {
    public static final String kpH = "name";
    public static final String kpI = "buildingTexture";
    public static final String kpJ = "textureSize";
    public static final String[] kpK = new String[]{"name", "buildingTexture", "textureSize"};
    private static final fsm_1 kpL = new fsm_1(48, 48);
    @NotNull
    private final ftq_0 kpM;
    @Nullable
    private final awk_1 kpN;

    public bkh_0(@NotNull ftq_0 ftq_02) {
        this.kpM = ftq_02;
        this.kpN = cal_1.lFY.JZ(this.ebK().glK());
    }

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{kpH, kpI, kpJ}, (Object)string2, n)) {
            case 0 -> this.getName();
            case 1 -> this.kpN;
            case 2 -> this.ebL();
            default -> null;
        };
    }

    public int ebJ() {
        return this.kpM.cZa();
    }

    public String getName() {
        return Integer.toString(this.kpM.cZa());
    }

    public String dah() {
        return Integer.toString(this.kpM.cZa());
    }

    private fts_0 ebK() {
        return this.kpM.glZ();
    }

    private fsm_1 ebL() {
        if (this.kpN == null) {
            return kpL;
        }
        acc_1 acc_12 = this.kpN.bQs();
        if (acc_12.bWx() == acc_12.bWy()) {
            if (acc_12.bWx() < bkh_0.kpL.width) {
                return new fsm_1(acc_12.bWx(), acc_12.bWy());
            }
            return kpL;
        }
        if (acc_12.bWx() > acc_12.bWy()) {
            if (acc_12.bWx() < bkh_0.kpL.width) {
                return new fsm_1(acc_12.bWx(), acc_12.bWy());
            }
            return new fsm_1(bkh_0.kpL.width, (int)((float)acc_12.bWy() * (float)bkh_0.kpL.width / (float)acc_12.bWx()));
        }
        if (acc_12.bWy() < bkh_0.kpL.height) {
            return new fsm_1(acc_12.bWx(), acc_12.bWy());
        }
        return new fsm_1((int)((float)acc_12.bWx() * (float)bkh_0.kpL.height / (float)acc_12.bWy()), bkh_0.kpL.height);
    }

    @Override
    public String[] bxk() {
        return kpK;
    }
}

