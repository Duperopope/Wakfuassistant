/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from euV
 */
public class euv_1
extends ff_1 {
    private static final Logger osd = Logger.getLogger(euv_1.class);
    public static final int ose = 150;
    public static boolean osf;
    long aDg;
    long osg;
    String osh;
    String eAk;
    vb_0 ezE = vb_0.bIT;
    int elB;
    int osi;
    private byte mmV;
    long osj;
    private long osk;
    private final byte[][] osl = new byte[3][];
    final long[] osm = new long[3];
    private long osn;
    List<evc_2> oso;
    private long osp;
    private final long osq;
    final euo_1 osr;
    int[] oss = new int[evm_2.fec()];
    private final Collection<euy_1> ost = new ArrayList<euy_1>();
    byte osu;
    protected final fi_1 osv = new euw_1(this);
    protected final fi_1 osw = new eux_1(this);

    public euv_1() {
        this.osr = new euo_1();
        this.osq = System.currentTimeMillis();
    }

    public int arF() {
        return this.elB;
    }

    public List<evc_2> fdu() {
        return this.oso;
    }

    public void Ok(int n) {
        this.elB = n;
    }

    public int fdv() {
        return this.osi;
    }

    public byte fdw() {
        return this.osu;
    }

    public void eq(byte by) {
        this.osu = by;
    }

    public byte eFW() {
        return this.mmV;
    }

    public long cWo() {
        return this.osj;
    }

    public void oZ(long l) {
        this.osj = l;
        this.fdx();
    }

    private void fdx() {
        for (euy_1 euy_12 : this.ost) {
            try {
                euy_12.a(this);
            }
            catch (RuntimeException runtimeException) {
                osd.error((Object)"Exception levee", (Throwable)runtimeException);
            }
        }
    }

    public long fdy() {
        long l = 0L;
        for (evc_2 evc_22 : this.oso) {
            long l2 = evc_22.fdK().getTime();
            if (l >= l2) continue;
            l = l2;
        }
        return l;
    }

    public long fdz() {
        long l = 0L;
        for (evc_2 evc_22 : this.oso) {
            long l2 = evc_22.fdJ().getTime();
            if (evc_22.arF() != this.elB || l <= l2) continue;
            l = l2;
        }
        return l;
    }

    public long fdA() {
        return this.osk;
    }

    public void pa(long l) {
        this.osk = l;
    }

    public long fdB() {
        return this.osn;
    }

    public void pb(long l) {
        this.osn = l;
    }

    public final void a(int n, byte[] byArray, long l) {
        if (n < 0 || n >= 3) {
            throw new IllegalArgumentException("On ne conserve que 3 derni\u00e9res IP utilis\u00e9es");
        }
        this.osl[n] = byArray;
        this.osm[n] = l;
    }

    public byte[] Ol(int n) {
        if (n < 0 || n >= 3) {
            throw new IllegalArgumentException("On ne conserve que 3 derni\u00e9res IP utilis\u00e9es");
        }
        return this.osl[n];
    }

    public long Om(int n) {
        if (n < 0 || n >= 3) {
            throw new IllegalArgumentException("On ne conserve que 3 derni\u00e9res IP utilis\u00e9es");
        }
        return this.osm[n];
    }

    public void b(byte[] byArray, long l) {
        this.osl[2] = this.osl[1];
        this.osl[1] = this.osl[0];
        this.osl[0] = byArray;
        this.osm[2] = this.osm[1];
        this.osm[1] = this.osm[0];
        this.osm[0] = l;
    }

    public long fdC() {
        return this.osp + this.fdD();
    }

    public long fdD() {
        return System.currentTimeMillis() - this.osq;
    }

    public void pc(long l) {
        this.osp = l;
    }

    public String eGs() {
        return this.osh;
    }

    public void oI(String string) {
        this.osh = string;
    }

    public String getTag() {
        return this.eAk;
    }

    public void jt(String string) {
        this.eAk = string;
    }

    public vb_0 dxH() {
        return this.ezE;
    }

    public void b(vb_0 vb_02) {
        this.ezE = vb_02;
    }

    public long xl() {
        return this.aDg;
    }

    public void nL(long l) {
        this.aDg = l;
    }

    public int[] cWq() {
        return this.oss;
    }

    public void w(int[] nArray) {
        this.oss = nArray;
    }

    public void B(Map<String, Long> map) {
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            euq_1 euq_12 = euq_1.rB(entry.getKey());
            if (euq_12 == null) continue;
            this.osr.a(new eup_1(euq_12, entry.getValue()));
            if (osf && euq_12 == euq_1.orM) {
                this.osi = GC.cw(entry.getValue());
                continue;
            }
            if (euq_12 != euq_1.orN) continue;
            this.mmV = GC.ct(entry.getValue());
        }
    }

    public euo_1 fdE() {
        return this.osr;
    }

    @Override
    public fi_1[] zj() {
        return new fi_1[]{this.osv, this.osw};
    }

    public byte[] fdF() {
        return this.a(new fi_1[]{this.osv});
    }

    public byte[] fdG() {
        return this.a(new fi_1[]{this.osw});
    }

    public void a(euy_1 euy_12) {
        if (this.ost.contains(euy_12)) {
            return;
        }
        this.ost.add(euy_12);
    }

    public void b(euy_1 euy_12) {
        this.ost.remove(euy_12);
    }

    public String toString() {
        return "AccountInformations{m_account_id=" + this.aDg + ", m_accountNickName='" + this.osh + "', m_tag='" + this.eAk + "', m_accountCommunity=" + String.valueOf((Object)this.ezE) + ", m_subscriptionLevel=" + this.elB + ", m_antiAddictionLevel=" + this.osi + ", m_additionalSlots=" + this.mmV + ", m_accountExpirationDate=" + this.osj + ", m_banEndDate=" + this.osk + ", m_accountConnectedIp=" + Arrays.toString((Object[])this.osl) + ", m_accountConnectedDate=" + Arrays.toString(this.osm) + ", m_baseTimeElapsed=" + this.osp + ", m_sessionStartTime=" + this.osq + "}";
    }

    public void aF(List<evc_2> list) {
        this.oso = list;
    }
}

