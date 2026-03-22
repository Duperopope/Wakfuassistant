/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class coR
extends nr_0 {
    private boolean mdu;
    private final List<coS> mdv = new ArrayList<coS>();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mdu = byteBuffer.get() == 1;
        int n = byteBuffer.get() & 0xFF;
        for (int i = 0; i < n; ++i) {
            byte by = byteBuffer.get();
            long l = byteBuffer.getLong();
            int n2 = byteBuffer.getShort() & 0xFFFF;
            byte[] byArray2 = new byte[n2];
            byteBuffer.get(byArray2);
            coS coS2 = new coS(by, l, byArray2);
            this.mdv.add(coS2);
        }
        return true;
    }

    @Override
    public int d() {
        return 13928;
    }

    public boolean ewM() {
        return this.mdu;
    }

    public List<coS> ewN() {
        return this.mdv;
    }
}

