/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.stream.Collectors;

/*
 * Renamed from aQT
 */
public final class aqt_0
extends aRY {
    public static final int eHV = 0;
    public static final int eHW = 1;
    public static final int eHX = 2;
    public static final int eHY = 3;
    public static final int eHZ = 4;
    public static final int eIa = 5;
    public static final int eIb = 6;
    private final int eIc;
    private final String[] eId;

    public aqt_0(int n, String ... stringArray) {
        this.eIc = n;
        this.eId = stringArray;
    }

    @Override
    public boolean isValid() {
        switch (this.eIc) {
            case 1: {
                return this.eId.length == 1;
            }
            case 2: {
                return this.eId.length == 1 || this.eId.length == 0;
            }
            case 3: {
                return this.eId.length == 2;
            }
            case 0: 
            case 4: 
            case 5: 
            case 6: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        try {
            switch (this.eIc) {
                case 1: {
                    this.y(ayf_22);
                    break;
                }
                case 2: {
                    this.z(ayf_22);
                    break;
                }
                case 4: {
                    aqt_0.A(ayf_22);
                    break;
                }
                case 3: {
                    this.B(ayf_22);
                    break;
                }
                case 5: {
                    aqt_0.cCr();
                    break;
                }
                case 6: {
                    aqt_0.C(ayf_22);
                    break;
                }
                case 0: {
                    aqt_0.cBS();
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Error while executing a craft command: " + String.valueOf(exception));
        }
    }

    private static void cCr() {
        String string = eKQ.qEb.fyU().stream().map(eKW2 -> String.format("- %s : %s", bms_1.Dm(eKW2.d()), eKW2.d())).sorted(Comparator.comparing(BH::aT)).collect(Collectors.joining(System.lineSeparator()));
        aqt_0.jF("===== Crafts names and ids =====" + System.lineSeparator());
        aqt_0.jF(string + "\n");
    }

    private static void cBS() {
        String string = System.lineSeparator();
        aqt_0.jF("(--list | -l) : list all jobs names and ids" + string + "(--learn | -l) <craft_id> : learn the job" + string + "(--unlearn | -ul) <craft_id> : unlearn the job" + string + "(--unlearn-all | -ula) : unlearn all jobs" + string + "(--addXp | -ax) <craft_id> + <xp> : add or remove xp from a job" + string + "(--max) : learn all crafts and xp them to lvl 200" + string);
    }

    private void y(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)229);
        ns_02.nX(Integer.parseInt(this.eId[0]));
        ayf_22.d(ns_02);
    }

    private void z(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)211);
        ns_02.nX(this.eId.length == 0 ? -1 : Integer.parseInt(this.eId[0]));
        ayf_22.d(ns_02);
    }

    private static void A(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)382);
        ayf_22.d(ns_02);
    }

    private void B(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)34);
        ns_02.nX(Integer.parseInt(this.eId[0]));
        ns_02.cX(Long.parseLong(this.eId[1]));
        ayf_22.d(ns_02);
    }

    private static void C(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)88);
        ayf_22.d(ns_02);
    }
}

