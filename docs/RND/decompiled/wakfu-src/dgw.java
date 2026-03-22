/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedList;

public class dgw
implements aao_2 {
    private static final dgw okD = new dgw();
    private final LinkedList<dgv> okE = new LinkedList();
    private dgh okF = null;

    private dgw() {
    }

    public static dgw fcT() {
        return okD;
    }

    public void a(dgv dgv2) {
        for (dgv dgv3 : this.okE) {
            if (dgv3.fcO().fcU().cuz()) continue;
            this.okE.remove(dgv3);
        }
        if (this.okF == null) {
            this.okF = dgv2.fcO().fcU();
            this.okF.a(dgv2);
        } else if (this.okF.cuz()) {
            dgh dgh2 = dgv2.fcO().fcU();
            if (dgh2.cuz()) {
                this.okE.addLast(dgv2);
            }
        } else {
            this.okF.bG(this.okF.fcO() != dgv2.fcO());
            this.okF = dgv2.fcO().fcU();
            this.okF.a(dgv2);
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (this.okF != null) {
            if (!this.okE.isEmpty()) {
                dgv dgv2 = this.okE.removeFirst();
                this.okF.bG(this.okF.fcO() != dgv2.fcO());
                this.okF = dgv2.fcO().fcU();
                this.okF.a(dgv2);
            } else {
                this.okF.bG(true);
                this.okF = null;
            }
        }
        return false;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }
}

