/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from KC
 */
public class kc_1
implements ki_1 {
    private kd_1 aOe;
    private final int[] aOf = new int[2];
    private boolean aOg;

    public kd_1 aRd() {
        return this.aOe;
    }

    public void a(kd_1 kd_12) {
        this.aOe = kd_12;
    }

    public int[] aRe() {
        return this.aOf;
    }

    public void I(int n, int n2) {
        this.aOf[0] = n;
        this.aOf[1] = n2;
    }

    public boolean aRf() {
        return this.aOg;
    }

    public void aG(boolean bl) {
        this.aOg = bl;
    }

    public String toString() {
        return "PositionCondition{m_condition=" + String.valueOf((Object)this.aOe) + ", m_value=" + Arrays.toString(this.aOf) + ", m_useSystemAsReference=" + this.aOg + "}";
    }
}

