/*
 * Decompiled with CFR 0.152.
 */
public final class aST
extends aRY {
    private final int ePQ;

    public aST() {
        this(-1);
    }

    public aST(int n) {
        this.ePQ = n;
    }

    @Override
    public boolean isValid() {
        int n = this.cDB();
        return this.ePQ == -1 || n == 50000 || n == 40000 || n == 30000 || n == 20000 || n == 10000;
    }

    private int cDB() {
        return this.ePQ * 10000;
    }

    @Override
    public void bGy() {
        if (this.ePQ == -1) {
            String string = "setitemtrackerloglevel|sitll help|h : show full documentation\nsetitemtrackerloglevel|sitll levelId : set logging level\nPossible values :\n1 : DEBUG\n2 : INFO\n3 : WARN\n4 : ERROR\n5 : FATAL\n";
            aqh_0.cBI().jF("setitemtrackerloglevel|sitll help|h : show full documentation\nsetitemtrackerloglevel|sitll levelId : set logging level\nPossible values :\n1 : DEBUG\n2 : INFO\n3 : WARN\n4 : ERROR\n5 : FATAL\n");
            return;
        }
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)98);
        ns_02.nX(this.cDB());
        ayf_22.d(ns_02);
    }
}

