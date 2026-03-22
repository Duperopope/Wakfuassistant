/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fTE
 */
public class fte_2
implements ftb_2 {
    private final Class<?> vgK;
    private final String vgL;
    private final String vgM;
    private final boolean vgN;

    public fte_2(Class<?> clazz, String string, String string2) {
        this(clazz, string, string2, false);
    }

    public fte_2(Class<?> clazz, String string, String string2, boolean bl) {
        this.vgK = clazz;
        this.vgL = string;
        this.vgM = string2;
        this.vgN = bl;
    }

    @Override
    public Class<?> gBQ() {
        return this.vgK;
    }

    @Override
    public String a(ftf_2 ftf_22) {
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.vgN && !ftf_22.wt(this.vgL)) {
            ftf_22.wu(this.vgL);
            stringBuilder.append(this.vgK.getSimpleName()).append(' ');
        }
        stringBuilder.append(this.vgL).append(" = ");
        stringBuilder.append("(").append(this.vgK.getSimpleName()).append(") ");
        stringBuilder.append(this.vgM).append(';');
        return stringBuilder.toString();
    }
}

