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
 * Renamed from AZ
 */
public final class az_0
extends apx_1 {
    private static final short ase = 1;
    private int o;
    private byte asf;
    private byte asg;
    private boolean ash;
    @aqd_2(name="is_challenge")
    private boolean asi;
    private boolean asj;
    private short ask;
    private ux_0 asl;
    private short asm;
    private short asn;
    private String aso;
    private String asp;
    private String[] asq;
    private String asr;
    private final ArrayList<ba_0> ass = new ArrayList(2);
    private final ArrayList<bb_0> ast = new ArrayList(2);

    public az_0() {
        super((short)1);
    }

    public void a(ba_0 ba_02) {
        this.ass.add(ba_02);
    }

    public void a(bb_0 bb_02) {
        this.ast.add(bb_02);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n, short s) {
        this.tz(n);
        if (s == 1) {
            Object object;
            int n2;
            byte[] byArray;
            this.o = byteBuffer.getInt();
            this.asf = byteBuffer.get();
            this.asg = byteBuffer.get();
            this.ash = byteBuffer.get() == 1;
            this.asi = byteBuffer.get() == 1;
            this.asj = byteBuffer.get() == 1;
            this.ask = byteBuffer.getShort();
            this.asm = byteBuffer.getShort();
            this.asn = byteBuffer.getShort();
            long l = byteBuffer.getLong();
            this.asl = l != 0L ? uw_0.fn(l) : null;
            try {
                byte[] byArray2 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray2);
                this.asr = new String(byArray2, "UTF-8").intern();
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                cPB.error((Object)"UnsupportedEncodingException during build", (Throwable)unsupportedEncodingException);
            }
            try {
                int n3 = byteBuffer.getInt();
                this.asq = new String[n3];
                for (int i = 0; i < n3; ++i) {
                    byArray = new byte[byteBuffer.getInt()];
                    byteBuffer.get(byArray);
                    this.asq[i] = new String(byArray, "UTF-8").intern();
                }
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                cPB.error((Object)"UnsupportedEncodingException during build", (Throwable)unsupportedEncodingException);
            }
            try {
                byte[] byArray3 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray3);
                this.aso = new String(byArray3, "UTF-8").intern();
                byte[] byArray4 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray4);
                this.asp = new String(byArray4, "UTF-8").intern();
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                cPB.error((Object)"UnsupportedEncodingException during build", (Throwable)unsupportedEncodingException);
            }
            int n4 = byteBuffer.getInt();
            for (n2 = 0; n2 < n4; ++n2) {
                byArray = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray);
                object = new ba_0();
                ((ba_0)object).cT(byArray);
                this.ass.add((ba_0)object);
            }
            n2 = byteBuffer.getInt();
            for (int i = 0; i < n2; ++i) {
                object = new byte[byteBuffer.getInt()];
                byteBuffer.get((byte[])object);
                bb_0 bb_02 = new bb_0();
                bb_02.cU((byte[])object);
                this.ast.add(bb_02);
            }
        } else {
            cPB.error((Object)"Tentative de d\u00e9s\u00e9rialisation d'un objet avec une version non prise en charge");
        }
    }

    @Override
    public apx_1 aFN() {
        return new az_0();
    }

    public ba_0 aFO() {
        return new ba_0();
    }

    public bb_0 aFP() {
        return new bb_0();
    }

    public ArrayList<ba_0> aFQ() {
        return this.ass;
    }

    @Override
    public byte[] aFR() {
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>(this.ass.size());
        ArrayList<byte[]> arrayList2 = new ArrayList<byte[]>(this.ast.size());
        int n = 0;
        n += 4;
        try {
            for (String string : this.asq) {
                n += 4 + string.getBytes("UTF-8").length;
            }
        }
        catch (Exception exception) {
            cPB.error((Object)"Exception during getBinaryData", (Throwable)exception);
        }
        try {
            n += 8;
            n += this.aso != null ? this.aso.getBytes("UTF-8").length : 0;
            n += this.asp != null ? this.asp.getBytes("UTF-8").length : 0;
        }
        catch (Exception exception) {
            cPB.error((Object)"Exception during getBinaryData", (Throwable)exception);
        }
        for (ba_0 ba_02 : this.ass) {
            byte[] byArray = ba_02.aGq();
            n += byArray.length + 4;
            arrayList.add(byArray);
        }
        for (bb_0 bb_02 : this.ast) {
            byte[] byArray = bb_02.aGy();
            n += byArray.length + 4;
            arrayList2.add(byArray);
        }
        try {
            n += 4;
            n += this.asr != null ? this.asr.getBytes("UTF-8").length : 0;
        }
        catch (Exception exception) {
            cPB.error((Object)"Exception during getBinaryData", (Throwable)exception);
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(31 + n);
        byteBuffer.putInt(this.o);
        byteBuffer.put(this.asf);
        byteBuffer.put(this.asg);
        byteBuffer.put(this.ash ? (byte)1 : 0);
        byteBuffer.put(this.asi ? (byte)1 : 0);
        byteBuffer.put(this.asj ? (byte)1 : 0);
        byteBuffer.putShort(this.ask);
        byteBuffer.putShort(this.asm);
        byteBuffer.putShort(this.asn);
        if (this.asl != null) {
            byteBuffer.putLong(this.asl.bjB());
        } else {
            byteBuffer.putLong(0L);
        }
        try {
            if (this.asr != null) {
                byte[] byArray = this.asr.getBytes("UTF-8");
                byteBuffer.putInt(byArray.length);
                byteBuffer.put(byArray);
            } else {
                byteBuffer.putInt(0);
            }
        }
        catch (Exception exception) {
            cPB.error((Object)"Exception during getBinaryData", (Throwable)exception);
        }
        try {
            byteBuffer.putInt(this.asq.length);
            for (String string : this.asq) {
                byte[] byArray = string.getBytes("UTF-8");
                byteBuffer.putInt(byArray.length);
                byteBuffer.put(byArray);
            }
        }
        catch (Exception exception) {
            cPB.error((Object)"Exception during getBinaryData", (Throwable)exception);
        }
        try {
            Object object;
            if (this.aso != null) {
                object = this.aso.getBytes("UTF-8");
                byteBuffer.putInt(((String[])object).length);
                byteBuffer.put((byte[])object);
            } else {
                byteBuffer.putInt(0);
            }
            if (this.asp != null) {
                object = this.asp.getBytes("UTF-8");
                byteBuffer.putInt(((Object)object).length);
                byteBuffer.put((byte[])object);
            } else {
                byteBuffer.putInt(0);
            }
        }
        catch (Exception exception) {
            cPB.error((Object)"Exception during getBinaryData", (Throwable)exception);
        }
        byteBuffer.putInt(arrayList.size());
        for (byte[] byArray : arrayList) {
            byteBuffer.putInt(byArray.length);
            byteBuffer.put(byArray);
        }
        byteBuffer.putInt(arrayList2.size());
        for (byte[] byArray : arrayList2) {
            byteBuffer.putInt(byArray.length);
            byteBuffer.put(byArray);
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

    public ux_0 aFU() {
        return this.asl;
    }

    public int d() {
        return this.o;
    }

    public ArrayList<bb_0> aFV() {
        return this.ast;
    }

    public byte aFW() {
        return this.asf;
    }

    public byte aFX() {
        return this.asg;
    }

    public String[] aFY() {
        return this.asq;
    }

    public String aFZ() {
        return this.aso;
    }

    public String aGa() {
        return this.asp;
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

    public void af(boolean bl) {
        this.ash = bl;
    }

    public void ag(boolean bl) {
        this.asi = bl;
    }

    public void ah(boolean bl) {
        this.asj = bl;
    }

    public void a(short s) {
        this.ask = s;
    }

    public void b(short s) {
        this.asm = s;
    }

    public short aGe() {
        return this.asm;
    }

    public short aGf() {
        return this.asn;
    }

    public void c(short s) {
        this.asn = s;
    }

    public void a(Date date) {
        this.asl = date != null ? uw_0.g(date) : null;
    }

    public void lK(int n) {
        this.o = n;
    }

    public void a(byte by) {
        this.asf = by;
    }

    public void b(byte by) {
        this.asg = by;
    }

    public void a(String[] stringArray) {
        this.asq = stringArray;
    }

    public void ap(String string) {
        this.aso = string;
    }

    public void aq(String string) {
        this.asp = string;
    }

    public void ar(String string) {
        this.asr = string;
    }

    public String aGg() {
        return this.asr;
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
}

