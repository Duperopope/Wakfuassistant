/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cue
 */
public class cue_0
extends nr_0 {
    private long ePP;

    public long Xi() {
        return this.ePP;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.ePP = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13933;
    }
}

