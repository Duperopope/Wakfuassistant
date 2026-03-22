/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class bRh
extends bRf<fcb_0> {
    public static final String kZw = "iconUrl";
    public static final String kZx = "description";
    public static final String kZy = "sidoaNeed";
    public static final String kZz = "buildDelay";
    public static final String kZA = "conditions";
    public static final String kZB = "ressources";
    public static final String[] kZC = bRh.w("iconUrl", "description", "sidoaNeed", "buildDelay", "conditions", "ressources");
    private final cal_1 kZD;

    @Override
    public String[] bxk() {
        return kZC;
    }

    public bRh(@NotNull fcb_0 fcb_02, @NotNull cal_1 cal_12) {
        super(fcb_02);
        this.kZD = cal_12;
    }

    @Override
    public Object eu(String string) {
        Object object = super.eu(string);
        if (object != null) {
            return object;
        }
        if (string.equals(kZw)) {
            return this.kZD.JY(((fcb_0)this.kZu).fRN());
        }
        if (string.equals(kZx)) {
            return aum_0.cWf().a(125, (long)((fcb_0)this.kZu).fSr(), new Object[0]);
        }
        if (string.equals(kZA)) {
            return null;
        }
        return super.eu(string);
    }

    @Override
    public boolean ekx() {
        return this.ein();
    }

    @Override
    public int eky() {
        return 0;
    }

    @Override
    public bRf ekz() {
        bRh bRh2 = new bRh((fcb_0)this.kZu, cal_1.lFY);
        return bRh2;
    }

    @Override
    public bQV ekB() {
        return bQV.kXL;
    }
}

