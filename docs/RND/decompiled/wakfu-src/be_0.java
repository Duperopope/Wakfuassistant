/*
 * Decompiled with CFR 0.152.
 */
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from Be
 */
public class be_0 {
    private int o;
    private short atb;
    private String atc;
    private String atd;
    private String ate;
    private String atf;
    private boolean atg;
    private boolean asv;
    private String ath;
    private String ati;
    private String[] atj;
    private String asx;
    private final ArrayList<bf_0> atk = new ArrayList(2);
    private String atl;
    private boolean atm;

    public be_0(bd_0 bd_02) {
    }

    public final void a(bf_0 bf_02) {
        this.atk.add(bf_02);
    }

    public final ArrayList<bf_0> aGT() {
        return this.atk;
    }

    public final String aGU() {
        return this.atf;
    }

    public final String aGV() {
        return this.ate;
    }

    public final String[] aGW() {
        return this.atj;
    }

    public final String aGX() {
        return this.ati;
    }

    public final String aGY() {
        return this.ath;
    }

    public final int aGZ() {
        return this.o;
    }

    public final String aHa() {
        return this.atc;
    }

    public final short aHb() {
        return this.atb;
    }

    public final String aHc() {
        return this.asx;
    }

    public final String aHd() {
        return this.atl;
    }

    public final String aHe() {
        return this.atd;
    }

    public final boolean aHf() {
        return this.asv;
    }

    public final boolean aHg() {
        return this.atm;
    }

    public final boolean aHh() {
        return this.atg;
    }

    public final byte[] aHi() {
        ByteBuffer byteBuffer = null;
        try {
            byte[] byArray = this.atc == null ? new byte[]{} : this.atc.getBytes("UTF-8");
            byte[] byArray2 = this.atd == null ? new byte[]{} : this.atd.getBytes("UTF-8");
            byte[] byArray3 = this.ate == null ? new byte[]{} : this.ate.getBytes("UTF-8");
            byte[] byArray4 = this.atf == null ? new byte[]{} : this.atf.getBytes("UTF-8");
            byte[] byArray5 = this.ath == null ? new byte[]{} : this.ath.getBytes("UTF-8");
            byte[] byArray6 = this.ati == null ? new byte[]{} : this.ati.getBytes("UTF-8");
            byte[] byArray7 = this.asx == null ? new byte[]{} : this.asx.getBytes("UTF-8");
            byte[] byArray8 = this.atl == null ? new byte[]{} : this.atl.getBytes("UTF-8");
            ArrayList<byte[]> arrayList = new ArrayList<byte[]>(this.atk.size());
            int n = byArray.length + byArray2.length + byArray3.length + byArray4.length + byArray5.length + byArray6.length + byArray8.length + byArray7.length;
            if (this.atj != null) {
                for (String object : this.atj) {
                    n += object.getBytes("UTF-8").length + 4;
                }
            }
            for (bf_0 bf_02 : this.atk) {
                byte[] byArray9 = bf_02.aHr();
                n += byArray9.length + 4;
                arrayList.add(byArray9);
            }
            byteBuffer = ByteBuffer.allocate(49 + n);
            byteBuffer.putInt(this.o);
            byteBuffer.putShort(this.atb);
            byteBuffer.put(this.atg ? (byte)1 : 0);
            byteBuffer.put(this.asv ? (byte)1 : 0);
            byteBuffer.put(this.atm ? (byte)1 : 0);
            byteBuffer.putInt(byArray.length);
            byteBuffer.put(byArray);
            byteBuffer.putInt(byArray2.length);
            byteBuffer.put(byArray2);
            byteBuffer.putInt(byArray3.length);
            byteBuffer.put(byArray3);
            byteBuffer.putInt(byArray4.length);
            byteBuffer.put(byArray4);
            byteBuffer.putInt(byArray5.length);
            byteBuffer.put(byArray5);
            byteBuffer.putInt(byArray6.length);
            byteBuffer.put(byArray6);
            byteBuffer.putInt(byArray7.length);
            byteBuffer.put(byArray7);
            byteBuffer.putInt(byArray8.length);
            byteBuffer.put(byArray8);
            if (this.atj != null) {
                byteBuffer.putInt(this.atj.length);
                for (String string : this.atj) {
                    byte[] byArray9 = string.getBytes("UTF-8");
                    byteBuffer.putInt(byArray9.length);
                    byteBuffer.put(byArray9);
                }
            } else {
                byteBuffer.putInt(0);
            }
            byteBuffer.putInt(arrayList.size());
            for (byte[] byArray11 : arrayList) {
                byteBuffer.putInt(byArray11.length);
                byteBuffer.put(byArray11);
            }
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            bd_0.aGh().error((Object)"UnsupportedEncodingException during serialize", (Throwable)unsupportedEncodingException);
        }
        return byteBuffer.array();
    }

    public final void ao(boolean bl) {
        this.asv = bl;
    }

    public final void ax(String string) {
        this.atf = string;
    }

    public final void ay(String string) {
        this.ate = string;
    }

    public final void b(String[] stringArray) {
        this.atj = stringArray;
    }

    public final void az(String string) {
        this.ati = string;
    }

    public final void aA(String string) {
        this.ath = string;
    }

    public final void lX(int n) {
        this.o = n;
    }

    public final void aB(String string) {
        this.atc = string;
    }

    public final void ap(boolean bl) {
        this.atm = bl;
    }

    public final void h(short s) {
        this.atb = s;
    }

    public final void aq(boolean bl) {
        this.atg = bl;
    }

    public final void aC(String string) {
        this.asx = string;
    }

    public final void aD(String string) {
        this.atl = string;
    }

    public final void aE(String string) {
        this.atd = string;
    }

    public final void cV(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.o = byteBuffer.getInt();
        this.atb = byteBuffer.getShort();
        this.atg = byteBuffer.get() == 1;
        this.asv = byteBuffer.get() == 1;
        this.atm = byteBuffer.get() == 1;
        try {
            int n;
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            this.atc = new String(byArray2, "UTF-8").intern();
            byte[] byArray3 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray3);
            this.atd = new String(byArray3, "UTF-8").intern();
            byte[] byArray4 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray4);
            this.ate = new String(byArray4, "UTF-8").intern();
            byte[] byArray5 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray5);
            this.atf = new String(byArray5, "UTF-8").intern();
            byte[] byArray6 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray6);
            this.ath = new String(byArray6, "UTF-8").intern();
            byte[] byArray7 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray7);
            this.ati = new String(byArray7, "UTF-8").intern();
            byte[] byArray8 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray8);
            this.asx = new String(byArray8, "UTF-8").intern();
            byte[] byArray9 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray9);
            this.atl = new String(byArray9, "UTF-8").intern();
            int n2 = byteBuffer.getInt();
            this.atj = new String[n2];
            for (n = 0; n < n2; ++n) {
                byte[] byArray10 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray10);
                this.atj[n] = new String(byArray10, "UTF-8").intern();
            }
            n = byteBuffer.getInt();
            for (int i = 0; i < n; ++i) {
                byte[] byArray11 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray11);
                bf_0 bf_02 = new bf_0();
                bf_02.cW(byArray11);
                this.atk.add(bf_02);
            }
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            bd_0.aGi().error((Object)"UnsupportedEncodingException during unserialise", (Throwable)unsupportedEncodingException);
        }
    }
}

