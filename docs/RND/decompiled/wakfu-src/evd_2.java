/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Renamed from evd
 */
public class evd_2
implements eur_1 {
    private int[] oss;
    private byte mmV;
    private boolean osH;
    private long lKV;
    private long osq;
    private evt_1 osI = evt_1.owK;
    private evt_1 osJ = evt_1.owK;
    private evu_2 osK = evu_2.ovM;
    private EnumSet<evv_1> osL = EnumSet.noneOf(evv_1.class);
    private evf_1 osM;
    private eva_2 osN = eva_2.osy;
    private euo_1 osr = new euo_1();
    private final List<Mv> osO = new ArrayList<Mv>(Mv.aVz.size());
    private vb_0 ezE = vb_0.bIT;

    public void a(evf_1 evf_12) {
        this.osM = evf_12;
    }

    public void w(int ... nArray) {
        this.oss = (int[])nArray.clone();
    }

    public boolean a(evn_2 evn_22) {
        return this.ba((short)evn_22.ordinal());
    }

    public boolean ba(short s) {
        return evm_2.c(this.oss, s);
    }

    public int[] cWq() {
        if (this.oss == null) {
            return (int[])evm_2.osZ.clone();
        }
        return (int[])this.oss.clone();
    }

    public byte eFW() {
        return this.mmV;
    }

    public void es(byte by) {
        this.mmV = by;
    }

    public void a(evt_1 evt_12) {
        if (this.osI != evt_12) {
            evt_1 evt_13 = this.fdL();
            this.osI = evt_12;
            if (this.osM != null) {
                this.osM.a(evt_13, this.fdL());
            }
        }
    }

    public void b(evt_1 evt_12) {
        this.osJ = evt_12;
    }

    public evt_1 fdL() {
        if (this.osJ != evt_1.owK) {
            return this.osJ;
        }
        return this.osI;
    }

    public evt_1 fdM() {
        return this.osI;
    }

    public evt_1 fdN() {
        return this.osJ;
    }

    public boolean c(evt_1 evt_12) {
        return this.fdL() == evt_12;
    }

    public boolean b(evv_1 evv_12) {
        boolean bl = this.fdL() != null && this.fdL().b(evv_12);
        boolean bl2 = this.osL.contains((Object)evv_12);
        return bl || bl2;
    }

    public boolean c(evv_1 evv_12) {
        boolean bl = this.osL.add(evv_12);
        if (bl && this.osM != null) {
            this.osM.a(this.fdL(), this.fdL());
        }
        return bl;
    }

    public boolean d(evv_1 evv_12) {
        boolean bl = this.osL.remove((Object)evv_12);
        if (bl && this.osM != null) {
            this.osM.a(this.fdL(), this.fdL());
        }
        return bl;
    }

    public EnumSet<evv_1> fdO() {
        return this.osL;
    }

    public boolean e(evv_1 evv_12) {
        return this.osL.contains((Object)evv_12);
    }

    public float fdP() {
        if (this.fdL() == null) {
            return 1.0f;
        }
        return this.fdL().fdP();
    }

    public int fdQ() {
        if (this.fdL() == null) {
            return 0;
        }
        return this.fdL().fdQ();
    }

    public Long fdR() {
        return this.lKV;
    }

    public void K(Long l) {
        this.lKV = l;
    }

    public long fdS() {
        return this.osq;
    }

    public void pd(long l) {
        this.osq = l;
    }

    public void a(euo_1 euo_12) {
        this.osr = euo_12;
    }

    public euo_1 fdE() {
        return this.osr;
    }

    public evu_2 fdT() {
        return this.osK;
    }

    public void a(evu_2 evu_22) {
        this.osK = evu_22;
    }

    public boolean fdU() {
        return this.osK == evu_2.ovO || this.osK == evu_2.ovM;
    }

    public eva_2 fdV() {
        return this.osN;
    }

    public void a(eva_2 eva_22) {
        this.osN = eva_22;
    }

    public void ld(boolean bl) {
        this.osH = bl;
    }

    public boolean fdW() {
        return this.osH;
    }

    public void et(byte by) {
        this.G(Mv.A(by));
    }

    public void G(Collection<Mv> collection) {
        this.osO.clear();
        this.osO.addAll(collection);
    }

    public List<Mv> dxI() {
        return this.osO;
    }

    public byte fdX() {
        return Mv.aJ(this.osO);
    }

    public boolean y(Mv mv) {
        return this.osO.contains((Object)mv);
    }

    public String fdY() {
        return this.osO.stream().map(Mv::aUP).collect(Collectors.joining(";"));
    }

    public vb_0 dxH() {
        return this.ezE;
    }

    public void b(vb_0 vb_02) {
        this.ezE = vb_02;
    }

    public void a(oy_1 oy_12) {
        oy_12.QU = this.oss;
        oy_12.QV = this.osI.owO;
        oy_12.QW = this.osJ.owO;
        oy_12.QX = this.osK.ovP;
        oy_12.Rc = this.osN.aJr();
        oy_12.Rb = this.mmV;
        oy_12.Ra = new int[this.osL.size()];
        oy_12.QY = this.osq;
        oy_12.QZ = this.lKV;
        int n = 0;
        for (evv_1 object2 : this.osL) {
            oy_12.Ra[n] = object2.oxx;
            ++n;
        }
        Set<Map.Entry<euq_1, eup_1>> set = this.osr.fdq();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            oa_1 oa_12 = new oa_1();
            oa_12.Ri = ((euq_1)((Object)entry.getKey())).aJr();
            oa_12.Rj = ((eup_1)entry.getValue()).apJ();
            oy_12.Rd.add(oa_12);
        }
        oy_12.Re = Mv.aJ(this.osO);
    }

    public void b(oy_1 oy_12) {
        evt_1 evt_12 = this.fdL();
        this.oss = oy_12.QU;
        this.osI = evt_1.Oq(oy_12.QV);
        this.osJ = evt_1.Oq(oy_12.QW);
        this.osK = evu_2.Op(oy_12.QX);
        this.mmV = oy_12.Rb;
        this.osN = eva_2.er(oy_12.Rc);
        this.osL.clear();
        this.osq = oy_12.QY;
        this.lKV = oy_12.QZ;
        if (oy_12.Ra != null) {
            for (int i = 0; i < oy_12.Ra.length; ++i) {
                int n = oy_12.Ra[i];
                this.osL.add(evv_1.Or(n));
            }
        }
        for (oa_1 oa_12 : oy_12.Rd) {
            euq_1 euq_12 = euq_1.ep(oa_12.Ri);
            if (euq_12 == null) continue;
            this.osr.a(new eup_1(euq_12, oa_12.Rj));
        }
        this.et(oy_12.Re);
        if (this.osM != null) {
            this.osM.a(evt_12, this.fdL());
        }
    }

    public void clear() {
        this.oss = null;
        this.osI = evt_1.owK;
        this.osJ = evt_1.owK;
        this.osK = evu_2.ovM;
        this.mmV = 0;
        this.osH = false;
        this.osL.clear();
        this.osr.clear();
        this.osO.clear();
    }

    public void a(evd_2 evd_22) {
        this.oss = evd_22.oss;
        this.osI = evd_22.osI;
        this.osJ = evd_22.osJ;
        this.osK = evd_22.osK;
        this.mmV = evd_22.mmV;
        this.osH = evd_22.osH;
        this.osL = evd_22.osL;
        this.osr = evd_22.osr;
        this.G(evd_22.osO);
    }

    public String toString() {
        return "WakfuAccountInformationHandler{, m_debuggingHackMode=" + this.osH + ", m_subscriptionLevel=" + String.valueOf((Object)this.osI) + ", m_antiAddictionLevel=" + String.valueOf((Object)this.osK) + ", m_additionalSlots=" + this.mmV + ", m_additionalRights=" + String.valueOf(this.osL) + ", m_accountData=" + String.valueOf(this.osr) + ", m_languages=" + this.fdY() + "}";
    }
}

