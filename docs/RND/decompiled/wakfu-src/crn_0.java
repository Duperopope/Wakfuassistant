/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crN
 */
public class crn_0
extends nr_0 {
    private int mgw;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mgw = byteBuffer.getInt();
        return true;
    }

    public int eAn() {
        return this.mgw;
    }

    @Override
    public int d() {
        return 14698;
    }
}

