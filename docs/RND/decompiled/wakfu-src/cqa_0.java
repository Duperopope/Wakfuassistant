/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from cqa
 */
public class cqa_0
extends nr_0 {
    private long lXG;
    private final List<ffV> mes = new ArrayList<ffV>();
    private long aZj;
    private ett_0 mer;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lXG = byteBuffer.getLong();
        this.aZj = byteBuffer.getLong();
        this.mer = ett_0.fj(byteBuffer.get());
        int n = byteBuffer.getShort();
        uy_1 uy_12 = new uy_1();
        for (int i = n; i > 0; --i) {
            if (!uy_12.aG(byteBuffer)) {
                return false;
            }
            ffV ffV2 = new ffV();
            ffV2.c(uy_12);
            this.mes.add(ffV2);
            uy_12.clear();
        }
        return true;
    }

    @Override
    public int d() {
        return 13027;
    }

    public List<ffV> exR() {
        return this.mes;
    }

    public long fD() {
        return this.aZj;
    }

    public long exN() {
        return this.lXG;
    }

    public ett_0 exQ() {
        return this.mer;
    }
}

