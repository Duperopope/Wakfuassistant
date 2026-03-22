/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cTn
 */
class ctn_1
implements aeh_2 {
    public static final String nIG = "bufferingDesc";
    public static final String nIH = "modulationColor";
    float nII = -1.0f;
    String nIJ;
    String nIK;
    private final cto_1 nIL = new cto_1(this);

    ctn_1() {
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (nIG.equals(string)) {
            if (this.nII < 0.0f || this.nII == 100.0f) {
                return null;
            }
            return this.nIJ;
        }
        if (nIH.equals(string)) {
            return this.nIK;
        }
        return null;
    }

    public cto_1 ePA() {
        return this.nIL;
    }
}

