/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;

/*
 * Renamed from fTD
 */
public class ftd_2
implements ftb_2 {
    private final String vgG;
    private final String vgH;
    private final Class<?> vgI;
    private final ArrayList<String> vgJ = new ArrayList();

    public ftd_2(Class<?> clazz, String string, String string2, String ... stringArray) {
        this.vgG = string;
        this.vgH = string2;
        this.vgI = clazz;
        Collections.addAll(this.vgJ, stringArray);
    }

    @Override
    public Class<?> gBQ() {
        return this.vgI;
    }

    @Override
    public String a(ftf_2 ftf_22) {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.vgH != null) {
            if (this.vgI != null) {
                stringBuilder.append("((").append(this.vgI.getSimpleName()).append(")");
            }
            stringBuilder.append(this.vgH);
            if (this.vgI != null) {
                stringBuilder.append(")");
            }
            stringBuilder.append(".");
        }
        stringBuilder.append(this.vgG).append("(");
        boolean bl = true;
        for (String string : this.vgJ) {
            if (!bl) {
                stringBuilder.append(", ");
            } else {
                bl = false;
            }
            stringBuilder.append(string);
        }
        stringBuilder.append(");");
        return stringBuilder.toString();
    }
}

