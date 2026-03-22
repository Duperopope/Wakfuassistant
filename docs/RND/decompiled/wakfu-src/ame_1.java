/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ame
 */
public class ame_1 {
    private int csQ;
    private int bVH;
    private int cHr;
    private final String cHs;

    public ame_1(int n, int n2, int n3, String string) {
        this.csQ = n;
        this.bVH = n2;
        this.cHr = n3;
        this.cHs = string;
    }

    public final int bCQ() {
        return this.csQ;
    }

    public final void td(int n) {
        this.csQ = n;
    }

    public final int bCR() {
        return this.bVH;
    }

    public final void te(int n) {
        this.bVH = n;
    }

    public final int bCS() {
        return this.cHr;
    }

    public final void tf(int n) {
        this.cHr = n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.csQ).append("x").append(this.bVH);
        if (this.cHr > 0) {
            stringBuilder.append(" (").append(this.cHr).append(")");
        }
        if (this.cHs != null && !this.cHs.isEmpty()) {
            stringBuilder.append(" (").append(this.cHs).append(")");
        }
        return stringBuilder.toString();
    }
}

