/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.Unmodifiable;

public class cxC
extends nr_0 {
    private long aDh;
    private final Set<Integer> mlU = new HashSet<Integer>();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        int n = byteBuffer.getShort();
        this.mlU.clear();
        for (int i = 0; i < n; ++i) {
            this.mlU.add(byteBuffer.getInt());
        }
        return true;
    }

    public long KU() {
        return this.aDh;
    }

    public @Unmodifiable Set<Integer> eET() {
        return Collections.unmodifiableSet(this.mlU);
    }

    @Override
    public int d() {
        return 15263;
    }
}

