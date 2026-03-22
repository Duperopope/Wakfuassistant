/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public class cxF
extends nr_0 {
    private final Set<eTw> mlX = new HashSet<eTw>();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        eTC eTC2 = new eTC();
        for (int i = 0; i < n; ++i) {
            eTC2.rpN.a(byteBuffer, exH.pdw);
            eTC2.rpP.a(byteBuffer, exH.pdw);
            this.mlX.add(eTC2.dFm());
            eTC2.p(null);
        }
        return true;
    }

    public Set<eTw> eEX() {
        return this.mlX;
    }

    @Override
    public int d() {
        return 1119;
    }
}

