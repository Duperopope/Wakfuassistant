/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aqS
 */
public class aqs_2
implements apb_1 {
    private aqt_2 cRq;
    private ArrayList<apc_1> bNp;

    public aqt_2 bGT() {
        return this.cRq;
    }

    public void a(aqt_2 aqt_22) {
        this.cRq = aqt_22;
    }

    @Override
    public apd_1 ez(String string) {
        if (this.cRq != null) {
            return this.cRq.fn(string);
        }
        return null;
    }

    @Override
    public ArrayList<apd_1> eA(String string) {
        if (this.cRq != null) {
            return this.cRq.fo(string);
        }
        return null;
    }

    @Override
    public void a(apc_1 apc_12) {
        if (this.bNp == null) {
            this.bNp = new ArrayList();
        }
        if (!this.bNp.contains(apc_12)) {
            this.bNp.add(apc_12);
        }
    }

    @Override
    public void bxE() {
        if (this.bNp == null) {
            return;
        }
        int n = this.bNp.size();
        for (int i = 0; i < n; ++i) {
            this.bNp.get(i).c(this);
        }
    }

    @Override
    public void bEM() {
        if (this.bNp == null) {
            return;
        }
        int n = this.bNp.size();
        for (int i = 0; i < n; ++i) {
            this.bNp.get(i).d(this);
        }
    }

    @Override
    public void eB(String string) {
        if (this.bNp == null) {
            return;
        }
        int n = this.bNp.size();
        for (int i = 0; i < n; ++i) {
            this.bNp.get(i).b(this, string);
        }
    }

    @Override
    public void bxF() {
        if (this.bNp == null) {
            return;
        }
        int n = this.bNp.size();
        for (int i = 0; i < n; ++i) {
            this.bNp.get(i).e(this);
        }
    }

    @Override
    public void bxG() {
        if (this.bNp == null) {
            return;
        }
        int n = this.bNp.size();
        for (int i = 0; i < n; ++i) {
            this.bNp.get(i).f(this);
        }
    }

    @Override
    public void eC(String string) {
        if (this.bNp == null) {
            return;
        }
        int n = this.bNp.size();
        for (int i = 0; i < n; ++i) {
            this.bNp.get(i).c(this, string);
        }
    }
}

