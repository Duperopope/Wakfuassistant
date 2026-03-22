/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSS
 */
public class ass_0
extends aRY {
    private final byte ePN;
    private final byte ePO;
    private final long ePP;

    public ass_0(byte by, int n, long l) {
        this.ePN = by;
        this.ePO = (byte)n;
        this.ePP = l;
    }

    public ass_0(byte by, int n) {
        this(by, n, 0L);
    }

    public ass_0(byte by) {
        this(by, 0);
    }

    public ass_0() {
        this(1);
    }

    @Override
    public boolean isValid() {
        if (this.ePN == 2 && this.ePO <= 0) {
            return false;
        }
        return this.ePN != 3 || this.ePO > 0 && this.ePP > 0L;
    }

    @Override
    public void bGy() {
        byte[] byArray;
        if (this.ePN == 1) {
            ass_0.jF("Sessions management");
            ass_0.jF("sessions ( 'help' | 'h' ) : display command help");
            ass_0.jF("sessions ( 'list' | 'l' ) serverNumber : list all client sessions by server");
            ass_0.jF("sessions ( 'remove' | 'rm' ) serverNumber ownerId : remove all client sessions for server (only Connection or World) by ownerId");
            ass_0.jF("For server parameter, use number value : ");
            ass_0.jF("1=Connection, 2=World");
            return;
        }
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        if (this.ePN == 3 && this.ePO == 3) {
            aqh_0.cBI().jI("Unable to launch remove command on game server");
            return;
        }
        for (byte by : byArray = new byte[]{1, 2, 3}) {
            if (this.ePO != by) continue;
            ns_0 ns_02 = new ns_0();
            ns_02.C(by);
            ns_02.Q((short)436);
            ns_02.D(this.ePN);
            ns_02.cX(this.ePP);
            ayf_22.d(ns_02);
        }
    }
}

