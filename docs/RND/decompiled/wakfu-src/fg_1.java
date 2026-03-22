/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from fg
 */
public class fg_1 {
    protected static final Logger oP = Logger.getLogger(fg_1.class);
    private static final fg_1 oQ = new fg_1();
    private final TIntObjectHashMap<fk_1> oR = new TIntObjectHashMap();
    private final TIntArrayList oS = new TIntArrayList();

    public static fg_1 zk() {
        return oQ;
    }

    private fg_1() {
        for (int i = 1; i < 17; ++i) {
            int n = 1 << i;
            fk_1 fk_12 = this.cc(n);
            if (fk_12 != null) continue;
            throw new RuntimeException("Impossible de cr\u00e9er un des pools par d\u00e9faut : size = " + n + " bytes");
        }
    }

    public fk_1 cc(int n) {
        int n2 = this.oS.size();
        for (int i = 0; i < n2; ++i) {
            int n3 = this.oS.getQuick(i);
            if (n3 < n) continue;
            return (fk_1)this.oR.get(n3);
        }
        fk_1 fk_12 = new fk_1(n);
        this.oR.put(n, (Object)fk_12);
        this.oS.add(n);
        return fk_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    byte[] a(ff_1 ff_12, fi_1 ... fi_1Array) {
        int n;
        Object object;
        if (fi_1Array == null || fi_1Array.length == 0) {
            return new byte[0];
        }
        int n2 = 0;
        int n3 = 0;
        int[] nArray = new int[fi_1Array.length];
        int n4 = fi_1Array.length;
        for (int i = 0; i < n4; ++i) {
            object = fi_1Array[i];
            if (object == null) {
                throw new RuntimeException("Impossible de s\u00e9rialiser le BInarSerial : une part est null");
            }
            if (object == fi_1.oX) continue;
            try {
                ((fi_1)object).zo();
                nArray[i] = ((fi_1)object).zt();
            }
            catch (Exception exception) {
                throw new RuntimeException("Error while calling expectedSize()", exception);
            }
            n2 += 1 + nArray[i];
            ++n3;
        }
        fk_1 fk_12 = this.cc(n2 + fi_1Array.length * 5 + 1);
        ByteBuffer byteBuffer = fk_12.zu();
        object = new byte[n3];
        int[] nArray2 = new int[n3];
        byteBuffer.put((byte)n3);
        byteBuffer.position(1 + n3 * 5);
        n3 = 0;
        int n5 = fi_1Array.length;
        for (n = 0; n < n5; ++n) {
            fi_1 fi_12 = fi_1Array[n];
            if (fi_12 == fi_1.oX) continue;
            fk_1 fk_13 = null;
            ByteBuffer byteBuffer2 = null;
            try {
                int n6 = 1 + nArray[n];
                fk_13 = this.cc(n6);
                byteBuffer2 = fk_13.zu();
                byteBuffer2.limit(n6);
                byte by = (byte)ff_12.a(fi_12);
                if (by >= 0) {
                    object[n3] = by;
                    nArray2[n3] = byteBuffer.position();
                    byteBuffer2.put(by);
                    fi_12.zs();
                    if (nArray[n] > 0) {
                        fi_12.as(byteBuffer2);
                    }
                    ++n3;
                } else {
                    oP.error((Object)("Impossible d'ajouter une part non r\u00e9f\u00e9renc\u00e9e : " + fi_12.getClass().getName()));
                }
                byteBuffer2.flip();
                byteBuffer.put(byteBuffer2);
                if (fk_13 == null || byteBuffer2 == null) continue;
                fk_13.at(byteBuffer2);
            }
            catch (Exception exception) {
                try {
                    fi_12.a("Exception lev\u00e9e lors de la s\u00e9rialisation de la part " + fi_12.getClass().getName(), exception);
                    if (fk_13 == null || byteBuffer2 == null) continue;
                    fk_13.at(byteBuffer2);
                }
                catch (Throwable throwable) {
                    if (fk_13 != null && byteBuffer2 != null) {
                        fk_13.at(byteBuffer2);
                    }
                    throw throwable;
                }
            }
            continue;
        }
        for (n = 0; n < n3; ++n) {
            byteBuffer.put(1 + n * 5, (byte)object[n]);
            byteBuffer.putInt(1 + n * 5 + 1, nArray2[n]);
        }
        byteBuffer.flip();
        byte[] byArray = new byte[byteBuffer.limit() - byteBuffer.position()];
        byteBuffer.get(byArray);
        fk_12.at(byteBuffer);
        return byArray;
    }
}

