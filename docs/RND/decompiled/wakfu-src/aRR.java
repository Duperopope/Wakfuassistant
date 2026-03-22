/*
 * Decompiled with CFR 0.152.
 */
public class aRR
extends aRY {
    final ars_0 eMl;

    public aRR(ars_0 ars_02) {
        this.eMl = ars_02;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Can't use this command: you're not logged in!");
            return;
        }
        switch (this.eMl.ordinal()) {
            case 0: {
                aRR.cBS();
                break;
            }
            case 1: {
                aRR.ap(ayf_22);
            }
        }
    }

    public static void cBS() {
        aRR.jF("help | h : show full documentation");
        aRR.jF("list_ie : List interactive elements in current partition");
    }

    private static void ap(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)95);
        ayf_22.d(ns_02);
    }
}

