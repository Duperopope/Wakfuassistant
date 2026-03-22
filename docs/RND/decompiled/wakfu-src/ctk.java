/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TByteArrayList
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TByteArrayList;
import gnu.trove.list.array.TIntArrayList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class ctk
extends nr_0 {
    private final ArrayList<wa_2> mhX = new ArrayList();
    private final TByteArrayList mhY = new TByteArrayList();
    private final TIntArrayList mhZ = new TIntArrayList();

    public List<wa_2> eBV() {
        return this.mhX;
    }

    public TByteArrayList eBW() {
        return this.mhY;
    }

    public TIntArrayList eBX() {
        return this.mhZ;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get() & 0xFF;
        for (int i = 0; i < n; ++i) {
            wa_2 wa_22 = new wa_2();
            if (!wa_22.aG(byteBuffer)) {
                dwV.error((Object)"Erreur durant la d\u00e9-serialisation d'un des inventaires marchands");
                return false;
            }
            this.mhX.add(wa_22);
            this.mhY.add(byteBuffer.get());
            this.mhZ.add(byteBuffer.getInt());
        }
        return true;
    }

    @Override
    public int d() {
        return 13301;
    }
}

