/*
 * Decompiled with CFR 0.152.
 */
public class aQE
extends aRY {
    public static final int eGe = 0;
    public static final int eGf = 1;
    public static final int eGg = 2;
    private final int eGh;
    private final String eGi;

    public aQE(int n) {
        this(n, null);
    }

    public aQE(int n, String string) {
        this.eGh = n;
        this.eGi = string == null ? null : BH.aT(string).strip();
    }

    @Override
    public boolean isValid() {
        return this.eGh == 2 || (this.eGh == 0 || this.eGh == 1) && this.eGi != null && !this.eGi.isBlank() && this.eGi.length() < 25;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("You must be connected to use this command");
            return;
        }
        ns_0 ns_02 = new ns_0();
        switch (this.eGh) {
            case 0: {
                ns_02.Q((short)497);
                ns_02.cT(this.eGi);
                break;
            }
            case 1: {
                ns_02.Q((short)41);
                ns_02.cT(this.eGi);
                break;
            }
            case 2: {
                ns_02.Q((short)43);
                break;
            }
            default: {
                return;
            }
        }
        ns_02.C((byte)4);
        ayf_22.d(ns_02);
    }
}

