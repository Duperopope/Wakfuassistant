/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TFloatArrayList
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.material.Material;
import gnu.trove.list.array.TFloatArrayList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;

/*
 * Renamed from fFl
 */
public class ffl_2 {
    private static final Logger upa = Logger.getLogger(ffl_2.class);
    private final ArrayList<ffm_2> upb = new ArrayList();
    private ffq_2 upc;
    private int bro;
    private int brq;
    private int brp;
    private int brr;
    private int bjW;
    private int bjX;
    private int upd = Integer.MAX_VALUE;
    private int upe = Integer.MIN_VALUE;
    private int upf = Integer.MAX_VALUE;
    private int upg = Integer.MIN_VALUE;
    private boolean bWn = false;
    private boolean uph = true;
    private int upi;
    private float cZV = 1.0f;
    private awg_1 tEC = null;
    private boolean bmg = true;
    private boolean upj = true;
    private float upk;
    private float upl;
    protected ZG tOu;
    private String jHw;
    private String upm;
    private String upn;
    private long uoD;

    private void gvJ() {
        this.tOu = new ZG(0L);
        this.tOu.dP(fq_0.bJ(this.jHw));
        try {
            this.tOu.k(this.jHw, false);
        }
        catch (IOException iOException) {
            upa.error((Object)"Unable to load anm file", (Throwable)iOException);
            this.tOu.bpI();
            this.tOu = null;
            return;
        }
        this.tOu.a(auw_2.dfI, auw_2.dfM);
        this.tOu.a(abi_1.wG(1));
        this.tOu.dT(this.getAnimName());
        this.tOu.a(Material.daH);
        this.tOu.bpr().c(this.tOu.bpt());
    }

    private String getAnimName() {
        return this.bWn ? this.upn : this.upm;
    }

    public ffl_2() {
        this.brp = Integer.MAX_VALUE;
        this.bro = Integer.MAX_VALUE;
        this.brr = Integer.MIN_VALUE;
        this.brq = Integer.MIN_VALUE;
    }

    public ArrayList<ffm_2> bsL() {
        return this.upb;
    }

    public void c(ffq_2 ffq_22) {
        this.upc = ffq_22;
    }

    public void a(short s, short s2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.upb.add(new ffm_2(s, s2, f2, f3, f4, f5, f6, f7, f8, f9));
        this.bro = Math.min(this.bro, s);
        this.brq = Math.max(this.brq, s);
        this.brp = Math.min(this.brp, s2);
        this.brr = Math.max(this.brr, s2);
        this.L((int)f2, (int)f5, (int)f6, (int)f9);
    }

    private void L(int n, int n2, int n3, int n4) {
        this.upd = Math.min(this.upd, n);
        this.upe = Math.max(this.upe, n3);
        this.upf = Math.min(this.upf, n4);
        this.upg = Math.max(this.upg, n2);
    }

    public void gvK() {
        ffm_2 ffm_22;
        int n;
        Collections.sort(this.upb);
        int n2 = (this.bro + this.brq) / 2;
        int n3 = (this.brp + this.brr) / 2;
        ffm_2 ffm_23 = null;
        this.upf = Integer.MAX_VALUE;
        this.upd = Integer.MAX_VALUE;
        this.upg = Integer.MIN_VALUE;
        this.upe = Integer.MIN_VALUE;
        for (n = this.upb.size() - 1; n >= 0; --n) {
            ffm_22 = this.upb.get(n);
            this.L((int)ffm_22.gvV(), (int)ffm_22.gvY(), (int)ffm_22.gvZ(), (int)ffm_22.gwc());
            if (ffm_22.upo != n2 || ffm_22.upp != n3) continue;
            ffm_23 = ffm_22;
            break;
        }
        if (ffm_23 == null && this.upb.size() > 0) {
            for (n = this.upb.size() / 2; n >= 0; --n) {
                ffm_22 = this.upb.get(n);
                if (ffm_22.upo != n2) continue;
                ffm_23 = ffm_22;
                break;
            }
        }
        if (ffm_23 == null && this.upb.size() > 0) {
            ffm_23 = this.upb.get(this.upb.size() / 2);
        }
        if (ffm_23 != null) {
            this.bjW = ffm_23.upo;
            this.bjX = ffm_23.upp;
            this.upk = (ffm_23.gvV() + ffm_23.gvZ()) / 2.0f;
            this.upl = (ffm_23.gvW() + ffm_23.gwa()) / 2.0f;
        }
    }

    public void oK(boolean bl) {
        this.upj = bl;
    }

    public boolean aq(int n, int n2) {
        if (!this.upj) {
            return false;
        }
        int n3 = this.upb.size();
        for (int i = 0; i < n3; ++i) {
            if (this.upb.get(i).bsM() != n || this.upb.get(i).bsN() != n2) continue;
            return true;
        }
        return false;
    }

    ffm_2 gM(int n, int n2) {
        int n3 = this.upb.size();
        for (int i = 0; i < n3; ++i) {
            ffm_2 ffm_22 = this.upb.get(i);
            if (ffm_22.upo != n || ffm_22.upp != n2) continue;
            return ffm_22;
        }
        return null;
    }

