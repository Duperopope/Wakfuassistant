/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from buE
 */
public class bue_0
implements aeh_2 {
    public static final String jqj = "smiley";
    public static final String jqk = "animName";
    private final buf_0 jql;
    private ZG icq;
    private static final Map<buf_0, bue_0> jqm = new HashMap<buf_0, bue_0>();

    public static bue_0 a(short s, byte by, int n) {
        buf_0 buf_02 = new buf_0(s, by, n);
        bue_0 bue_02 = jqm.get(buf_02);
        if (bue_02 == null) {
            bue_02 = new bue_0(buf_02);
            jqm.put(buf_02, bue_02);
        }
        return bue_02;
    }

    private bue_0(buf_0 buf_02) {
        this.jql = buf_02;
        this.bkZ();
    }

    private void bkZ() {
        VI vI = VI.pX(this.jql.dJk());
        this.icq = bue_0.a(vI != null ? vI : VI.bJF, this.jql.aWP(), this.jql.aWO());
    }

    protected static String d(short s, byte by) {
        return "Smiley_" + s + by;
    }

    @Nullable
    private static ZG a(@NotNull VI vI, short s, byte by) {
        ZG zG = new ZG(aym_2.bSE());
        String string = bue_0.d(s, by);
        try {
            zG.k(String.format(auc_0.cVq().bS("playerGfxPath"), string), true);
        }
        catch (fu_0 | IOException exception) {
            return null;
        }
        zG.dP(string);
        zG.dT(vI.bkI());
        zG.bQ(0.0f);
        bft_2 bft_22 = bft_2.dgp();
        aro_1 aro_12 = zG.bqd();
        bjc_1 bjc_12 = new bjc_1(bft_22.d(s, by));
        aro_12.b(arx_1.cTt, bjc_12.dqY());
        bjc_1 bjc_13 = new bjc_1(bft_22.c(s, by));
        aro_12.b(arx_1.cTs, bjc_13.dqY());
        if (bft_22.f(s, by)) {
            bjc_1 bjc_14 = new bjc_1(bft_22.e(s, by));
            aro_12.b(arx_1.cTz, bjc_14.dqY());
        }
        aro_12.btE();
        return zG;
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(jqj)) {
            return this.icq;
        }
        if (string.equals(jqk)) {
            return this.icq == null ? null : this.icq.bkI();
        }
        return null;
    }

    public int dJk() {
        return this.jql.dJk();
    }
}

