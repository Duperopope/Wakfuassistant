/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class coA
extends nr_0 {
    private final List<eAb> mdi = new ArrayList<eAb>();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mdi.clear();
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            this.mdi.add(eAb.a(byteBuffer, true));
        }
        return true;
    }

    public List<eAb> ewx() {
        return this.mdi;
    }

    @Override
    public int d() {
        return 12576;
    }
}

