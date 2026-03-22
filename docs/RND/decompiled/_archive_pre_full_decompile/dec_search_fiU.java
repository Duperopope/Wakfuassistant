/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class fiU
extends fiT {
    public static final int sts = -1;
    @NotNull
    private Set<Short> stt = new HashSet<Short>();
    @Nullable
    private String p = null;
    private boolean stu = false;
    @Nullable
    private Mv aVU = null;
    private short aWL = (short)-1;
    private short aWK = (short)-1;
    private boolean stv = false;
    private long stg = -1L;
    private long sth = -1L;
    private boolean stw = false;
    private int bNc = -1;
    private int bNd = -1;
    @NotNull
    private List<fgj> stx = new ArrayList<fgj>();
    @NotNull
    private List<fjd> kcN = new ArrayList<fjd>();
    private boolean stl = false;
    private int stm = -1;
    private int stn = -1;
    public static final short sty = 1;
    public static final short stz = 2;
    public static final short stA = 4;
    public static final short stB = 8;
    public static final short stC = 16;
    public static final short stD = 32;
    public static final short stE = 64;
    public static final short stF = 128;
    public static final short stG = 256;
    public static final short stH = 512;
    public static final short stI = 1024;
    public static final short stJ = 2048;
    public static final short stK = 4096;
    public static final short stL = 8192;

    public void reset() {
        this.stt.clear();
        this.p = null;
        this.stu = false;
        this.aVU = null;
        this.aWL = (short)-1;
        this.aWK = (short)-1;
        this.stv = false;
        this.stg = -1L;
        this.sth = -1L;
        this.stw = false;
        this.bNc = -1;
        this.bNd = -1;
        this.stx.clear();
        this.kcN.clear();
        this.stl = false;
        this.stm = -1;
        this.stn = -1;
    }

    public abstract byte[] aVX();

    protected void i(azg azg2) {
        this.h(azg2);
        azg2.aG((short)this.xr());
        if (!this.stt.isEmpty()) {
            azg2.aG((short)this.stt.size());
            this.stt.forEach(azg2::aG);
        }
        if (this.p != null && !this.p.isEmpty()) {
            byte[] byArray = BH.aP(this.p);
            byte by = GC.ct(byArray.length);
            azg2.aF(by);
            azg2.h(byArray, by);
            azg2.dz(this.stu);
            azg2.aF(this.aVU == null ? (byte)-1 : this.aVU.aJr());
        }
        if (this.aWL != -1) {
            azg2.aG(this.aWL);
        }
        if (this.aWK != -1) {
            azg2.aG(this.aWK);
        }
        if (this.stg != -1L) {
            azg2.gK(this.stg);
        }
        if (this.sth != -1L) {
            azg2.gK(this.sth);
        }
        if (this.bNc != -1) {
            azg2.vC(this.bNc);
        }
        if (this.bNd != -1) {
            azg2.vC(this.bNd);
        }
        if (!this.stx.isEmpty()) {
            azg2.aF((byte)this.stx.size());
            this.stx.forEach(fgj2 -> azg2.aF(fgj2.aJr()));
        }
        if (!this.kcN.isEmpty()) {
            azg2.aF((byte)this.kcN.size());
            this.kcN.forEach(fjd2 -> azg2.aF((byte)fjd2.d()));
            azg2.dz(this.stl);
        }
        if (this.stm != -1) {
            azg2.vC(this.stm);
        }
        if (this.stn != -1) {
            azg2.vC(this.stn);
        }
    }

    protected short gj(ByteBuffer byteBuffer) {
        int n;
        AbstractCollection abstractCollection;
        int n2;
        this.gi(byteBuffer);
        short s = byteBuffer.getShort();
        if (fiU.N(s, (short)1)) {
            n2 = byteBuffer.getShort();
            abstractCollection = new HashSet<Short>(n2);
            for (n = 0; n < n2; ++n) {
                abstractCollection.add(byteBuffer.getShort());
            }
            this.h((Set<Short>)((Object)abstractCollection));
        }
        if (fiU.N(s, (short)2)) {
            this.sN(BH.eE(byteBuffer));
            this.ny(byteBuffer.get() == 1);
            this.E(Mv.z(byteBuffer.get()).orElse(null));
        }
        if (fiU.N(s, (short)4)) {
            this.fk(byteBuffer.getShort());
        }
        if (fiU.N(s, (short)8)) {
            this.fl(byteBuffer.getShort());
        }
        this.nz(fiU.N(s, (short)16));
        if (fiU.N(s, (short)32)) {
            this.tL(byteBuffer.getLong());
        }
        if (fiU.N(s, (short)64)) {
            this.tM(byteBuffer.getLong());
        }
        this.nA(fiU.N(s, (short)128));
        if (fiU.N(s, (short)256)) {
            this.Wk(byteBuffer.getInt());
        }
        if (fiU.N(s, (short)512)) {
            this.Wl(byteBuffer.getInt());
        }
        if (fiU.N(s, (short)1024)) {
            n2 = byteBuffer.get();
            abstractCollection = new ArrayList(n2);
            for (n = 0; n < n2; ++n) {
                abstractCollection.add((fgj)fgj.eV(byteBuffer.get()));
            }
            this.bg((List<fgj>)((Object)abstractCollection));
        }
        if (fiU.N(s, (short)2048)) {
            n2 = byteBuffer.get();
            abstractCollection = new ArrayList(n2);
            for (n = 0; n < n2; ++n) {
                abstractCollection.add(fjd.Wu(byteBuffer.get()));
            }
            this.bh((List<fjd>)((Object)abstractCollection));
            this.nB(byteBuffer.get() > 0);
        }
        if (fiU.N(s, (short)4096)) {
            this.Wm(byteBuffer.getInt());
        }
        if (fiU.N(s, (short)8192)) {
            this.Wn(byteBuffer.getInt());
        }
        return s;
    }

    protected int eS(byte[] byArray) {
        int n = fiU.gam();
        short s = (short)this.xr();
        if (fiU.N(s, (short)1)) {
            n += 2 + this.stt.size() * 2;
        }
        if (fiU.N(s, (short)2)) {
            n += 1 + byArray.length + 1 + 1;
        }
        if (fiU.N(s, (short)4)) {
            n += 2;
        }
        if (fiU.N(s, (short)8)) {
            n += 2;
        }
        if (fiU.N(s, (short)32)) {
            n += 8;
        }
        if (fiU.N(s, (short)64)) {
            n += 8;
        }
        if (fiU.N(s, (short)256)) {
            n += 4;
        }
        if (fiU.N(s, (short)512)) {
            n += 4;
        }
        if (fiU.N(s, (short)1024)) {
            n += 1 + this.stx.size() * 1;
        }
        if (fiU.N(s, (short)2048)) {
            n += 1 + this.kcN.size() * 1 + 1;
        }
        if (fiU.N(s, (short)4096)) {
            n += 4;
        }
        if (fiU.N(s, (short)8192)) {
            n += 4;
        }
        return n;
    }

    protected static boolean N(int n, short s) {
        return (n & s) == s;
    }

    private int xr() {
        return (this.stt.isEmpty() ? 0 : 1) | (this.p == null || this.p.isEmpty() ? 0 : 2) | (this.aWL == -1 ? 0 : 4) | (this.aWK == -1 ? 0 : 8) | (!this.stv ? 0 : 16) | (this.stg == -1L ? 0 : 32) | (this.sth == -1L ? 0 : 64) | (!this.stw ? 0 : 128) | (this.bNc == -1 ? 0 : 256) | (this.bNd == -1 ? 0 : 512) | (this.stx.isEmpty() ? 0 : 1024) | (this.kcN.isEmpty() ? 0 : 2048) | (this.stm == -1 ? 0 : 4096) | (this.stn == -1 ? 0 : 8192) | this.gaf();
    }

    protected abstract int gaf();

    public abstract fiU We(int var1);

    @NotNull
    @Generated
    public Set<Short> gap() {
        return this.stt;
    }

    @Nullable
    @Generated
    public String getName() {
        return this.p;
    }

    @Generated
    public boolean gaq() {
        return this.stu;
    }

    @Nullable
    @Generated
    public Mv aUXX() {
        return this.aVU;
    }

    @Generated
    public short aVf() {
        return this.aWL;
    }

    @Generated
    public short aVe() {
        return this.aWK;
    }

    @Generated
    public boolean gar() {
        return this.stv;
    }

    @Generated
    public long gah() {
        return this.stg;
    }

    @Generated
    public long gai() {
        return this.sth;
    }

    @Generated
    public boolean gas() {
        return this.stw;
    }

    @Generated
    public int gat() {
        return this.bNc;
    }

    @Generated
    public int dVs() {
        return this.bNd;
    }

    @NotNull
    @Generated
    public List<fgj> gau() {
        return this.stx;
    }

    @NotNull
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
    public fiU h(@NotNull Set<Short> set) {
        if (set == null) {
            throw new NullPointerException("m_itemTypes is marked non-null but is null");
        }
        this.stt = set;
        return this;
    }

    @Generated
    public fiU sN(@Nullable String string) {
        this.p = string;
        return this;
    }

    @Generated
    public fiU ny(boolean bl) {
        this.stu = bl;
        return this;
    }

    @Generated
    public fiU E(@Nullable Mv mv) {
        this.aVU = mv;
        return this;
    }

    @Generated
    public fiU fk(short s) {
        this.aWL = s;
        return this;
    }

    @Generated
    public fiU fl(short s) {
        this.aWK = s;
        return this;
    }

    @Generated
    public fiU nz(boolean bl) {
        this.stv = bl;
        return this;
    }

    @Generated
    public fiU tL(long l) {
        this.stg = l;
        return this;
    }

    @Generated
    public fiU tM(long l) {
        this.sth = l;
        return this;
    }

    @Generated
    public fiU nA(boolean bl) {
        this.stw = bl;
        return this;
    }

    @Generated
    public fiU Wk(int n) {
        this.bNc = n;
        return this;
    }

    @Generated
    public fiU Wl(int n) {
        this.bNd = n;
        return this;
    }

    @Generated
    public fiU bg(@NotNull List<fgj> list) {
        if (list == null) {
            throw new NullPointerException("m_itemRarities is marked non-null but is null");
        }
        this.stx = list;
        return this;
    }

    @Generated
    public fiU bh(@NotNull List<fjd> list) {
        if (list == null) {
            throw new NullPointerException("m_slotColors is marked non-null but is null");
        }
        this.kcN = list;
        return this;
    }

    @Generated
    public fiU nB(boolean bl) {
        this.stl = bl;
        return this;
    }

    @Generated
    public fiU Wm(int n) {
        this.stm = n;
        return this;
    }

    @Generated
    public fiU Wn(int n) {
        this.stn = n;
        return this;
    }

    @Override
    @Generated
    public String toString() {
        return "ClientSearchParameters(m_itemTypes=" + String.valueOf(this.gap()) + ", m_name=" + this.getName() + ", m_exactNameMatch=" + this.gaq() + ", m_language=" + String.valueOf((Object)this.aUXX()) + ", m_minLevel=" + this.aVf() + ", m_maxLevel=" + this.aVe() + ", m_onlyExtremePrice=" + this.gar() + ", m_minPrice=" + this.gah() + ", m_maxPrice=" + this.gai() + ", m_onlyIfValid=" + this.gas() + ", m_minQuantity=" + this.gat() + ", m_maxQuantity=" + this.dVs() + ", m_itemRarities=" + String.valueOf(this.gau()) + ", m_slotColors=" + String.valueOf(this.gaj()) + ", m_slotFixedOrder=" + this.gak() + ", m_sublimationId=" + this.amQ() + ", m_specialSublimationId=" + this.amS() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fiU)) {
            return false;
        }
        fiU fiU2 = (fiU)object;
        if (!fiU2.C(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        if (this.gaq() != fiU2.gaq()) {
            return false;
        }
        if (this.aVf() != fiU2.aVf()) {
            return false;
        }
        if (this.aVe() != fiU2.aVe()) {
            return false;
        }
        if (this.gar() != fiU2.gar()) {
            return false;
        }
        if (this.gah() != fiU2.gah()) {
            return false;
        }
        if (this.gai() != fiU2.gai()) {
            return false;
        }
        if (this.gas() != fiU2.gas()) {
            return false;
        }
        if (this.gat() != fiU2.gat()) {
            return false;
        }
        if (this.dVs() != fiU2.dVs()) {
            return false;
        }
        if (this.gak() != fiU2.gak()) {
            return false;
        }
        if (this.amQ() != fiU2.amQ()) {
            return false;
        }
        if (this.amS() != fiU2.amS()) {
            return false;
        }
        Set<Short> set = this.gap();
        Set<Short> set2 = fiU2.gap();
        if (set == null ? set2 != null : !((Object)set).equals(set2)) {
            return false;
        }
        String string = this.getName();
        String string2 = fiU2.getName();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        Mv mv = this.aUXX();
        Mv mv2 = fiU2.aUXX();
        if (mv == null ? mv2 != null : !((Object)((Object)mv)).equals((Object)mv2)) {
            return false;
        }
        List<fgj> list = this.gau();
        List<fgj> list2 = fiU2.gau();
        if (list == null ? list2 != null : !((Object)list).equals(list2)) {
            return false;
        }
        List<fjd> list3 = this.gaj();
        List<fjd> list4 = fiU2.gaj();
        return !(list3 == null ? list4 != null : !((Object)list3).equals(list4));
    }

    @Override
    @Generated
    protected boolean C(Object object) {
        return object instanceof fiU;
    }

    @Override
    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        n2 = n2 * 59 + (this.gaq() ? 79 : 97);
        n2 = n2 * 59 + this.aVf();
        n2 = n2 * 59 + this.aVe();
        n2 = n2 * 59 + (this.gar() ? 79 : 97);
        long l = this.gah();
        n2 = n2 * 59 + (int)(l >>> 32 ^ l);
        long l2 = this.gai();
        n2 = n2 * 59 + (int)(l2 >>> 32 ^ l2);
        n2 = n2 * 59 + (this.gas() ? 79 : 97);
        n2 = n2 * 59 + this.gat();
        n2 = n2 * 59 + this.dVs();
        n2 = n2 * 59 + (this.gak() ? 79 : 97);
        n2 = n2 * 59 + this.amQ();
        n2 = n2 * 59 + this.amS();
        Set<Short> set = this.gap();
        n2 = n2 * 59 + (set == null ? 43 : ((Object)set).hashCode());
        String string = this.getName();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        Mv mv = this.aUXX();
        n2 = n2 * 59 + (mv == null ? 43 : ((Object)((Object)mv)).hashCode());
        List<fgj> list = this.gau();
        n2 = n2 * 59 + (list == null ? 43 : ((Object)list).hashCode());
        List<fjd> list2 = this.gaj();
        n2 = n2 * 59 + (list2 == null ? 43 : ((Object)list2).hashCode());
        return n2;
    }
}
