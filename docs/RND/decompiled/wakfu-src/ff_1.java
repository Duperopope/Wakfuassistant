/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ff
 */
public abstract class ff_1 {
    private static final int oN = 0xA00000;
    private static final Logger oO = Logger.getLogger(ff_1.class);

    public abstract fi_1[] zj();

    int a(fi_1 fi_12) {
        fi_1[] fi_1Array = this.zj();
        if (fi_1Array != null) {
            for (int i = 0; i < fi_1Array.length; ++i) {
                if (fi_1Array[i] != fi_12) continue;
                return i;
            }
        }
        return -1;
    }

    public final byte[] a(fi_1 ... fi_1Array) {
        if (fi_1Array != null && fi_1Array.length > 0) {
            return fg_1.zk().a(this, fi_1Array);
        }
        throw new RuntimeException("Unable to serialize content without parts");
    }

    public final byte[] a(int ... nArray) {
        if (nArray != null && nArray.length > 0) {
            fi_1[] fi_1Array = new fi_1[nArray.length];
            fi_1[] fi_1Array2 = this.zj();
            int n = 0;
            for (int n2 : nArray) {
                fi_1Array[n++] = fi_1Array2[n2];
            }
            return fg_1.zk().a(this, fi_1Array);
        }
        throw new RuntimeException("Unable to serialize content without parts");
    }

    public final void as(byte[] byArray) {
        this.a(byArray, 0);
    }

    public final void a(byte[] byArray, int n) {
        int n2;
        fi_1[] fi_1Array = this.zj();
        if (fi_1Array == null || fi_1Array.length <= 0) {
            return;
        }
        ArrayList<fi_1> arrayList = new ArrayList<fi_1>(fi_1Array.length);
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n3 = byteBuffer.get();
        byte[] byArray2 = new byte[n3];
        int[] nArray = new int[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            byArray2[n2] = byteBuffer.get();
            nArray[n2] = byteBuffer.getInt();
        }
        for (n2 = 0; n2 < n3; ++n2) {
            byte by = byArray2[n2];
            int n4 = nArray[n2];
            int n5 = n2 < n3 - 1 ? nArray[n2 + 1] - n4 - 1 : byteBuffer.limit() - n4 - 1;
            if (n5 <= 0) {
                oO.warn((Object)("Part " + by + "(offset=" + n4 + ") is empty for " + String.valueOf(this) + " ! (voir log serveur)"), (Throwable)new Exception());
                continue;
            }
            if (n5 > 0xA00000) {
                oO.error((Object)("Part " + by + "(offset=" + n4 + ") exceeds max limit (" + n5 + " > 10485760 bytes)"), (Throwable)new Exception());
                continue;
            }
            fk_1 fk_12 = fg_1.zk().cc(n5);
            ByteBuffer byteBuffer2 = fk_12.zu();
            byteBuffer.position(n4 + 1);
            byteBuffer2.limit(n5);
            byteBuffer.get(byteBuffer2.array(), 0, n5);
            if (by >= 0 && by < fi_1Array.length) {
                fi_1 fi_12 = fi_1Array[by];
                if (fi_12 == fi_1.oX) {
                    oO.warn((Object)("Don't know how to unserialise part #" + by + " (EMPTY)."));
                    continue;
                }
                if (fi_12 == null) {
                    oO.error((Object)("Part " + by + " of " + String.valueOf(this) + " is null"), (Throwable)new Exception());
                    continue;
                }
                try {
                    fi_12.zs();
                    fi_12.a(byteBuffer2, n);
                    if (!fi_12.zr()) {
                        arrayList.add(fi_12);
                    }
                }
                catch (RuntimeException runtimeException) {
                    fi_12.a("Exception lev\u00e9e lors de la d\u00e9serialisation de " + String.valueOf(this) + ", part :" + by, runtimeException);
                }
                if (byteBuffer2.remaining() > 0) {
                    oO.warn((Object)new Exception("Part " + by + " of " + String.valueOf(this) + " still have " + byteBuffer2.remaining() + " byte(s) left !"));
                }
            }
            fk_12.at(byteBuffer2);
        }
        for (fi_1 fi_13 : arrayList) {
            fi_13.zp();
        }
    }

    public final void a(fi_1 fi_12, byte[] byArray, int n) {
        fi_1[] fi_1Array = this.zj();
        if (fi_12 == null || fi_1Array == null || fi_1Array.length <= 0) {
            return;
        }
        int n2 = this.a(fi_12);
        if (n2 < 0) {
            throw new RuntimeException("Unable to find part in BinarSerial class : " + this.getClass().getSimpleName());
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n3 = byteBuffer.get();
        for (int i = 0; i < n3; ++i) {
            byte by = byteBuffer.get();
            int n4 = byteBuffer.getInt();
            if (by != n2) continue;
            byteBuffer.position(n4 + 1);
            try {
                fi_12.zs();
                fi_12.a(byteBuffer, n);
                if (!fi_12.zr()) {
                    fi_12.zp();
                }
            }
            catch (RuntimeException runtimeException) {
                oO.error((Object)("Exception lev\u00e9e lors de la d\u00e9serialisation de la part :" + n2), (Throwable)runtimeException);
            }
            return;
        }
        throw new RuntimeException("Part (" + n2 + ")doesnt exist in BinarSerial class : " + this.getClass().getSimpleName());
    }
}

