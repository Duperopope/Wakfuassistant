/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from csl
 */
public class csl_0
extends nr_0 {
    private final ArrayList<Long> mha = new ArrayList();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            this.mha.add(byteBuffer.getLong());
        }
        return true;
    }

    @Override
    public int d() {
        return 13263;
    }

    public ArrayList<Long> eAL() {
        return this.mha;
    }
}

