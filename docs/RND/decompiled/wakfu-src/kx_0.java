/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Kx
 */
public class kx_0
implements ki_1 {
    private final int[] aNN = new int[2];
    private final int[] aNO = new int[2];

    public int[] aQW() {
        return this.aNN;
    }

    public void G(int n, int n2) {
        this.aNN[0] = n;
        this.aNN[1] = n2;
    }

    public int[] aQX() {
        return this.aNO;
    }

    public void H(int n, int n2) {
        this.aNO[0] = n;
        this.aNO[1] = n2;
    }

    public String toString() {
        return "LifeCondition{m_lifeEnd=" + Arrays.toString(this.aNN) + ", m_lifeStart=" + Arrays.toString(this.aNO) + "}";
    }
}

