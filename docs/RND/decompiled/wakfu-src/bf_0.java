/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/*
 * Renamed from Bf
 */
public class bf_0 {
    private int o;
    private int atn;
    private String ato;
    private String atf;
    private String atl;
    private boolean atm;
    private String[] atp;
    private String[] atq;
    private final TIntArrayList atr = new TIntArrayList(2);

    public final void lY(int n) {
        this.atr.add(n);
    }

    public TIntArrayList aHj() {
        return this.atr;
    }

    public final String aHk() {
        return this.ato;
    }

    public final int aHl() {
        return this.o;
    }

    public final String[] aHm() {
        return this.atp;
    }

    public final String[] aHn() {
        return this.atq;
    }

    public final String aHo() {
        return this.atl;
    }

    public String aGU() {
        return this.atf;
    }

    public final int aHp() {
        return this.atn;
    }

    public final boolean aHq() {
        return this.atm;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final byte[] aHr() {
        ByteBuffer byteBuffer = null;
        try {
            byte[] byArray;
            byte[] byArray2 = this.ato == null ? new byte[]{} : this.ato.getBytes("UTF-8");
            byte[] byArray3 = this.atl == null ? new byte[]{} : this.atl.getBytes("UTF-8");
            byte[] byArray4 = this.atf == null ? new byte[]{} : this.atf.getBytes("UTF-8");
            int n = byArray2.length + byArray3.length + byArray4.length;
            if (this.atp != null) {
                for (String string : this.atp) {
                    n += string.getBytes("UTF-8").length + 4;
                }
            }
            if (this.atq != null) {
                for (String string : this.atq) {
                    n += string.getBytes("UTF-8").length + 4;
                }
            }
            byteBuffer = ByteBuffer.allocate(33 + (n += 4 * this.atr.size()));
            byteBuffer.putInt(this.o);
            byteBuffer.putInt(this.atn);
            byteBuffer.put(this.atm ? (byte)1 : 0);
            byteBuffer.putInt(byArray2.length);
            byteBuffer.put(byArray2);
            byteBuffer.putInt(byArray3.length);
            byteBuffer.put(byArray3);
            byteBuffer.putInt(byArray4.length);
            byteBuffer.put(byArray4);
            if (this.atp != null) {
                byteBuffer.putInt(this.atp.length);
                for (String string : this.atp) {
                    byArray = string.getBytes("UTF-8");
                    byteBuffer.putInt(byArray.length);
                    byteBuffer.put(byArray);
                }
            } else {
                byteBuffer.putInt(0);
            }
            if (this.atq != null) {
                byteBuffer.putInt(this.atq.length);
                for (String string : this.atq) {
                    byArray = string.getBytes("UTF-8");
                    byteBuffer.putInt(byArray.length);
                    byteBuffer.put(byArray);
                }
            } else {
                byteBuffer.putInt(0);
            }
            String[] stringArray = this.atr;
            synchronized (this.atr) {
                byteBuffer.putInt(this.atr.size());
                for (int i = 0; i < this.atr.size(); ++i) {
                    byteBuffer.putInt(this.atr.getQuick(i));
                }
                // ** MonitorExit[var6_7] (shouldn't be in output)
            }
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            bd_0.aGj().error((Object)"UnsupportedEncodingException during serialize", (Throwable)unsupportedEncodingException);
        }
        {
            return byteBuffer.array();
        }
    }

    public final void aF(String string) {
        this.ato = string;
    }

    public final void lZ(int n) {
        this.o = n;
    }

    public final void ar(boolean bl) {
        this.atm = bl;
    }

    public final void c(String[] stringArray) {
        this.atp = stringArray;
    }

    public final void d(String[] stringArray) {
        this.atq = stringArray;
    }

    public final void aG(String string) {
        this.atl = string;
    }

    public void ax(String string) {
        this.atf = string;
    }

    public final void ma(int n) {
        this.atn = n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void cW(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        try {
            int n;
            this.o = byteBuffer.getInt();
            this.atn = byteBuffer.getInt();
            this.atm = byteBuffer.get() == 1;
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            this.ato = new String(byArray2, "UTF-8").intern();
            byte[] byArray3 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray3);
            this.atl = new String(byArray3, "UTF-8").intern();
            byte[] byArray4 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray4);
            this.atf = new String(byArray4, "UTF-8").intern();
            int n2 = byteBuffer.getInt();
            this.atp = new String[n2];
            for (n = 0; n < n2; ++n) {
                byte[] byArray5 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray5);
                this.atp[n] = new String(byArray5, "UTF-8").intern();
            }
            n = byteBuffer.getInt();
            this.atq = new String[n];
            for (int i = 0; i < n; ++i) {
                byte[] byArray6 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray6);
                this.atq[i] = new String(byArray6, "UTF-8").intern();
            }
            TIntArrayList tIntArrayList = this.atr;
            synchronized (tIntArrayList) {
                int n3 = byteBuffer.getInt();
                for (int i = 0; i < n3; ++i) {
                    this.atr.add(byteBuffer.getInt());
                }
            }
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            bd_0.aGR().error((Object)"UnsupportedEncodingException during unserialise", (Throwable)unsupportedEncodingException);
        }
    }
}

