/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class cla
extends nv_0 {
    private final long lYT;
    private final ArrayList<azx_1<Long, Short>> lYU = new ArrayList();

    public cla(long l) {
        this.lYT = l;
    }

    public void l(long l, short s) {
        this.lYU.add(new azx_1<Long, Short>(l, s));
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.lYT);
        for (azx_1<Long, Short> azx_12 : this.lYU) {
            azg_12.gK(azx_12.getFirst());
            azg_12.aG(azx_12.aHI());
        }
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13968;
    }
}

