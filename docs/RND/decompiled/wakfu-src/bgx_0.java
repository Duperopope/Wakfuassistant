/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bgx
 */
public class bgx_0
implements aeh_2 {
    public static final String iaG = "breedInfo";
    public static final String iaH = "enabled";
    private final eym iaI;
    private boolean cHn;
    private int iaJ;

    public bgx_0(eym eym2) {
        this.iaI = eym2;
    }

    public void setEnabled(boolean bl) {
        this.cHn = bl;
    }

    public boolean isEnabled() {
        return this.cHn;
    }

    public void CG(int n) {
        this.iaJ = n;
    }

    public int dju() {
        return this.iaJ;
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    public eym dfW() {
        return this.iaI;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(iaG)) {
            return bfq_2.dge().BO(this.iaI.aWP());
        }
        if (string.equals(iaH)) {
            return this.cHn;
        }
        return null;
    }
}

