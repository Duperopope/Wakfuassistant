/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntByteHashMap
 */
import gnu.trove.map.hash.TIntByteHashMap;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from ctR
 */
public class ctr_0
extends nr_0 {
    private ArrayList<cts_0> miI;

    @Override
    public boolean dn(byte ... byArray) {
        this.miI = new ArrayList();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            int n2 = byteBuffer.getInt();
            int n3 = byteBuffer.getInt();
            float f2 = byteBuffer.getFloat();
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            String string = BH.dc(byArray2);
            int n4 = byteBuffer.getInt();
            TIntByteHashMap tIntByteHashMap = new TIntByteHashMap();
            int n5 = byteBuffer.getInt();
            for (int j = 0; j < n5; ++j) {
                tIntByteHashMap.put(byteBuffer.getInt(), byteBuffer.get());
            }
            this.miI.add(new cts_0(n2, n3, f2, string, n4, tIntByteHashMap));
        }
        return true;
    }

    @Override
    public int d() {
        return 14359;
    }

    public ArrayList<cts_0> eCF() {
        return this.miI;
    }
}

