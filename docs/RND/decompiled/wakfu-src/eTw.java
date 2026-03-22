/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.impl.HashFunctions
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import gnu.trove.impl.HashFunctions;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class eTw
implements ayx_2,
eTs {
    protected static final Logger rpd = Logger.getLogger(eTw.class);
    private long bgK;
    private uw_0 mko;
    private uw_0 bwH;
    private String cxT;
    private String jbB;
    private long ePP;
    private boolean rpe = true;
    private byte asf;
    private byte cju = 0;
    private byte odp = (byte)2;
    private TLongObjectHashMap<String> rpf = new TLongObjectHashMap();
    private byte odq = (byte)2;
    private TLongObjectHashMap<String> rpg = new TLongObjectHashMap();
    private static long rph = -1L;
    private boolean rdF;
    private static final ObjectPool rpi = new ayv_2(new eTx());
    private static int rpj = 0;

    public static eTw fJe() {
        eTw eTw2;
        try {
            eTw2 = (eTw)rpi.borrowObject();
            eTw2.rdF = true;
            ++rpj;
        }
        catch (Exception exception) {
            eTw2 = new eTw();
            rpd.error((Object)("Erreur lors d'un checkOut sur un message de type CreateGuildRequestMessage : " + exception.getMessage()));
        }
        return eTw2;
    }

    @Override
    public void aVI() {
        this.odp = (byte)2;
        this.odq = (byte)2;
    }

    @Override
    public void aVH() {
        this.bgK = -1L;
        this.mko = null;
        this.bwH = null;
        this.jbB = null;
        this.cxT = null;
        this.odp = 0;
        this.odq = 0;
        this.ePP = -1L;
        this.cju = 0;
        this.rpf.clear();
        this.rpg.clear();
    }

    public void aZp() {
        if (this.rdF) {
            try {
                rpi.returnObject((Object)this);
                --rpj;
                this.rdF = false;
            }
            catch (Exception exception) {
                rpd.error((Object)"Exception levee", (Throwable)exception);
            }
        } else {
            this.aVH();
        }
    }

    public eTw() {
    }

    public eTw(String string, String string2, long l, byte by, byte by2, ux_0 ux_02) {
        this(string, string2, l, by, by2, ux_02, true);
    }

    public eTw(String string, String string2, long l, byte by, byte by2, ux_0 ux_02, boolean bl) {
        this.a(string, string2, l, by, by2, bl);
        this.D(ux_02);
    }

    public eTw(String string, String string2, long l, byte by, byte by2, int n, int n2, int n3) {
        this(string, string2, l, by, by2, n, n2, n3, true);
    }

    public eTw(String string, String string2, long l, byte by, byte by2, int n, int n2, int n3, boolean bl) {
        this.a(string, string2, l, by, by2, bl);
        this.d(0, 0, n, n2, n3);
    }

    public eTw(String string, String string2, long l, byte by, byte by2, byte by3, byte by4, short s, byte by5, byte by6) {
        this(string, string2, l, by, by2, by3, by4, s, by5, by6, true);
    }

    public eTw(String string, String string2, long l, byte by, byte by2, byte by3, byte by4, short s, byte by5, byte by6, boolean bl) {
        this.a(string, string2, l, by, by2, bl);
        this.d(by6, by5, by3, by4, s);
    }

    private void a(String string, String string2, long l, byte by, byte by2, boolean bl) {
        this.fJf();
        this.cxT = string != null ? string : "";
        this.jbB = string2 != null ? string2 : "";
        this.ePP = l;
        this.asf = by;
        this.cju = by2;
        this.rpe = bl;
    }

    public void o(eTw eTw2) {
        TLongObjectIterator tLongObjectIterator;
        this.bgK = eTw2.bgK;
        this.cxT = eTw2.cxT;
        this.jbB = eTw2.jbB;
        this.ePP = eTw2.ePP;
        this.asf = eTw2.asf;
        this.cju = eTw2.cju;
        this.rpe = eTw2.rpe;
        if (eTw2.mko != null) {
            this.mko = new uw_0(eTw2.mko);
        }
        if (eTw2.bwH != null) {
            this.bwH = new uw_0(eTw2.bwH);
        }
        this.odp = eTw2.odp;
        this.odq = eTw2.odq;
        this.rpf.clear();
        if (!eTw2.rpf.isEmpty()) {
            tLongObjectIterator = eTw2.rpf.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                this.rpf.put(tLongObjectIterator.key(), (Object)((String)tLongObjectIterator.value()));
            }
        }
        this.rpg.clear();
        if (!eTw2.rpg.isEmpty()) {
            tLongObjectIterator = eTw2.rpg.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                this.rpg.put(tLongObjectIterator.key(), (Object)((String)tLongObjectIterator.value()));
            }
        }
    }

    public void d(int n, int n2, int n3, int n4, int n5) {
        if (this.mko == null) {
            this.mko = new uw_0(0, n, n2, n3, n4, n5);
        } else {
            this.mko.a(0, n, n2, n3, n4, n5);
        }
    }

    public void e(int n, int n2, int n3, int n4, int n5) {
        if (this.bwH == null) {
            this.bwH = new uw_0(0, n, n2, n3, n4, n5);
        } else {
            this.bwH.a(0, n, n2, n3, n4, n5);
        }
    }

    public void D(ux_0 ux_02) {
        this.mko = new uw_0(ux_02);
    }

    public void P(ux_0 ux_02) {
        this.bwH = new uw_0(ux_02);
    }

    public void di(long l) {
        this.bgK = l;
    }

    public void fJf() {
        this.bgK = rph--;
    }

    public long Lx() {
        return this.bgK;
    }

    public void eQ(String string) {
        if (string.length() > 32) {
            string = string.substring(0, 32);
        }
        this.cxT = string;
    }

    public void oA(String string) {
        if (string.length() > 127) {
            string = string.substring(0, 127);
        }
        this.jbB = string;
    }

    public void pi(long l) {
        this.ePP = l;
    }

    public void a(byte by) {
        this.asf = by;
    }

    public void bE(byte by) {
        this.cju = by;
    }

    public void mA(boolean bl) {
        this.rpe = bl;
    }

    public boolean fJg() {
        return this.rpe;
    }

    public void mB(boolean bl) {
        this.rpe = bl;
    }

    public uw_0 fJh() {
        return this.mko;
    }

    @Override
    public ux_0 dis() {
        return this.mko;
    }

    public uw_0 fJi() {
        return this.bwH;
    }

    public ux_0 bka() {
        return this.bwH;
    }

    @Override
    public String bAD() {
        return this.cxT;
    }

    @Override
    public String getDescription() {
        return this.jbB;
    }

    @Override
    public long Xi() {
        return this.ePP;
    }

    @Override
    public byte aFW() {
        return this.asf;
    }

    public byte eJz() {
        return this.cju;
    }

    public byte faA() {
        return this.odp;
    }

    public void bC(byte by) {
        this.odp = by;
    }

    public byte faB() {
        return this.odq;
    }

    public void bD(byte by) {
        this.odq = by;
    }

    public void i(long l, String string) {
        this.rpf.put(l, (Object)string);
    }

    public String qC(long l) {
        return (String)this.rpf.remove(l);
    }

    public TLongObjectHashMap<String> fJj() {
        return this.rpf;
    }

    public void j(long l, String string) {
        this.rpg.put(l, (Object)string);
    }

    public String qD(long l) {
        return (String)this.rpg.remove(l);
    }

    public TLongObjectHashMap<String> fJk() {
        return this.rpg;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eTw)) {
            return false;
        }
        eTw eTw2 = (eTw)object;
        if (this.mko != null) {
            if (this.mko.bjD() != eTw2.mko.bjD()) {
                return false;
            }
            if (this.mko.bjG() != this.mko.bjG()) {
                return false;
            }
            if (this.mko.bjI() != eTw2.mko.bjI()) {
                return false;
            }
        }
        if (this.ePP != eTw2.ePP) {
            return false;
        }
        if (this.asf != eTw2.asf) {
            return false;
        }
        if (this.cju != eTw2.cju) {
            return false;
        }
        return this.cxT != null ? this.cxT.toLowerCase().equals(eTw2.cxT.toLowerCase()) : eTw2.cxT == null;
    }

    public int hashCode() {
        return (int)(this.bgK ^ this.bgK >>> 32);
    }

    public int fJl() {
        int n = 31 * HashFunctions.hash((long)this.mko.bjB());
        n = 31 * n + (this.cxT != null ? this.cxT.hashCode() : 0);
        n = 31 * n + (int)(this.ePP ^ this.ePP >>> 32);
        n = 31 * n + this.asf;
        n = 31 * n + this.cju;
        return n;
    }

    public String toString() {
        return "WakfuCalendarEvent{\nm_uid=" + this.bgK + ", m_startDate=" + String.valueOf(this.mko) + ", m_endDate=" + String.valueOf(this.bwH) + ", m_title=\"" + this.cxT + "\", m_desc=\"" + this.jbB + "\"\nm_ownerId=" + this.ePP + ", m_type=" + this.asf + "\nm_evolution=" + this.cju + "\nm_participants=" + this.d(this.rpf) + ", m_registered=" + this.d(this.rpg) + "\n}";
    }

    private String d(TLongObjectHashMap<String> tLongObjectHashMap) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            String string = (String)tLongObjectIterator.value();
            long l = tLongObjectIterator.key();
            stringBuilder.append("(").append(l).append(",").append(string).append(")").append(";");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean Q(ux_0 ux_02) {
        return this.mko.bjI() <= ux_02.bjI() && this.mko.bjG() < ux_02.bjG();
    }

    public eTw mC(boolean bl) {
        eTw eTw2 = bl ? eTw.fJe() : new eTw();
        eTw2.cxT = this.cxT;
        eTw2.jbB = this.jbB;
        eTw2.mko = this.mko;
        eTw2.bwH = this.bwH;
        eTw2.odp = this.odp;
        eTw2.odq = this.odq;
        eTw2.ePP = this.ePP;
        eTw2.rpf = new TLongObjectHashMap(this.rpf);
        eTw2.rpg = new TLongObjectHashMap(this.rpg);
        eTw2.asf = this.asf;
        eTw2.cju = this.cju;
        eTw2.bgK = this.bgK;
        return eTw2;
    }
}

