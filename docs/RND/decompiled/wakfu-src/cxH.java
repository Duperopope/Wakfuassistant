/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public class cxH
extends nr_0 {
    private final Set<eTw> mlZ = new HashSet<eTw>();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        eTC eTC2 = new eTC();
        for (int i = 0; i < n; ++i) {
            eTC2.eL(byteBuffer);
            this.mlZ.add(eTC2.dFm());
        }
        return true;
    }

    public Set<eTw> eEX() {
        return this.mlZ;
    }

    @Override
    public int d() {
        return 1121;
    }
}

