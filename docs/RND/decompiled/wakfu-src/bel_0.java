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
 * Renamed from bEL
 */
public class bel_0
implements aeh_2 {
    public static final String jRm = "referenceItem";
    public static final String jRn = "quantity";
    public static final String[] jRo = new String[]{"referenceItem", "quantity"};
    @NotNull
    public bgv_2 iDU;
    public long eCL;

    public bel_0(@NotNull bgv_2 bgv_22, long l) {
        this.iDU = bgv_22;
        this.eCL = l;
    }

    @NotNull
    public bgv_2 duo() {
        return this.iDU;
    }

    public long aBF() {
        return this.eCL;
    }

    @Override
    public String[] bxk() {
        String[] stringArray = new String[jRo.length + beg_1.jQY.length];
        System.arraycopy(jRo, 0, stringArray, 0, jRo.length);
        System.arraycopy(beg_1.jQY, 0, stringArray, jRo.length, beg_1.jQY.length);
        return stringArray;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "referenceItem": {
                return this.iDU;
            }
            case "quantity": {
                return this.eCL;
            }
            case "name": {
                Object object = this.iDU.dSz().eu(string);
                if (this.eCL > 1L && object != null) {
                    return String.format("%s x %d", object, this.aBF());
                }
                return object;
            }
        }
        return this.iDU.dSz().eu(string);
    }
}

