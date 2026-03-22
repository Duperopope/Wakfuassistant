/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class cpq
extends nr_0 {
    private final List<eJS> mdQ = new ArrayList<eJS>();
    private boolean mdR;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            this.mdQ.add(eJU.fr(byteBuffer));
        }
        this.mdR = byteBuffer.get() == 1;
        return true;
    }

    public List<eJS> exl() {
        return this.mdQ;
    }

    public boolean exm() {
        return this.mdR;
    }

    @Override
    public int d() {
        return 12373;
    }
}

