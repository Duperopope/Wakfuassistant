/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from bwW
 */
public class bww_0
extends bwo_0 {
    private List<eVo> jAu = null;
    private final acd_1 jAv = new acd_1();

    public void a(bsj_0 bsj_02, byte by, List<eVo> list) {
        this.a(bsj_02, by);
        this.jAu = list;
        this.eB(99.0f);
        this.eA(99.0f);
    }

    @Override
    public void reset() {
        this.jAu = null;
    }

    @Override
    protected boolean a(int n, int n2, short s, int n3, int n4, short s2) {
        this.jAv.Q(n, n2, s);
        return !eVo.a(this.jAv, this.jAu) || super.a(n, n2, s, n3, n4, s2);
    }
}

