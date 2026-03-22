/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import org.apache.log4j.Logger;

/*
 * Renamed from Bd
 */
public final class bd_0
extends apx_1 {
    private static final short asO = 1;
    private int o;
    private short asP;
    private boolean asQ;
    private byte asf;
    private boolean ash;
    @aqd_2(name="is_challenge")
    private boolean asi;
    private boolean asj;
    private boolean asR;
    private short ask;
    private uw_0 asS;
    private short asT;
    private short asU;
    private long[] asV;
    private boolean asW;
    private String aso;
    private String asX;
    private String asp = "";
    private String asY;
    private String[] asq;
    private final ArrayList<be_0> asZ = new ArrayList(2);
    private final ArrayList<bg_0> ata = new ArrayList(2);

    public bd_0() {
        super((short)1);
    }

    public void a(be_0 be_02) {
        this.asZ.add(be_02);
    }

    public void a(bg_0 bg_02) {
        this.ata.add(bg_02);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n, short s) {
        this.tz(n);
        if (s == 1) {
            int n2;
            Object object;
            byte[] byArray;
            this.o = byteBuffer.getInt();
            this.asf = byteBuffer.get();
            this.asP = byteBuffer.getShort();
            this.asQ = byteBuffer.get() == 1;
            this.ash = byteBuffer.get() == 1;
            this.asi = byteBuffer.get() == 1;
            this.asj = byteBuffer.get() == 1;
            this.asW = byteBuffer.get() == 1;
            this.asR = byteBuffer.get() == 1;
            this.asT = byteBuffer.getShort();
            this.asU = byteBuffer.getShort();
            this.ask = byteBuffer.getShort();
            long l = byteBuffer.getLong();
            this.asS = l != 0L ? uw_0.fn(l) : null;
            int n3 = byteBuffer.getInt();
            if (n3 > 0) {
                this.asV = new long[n3];
                for (int i = 0; i < n3; ++i) {
                    this.asV[i] = byteBuffer.getLong();
                }
            }
            try {
                byte[] byArray2 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray2);
                this.aso = new String(byArray2, "UTF-8").intern();
                byte[] byArray3 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray3);
                this.asp = new String(byArray3, "UTF-8").intern();
                byArray = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray);
                this.asX = new String(byArray, "UTF-8").intern();
                object = new byte[byteBuffer.getInt()];
                byteBuffer.get((byte[])object);
                this.asY = new String((byte[])object, "UTF-8").intern();
                int n4 = byteBuffer.getInt();
                this.asq = new String[n4];
                for (int i = 0; i < n4; ++i) {
                    byte[] byArray4 = new byte[byteBuffer.getInt()];
                    byteBuffer.get(byArray4);
                    this.asq[i] = new String(byArray4, "UTF-8").intern();
                }
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                cPB.error((Object)"UnsupportedEncodingException during build", (Throwable)unsupportedEncodingException);
            }
            int n5 = byteBuffer.getInt();
            for (n2 = 0; n2 < n5; ++n2) {
                byArray = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray);
                object = new be_0(this);
                object.cV(byArray);
                this.asZ.add((be_0)object);
            }
            n2 = byteBuffer.getInt();
            for (int i = 0; i < n2; ++i) {
                object = new byte[byteBuffer.getInt()];
                byteBuffer.get((byte[])object);
                bg_0 bg_02 = new bg_0();
                bg_02.cX((byte[])object);
                this.ata.add(bg_02);
            }
        } else {
            cPB.error((Object)"Tentative de d\u00e9s\u00e9rialisation d'un objet avec une version non prise en charge");
        }
    }

    @Override
    public apx_1 aFN() {
        return new bd_0();
    }

    public bf_0 aGE() {
        return new bf_0();
    }

    public be_0 aGF() {
        return new be_0(this);
    }

    public bg_0 aGG() {
        return new bg_0();
    }

    public ArrayList<be_0> aFQ() {
        return this.asZ;
    }

    @Override
    public byte[] aFR() {
        byte[] byArray = null;
        byte[] byArray2 = null;
        byte[] byArray3 = null;
        byte[] byArray4 = null;
        try {
            byArray = this.aso.getBytes("UTF-8");
            byArray2 = this.asp.getBytes("UTF-8");
            byArray3 = this.asX.getBytes("UTF-8");
            byArray4 = this.asY.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            cPB.error((Object)"UnsupportedEncodingException during getBinaryData", (Throwable)unsupportedEncodingException);
        }
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>(this.asZ.size());
        ArrayList<byte[]> arrayList2 = new ArrayList<byte[]>(this.ata.size());
        int n = 4 + byArray.length;
        n += 4 + byArray2.length;
        n += 4 + byArray3.length;
        n += 4 + byArray4.length;
        n += 4;
        try {
            for (String string : this.asq) {
                n += 4 + string.getBytes("UTF-8").length;
            }
        }
        catch (Exception exception) {
            cPB.error((Object)"Exception during getBinaryData", (Throwable)exception);
        }
        for (be_0 be_02 : this.asZ) {
            byte[] byArray5 = be_02.aHi();
            n += byArray5.length + 4;
            arrayList.add(byArray5);
        }
        for (bg_0 bg_02 : this.ata) {
            byte[] byArray6 = bg_02.aHx();
            n += byArray6.length + 4;
            arrayList2.add(byArray6);
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(31 + (this.asV != null ? this.asV.length : 0) * 8 + 4 + 4 + n);
        byteBuffer.putInt(this.o);
        byteBuffer.put(this.asf);
        byteBuffer.putShort(this.asP);
        byteBuffer.put(this.asQ ? (byte)1 : 0);
        byteBuffer.put(this.ash ? (byte)1 : 0);
        byteBuffer.put(this.asi ? (byte)1 : 0);
        byteBuffer.put(this.asj ? (byte)1 : 0);
        byteBuffer.put(this.asW ? (byte)1 : 0);
        byteBuffer.put(this.asR ? (byte)1 : 0);
        byteBuffer.putShort(this.asT);
        byteBuffer.putShort(this.asU);
        byteBuffer.putShort(this.ask);
        if (this.asS != null) {
            byteBuffer.putLong(this.asS.bjB());
        } else {
            byteBuffer.putLong(0L);
        }
        if (this.asV != null) {
            byteBuffer.putInt(this.asV.length);
            long[] lArray = this.asV;
            int n2 = lArray.length;
            for (int i = 0; i < n2; ++i) {
                Long object = lArray[i];
                byteBuffer.putLong(object);
            }
        } else {
            byteBuffer.putInt(0);
        }
        byteBuffer.putInt(byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.putInt(byArray2.length);
        byteBuffer.put(byArray2);
        byteBuffer.putInt(byArray3.length);
        byteBuffer.put(byArray3);
        byteBuffer.putInt(byArray4.length);
        byteBuffer.put(byArray4);
        try {
            byteBuffer.putInt(this.asq.length);
            for (String string : this.asq) {
                byte[] byArray5 = string.getBytes("UTF-8");
                byteBuffer.putInt(byArray5.length);
                byteBuffer.put(byArray5);
            }
        }
        catch (Exception exception) {
            cPB.error((Object)"Exception during getBinaryData", (Throwable)exception);
        }
        byteBuffer.putInt(arrayList.size());
        for (byte[] byArray8 : arrayList) {
            byteBuffer.putInt(byArray8.length);
            byteBuffer.put(byArray8);
        }
        byteBuffer.putInt(arrayList2.size());
        for (byte[] byArray9 : arrayList2) {
            byteBuffer.putInt(byArray9.length);
            byteBuffer.put(byArray9);
        }
        return byteBuffer.array();
    }

    @Override
    public int aFS() {
        return ewj_2.ozA.d();
    }

    public short aFT() {
        return this.ask;
    }

    public uw_0 aGH() {
        return this.asS;
    }

    public int d() {
        return this.o;
    }

    public String aFZ() {
        return this.aso;
    }

    public short aGI() {
        return this.asP;
    }

    public short aGJ() {
        return this.asT;
    }

    public short aGK() {
        return this.asU;
    }

    public String aGL() {
        return this.asY;
    }

    public ArrayList<bg_0> aFV() {
        return this.ata;
    }

    public byte aFW() {
        return this.asf;
    }

    public String[] aFY() {
        return this.asq;
    }

    public String aGM() {
        return this.asX;
    }

    public String aGa() {
        return this.asp;
    }

    public long[] aGN() {
        return this.asV;
    }

    public boolean aGb() {
        return this.ash;
    }

    public boolean aGc() {
        return this.asi;
    }

    public boolean aGd() {
        return this.asj;
    }

    public void ah(boolean bl) {
        this.asj = bl;
    }

    public boolean aGO() {
        return this.asR;
    }

    public boolean aGP() {
        return this.asW;
    }

    public boolean aGQ() {
        return this.asQ;
    }

    public void af(boolean bl) {
        this.ash = bl;
    }

    public void ag(boolean bl) {
        this.asi = bl;
    }

    public void a(short s) {
        this.ask = s;
    }

    public void a(Date date) {
        this.asS = date != null ? uw_0.g(date) : null;
    }

    public void lK(int n) {
        this.o = n;
    }

    public void ap(String string) {
        this.aso = string;
    }

    public void e(short s) {
        this.asP = s;
    }

    public void f(short s) {
        this.asT = s;
    }

    public void g(short s) {
        this.asU = s;
    }

    public void av(String string) {
        this.asY = string;
    }

    public void al(boolean bl) {
        this.asR = bl;
    }

    public void am(boolean bl) {
        this.asW = bl;
    }

    public void an(boolean bl) {
        this.asQ = bl;
    }

    public void a(byte by) {
        this.asf = by;
    }

    public void a(String[] stringArray) {
        this.asq = stringArray;
    }

    public void aw(String string) {
        this.asX = string;
    }

    public void aq(String string) {
        this.asp = string;
    }

    public void a(long[] lArray) {
        this.asV = lArray;
    }

    static /* synthetic */ Logger aGh() {
        return cPB;
    }

    static /* synthetic */ Logger aGi() {
        return cPB;
    }

    static /* synthetic */ Logger aGj() {
        return cPB;
    }

    static /* synthetic */ Logger aGR() {
        return cPB;
    }

    static /* synthetic */ Logger aGS() {
        return cPB;
    }
}

