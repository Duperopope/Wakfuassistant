/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cbK
 */
class cbk_2
implements aeh_2 {
    private final String lKL;
    private final List<String> lKM;
    public static final String lKN = "fontDefinitionName";
    public static final String lKO = "fonts";
    private final String[] lKP = new String[]{"fonts", "fontDefinitionName"};

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public cbk_2(cbi_2 cbi_22, String string, List list) {
        this.lKL = string;
        this.lKM = list;
    }

    @Override
    public String[] bxk() {
        return this.lKP;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (lKN.equals(string)) {
            return this.lKL;
        }
        if (lKO.equals(string)) {
            return this.lKM;
        }
        return null;
    }

    public String ess() {
        return this.lKL;
    }
}

