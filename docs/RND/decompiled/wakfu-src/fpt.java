/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.EnumSet;

public class fpt {
    private final int sOD;
    private final int sOE;
    private final ArrayList<fpy_0> sOF = new ArrayList();
    private final EnumSet<fpz_0> sOG = EnumSet.noneOf(fpz_0.class);

    public fpt(int n, int n2) {
        this.sOD = n;
        this.sOE = n2;
    }

    public void a(fpy_0 fpy_02) {
        this.sOF.add(fpy_02);
    }

    public void a(fpz_0 fpz_02) {
        this.sOG.add(fpz_02);
    }

    public int d() {
        return this.sOD;
    }

    public int clk() {
        return this.sOE;
    }

    public ArrayList<fpy_0> ggC() {
        return this.sOF;
    }

    public EnumSet<fpz_0> ggD() {
        return this.sOG;
    }

    public String toString() {
        return "BattlegroundData{m_id=" + this.sOD + ", m_territoryId=" + this.sOE + ", m_scenarios=" + String.valueOf(this.sOF) + ", m_levels=" + String.valueOf(this.sOG) + "}";
    }
}

