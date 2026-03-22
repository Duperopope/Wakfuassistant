/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Renamed from cuJ
 */
public class cuj_0
extends nr_0 {
    private long duS;
    private final Collection<fnt_0> mjs = new ArrayList<fnt_0>();
    private long aDh;
    private fnv_0 mjt;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.duS = byteBuffer.getLong();
        this.mjt = fnv_0.fr(byteBuffer.getShort());
        while (byteBuffer.hasRemaining()) {
            fnw_0 fnw_02 = fnw_0.he(byteBuffer.get());
            fnt_0 fnt_02 = fnw_02.gfi();
            fnt_02.eM(byteBuffer);
            this.mjs.add(fnt_02);
        }
        return true;
    }

    public long KU() {
        return this.aDh;
    }

    public long bSZ() {
        return this.duS;
    }

    public Iterator<fnt_0> eAy() {
        return this.mjs.iterator();
    }

    public fnv_0 eDt() {
        return this.mjt;
    }

    @Override
    public int d() {
        return 12218;
    }

    @Override
    public String toString() {
        return "PetChangeMessage{m_itemId=" + this.duS + ", m_changes=" + this.mjs.size() + "}";
    }
}

