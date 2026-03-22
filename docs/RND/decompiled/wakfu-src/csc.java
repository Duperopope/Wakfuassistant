/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class csc
extends nr_0 {
    private long aDh;
    private final Collection<fen_0> mgK = new ArrayList<fen_0>();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        while (byteBuffer.hasRemaining()) {
            fep_0 fep_02 = fep_0.ge(byteBuffer.get());
            fen_0 fen_02 = fep_02.fUK();
            fen_02.eM(byteBuffer);
            this.mgK.add(fen_02);
        }
        return true;
    }

    public Iterator<fen_0> eAy() {
        return this.mgK.iterator();
    }

    public long KU() {
        return this.aDh;
    }

    @Override
    public int d() {
        return 13084;
    }

    @Override
    public String toString() {
        return "QuestInventoryChangeMessage{m_changes=" + this.mgK.size() + "}";
    }
}

