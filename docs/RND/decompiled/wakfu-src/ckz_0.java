/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from ckZ
 */
public final class ckz_0
extends nv_0 {
    private final long lYR;
    private final ArrayList<faZ> lYS = new ArrayList();

    public ckz_0(long l) {
        this.lYR = l;
    }

    public boolean a(faZ faZ2) {
        return !this.lYS.contains(faZ2) && this.lYS.add(faZ2);
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.lYR);
        for (int i = 0; i < this.lYS.size(); ++i) {
            faZ faZ2 = this.lYS.get(i);
            azg_12.aF(faZ2.fRz().rQv);
            azg_12.dH(faZ2.fRC());
        }
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13047;
    }

    @Override
    public String toString() {
        return "HavenWorldManageActionRequest{m_actions=" + this.lYS.size() + "}";
    }
}

