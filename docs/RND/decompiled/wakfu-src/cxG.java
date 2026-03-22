/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public class cxG
extends nr_0 {
    private final Set<eTw> mlY = new HashSet<eTw>();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        eTC eTC2 = new eTC();
        for (int i = 0; i < n; ++i) {
            eTC2.eL(byteBuffer);
            this.mlY.add(eTC2.dFm());
            eTC2.p(null);
        }
        return true;
    }

    public Set<eTw> eEX() {
        return this.mlY;
    }

    @Override
    public int d() {
        return 1083;
    }
}

