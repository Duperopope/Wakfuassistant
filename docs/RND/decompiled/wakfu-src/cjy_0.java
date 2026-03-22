/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from cjY
 */
public class cjy_0
extends nv_0 {
    private final long lXE;
    private final Map<Byte, fho_0> lXF = new HashMap<Byte, fho_0>();

    public cjy_0(long l) {
        this.lXE = l;
    }

    public void a(byte by, fho_0 fho_02) {
        this.lXF.put(by, fho_02);
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(9 + this.lXF.size() * (1 + fho_0.fZd()));
        azg_12.gK(this.lXE);
        azg_12.aF((byte)this.lXF.size());
        this.lXF.forEach((by, fho_02) -> {
            azg_12.aF((byte)by);
            fho_02.d(azg_12);
        });
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13996;
    }
}

