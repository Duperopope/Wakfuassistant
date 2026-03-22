/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class fiR {
    public static final List<fjd> sti = Collections.nCopies(4, fjd.swH);
    public static final List<Integer> stj = Collections.nCopies(4, fjd.swH.d());
    private static final byte[] stk = new fiR().aVX();
    private int epc;
    private long jYa;
    private int ejM;
    @Nullable
    private fjg keK;
    private short jYc = (short)-1;
    @Nullable
    private List<fjd> kcN;
    private boolean stl = false;
    private int stm = -1;
    private int stn = -1;

    public void reset() {
        this.ge(ByteBuffer.wrap(stk));
    }

    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(this.fZd());
        azg_12.vC(this.epc);
        azg_12.gK(this.jYa);
        azg_12.vC(this.ejM);
        azg_12.aF(this.keK == null ? (byte)-1 : this.keK.aJr());
        azg_12.aG(this.jYc);
        if (this.kcN == null) {
            azg_12.aF((byte)-1);
        } else {
            azg_12.aF((byte)this.kcN.size());
            for (fjd fjd2 : this.kcN) {
                azg_12.aF((byte)fjd2.d());
            }
        }
        azg_12.dz(this.stl);
        azg_12.vC(this.stm);
        azg_12.vC(this.stn);
        return azg_12.bTe();
    }

    public static fiR gg(ByteBuffer byteBuffer) {
        fiR fiR2 = new fiR();
        fiR2.ge(byteBuffer);
        return fiR2;
    }

    private void ge(ByteBuffer byteBuffer) {
        this.Wf(byteBuffer.getInt());
        this.tK(byteBuffer.getLong());
        this.Wg(byteBuffer.getInt());
        this.b(fjg.eL(byteBuffer.get()).orElse(null));
        this.fj(byteBuffer.getShort());
        int n = byteBuffer.get();
        if (n > 0) {
            ArrayList<fjd> arrayList = new ArrayList<fjd>(n);
            for (int i = 0; i < n; ++i) {
                arrayList.add(fjd.Wu(byteBuffer.get()));
            }
            this.be(arrayList);
        } else {
            this.be(null);
        }
        this.nw(byteBuffer.get() > 0);
        this.Wh(byteBuffer.getInt());
        this.Wi(byteBuffer.getInt());
    }

    private int fZd() {
        return 20 + (this.kcN == null ? 0 : this.kcN.size() * 1) + 1 + 4 + 4;
    }

    @Generated
    public int AK() {
        return this.epc;
    }

    @Generated
    public long akd() {
        return this.jYa;
    }

    @Generated
    public int oP() {
        return this.ejM;
    }

    @Nullable
    @Generated
    public fjg dXx() {
        return this.keK;
    }

    @Generated
    public short dUY() {
        return this.jYc;
    }

    @Nullable
    @Generated
    public List<fjd> gaj() {
        return this.kcN;
    }

    @Generated
    public boolean gak() {
        return this.stl;
    }

    @Generated
    public int amQ() {
        return this.stm;
    }

    @Generated
    public int amS() {
        return this.stn;
    }

    @Generated
    public fiR Wf(int n) {
        this.epc = n;
        return this;
    }

    @Generated
    public fiR tK(long l) {
        this.jYa = l;
        return this;
    }

    @Generated
    public fiR Wg(int n) {
        this.ejM = n;
        return this;
    }

    @Generated
    public fiR b(@Nullable fjg fjg2) {
        this.keK = fjg2;
        return this;
    }

    @Generated
    public fiR fj(short s) {
        this.jYc = s;
        return this;
    }

    @Generated
    public fiR be(@Nullable List<fjd> list) {
        this.kcN = list;
        return this;
    }

    @Generated
    public fiR nw(boolean bl) {
        this.stl = bl;
        return this;
    }

    @Generated
    public fiR Wh(int n) {
        this.stm = n;
        return this;
    }

    @Generated
    public fiR Wi(int n) {
        this.stn = n;
        return this;
    }

    @Generated
    public String toString() {
        return "ClientMarketOfferCriteria(m_itemRefId=" + this.AK() + ", m_unitPrice=" + this.akd() + ", m_quantity=" + this.oP() + ", m_sellDuration=" + String.valueOf((Object)this.dXx()) + ", m_itemLevel=" + this.dUY() + ", m_slotColors=" + String.valueOf(this.gaj()) + ", m_slotFixedOrder=" + this.gak() + ", m_sublimationId=" + this.amQ() + ", m_specialSublimationId=" + this.amS() + ")";
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fiR)) {
            return false;
        }
        fiR fiR2 = (fiR)object;
        if (!fiR2.C(this)) {
            return false;
        }
        if (this.AK() != fiR2.AK()) {
            return false;
        }
        if (this.akd() != fiR2.akd()) {
            return false;
        }
        if (this.oP() != fiR2.oP()) {
            return false;
        }
        if (this.dUY() != fiR2.dUY()) {
            return false;
        }
        if (this.gak() != fiR2.gak()) {
            return false;
        }
        if (this.amQ() != fiR2.amQ()) {
            return false;
        }
        if (this.amS() != fiR2.amS()) {
            return false;
        }
        fjg fjg2 = this.dXx();
        fjg fjg3 = fiR2.dXx();
        if (fjg2 == null ? fjg3 != null : !((Object)((Object)fjg2)).equals((Object)fjg3)) {
            return false;
        }
        List<fjd> list = this.gaj();
        List<fjd> list2 = fiR2.gaj();
        return !(list == null ? list2 != null : !((Object)list).equals(list2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof fiR;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.AK();
        long l = this.akd();
        n2 = n2 * 59 + (int)(l >>> 32 ^ l);
        n2 = n2 * 59 + this.oP();
        n2 = n2 * 59 + this.dUY();
        n2 = n2 * 59 + (this.gak() ? 79 : 97);
        n2 = n2 * 59 + this.amQ();
        n2 = n2 * 59 + this.amS();
        fjg fjg2 = this.dXx();
        n2 = n2 * 59 + (fjg2 == null ? 43 : ((Object)((Object)fjg2)).hashCode());
        List<fjd> list = this.gaj();
        n2 = n2 * 59 + (list == null ? 43 : ((Object)list).hashCode());
        return n2;
    }
}

