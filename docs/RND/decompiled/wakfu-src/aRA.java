/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Map;
import org.jetbrains.annotations.Nullable;

public class aRA
extends aRY {
    public static final int eKM = 0;
    public static final int eKN = 1;
    public static final int eKO = 2;
    public static final int eKP = 3;
    private final int eKQ;
    private final Object[] eKR;

    public aRA(int n, Object ... objectArray) {
        this.eKQ = n;
        this.eKR = (Object[])objectArray.clone();
    }

    @Override
    public boolean isValid() {
        switch (this.eKQ) {
            case 0: 
            case 1: 
            case 2: {
                return this.eKR.length == 0;
            }
            case 3: {
                return this.eKR.length == 2 && this.eKR[0] instanceof Long && this.eKR[1] instanceof String;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        switch (this.eKQ) {
            case 0: {
                aRA.cBS();
                break;
            }
            case 1: {
                aRA.ac(ayf_22);
                break;
            }
            case 2: {
                aRA.ad(ayf_22);
                break;
            }
            case 3: {
                aRA.a(ayf_22, (Long)this.eKR[0], (String)this.eKR[1]);
            }
        }
    }

    private static void cBS() {
        aRA.jF("Syntax: havenBag | hb <command>");
        aRA.jF("(help | h) : show help");
        aRA.jF("(feeInfo | fi) : show information about craft fee of current haven bag. Outside of haven bag, craft fee of current player are displayed instead");
        aRA.jF("(listItems | li) : list interactive items in the player haven bag");
        aRA.jF("(copyInteractiveItem | ci) uid \"target\" : copy the item with \"uid\" as id to the target haven bag");
    }

    private static void ac(ayf_2 ayf_22) {
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return;
        }
        bnv_2 bnv_22 = bgt_02.dnw();
        bhJ bhJ2 = bnv_22 == null ? bgt_02 : bnv_22.dyS();
        eki_0 eki_02 = bhJ2.dpK();
        boolean bl = eki_02.fyr();
        aRA.jF("Craftsman: " + bhJ2.getName());
        if (eki_02.fyq()) {
            aRA.jF("Craftsman expects fees from his guild members.");
        } else {
            aRA.jF("Free for guild.");
        }
        for (ekb_0 ekb_02 : ekb_0.values()) {
            @Nullable ekd_0 ekd_02 = eki_02.qg().get((Object)ekb_02);
            String string = String.format("Step %s to %s:", ekb_02.aVf(), ekb_02.aVe());
            if (ekd_02 != null) {
                String string2 = String.format("for equipments %s kamas", ekd_02.fyF());
                String string3 = String.format("for components %s kamas", ekd_02.fyG());
                aRA.jF(String.format("%s %s and %s", string, string2, string3));
                continue;
            }
            aRA.jF(String.format("%s no fees defined%s", string, bl ? " (But prices of last step applies)" : ""));
        }
        aRA.jF("Overridden Fees:");
        for (Map.Entry entry : eki_02.dyy().entrySet()) {
            aRA.jF(String.format("Recipe: %s for %s kamas", entry.getKey(), entry.getValue()));
        }
    }

    private static void ad(ayf_2 ayf_22) {
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            aRA.jF("Can't find player character");
            return;
        }
        bnv_2 bnv_22 = bgt_02.dnx();
        if (bnv_22 == null) {
            aRA.jF("Can't find player haven bag");
            return;
        }
        for (fnH fnH2 : bnv_22.dzc()) {
            aRA.jF(fnH2.toString());
        }
    }

    private static void a(ayf_2 ayf_22, long l, String string) {
        ns_0 ns_02 = new ns_0();
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            aRA.jF("Can't find player character");
            return;
        }
        ns_02.C((byte)3);
        ns_02.Q((short)66);
        ns_02.cX(bgt_02.Sn());
        ns_02.cX(l);
        ns_02.cT(string);
        ayf_22.d(ns_02);
    }
}

