/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.set.hash.TLongHashSet;
import org.apache.log4j.Logger;

public final class aRH
extends aRY {
    private static final Logger eLs = Logger.getLogger(aQP.class);
    public static final int eLt = 0;
    public static final int eLu = 1;
    public static final int eLv = 2;
    public static final int eLw = 3;
    private final int eLx;
    private final String[] eLy;

    public aRH(int n, String ... stringArray) {
        this.eLx = n;
        this.eLy = (String[])stringArray.clone();
    }

    @Override
    public boolean isValid() {
        switch (this.eLx) {
            case 0: 
            case 2: 
            case 3: {
                return this.eLy.length == 0;
            }
            case 1: {
                return this.eLy.length == 2;
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
        try {
            switch (this.eLx) {
                case 0: {
                    aRH.cBS();
                    return;
                }
                case 1: {
                    this.cCk();
                    return;
                }
                case 2: {
                    this.cCy();
                    return;
                }
                case 3: {
                    this.cCU();
                    return;
                }
            }
        }
        catch (Exception exception) {
            eLs.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    private void cCU() {
        boolean bl = ewo_0.oBF.k(ewr_0.oDy);
        ewo_0.oBF.a(ewr_0.oDy, Boolean.toString(!bl));
        boolean bl2 = ewo_0.oBF.k(ewr_0.oDy);
        fse_1.gFu().f("heroesEnabled", bl2);
        aRH.jF("Heroes activated = " + bl2);
    }

    private void cCy() {
        aUQ aUQ2 = aue_0.cVJ().cVO();
        TLongHashSet tLongHashSet = fcL.rUh.su(aUQ2.xl());
        if (tLongHashSet == null || tLongHashSet.isEmpty()) {
            aRH.jF("Aucun heros");
            return;
        }
        tLongHashSet.forEach((TLongProcedure)new aRI(this));
    }

    private void cCk() {
        long l = Long.parseLong(this.eLy[0]);
        long l2 = Long.parseLong(this.eLy[1]);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)326);
        ns_02.cX(l);
        ns_02.cX(l2);
        ayf_22.d(ns_02);
    }

    private static void cBS() {
        aRH.jF("(hero) (help | h) : show help");
        aRH.jF("(hero) (list | l) : show available heroes");
        aRH.jF("(hero) (addXp | xp) : add xp to hero of given id");
        aRH.jF("(hero) (clientEnablingSwitch | ces) : switch enable or disable hero into client only");
    }
}

