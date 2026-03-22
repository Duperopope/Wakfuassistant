/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from fpH
 */
public final class fph_0 {
    private final long sQD;
    private final TLongObjectHashMap<fpg_0> sQE = new TLongObjectHashMap();

    public fph_0(long l) {
        this.sQD = l;
    }

    private fpg_0 ux(long l) {
        fpg_0 fpg_02 = (fpg_0)this.sQE.get(l);
        if (fpg_02 == null) {
            fpg_02 = new fpg_0();
            this.sQE.put(l, (Object)fpg_02);
        }
        return fpg_02;
    }

    public void ap(long l, int n) {
        fpg_0 fpg_02 = this.ux(l);
        fpg_02.YD(n);
    }

    public void aq(long l, int n) {
        fpg_0 fpg_02 = this.ux(l);
        fpg_02.YE(n);
    }

    public void ar(long l, int n) {
        fpg_0 fpg_02 = this.ux(l);
        fpg_02.YF(n);
    }

    public void a(long l, fpp_0 fpp_02) {
        fpg_0 fpg_02 = this.ux(l);
        fpg_02.g(fpp_02);
    }

    public void as(long l, int n) {
        fpg_0 fpg_02 = this.ux(l);
        fpg_02.YG(n);
    }

    public void b(long l, fpp_0 fpp_02) {
        fpg_0 fpg_02 = this.ux(l);
        fpg_02.h(fpp_02);
    }

    public void at(long l, int n) {
        fpg_0 fpg_02 = this.ux(l);
        fpg_02.YH(n);
    }

    public long Tx() {
        return this.sQD;
    }

    public TLongObjectHashMap<fpg_0> ghl() {
        return this.sQE;
    }

    public String toString() {
        return "PvpFightReport{m_fightId=" + this.sQD + ", m_playersReportsInfos=" + String.valueOf(this.sQE) + "}";
    }
}

