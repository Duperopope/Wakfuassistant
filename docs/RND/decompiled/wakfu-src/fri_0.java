/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from fri
 */
public class fri_0 {
    private final int sXC;
    private final List<Integer> sXD;
    private final List<Integer> sXE;

    public fri_0(int n, List<Integer> list, List<Integer> list2) {
        this.sXC = n;
        this.sXD = list;
        this.sXE = list2;
    }

    public boolean ZA(int n) {
        return this.sXD.contains(n);
    }

    public List<Integer> efB() {
        return this.sXE;
    }

    public boolean ZB(int n) {
        return this.sXE.contains(n);
    }

    public int ayQ() {
        return this.sXC;
    }
}

