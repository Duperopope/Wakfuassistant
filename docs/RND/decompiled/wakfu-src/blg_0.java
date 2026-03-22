/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from blg
 */
public class blg_0
extends eJB
implements blf_0 {
    public blg_0(fdl fdl2) {
        super(fdl2);
    }

    @Override
    public void cg(byte[] byArray) {
        this.qAb.beZ();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        RW rW = this.qAb.beS();
        uy_1 uy_12 = new uy_1();
        this.qAa.ts(byteBuffer.getInt());
        while (byteBuffer.hasRemaining()) {
            uy_12.clear();
            uy_12.aG(byteBuffer);
            this.bp((ffV)rW.x(uy_12));
        }
    }

    public RS<ffV> dtm() {
        return this.qAb;
    }
}

