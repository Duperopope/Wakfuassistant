/*
 * Decompiled with CFR 0.152.
 */
public class aai {
    public static final String bXU = ".tgam";
    public static final String bXV = "";
    private static final aai bXW = new aai(".tgam", false);
    private final String bXX;
    private final boolean bXY;
    private String bXZ = "";

    protected aai(String string, boolean bl) {
        this.bXX = string;
        this.bXY = bl;
    }

    public static aai bqJ() {
        return bXW;
    }

    public final void ec(String string) {
        this.bXZ = string;
        if (!string.endsWith("/")) {
            this.bXZ = this.bXZ + "/";
        }
    }

    public awk_1 qW(int n) {
        String string = this.qX(n);
        long l = arn_2.fX(string);
        if (this.bXY) {
            return awm_1.bPn().b((art_1)aru_2.cVG.bIv(), l, string, false);
        }
        return awm_1.bPn().a((art_1)aru_2.cVG.bIv(), l, string, false);
    }

    protected final String qX(int n) {
        return fo_0.bB(this.bXZ + n + this.bXX);
    }
}

