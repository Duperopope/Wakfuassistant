/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class csm
extends nr_0 {
    private boolean mhb = false;
    private final ArrayList<Long> mhc = new ArrayList();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        if (byteBuffer.get() == 0) {
            this.mhb = true;
        }
        int n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            this.mhc.add(byteBuffer.getLong());
        }
        return true;
    }

    @Override
    public int d() {
        return 12056;
    }

    public boolean eAM() {
        return this.mhb;
    }

    public ArrayList<Long> eAN() {
        return this.mhc;
    }
}

