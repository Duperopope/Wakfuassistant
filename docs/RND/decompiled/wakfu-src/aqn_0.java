/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aQN
 */
public final class aqn_0
extends aRY {
    private final long eHh;

    public aqn_0(long l) {
        this.eHh = l;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        this.cBY();
    }

    private void cBY() {
        fiq_2.gCw().d(fik_2.a(string -> this.cBZ(), string -> aqn_0.jF("You HAVE to validate your command with a dev")).vE("Do you have a developer agreement for this command ?"));
    }

    private void cBZ() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)243);
        ns_02.cX(this.eHh);
        ayf_22.d(ns_02);
    }
}

