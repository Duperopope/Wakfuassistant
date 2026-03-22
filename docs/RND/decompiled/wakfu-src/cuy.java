/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public class cuy
extends nr_0 {
    private Set<Integer> mjr = new HashSet<Integer>();
    private boolean asG;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            this.mjr.add(byteBuffer.getInt());
        }
        this.asG = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 12466;
    }

    public Set<Integer> eDi() {
        return this.mjr;
    }

    public boolean aGv() {
        return this.asG;
    }
}

