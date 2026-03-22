/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fpG
 */
public final class fpg_0 {
    private int sQw;
    private int sQx;
    private int sQy;
    private int sQz;
    private fpp_0 sQA;
    private fpp_0 sQB;
    private int sQC;

    public void YD(int n) {
        this.sQw = n;
    }

    public void YE(int n) {
        this.sQx = n;
    }

    public void YF(int n) {
        this.sQz = n;
    }

    public void g(fpp_0 fpp_02) {
        this.sQB = fpp_02;
    }

    public void YG(int n) {
        this.sQy = n;
    }

    public void h(fpp_0 fpp_02) {
        this.sQA = fpp_02;
    }

    public void YH(int n) {
        this.sQC = n;
    }

    public int ghe() {
        return this.sQw;
    }

    public int ghf() {
        return this.sQx;
    }

    public int ghg() {
        return this.sQy;
    }

    public int ghh() {
        return this.sQz;
    }

    public fpp_0 ghi() {
        return this.sQA;
    }

    @Nullable
    public fpp_0 ghj() {
        return this.sQB;
    }

    public int ghk() {
        return this.sQC;
    }

    public String toString() {
        return "PlayerReportInfo{m_previousStrength=" + this.sQw + ", m_currentStrength=" + this.sQx + ", m_previousRanking=" + this.sQy + ", m_currentRanking=" + this.sQz + ", m_previousRank=" + String.valueOf(this.sQA) + ", m_currentRank=" + String.valueOf(this.sQB) + "}";
    }
}

