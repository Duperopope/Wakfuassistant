/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.Map;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public class fiP
extends fiU {
    private int epc = -1;
    @NotNull
    private Map<fja, Integer> stc = new EnumMap<fja, Integer>(fja.class);
    public static final short std = 16384;
    public static final short ste = Short.MIN_VALUE;

    @Override
    public void reset() {
        super.reset();
        this.epc = -1;
        this.stc.clear();
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.getName());
        azg azg2 = new azg(this.eR(byArray));
        this.i(azg2);
        if (this.epc != -1) {
            azg2.vC(this.epc);
        }
        if (!this.stc.isEmpty()) {
            azg2.aF((byte)this.stc.size());
            for (Map.Entry<fja, Integer> entry : this.stc.entrySet()) {
                azg2.aG((short)entry.getKey().d());
                azg2.vC(entry.getValue());
            }
        }
        return azg2.bTe();
    }

    public static fiP gd(ByteBuffer byteBuffer) {
        fiP fiP2 = new fiP();
        fiP2.ge(byteBuffer);
        return fiP2;
    }

    private void ge(ByteBuffer byteBuffer) {
        short s = this.gj(byteBuffer);
        if (fiP.N(s, (short)16384)) {
            this.Wd(byteBuffer.getInt());
        }
        if (fiP.N(s, (short)Short.MIN_VALUE)) {
            int n = byteBuffer.get();
            EnumMap<fja, Integer> enumMap = new EnumMap<fja, Integer>(fja.class);
            for (int i = 0; i < n; ++i) {
                enumMap.put(fja.Wp(byteBuffer.getShort()), byteBuffer.getInt());
            }
            this.P(enumMap);
        }
    }

    private int eR(byte[] byArray) {
        return this.eS(byArray) + (this.epc == -1 ? 0 : 4) + (this.stc.isEmpty() ? 0 : 1 + this.stc.size() * 6);
    }

    @Override
    protected int gaf() {
        return (this.epc == -1 ? 0 : 16384) | (this.stc.isEmpty() ? 0 : Short.MIN_VALUE);
    }

    @Generated
    public int AK() {
        return this.epc;
    }

    @NotNull
    @Generated
    public Map<fja, Integer> gag() {
        return this.stc;
    }

    @Generated
    public fiP Wd(int n) {
        this.epc = n;
        return this;
    }

    @Generated
    public fiP P(@NotNull Map<fja, Integer> map) {
        if (map == null) {
            throw new NullPointerException("m_minCharacteristics is marked non-null but is null");
        }
        this.stc = map;
        return this;
    }

    @Override
    @Generated
    public String toString() {
        return "ClientEntrySearchParameters(m_itemRefId=" + this.AK() + ", m_minCharacteristics=" + String.valueOf(this.gag()) + ")";
    }

    @Override
    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fiP)) {
            return false;
        }
        fiP fiP2 = (fiP)object;
        if (!fiP2.C(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        if (this.AK() != fiP2.AK()) {
            return false;
        }
        Map<fja, Integer> map = this.gag();
        Map<fja, Integer> map2 = fiP2.gag();
        return !(map == null ? map2 != null : !((Object)map).equals(map2));
    }

    @Override
    @Generated
    protected boolean C(Object object) {
        return object instanceof fiP;
    }

    @Override
    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        n2 = n2 * 59 + this.AK();
        Map<fja, Integer> map = this.gag();
        n2 = n2 * 59 + (map == null ? 43 : ((Object)map).hashCode());
        return n2;
    }

    @Override
    @Generated
    public /* synthetic */ fiU We(int n) {
        return this.Wd(n);
    }
}
