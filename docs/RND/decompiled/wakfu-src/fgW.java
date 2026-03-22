/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public final class fgW
extends Enum<fgW>
implements aoq_1 {
    public static final /* enum */ fgW smf = new fgW(0, "Non li\u00e9", false, false, false);
    public static final /* enum */ fgW smg = new fgW(1, "Li\u00e9 au personnage quand \u00e9quip\u00e9", true, false, false);
    public static final /* enum */ fgW smh = new fgW(2, "Li\u00e9 au personnage quand ramass\u00e9", true, true, false);
    public static final /* enum */ fgW smi = new fgW(3, "Li\u00e9 au compte quand \u00e9quip\u00e9", false, false, false);
    public static final /* enum */ fgW smj = new fgW(4, "Li\u00e9 au compte quand ramass\u00e9", false, true, false);
    public static final /* enum */ fgW smk = new fgW(5, "Ne pas utiliser", true, false, true);
    public static final /* enum */ fgW sml = new fgW(6, "Ne pas utiliser", true, true, true);
    public static final /* enum */ fgW smm = new fgW(7, "Ne pas utiliser", false, false, true);
    public static final /* enum */ fgW smn = new fgW(8, "Ne pas utiliser", false, true, true);
    private final byte smo;
    private final String smp;
    private final boolean smq;
    private final boolean smr;
    private final boolean sms;
    private final String smt;
    private static final /* synthetic */ fgW[] smu;

    public static fgW[] values() {
        return (fgW[])smu.clone();
    }

    public static fgW valueOf(String string) {
        return Enum.valueOf(fgW.class, string);
    }

    private fgW(int n2, String string2, boolean bl, boolean bl2, boolean bl3) {
        this.smq = bl;
        this.smr = bl2;
        this.sms = bl3;
        this.smo = GC.ct(n2);
        this.smp = string2;
        this.smt = n2 == 0 ? "item.not.bound" : fgW.t(this.smr, this.smq);
    }

    private static String t(boolean bl, boolean bl2) {
        return "itemBoundType." + (bl2 ? "character" : "account") + "." + (bl ? "pickup" : "equip");
    }

    public byte aJr() {
        return this.smo;
    }

    public boolean bKa() {
        return this.sms;
    }

    public boolean fXw() {
        return this.smr;
    }

    public boolean fXx() {
        return this.smq;
    }

    public String clY() {
        return this.smt;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.smo);
    }

    @Override
    public String aXB() {
        return this.smp;
    }

    @Override
    public String aXC() {
        return "";
    }

    @NotNull
    public static fgW go(byte by) {
        for (fgW fgW2 : fgW.values()) {
            if (fgW2.smo != by) continue;
            return fgW2;
        }
        return smf;
    }

    public static fgW u(boolean bl, boolean bl2) {
        return fgW.e(bl, bl2, false);
    }

    public static fgW e(boolean bl, boolean bl2, boolean bl3) {
        for (fgW fgW2 : fgW.values()) {
            if (fgW2.smq != bl2 || fgW2.smr != bl || fgW2.sms != bl3) continue;
            return fgW2;
        }
        return null;
    }

    public static fgW a(fgW fgW2, fgW fgW3) {
        if (fgW2 == null && fgW3 == null) {
            throw new IllegalStateException("Trying to compare 2 null bind types");
        }
        if (fgW2 == null || fgW2 == smf) {
            return fgW3;
        }
        if (fgW3 == null || fgW3 == smf) {
            return fgW2;
        }
        if (fgW2 == fgW3) {
            return fgW2;
        }
        if (fgW2.smq && !fgW3.smq) {
            return fgW2;
        }
        if (fgW3.smq && !fgW2.smq) {
            return fgW3;
        }
        if (fgW2 == smj && fgW3 == smi) {
            return fgW2;
        }
        if (fgW3 == smj && fgW2 == smi) {
            return fgW2;
        }
        throw new IllegalStateException("Comparison between two binds but we can't define which is stronger, bind1 : " + String.valueOf(fgW2) + ", bind2 : " + String.valueOf(fgW3));
    }

    public String toString() {
        return "ItemBindType{m_id=" + this.smo + ", m_desc='" + this.smp + "', m_character=" + this.smq + ", m_onPickup=" + this.smr + ", m_isForced=" + this.sms + ", m_translationKey='" + this.smt + "'}";
    }

    private static /* synthetic */ fgW[] fXy() {
        return new fgW[]{smf, smg, smh, smi, smj, smk, sml, smm, smn};
    }

    static {
        smu = fgW.fXy();
    }
}

