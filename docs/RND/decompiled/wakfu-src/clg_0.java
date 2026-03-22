/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from clG
 */
public class clg_0
extends nv_0 {
    private final String lZX;
    private final List<fgs> lZY = new ArrayList<fgs>();

    public clg_0(String string) {
        this.lZX = string;
    }

    public void c(long l, short s, short s2) {
        this.lZY.add(new fgs(l, s, s2));
    }

    @Override
    public byte[] aVX() {
        int n = 1 + this.lZX.length() + 2 + this.lZY.size() * fgs.DN();
        azg_1 azg_12 = new azg_1(n);
        azg_12.gW(this.lZX);
        azg_12.aG((short)this.lZY.size());
        this.lZY.forEach(fgs2 -> fgs2.e(azg_12));
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12467;
    }
}

