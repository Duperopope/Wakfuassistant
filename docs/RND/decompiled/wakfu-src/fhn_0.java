/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/*
 * Renamed from fhN
 */
public class fhn_0
implements Serializable {
    private int jSm;
    private rd_0 iRT;
    private int jSn;

    public fhn_0() {
        this(0, rd_0.bjA, 0);
    }

    public fhn_0(rd_0 rd_02) {
        this(0, rd_02, 0);
    }

    public fhn_0(byte by) {
        this(0, rd_0.O(by), 0);
    }

    public fhn_0(int n, byte by, int n2) {
        this(n, rd_0.O(by), n2);
    }

    public fhn_0(int n, rd_0 rd_02, int n2) {
        this.jSm = n;
        this.iRT = rd_02;
        this.jSn = n2;
    }

    public int air() {
        return this.jSm;
    }

    public void VG(int n) {
        this.jSm = n;
    }

    public void fYV() {
        this.jSm = 0;
        this.jSn = 0;
    }

    public rd_0 dBe() {
        return this.iRT;
    }

    public void l(rd_0 rd_02) {
        this.iRT = rd_02;
    }

    public int dSU() {
        return this.jSn;
    }

    public Optional<fhc_0> fYW() {
        if (this.jSm <= 0) {
            return Optional.empty();
        }
        return Optional.ofNullable(fgD.fXh().Vd(this.jSm));
    }

    public List<eiy_0> y(ffS ffS2) {
        if (this.iRT == rd_0.bjA) {
            return List.of();
        }
        Optional<fhc_0> optional = this.fYW();
        if (optional.isEmpty()) {
            return List.of();
        }
        fhc_0 fhc_02 = optional.get();
        short s = this.cmL();
        ArrayList<eiy_0> arrayList = new ArrayList<eiy_0>();
        Iterator<enk_0> iterator = fhc_02.fYj();
        while (iterator.hasNext()) {
            eiy_0 eiy_02;
            ero_0 ero_02;
            ero_0 ero_03;
            enk_0 enk_02 = iterator.next();
            if (s > enk_02.fAw() || s < enk_02.fAv() || (ero_03 = (ero_0)enf_0.fBb().pU(enk_02.avZ())) == null || (ero_02 = (ero_0)ero_03.b((qm_0)null)) == null) continue;
            eNl eNl2 = new enm_0().eh(s).fBe();
            enq_0 enq_02 = enq_0.a(true, true, null);
            ero_02.a(enk_02, eNl2, null, null, null, 0, 0, (short)0, (qr_0)enq_02);
            ero_02.E(null);
            if (ero_02 instanceof eON) {
                var13_13 = (eot_0)ero_02;
                eiy_02 = new eiy_0((exx_2)((eot_0)var13_13).fCY());
                eiy_02.PX(var13_13.getValue());
            } else {
                if (!(ero_02 instanceof eok_0)) continue;
                var13_13 = (eok_0)ero_02;
                eiy_02 = new eiy_0((exx_2)((eok_0)var13_13).fCY());
                eiy_02.PX(var13_13.getValue());
                eiy_02.PY(var13_13.getValue());
            }
            if (fhc_02.dSY().fYF().contains(ffS2)) {
                eiy_02.PX(eiy_02.getValue() * 2);
                eiy_02.PY(eiy_02.fwT() * 2);
            }
            arrayList.add(eiy_02);
        }
        return arrayList;
    }

    public short cmL() {
        if (this.jSm <= 0) {
            return 0;
        }
        Object r = fgD.fXh().Vd(this.jSm);
        if (r == null || ((fhc_0)r).dSY() == null) {
            return 0;
        }
        return ((fhc_0)r).dSY().Vz(this.jSn);
    }

    public void Lu(int n) {
        this.jSn = n;
    }

    public void VH(int n) {
        this.jSn += n;
    }

    public void VI(int n) {
        this.jSn -= n;
    }

    public boolean fYK() {
        return this.jSm != 0;
    }

    public fhn_0 fYX() {
        return new fhn_0(this.jSm, this.iRT, this.jSn);
    }

    public boolean h(fhn_0 fhn_02) {
        if (fhn_02 == null) {
            return false;
        }
        if (this.jSm != fhn_02.jSm) {
            return false;
        }
        if (this.iRT != fhn_02.iRT) {
            return false;
        }
        return this.jSn == fhn_02.jSn;
    }

    public String toString() {
        return "{m_slottedItemId:" + this.jSm + ",m_color:" + String.valueOf(this.iRT) + ",m_amount:" + this.jSn + "}";
    }
}

