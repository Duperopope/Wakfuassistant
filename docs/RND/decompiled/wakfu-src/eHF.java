/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.LinkedList;

class eHF {
    private final LinkedList<eHG> qsK = new LinkedList();
    private final eHC qsL;
    private final eHC qsM;
    private eHF qsN;
    final /* synthetic */ eHE qsO;

    eHF(eHE eHE2, eHC eHC2, eHC eHC3) {
        this.qsO = eHE2;
        this.qsL = eHC2;
        this.qsM = eHC3;
    }

    public eHC fvQ() {
        return this.qsL;
    }

    public void a(eHF eHF2) {
        this.qsN = eHF2;
    }

    public void a(eHG eHG2) {
        this.qsO.qsH.put(eHG2.xl(), this.qsL.aJr());
        if (this.qsM != null) {
            eHG2.b(this.qsM);
        }
        this.qsK.add(eHG2);
        Collections.sort(this.qsK);
        this.qsO.a(eHG2.xl(), this.qsL);
    }

    public void b(eHG eHG2) {
        this.qsK.remove(eHG2);
    }

    public eHG pB(long l) {
        int n = this.qsK.size();
        for (int i = 0; i < n; ++i) {
            eHG eHG2 = this.qsK.get(i);
            if (eHG2.xl() != l) continue;
            return this.qsK.remove(i);
        }
        return null;
    }

    public void fvR() {
        if (this.qsN == null) {
            return;
        }
        ux_0 ux_02 = ue_0.bjV().bjc();
        while (!this.qsK.isEmpty() && this.qsK.peek().O(ux_02)) {
            eHG eHG2 = this.qsK.poll();
            this.qsN.a(eHG2);
        }
    }

    public String toString() {
        return "LevelList{m_elements=" + String.valueOf(this.qsK) + ", m_level=" + String.valueOf((Object)this.qsL) + ", m_nextLevel=" + String.valueOf((Object)this.qsM) + ", m_nextList=" + String.valueOf(this.qsN) + "}";
    }
}

