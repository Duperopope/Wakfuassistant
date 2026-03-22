/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bNh
 */
public class bnh_2
implements aeh_2,
fgf_0 {
    private final int kAJ;
    private final ffV kAK;
    private final int kAL;
    private boolean bWn;
    private boolean kAM;
    public static final String kAN = "reward";
    public static final String kAO = "quantity";
    public static final String kAP = "selected";
    public static final String kAQ = "canBeSelected";

    public bnh_2(int n, ffV ffV2, int n2) {
        this.kAJ = n;
        this.kAK = ffV2;
        this.kAL = n2;
    }

    @Override
    public String[] bxk() {
        return new String[]{kAN, kAO, kAP, kAQ};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "reward": {
                return this.kAK;
            }
            case "quantity": {
                return this.kAL;
            }
            case "selected": {
                return this.bWn;
            }
            case "canBeSelected": {
                return this.kAM;
            }
        }
        return null;
    }

    public int azt() {
        return this.kAJ;
    }

    public boolean bqr() {
        return this.bWn;
    }

    public void efw() {
        this.bWn = !this.bWn;
        fse_1.gFu().a((aef_2)this, kAP, kAQ);
    }

    public void setSelected(boolean bl) {
        if (bl == this.bqr()) {
            return;
        }
        this.bWn = bl;
        fse_1.gFu().a((aef_2)this, kAP, kAQ);
    }

    public boolean efx() {
        return this.kAM;
    }

    public void ig(boolean bl) {
        if (bl == this.kAM) {
            return;
        }
        this.kAM = bl;
        fse_1.gFu().a((aef_2)this, kAQ);
    }

    @Override
    public ffV getItem() {
        return this.kAK;
    }
}

