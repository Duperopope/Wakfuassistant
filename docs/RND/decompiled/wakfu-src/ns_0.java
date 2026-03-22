/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TByteArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TByteArrayList;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from Ns
 */
public class ns_0
extends nv_0 {
    private static final Logger aYr = Logger.getLogger(ns_0.class);
    protected byte aYm;
    protected short aYs;
    protected final TByteArrayList aYt = new TByteArrayList(64);

    public void C(byte by) {
        this.aYm = by;
    }

    @Override
    public byte[] aVX() {
        if (this.aYt.size() > 65535) {
            aYr.error((Object)("Impossible d'encoder un message de taille " + this.aYt.size() + " > 0xFFFF"));
            return null;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 + this.aYt.size());
        byteBuffer.putShort(this.aYs);
        byteBuffer.putShort((short)this.aYt.size());
        byteBuffer.put(this.aYt.toArray());
        return this.a(this.aYm, byteBuffer.array());
    }

    @Override
    public int d() {
        return 396;
    }

    public void Q(short s) {
        this.aYs = s;
    }

    public short aVZ() {
        return this.aYs;
    }

    public void w(Object object) {
        if (object instanceof Integer) {
            this.nX((Integer)object);
            return;
        }
        if (object instanceof Byte) {
            this.D((Byte)object);
            return;
        }
        if (object instanceof Long) {
            this.cX((Long)object);
            return;
        }
        if (object instanceof Float) {
            this.br(((Float)object).floatValue());
            return;
        }
        if (object instanceof Short) {
            this.R((Short)object);
            return;
        }
        if (object instanceof Boolean) {
            this.aN((Boolean)object);
            return;
        }
        if (object instanceof String) {
            this.cT((String)object);
            return;
        }
        throw new IllegalArgumentException("type " + object.getClass().getSimpleName() + " non ajoutable au message");
    }

    public void cT(String string) {
        byte[] byArray = BH.aP(string);
        if (byArray != null && byArray.length <= 65535) {
            this.R((short)byArray.length);
            this.aYt.add(byArray);
        } else {
            aYr.error((Object)"Impossible d'ajouter le param\u00e8tre de type cha\u00eene.");
        }
    }

    public void nX(int n) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(n);
        this.aYt.add(byteBuffer.array());
    }

    public void aN(boolean bl) {
        this.aYt.add(bl ? (byte)1 : 0);
    }

    public void D(byte by) {
        this.aYt.add(by);
    }

    public void cX(long l) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(l);
        this.aYt.add(byteBuffer.array());
    }

    public void R(short s) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(2);
        byteBuffer.putShort(s);
        this.aYt.add(byteBuffer.array());
    }

    public void br(float f2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putFloat(f2);
        this.aYt.add(byteBuffer.array());
    }
}