    public float[] gvL() {
        float[] fArray = new float[this.upb.size() * 8];
        int n = this.upb.size();
        for (int i = 0; i < n; ++i) {
            ffm_2 ffm_22 = this.upb.get(i);
            fArray[i * 8] = ffm_22.upq;
            fArray[i * 8 + 1] = ffm_22.dzg;
            fArray[i * 8 + 2] = ffm_22.upr;
            fArray[i * 8 + 3] = ffm_22.ups;
            fArray[i * 8 + 4] = ffm_22.upt;
            fArray[i * 8 + 5] = ffm_22.upu;
            fArray[i * 8 + 6] = ffm_22.upv;
            fArray[i * 8 + 7] = ffm_22.upw;
        }
        return fArray;
    }

    public void a(TFloatArrayList tFloatArrayList) {
        for (int i = this.bro - 1; i < this.brq + 1; ++i) {
            for (int j = this.brp - 1; j < this.brr + 1; ++j) {
                ffm_2 ffm_22 = this.gM(i, j);
                ffm_2 ffm_23 = this.gM(i, j + 1);
                ffm_2 ffm_24 = this.gM(i + 1, j);
                if (ffm_22 == null) {
                    if (ffm_23 != null) {
                        tFloatArrayList.add(ffm_23.upr);
                        tFloatArrayList.add(ffm_23.ups);
                        tFloatArrayList.add(ffm_23.upt);
                        tFloatArrayList.add(ffm_23.upu);
                    }
                    if (ffm_24 == null) continue;
                    tFloatArrayList.add(ffm_24.upq);
                    tFloatArrayList.add(ffm_24.dzg);
                    tFloatArrayList.add(ffm_24.upr);
                    tFloatArrayList.add(ffm_24.ups);
                    continue;
                }
                if (ffm_23 == null) {
                    tFloatArrayList.add(ffm_22.upq);
                    tFloatArrayList.add(ffm_22.dzg);
                    tFloatArrayList.add(ffm_22.upv);
                    tFloatArrayList.add(ffm_22.upw);
                }
                if (ffm_24 != null) continue;
                tFloatArrayList.add(ffm_22.upt);
                tFloatArrayList.add(ffm_22.upu);
                tFloatArrayList.add(ffm_22.upv);
                tFloatArrayList.add(ffm_22.upw);
            }
        }
    }

    public int bgm() {
        return this.bro;
    }

    public int bgo() {
        return this.brq;
    }

    public int bgn() {
        return this.brp;
    }

    public int bgp() {
        return this.brr;
    }

    public axb_2 getColor() {
        return this.upc.dYq();
    }

    public String dZs() {
        return this.upc.dZs();
    }

    public boolean bqr() {
        return this.bWn;
    }

    public void setSelected(boolean bl) {
        if (this.bWn == bl) {
            return;
        }
        this.bWn = bl;
        this.uph = true;
    }

    public int gvM() {
        return this.upi;
    }

    public void aaQ(int n) {
        this.upi = n;
    }

    public float bKh() {
        return this.cZV;
    }

    public void cN(float f2) {
        this.cZV = f2;
    }

    public int bgv() {
        return this.bjW;
    }

    public int bgu() {
        return this.bjX;
    }

    public float gvN() {
        return this.upk;
    }

    public float gvO() {
        return this.upl;
    }

    public int gvP() {
        return this.upd;
    }

    public int gvQ() {
        return this.upe;
    }

    public int gvR() {
        return this.upf;
    }

    public int gvS() {
        return this.upg;
    }

    public awg_1 getPixmap() {
        return this.tEC;
    }

    public void setPixmap(awg_1 awg_12) {
        this.tEC = awg_12;
    }

    public void mE(String string) {
        this.jHw = string;
    }

    public void tV(String string) {
        this.upm = string;
    }

    public void tW(String string) {
        this.upn = string;
    }

    public void uZ(long l) {
        this.uoD = l;
    }

    public void bmX() {
        if (this.tEC != null && this.tEC.bHg() != null) {
            this.tEC.bHg().bsI();
            this.tEC = null;
        }
        if (this.tOu != null) {
            this.tOu.bpI();
            this.tOu = null;
        }
    }

    public ffq_2 gvT() {
        return this.upc;
    }

    public boolean isVisible() {
        return this.bmg;
    }

    public void setVisible(boolean bl) {
        this.bmg = bl;
    }

    public ZG gvU() {
        return this.tOu;
    }

    public boolean aaR(int n) {
        if (!this.bmg) {
            return true;
        }
        if (!this.bwK()) {
            return true;
        }
        this.gst();
        if (this.uph) {
            if (this.bWn && this.uoD != -1L) {
                fhy_2.gBq().nW(this.uoD);
            }
            this.tOu.dT(this.getAnimName());
            this.uph = false;
        }
        this.tOu.b((afV)null, n);
        return true;
    }

    private boolean bwK() {
        if (this.tOu == null && this.jHw != null && this.upm != null && this.upn != null) {
            this.gvJ();
        }
        return this.tOu != null;
    }

    protected void gst() {
        Entity entity = this.tOu.bpq();
        awp_1 awp_12 = (awp_1)entity.bIS().uW(0);
        awp_12.A(this.upk, this.upl, 0.0f);
        float f2 = 1.0f;
        if (this.tOu.bqd() != null) {
            f2 = this.tOu.bqd().getScale();
        }
        float f3 = 60.0f;
        awp_12.B(60.0f / f2, 60.0f / f2, 0.0f);
        entity.bIS().bPv();
    }
}

