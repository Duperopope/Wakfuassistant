/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eWT
 */
public class ewt_1
implements ewp_1 {
    private final ewp_1 rCD;
    private ewx_1 hDE;
    private int rCE;
    private int rCF;

    public ewt_1(ewp_1 ewp_12) {
        this.rCD = ewp_12;
        this.hDE = ewx_1.rCS;
    }

    public void a(ewx_1 ewx_12) {
        this.hDE = ewx_12;
    }

    public ewx_1 ezS() {
        return this.hDE;
    }

    @Override
    public int d() {
        return this.rCD.d();
    }

    @Override
    public int aVt() {
        return this.rCD.aVt();
    }

    @Override
    public short bdn() {
        return this.rCD.bdn();
    }

    @Override
    public ang_2 bdo() {
        return this.rCD.bdo();
    }

    @Override
    public int LR() {
        return this.rCD.LR();
    }

    @Override
    public int fOo() {
        return this.rCD.fOo();
    }

    @Override
    public int fOp() {
        return this.rCD.fOp();
    }

    @Override
    public ArrayList<eww_1> aFV() {
        return this.rCD.aFV();
    }

    @Override
    public boolean SS(int n) {
        return this.rCD.SS(n);
    }

    @Override
    public boolean ST(int n) {
        return this.rCD.ST(n);
    }

    @Override
    public boolean fOq() {
        return this.rCD.fOq();
    }

    public void SY(int n) {
        this.rCE = n;
    }

    public void SZ(int n) {
        this.rCF = n;
    }

    public int fOr() {
        return this.rCE;
    }

    public int fOs() {
        return this.rCF;
    }

    public void a(exP exP2, etu_0 etu_02) {
        this.rCF = 0;
        this.rCE = 0;
        ArrayList<eww_1> arrayList = this.rCD.aFV();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            eww_1 eww_12 = arrayList.get(i);
            if (!eww_12.bdo().b(exP2, exP2, etu_02, etu_02)) continue;
            this.rCF += eww_12.fOs();
            this.rCE += eww_12.fOr();
        }
    }

    public String toString() {
        return "FightChallengeInstance{m_model=" + String.valueOf(this.rCD) + ", m_state=" + String.valueOf((Object)this.hDE) + ", m_dropLevel=" + this.rCE + ", m_xpLevel=" + this.rCF + "}";
    }
}

