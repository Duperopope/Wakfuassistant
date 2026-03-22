/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from blx
 */
public class blx_0
implements aeh_2 {
    public static final String iuP = "hero";
    public static final String iuQ = "remainingTime";
    public static final String iuR = "aevId";
    public static final String iuS = "isUpgraded";
    private final byte iuT;
    private bgl_0 iuU;

    blx_0(byte by) {
        this.iuT = by;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(iuP)) {
            return this.iuU;
        }
        if (string.equals(iuQ)) {
            return this.dtQ();
        }
        if (string.equals(iuR)) {
            return this.dtN();
        }
        if (string.equals(iuS)) {
            return this.dtP();
        }
        return null;
    }

    public String dtN() {
        return "heroAEV" + this.iuT;
    }

    public bgl_0 dtO() {
        return this.iuU;
    }

    public void a(bgl_0 bgl_02) {
        this.iuU = bgl_02;
    }

    public boolean dtP() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        boolean bl = fcI.fSO();
        evd_2 evd_22 = bgt_02.dpL();
        boolean bl2 = evd_22.b(evv_1.oxo);
        return bl || bl2;
    }

    private String dtQ() {
        aUQ aUQ2 = aue_0.cVJ().cVO();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        boolean bl = fcI.fSO();
        long l = aUQ2.cWo();
        evd_2 evd_22 = bgt_02.dpL();
        boolean bl2 = evd_22.b(evv_1.oxo);
        if (bl || !bl2) {
            return "";
        }
        String string = aUQ2.iB(l);
        return string == null ? "" : string;
    }

    public String toString() {
        return "HeroSlot{m_index=" + this.iuT + ", m_hero=" + String.valueOf(this.iuU) + "}";
    }
}

