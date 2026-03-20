/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public class fiS
extends fiU {
    @NotNull
    private List<Integer> sto = new ArrayList<Integer>();
    public static final short stp = 16384;

    @Override
    public void reset() {
        super.reset();
        this.sto.clear();
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.getName());
        azg azg2 = new azg(this.eR(byArray));
        this.i(azg2);
        if (!this.sto.isEmpty()) {
            azg2.aG((short)this.sto.size());
            this.sto.forEach(azg2::vC);
        }
        return azg2.bTe();
    }

    public static fiS gh(ByteBuffer byteBuffer) {
        fiS fiS2 = new fiS();
        fiS2.ge(byteBuffer);
        return fiS2;
    }

    private void ge(ByteBuffer byteBuffer) {
        short s = this.gj(byteBuffer);
        if (fiS.N(s, (short)16384)) {
            int n = byteBuffer.getShort();
            ArrayList<Integer> arrayList = new ArrayList<Integer>(n);
            for (int i = 0; i < n; ++i) {
                arrayList.add(byteBuffer.getInt());
            }
            this.bf(arrayList);
        }
    }

    private int eR(byte[] byArray) {
        return this.eS(byArray) + (this.sto.isEmpty() ? 0 : 2 + this.sto.size() * 4);
    }

    @Override
    protected int gaf() {
        return this.sto.isEmpty() ? 0 : 16384;
    }

    @Override
    public fiU We(int n) {
        if (n == -1) {
            this.sto.clear();
        } else {
            this.sto.add(n);
        }
        return this;
    }

    @NotNull
    @Generated
    public List<Integer> gal() {
        return this.sto;
    }

    @Generated
    public fiS bf(@NotNull List<Integer> list) {
        if (list == null) {
            throw new NullPointerException("m_itemRefIds is marked non-null but is null");
        }
        this.sto = list;
        return this;
    }

    @Override
    @Generated
    public String toString() {
        return "ClientOfferSearchParameters(m_itemRefIds=" + String.valueOf(this.gal()) + ")";
    }

    @Override
    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fiS)) {
            return false;
        }
        fiS fiS2 = (fiS)object;
        if (!fiS2.C(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        List<Integer> list = this.gal();
        List<Integer> list2 = fiS2.gal();
        return !(list == null ? list2 != null : !((Object)list).equals(list2));
    }

    @Override
    @Generated
    protected boolean C(Object object) {
        return object instanceof fiS;
    }

    @Override
    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        List<Integer> list = this.gal();
        n2 = n2 * 59 + (list == null ? 43 : ((Object)list).hashCode());
        return n2;
    }
}
