/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.apache.log4j.Logger;

/*
 * Renamed from apL
 */
public class apl_1
implements do_0 {
    public static final ByteOrder cOL = ByteOrder.LITTLE_ENDIAN;
    private static final Logger cOM = Logger.getLogger(apl_1.class);
    private final ByteBuffer cONN;
    private int cOO = -1;
    private byte cOP = (byte)-1;
    private byte cOQ = 0;
    private static final ByteBuffer cOR = ByteBuffer.allocate(0);
    private byte[] cOS = new byte[128];

    protected apl_1(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("ByteBuffer can't be null");
        }
        this.cONN = byteBuffer;
        this.cONN.order(cOL);
    }

    public static apl_1 gR(InputStream inputStream) {
        apl_1 apl_12 = new apl_1(apl_1.gS(inputStream));
        inputStream.close();
        return apl_12;
    }

    public static apl_1 eT(ByteBuffer byteBuffer) {
        return new apl_1(byteBuffer);
    }

    public static apl_1 a(ByteBuffer byteBuffer, ByteOrder byteOrder) {
        byteBuffer.order(byteOrder);
        return new apl_1(byteBuffer);
    }

    public static apl_1 dw(byte[] byArray) {
        return new apl_1(ByteBuffer.wrap(byArray));
    }

    public static apl_1 a(byte[] byArray, ByteOrder byteOrder) {
        return new apl_1(ByteBuffer.wrap(byArray).order(byteOrder));
    }

    protected static ByteBuffer gS(InputStream inputStream) {
        byte[] byArray = null;
        while (inputStream.available() != 0) {
            int n;
            int n2 = inputStream.available();
            byte[] byArray2 = new byte[n2];
            for (int i = 0; i != n2; i += n) {
                n = inputStream.read(byArray2, i, n2 - i);
                if (n != -1) continue;
                throw new EOFException("Less data than assumed in the stream. " + n2 + " expected, " + i + " read");
            }
            if (byArray == null) {
                byArray = byArray2;
                continue;
            }
            byte[] byArray3 = new byte[byArray.length + byArray2.length];
            System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
            System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
            byArray = byArray3;
        }
        if (byArray != null) {
            return ByteBuffer.wrap(byArray);
        }
        return ByteBuffer.allocate(0);
    }

    public final void a(ByteOrder byteOrder) {
        this.cONN.order(byteOrder);
    }

    public final ByteOrder bFN() {
        return this.cONN.order();
    }

    public final int tv(int n) {
        if (n <= 0) {
            return 0;
        }
        int n2 = this.cONN.remaining();
        int n3 = Math.min(n2, n);
        this.cONN.position(this.cONN.position() + n3);
        return n3;
    }

    public final int available() {
        return this.cONN.remaining();
    }

    @Override
    public void close() {
    }

    public final int c(byte[] byArray, int n, int n2) {
        int n3 = Math.min(this.available(), Math.min(byArray.length - n, n2));
        this.cONN.get(byArray, n, n3);
        return n3;
    }

    public final int dx(byte[] byArray) {
        int n = Math.min(this.available(), byArray.length);
        this.cONN.get(byArray, 0, n);
        return n;
    }

    @Override
    public final byte[] mv(int n) {
        byte[] byArray = new byte[n];
        this.cONN.get(byArray);
        return byArray;
    }

    @Override
    public final short[] mw(int n) {
        short[] sArray = new short[n];
        for (int i = 0; i < n; ++i) {
            sArray[i] = this.cONN.getShort();
        }
        return sArray;
    }

    @Override
    public final int[] mx(int n) {
        int[] nArray = new int[n];
        for (int i = 0; i < n; ++i) {
            nArray[i] = this.cONN.getInt();
        }
        return nArray;
    }

    @Override
    public final float[] my(int n) {
        float[] fArray = new float[n];
        for (int i = 0; i < n; ++i) {
            fArray[i] = this.cONN.getFloat();
        }
        return fArray;
    }

    @Override
    public final float aIB() {
        return this.cONN.getFloat();
    }

    @Override
    public final short aIz() {
        return this.cONN.getShort();
    }

    public final int bFO() {
        return this.cONN.getShort() & 0xFFFF;
    }

    @Override
    public final int aIA() {
        return this.cONN.getInt();
    }

    public final long bFP() {
        return (long)this.cONN.getInt() & 0xFFFFFFFFL;
    }

    public final long bFQ() {
        return this.cONN.getLong();
    }

    @Override
    public final byte aIy() {
        return this.cONN.get();
    }

    public final short bFR() {
        return (short)((short)this.cONN.get() & 0xFF);
    }

    public final boolean bFS() {
        int n = this.cONN.position();
        if (n == this.cOO && this.cOP <= 6) {
            this.cOP = (byte)(this.cOP + 1);
            return (this.cOQ & 1 << 7 - this.cOP) != 0;
        }
        this.cOP = 0;
        this.cOO = n + 1;
        this.cOQ = this.cONN.get();
        int n2 = this.cOQ & 0x80;
        return n2 != 0;
    }

    @Override
    public final String aIC() {
        int n;
        int n2 = this.cONN.limit();
        for (n = this.cONN.position(); n < n2 && this.cONN.get(n) != 0; ++n) {
        }
        if (n >= n2) {
            throw new EOFException("Unable to find a valid Null terminated UTF-8 string end.");
        }
        int n3 = n - this.cONN.position();
        if (n3 > 0) {
            if (n3 > this.cOS.length) {
                this.cOS = new byte[n3];
            }
            this.cONN.get(this.cOS, 0, n3);
            this.cONN.get();
            return BH.a(this.cOS, 0, n3);
        }
        this.cONN.get();
        return "";
    }

    public final int bFT() {
        return this.cONN.position();
    }

    public final void tw(int n) {
        this.cONN.position(n);
    }
}

