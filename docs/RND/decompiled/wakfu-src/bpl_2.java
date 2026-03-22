/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bPL
 */
public class bpl_2
implements aeh_2 {
    public static final String kSG = "currency";
    public static final String kSH = "currencyId";
    public static final String kSI = "value";
    public static final String kSJ = "description";
    private final bpp_2 kSK;
    private final bpa_2 kSL;

    public bpl_2(bpa_2 bpa_22, bpp_2 bpp_22) {
        this.kSL = bpa_22;
        this.kSK = bpp_22;
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kSG)) {
            return this.kSL.byf();
        }
        if (string.equals(kSH)) {
            return this.kSL.aJr();
        }
        if (string.equals(kSI)) {
            return this.kSK.a(this.kSL);
        }
        if (string.equals(kSJ)) {
            return this.kSL.getDescription();
        }
        return null;
    }

    void eiP() {
        fse_1.gFu().a((aef_2)this, kSI);
    }

    public bpa_2 ehX() {
        return this.kSL;
    }

    public String toString() {
        return "WalletEntry{m_currency=" + String.valueOf((Object)this.kSL) + "}";
    }
}

