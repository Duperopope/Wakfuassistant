/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class aQq
extends aRY {
    private final byte eCy;
    private final String eCz;
    private int[] dwu = new int[1];

    public aQq(byte by, String string) {
        this.eCy = by;
        this.eCz = string;
        this.dwu[0] = -1;
    }

    public aQq(byte by, String string, int n) {
        this.eCy = by;
        this.eCz = string;
        this.dwu[0] = n;
    }

    public aQq(byte by, int n) {
        this.eCy = by;
        this.eCz = null;
        this.dwu[0] = n;
    }

    public aQq(byte by, List<Integer> list) {
        this.eCy = by;
        this.eCz = null;
        this.dwu = Bv.a(list.toArray(new Integer[list.size()]));
    }

    public aQq(byte by) {
        this.eCy = by;
        this.eCz = null;
        this.dwu[0] = -1;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        if (this.eCy == 14) {
            aQq.cBS();
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.Q((short)40);
        ns_02.C((byte)3);
        ns_02.D(this.eCy);
        switch (this.eCy) {
            case 2: {
                ns_02.cT(this.eCz);
                ns_02.nX(this.dwu[0]);
                break;
            }
            case 1: {
                ns_02.cT(this.eCz);
                break;
            }
            case 3: {
                this.a(ns_02);
                break;
            }
            case 4: {
                this.a(ns_02);
                break;
            }
            case 9: {
                this.a(ns_02);
                break;
            }
            case 5: {
                this.a(ns_02);
                break;
            }
            case 10: {
                this.a(ns_02);
                break;
            }
            case 11: {
                this.a(ns_02);
                break;
            }
            case 12: {
                ns_02.nX(this.dwu[0]);
                break;
            }
            case 13: {
                this.cBU();
                return;
            }
            case 7: 
            case 8: {
                break;
            }
            default: {
                throw new UnsupportedOperationException("La commande " + this.eCy + " n'est pas support\u00e9e");
            }
        }
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private void cBU() {
        int n = this.dwu[0];
        bbu_2 bbu_22 = bcb_1.hDb.AL(n);
        if (bbu_22 == null) {
            aqh_0.cBI().jI("Unknown achievement id = " + n);
            return;
        }
        aQq.jF("Objective list for : " + aum_0.cWf().a(62, (long)n, new Object[0]) + " (id = " + n + ")");
        ArrayList<bcj_1> arrayList = bbu_22.dau();
        for (int i = 0; i < arrayList.size(); ++i) {
            bcj_1 bcj_12 = arrayList.get(i);
            aQq.jF(bcj_12.d() + " : " + aum_0.cWf().a(64, (long)bcj_12.d(), new Object[0]));
        }
    }

    private void a(ns_0 ns_02) {
        ns_02.nX(this.dwu.length);
        for (int i = 0; i < this.dwu.length; ++i) {
            ns_02.nX(this.dwu[i]);
        }
    }

    private static void cBS() {
        aQq.jF("(help | h) : display command help");
        aQq.jF("(reset | ar) id id id... : Reset the given achievements (main character and heroes)");
        aQq.jF("(reset all | ara)  : Reset ALL achievements (main character and heroes)");
        aQq.jF("(disable | ad) id id id... : Force disable the list of achievement (main character and heroes)");
        aQq.jF("(complete) id id id... : Complete the given achievements (main character and heroes)");
        aQq.jF("(completeObjective | co) id id id... : Complete the given objectives (main character and heroes)");
        aQq.jF("(resetObjective | ro) id id id... : Complete the given achievements (main character and heroes)");
        aQq.jF("(state | as)  id id id... : Gives the completion state of the given achievement (main character and heroes)");
        aQq.jF("(criterion | ac)  id : Show the visibility and activation criteria of the given achievement");
        aQq.jF("(getObjectivesIds | goi) id : Show the objectives id of the given achievement");
        aQq.jF("(var get) &lt;name&gt; : Show the value of the variable for the current character");
        aQq.jF("(var set) &lt;name&gt; &lt;value&gt; : Set the value to the given variable for the current character and heroes");
        aQq.jF("(filldatabase | filldb) :  Fill the database with all achievements variables value and complete all objectives");
    }

    public String toString() {
        return "AchievementCommand{m_cmd=" + this.eCy + ", m_varName='" + this.eCz + "', m_value=" + Arrays.toString(this.dwu) + "}";
    }
}

