/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aRx
 */
public class arx_0
extends aRY {
    private final int eKc;
    private final List<String> eKd;

    public arx_0() {
        this(1);
    }

    public arx_0(int n) {
        this(n, new ArrayList<String>());
    }

    public arx_0(int n, List<String> list) {
        this.eKc = n;
        this.eKd = list != null ? list : new ArrayList<String>();
    }

    @Override
    public boolean isValid() {
        switch (this.eKc) {
            case 0: 
            case 1: 
            case 2: 
            case 4: 
            case 5: 
            case 7: {
                return this.eKd.size() == 0;
            }
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
            switch (this.eKc) {
                case 0: {
                    arx_0.cBS();
                    break;
                }
                case 1: {
                    this.H(ayf_22);
                    break;
                }
                case 6: {
                    this.J(ayf_22);
                    break;
                }
                default: {
                    this.I(ayf_22);
                    break;
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me lors de l'execution d'une commande godmode (client) " + String.valueOf(exception));
        }
    }

    public static String cCL() {
        return null;
    }

    private static void cBS() {
        arx_0.jF("help | h : show full documentation");
        arx_0.jF("-all | -a : execute all the options (except exploits)");
        arx_0.jF("-fight | -f : character and spells to max level");
        arx_0.jF("-exploit | -ex : get all achievements (Don't use this option)");
        arx_0.jF("-emotes | -em : unlock emotes");
        arx_0.jF("-furniture | -fu : unlock all learnable furniture");
        arx_0.jF("-cosmetics | -c : unlock all cosmetics");
        arx_0.jF("-cosmetics | -c <typeId|typeName...> : unlock all cosmetics for specific type");
        arx_0.jF("");
        arx_0.jF("Following cosmetics types are available :");
        for (fm_1 fm_12 : ekj_0.qBp) {
            arx_0.jF(String.format("- %s (Id : %s)", fm_12.name(), fm_12.getNumber()));
        }
    }

    private void H(ayf_2 ayf_22) {
        this.I(ayf_22);
        fse_1.gFu().a((aef_2)aue_0.cVJ().cVK(), aue_0.cVJ().cVK().bxk());
    }

    private void I(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)342);
        ns_02.nX(this.eKc);
        ayf_22.d(ns_02);
    }

    private void J(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)342);
        ns_02.nX(this.eKc);
        for (String string : this.eKd) {
            if (string == null) continue;
            ns_02.cT(string);
        }
        ayf_22.d(ns_02);
    }
}

