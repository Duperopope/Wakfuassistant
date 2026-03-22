/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class csd
extends nr_0 {
    private final Collection<fey_0> mgL = new ArrayList<fey_0>();
    private long aDh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        while (byteBuffer.hasRemaining()) {
            ffa ffa2 = ffa.gf(byteBuffer.get());
            fey_0 fey_02 = ffa2.fUR();
            fey_02.eM(byteBuffer);
            this.mgL.add(fey_02);
        }
        return true;
    }

    public long KU() {
        return this.aDh;
    }

    public Iterator<fey_0> eAy() {
        return this.mgL.iterator();
    }

    @Override
    public int d() {
        return 13029;
    }

    @Override
    public String toString() {
        return "TemporaryInventoryChangeMessage{m_changes=" + this.mgL.size() + "}";
    }
}

