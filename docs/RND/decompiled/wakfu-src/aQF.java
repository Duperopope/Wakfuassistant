/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class aQF
extends aRY {
    public static final int eGj = 0;
    public static final int eGk = 1;
    public static final int eGl = 2;
    public static final int eGm = 3;
    public static final int eGn = 4;
    public static final int eGo = 5;
    public static final int eGp = 6;
    public static final int eGq = 7;
    private final int eGr;
    private final String[] eGs;

    public aQF(int n, String ... stringArray) {
        this.eGr = n;
        this.eGs = (String[])stringArray.clone();
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        ns_0 ns_02 = new ns_0();
        switch (this.eGr) {
            case 0: {
                aQF.cBS();
                break;
            }
            case 1: {
                ns_02.Q((short)372);
                if (this.eGs.length == 1) {
                    ns_02.aN(true);
                    ns_02.nX(Integer.parseInt(this.eGs[0]));
                } else {
                    ns_02.aN(false);
                    ns_02.nX(aue_0.cVJ().cVK().dlp());
                }
                ns_02.C((byte)6);
                ayf_22.d(ns_02);
                break;
            }
            case 2: {
                ns_02.Q((short)215);
                ns_02.nX(Integer.parseInt(this.eGs[0]));
                ns_02.C((byte)6);
                ayf_22.d(ns_02);
                break;
            }
            case 3: {
                ns_02.Q((short)247);
                ns_02.C((byte)6);
                ayf_22.d(ns_02);
                break;
            }
            case 4: {
                ns_02.Q((short)245);
                ns_02.C((byte)3);
                ayf_22.d(ns_02);
                break;
            }
            case 5: {
                ns_02.Q((short)62);
                ns_02.C((byte)3);
                ayf_22.d(ns_02);
                break;
            }
            case 6: {
                this.cBW();
                break;
            }
            case 7: {
                ns_02.Q((short)302);
                ns_02.C((byte)6);
                ayf_22.d(ns_02);
            }
        }
    }

    private void cBW() {
        if (this.eGs.length > 0) {
            int n = Integer.parseInt(this.eGs[0]);
            Optional<fpt> optional = fpu.sOH.FP(n);
            if (optional.isPresent()) {
                aQF.a(optional.get());
            } else {
                aQF.jF("No battleground data for id " + n);
            }
        } else {
            for (fpt fpt2 : fpu.sOH.ggE()) {
                aQF.a(fpt2);
            }
        }
    }

    private static void a(fpt fpt2) {
        StringBuilder stringBuilder = new StringBuilder(String.format("%2d", fpt2.d()));
        stringBuilder.append(' ').append(aum_0.cWf().a(66, (long)fpt2.clk(), new Object[0]));
        stringBuilder.append(" Level=");
        for (fpz_0 object : fpt2.ggD()) {
            stringBuilder.append(object.d()).append(", ");
        }
        stringBuilder.append(" Gameplay=");
        for (fpy_0 fpy_02 : fpt2.ggC()) {
            stringBuilder.append(fpy_02.dfF()).append(", ");
        }
        aQF.jF(stringBuilder.toString());
    }

    private static void cBS() {
        aQF.jF("start : if it exists, starts the battleground of the current territory");
        aQF.jF("start <bgId> : starts battleground with the given id");
        aQF.jF("stop <bgId> : closes battleground with the given id");
        aQF.jF("dailylist | dlist : generates or gives battleground list for today");
        aQF.jF("close : ends and closes the battleground you're visiting");
        aQF.jF("serverlist | slist : gives the list of battleground existing on this game server");
        aQF.jF("data | data <id> : gives the gameplay data for one or all territory");
        aQF.jF("simulate | sim : generates a (false) list of battleground without incidence on the current list");
    }
}

