/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from cqb
 */
public class cqb_0
extends nr_0 {
    private long lXG;
    private final List<RT> met = new ArrayList<RT>();
    private long aZj;
    private ett_0 mer;

    @Override
    public boolean dn(byte[] byArray) {
        int n;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lXG = byteBuffer.getLong();
        this.aZj = byteBuffer.getLong();
        this.mer = ett_0.fj(byteBuffer.get());
        uy_1 uy_12 = new uy_1();
        for (int i = n = byteBuffer.getShort(); i > 0; --i) {
            if (!uy_12.aG(byteBuffer)) {
                return false;
            }
            ffV ffV2 = new ffV();
            ffV2.c(uy_12);
            this.met.add(ffV2);
        }
        return true;
    }

    @Override
    public int d() {
        return 13750;
    }

    public List<RT> exR() {
        return this.met;
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

