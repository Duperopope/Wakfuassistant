/*
 * Decompiled with CFR 0.152.
 */
public class aQB
extends aRY {
    private final byte eFY;

    public aQB(byte by) {
        this.eFY = by;
    }

    @Override
    public boolean isValid() {
        return this.eFY == 1 || this.eFY == 2 || this.eFY == 3;
    }

    @Override
    public void bGy() {
        if (this.eFY == 3) {
            this.cBS();
            return;
        }
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Cannot access theses commands without being logged in!");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)36);
        ns_02.aN(this.eFY == 1);
        ayf_22.d(ns_02);
    }

    private void cBS() {
        aQB.jF("Syntax: bak <command>");
        aQB.jF("(h) : show help");
        aQB.jF("(lock on|off) : lock or unlock the BAK");
    }
}

