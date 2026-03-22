/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from fox
 */
public class fox_0
extends fop_0 {
    private final Map<Integer, ua_0> sLF = new HashMap<Integer, ua_0>();
    private final Set<Integer> sLG = new HashSet<Integer>();
    private final Map<Integer, fow_0> sLH = new HashMap<Integer, fow_0>();
    private final int sLI;

    public fox_0(int n, int n2, int n3, int n4, long l, long l2, byte by, short s, short s2) {
        super(n, n2, n4, l, l2, by, s, s2);
        this.sLI = n3;
    }

    public void a(int n, ua_0 ua_02) {
        this.sLF.put(n, ua_02);
    }

    @Override
    public boolean XL(int n) {
        return this.sLF.containsKey(n);
    }

    @Override
    public ua_0 XM(int n) {
        return this.sLF.get(n);
    }

    public boolean XO(int n) {
        return this.sLG.add(n);
    }

    public void ao(int n2, int n3, int n4) {
        fow_0 fow_02 = this.sLH.computeIfAbsent(n2, n -> new fow_0());
        fow_02.e(n3, new awx_2(n4));
    }

    @Override
    public boolean gfz() {
        return false;
    }

    @Override
    public int gfD() {
        return this.sLI;
    }

    @Override
    public fow_0 XN(int n) {
        return this.sLH.get(n);
    }

    @Override
    public boolean XJ(int n) {
        return this.sLG.contains(n);
    }

    @Override
    public boolean XK(int n) {
        return this.sLH.containsKey(n);
    }

    public String toString() {
        return "PetDefinitionImpl{m_id=" + this.sLh + "}";
    }

    @Override
    public int[] gfB() {
        return this.sLG.stream().mapToInt(n -> n).toArray();
    }

    @Override
    public int[] gfC() {
        return this.sLH.keySet().stream().mapToInt(n -> n).toArray();
    }
}

