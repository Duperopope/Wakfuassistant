/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class cya
extends nr_0 {
    private long aDL;
    private final Collection<ezk_1> mmk = new ArrayList<ezk_1>();

    @Override
    public boolean dn(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDL = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            ezm_2 ezm_22 = ezm_2.fV(byteBuffer.get());
            ezk_1 ezk_12 = (ezk_1)ezm_22.createNew();
            byteBuffer.get(byArray2);
            ezk_12.eM(ByteBuffer.wrap(byArray2));
            this.mmk.add(ezk_12);
        }
        return true;
    }

    public Iterator<ezk_1> eAy() {
        return this.mmk.iterator();
    }

    public long Ya() {
        return this.aDL;
    }

    @Override
    public int d() {
        return 15974;
    }

    @Override
    public String toString() {
        return "GuildChangeMessage{m_changes=" + this.mmk.size() + "}";
    }
}

