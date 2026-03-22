/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aam
 */
public abstract class aam_0
extends aaj_0 {
    final ArrayList<aaO> bYI = new ArrayList(3);
    final ArrayList<aaO> bYJ = new ArrayList(3);
    private final arr_2 bYK = new aan(this);
    boolean bYL = true;

    protected aam_0() {
    }

    public void bS(boolean bl) {
        this.bYL = bl;
    }

    public void a(aaO aaO2) {
        if (!aaO2.bsd()) {
            return;
        }
        aaO2.bb((int)this.drD, (int)this.drE);
        if (aaO2.bse()) {
            if (!this.bYI.contains(aaO2)) {
                this.bYI.add(aaO2);
            }
        } else if (!this.bYJ.contains(aaO2)) {
            this.bYJ.add(aaO2);
        }
    }

    public void b(aaO aaO2) {
        if (aaO2.bse()) {
            this.bYI.remove(aaO2);
        } else {
            this.bYJ.remove(aaO2);
        }
    }

    @Override
    public void bqQ() {
        int n;
        super.bqQ();
        for (n = this.bYI.size() - 1; n >= 0; --n) {
            this.bYI.get(n).bqQ();
        }
        for (n = this.bYJ.size() - 1; n >= 0; --n) {
            this.bYJ.get(n).bqQ();
        }
    }

    @Override
    public void bb(int n, int n2) {
        int n3;
        super.bb(n, n2);
        for (n3 = this.bYI.size() - 1; n3 >= 0; --n3) {
            this.bYI.get(n3).bb(n, n2);
        }
        for (n3 = this.bYJ.size() - 1; n3 >= 0; --n3) {
            this.bYJ.get(n3).bb(n, n2);
        }
    }

    @Override
    protected void a(atg_2 atg_22) {
    }

    @Override
    protected void b(atg_2 atg_22) {
        ast_1.bJG().a(this.bYK, atg_22);
    }

    @Override
    public void qy(int n) {
        int n2;
        super.qy(n);
        if (!this.bYL) {
            return;
        }
        for (n2 = this.bYI.size() - 1; n2 >= 0; --n2) {
            this.bYI.get(n2).qy(n);
        }
        for (n2 = this.bYJ.size() - 1; n2 >= 0; --n2) {
            this.bYJ.get(n2).qy(n);
        }
    }

    @Override
    public void bN(boolean bl) {
        super.bN(bl);
        this.brg();
    }

    public final void brg() {
        int n;
        for (n = this.bYI.size() - 1; n >= 0; --n) {
            this.bYI.get(n).reset();
        }
        for (n = this.bYJ.size() - 1; n >= 0; --n) {
            this.bYJ.get(n).reset();
        }
        this.bYI.clear();
        this.bYJ.clear();
    }

    @Override
    protected void e(aaj_0 aaj_02) {
        aaO aaO2;
        int n;
        super.e(aaj_02);
        aam_0 aam_02 = (aam_0)aaj_02;
        for (n = 0; n < aam_02.bYI.size(); ++n) {
            aaO2 = aam_02.bYI.get(n);
            this.bYI.add((aaO)aaO2.brc());
            aaO2.brb();
        }
        for (n = 0; n < aam_02.bYJ.size(); ++n) {
            aaO2 = aam_02.bYJ.get(n);
            this.bYJ.add((aaO)aaO2.brc());
            aaO2.brb();
        }
    }
}

