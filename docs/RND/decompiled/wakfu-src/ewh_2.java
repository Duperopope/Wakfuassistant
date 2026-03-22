/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eWh
 */
public class ewh_2 {
    public static final ewh_2 rAZ = new ewh_2();
    private int rBa;
    private int rBb;
    private List<? extends exP> rBc;

    public void SG(int n) {
        this.rBa = n;
    }

    public void SH(int n) {
        this.rBb = n;
    }

    public void aU(List<? extends exP> list) {
        this.rBc = list == null ? Collections.emptyList() : new ArrayList<exP>(list);
    }

    public int fNK() {
        return this.rBa;
    }

    public int fNL() {
        return this.rBb;
    }

    public List<? extends exP> fNM() {
        if (this.rBc == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(this.rBc);
    }

    public String toString() {
        return "TackleResult{m_apLoss=" + this.rBa + ", m_mpLoss=" + this.rBb + ", m_tacklers=" + String.valueOf(this.rBc) + "}";
    }

    public boolean fNN() {
        if (this == rAZ) {
            return false;
        }
        return this.rBa == 0 && this.rBb == 0;
    }

    public boolean fNO() {
        if (this == rAZ) {
            return false;
        }
        return this.rBa != 0 || this.rBb != 0;
    }
}

