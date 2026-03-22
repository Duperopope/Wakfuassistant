/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aCi
 */
public class aci_1 {
    public static final int dAu = 16;
    public int cuQ;
    public int cuR;
    public int cuS;
    public int cuT;

    public aci_1(aci_1 aci_12) {
        this.d(aci_12);
    }

    public aci_1(int n, int n2, int n3, int n4) {
        this.y(n, n2, n3, n4);
    }

    public aci_1() {
        this.cuQ = Integer.MIN_VALUE;
        this.cuR = Integer.MAX_VALUE;
        this.cuS = Integer.MIN_VALUE;
        this.cuT = Integer.MAX_VALUE;
    }

    public final ByteBuffer eW(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.cuQ);
        byteBuffer.putInt(this.cuS);
        byteBuffer.putInt(this.cuR);
        byteBuffer.putInt(this.cuT);
        return byteBuffer;
    }

    public final ByteBuffer eX(ByteBuffer byteBuffer) {
        this.cuQ = byteBuffer.getInt();
        this.cuS = byteBuffer.getInt();
        this.cuR = byteBuffer.getInt();
        this.cuT = byteBuffer.getInt();
        return byteBuffer;
    }

    public final void y(int n, int n2, int n3, int n4) {
        this.cuQ = n;
        this.cuR = n2;
        this.cuS = n3;
        this.cuT = n4;
    }

    public final void d(aci_1 aci_12) {
        this.cuQ = aci_12.cuQ;
        this.cuR = aci_12.cuR;
        this.cuS = aci_12.cuS;
        this.cuT = aci_12.cuT;
    }

    public final void cK(int n, int n2) {
        this.cuQ += n;
        this.cuR += n;
        this.cuS += n2;
        this.cuT += n2;
    }

    public final int bWF() {
        return this.cuQ;
    }

    public final void wR(int n) {
        this.cuQ = n;
    }

    public final int bWG() {
        return this.cuR;
    }

    public final void wS(int n) {
        this.cuR = n;
    }

    public final int bWH() {
        return this.cuS;
    }

    public final void wT(int n) {
        this.cuS = n;
    }

    public final int bWI() {
        return this.cuT;
    }

    public final void wU(int n) {
        this.cuT = n;
    }

    public final int bWJ() {
        return this.cuR - this.cuQ + 1;
    }

    public final int bWK() {
        return this.cuT - this.cuS + 1;
    }

    public final boolean cL(int n, int n2) {
        return n >= this.cuQ && n <= this.cuR && n2 >= this.cuS && n2 <= this.cuT;
    }

    public final boolean e(aci_1 aci_12) {
        return this.z(aci_12.cuQ, aci_12.cuR, aci_12.cuS, aci_12.cuT);
    }

    public final boolean z(int n, int n2, int n3, int n4) {
        if (n > this.cuR) {
            return false;
        }
        if (n2 < this.cuQ) {
            return false;
        }
        if (n3 > this.cuT) {
            return false;
        }
        return n4 >= this.cuS;
    }

    public final void cM(int n, int n2) {
        this.cuQ = Math.min(n, this.cuQ);
        this.cuR = Math.max(n, this.cuR);
        this.cuS = Math.min(n2, this.cuS);
        this.cuT = Math.max(n2, this.cuT);
    }

    public final void f(aci_1 aci_12) {
        this.cuQ = Math.min(aci_12.cuQ, this.cuQ);
        this.cuR = Math.max(aci_12.cuR, this.cuR);
        this.cuS = Math.min(aci_12.cuS, this.cuS);
        this.cuT = Math.max(aci_12.cuT, this.cuT);
    }

    public String toString() {
        return "(" + this.cuQ + ", " + this.cuS + ") - (" + this.cuR + ", " + this.cuT + ")";
    }

    public double bWL() {
        return (double)(this.cuQ + this.cuR) * 0.5;
    }

    public double bWM() {
        return (double)(this.cuS + this.cuT) * 0.5;
    }

    public void a(@NotNull acj_1 acj_12) {
        for (int i = this.cuQ; i <= this.cuR; ++i) {
            for (int j = this.cuS; j <= this.cuT; ++j) {
                acj_12.apply(i, j);
            }
        }
    }
}

