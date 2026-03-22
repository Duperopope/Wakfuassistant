/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.List;

public class aRK
extends aRY {
    public static final int eLA = 0;
    public static final int eLB = 1;
    public static final int eLC = 2;
    public static final int eLD = 3;
    public static final int eLE = 4;
    public static final int eLF = 5;
    public static final int eLG = 6;
    public static final String[] eLH = new String[0];
    private final int eLI;
    private final List<Integer> eLJ;
    private final String[] eLK;

    public aRK(int n, String ... stringArray) {
        this.eLI = n;
        this.eLK = stringArray;
        this.eLJ = Collections.emptyList();
    }

    public aRK(int n, List<Integer> list) {
        this.eLI = n;
        this.eLK = eLH;
        this.eLJ = list;
    }

    @Override
    public boolean isValid() {
        switch (this.eLI) {
            case 0: 
            case 2: {
                return this.eLK.length == 0;
            }
            case 1: 
            case 4: 
            case 5: 
            case 6: {
                return this.eLJ != null && !this.eLJ.isEmpty();
            }
            case 3: {
                return this.eLK.length == 1;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        if (this.eLI == 0) {
            aRK.cBS();
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null || bgt_02.dkZ() == null || !bgt_02.dkZ().dGo().fLv()) {
            aqh_0.cBI().jI("You are not in an Infinite Waves fight");
            return;
        }
        switch (this.eLI) {
            case 1: {
                this.cCW();
                break;
            }
            case 2: {
                aRK.cCX();
                break;
            }
            case 3: {
                this.cCY();
                break;
            }
            case 4: {
                this.cCZ();
                break;
            }
            case 5: {
                this.cDa();
                break;
            }
            case 6: {
                this.cDb();
            }
        }
    }

    private void cCW() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)441);
        this.eLJ.forEach(ns_02::nX);
        aRK.b(ns_02);
    }

    private static void cCX() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)122);
        aRK.b(ns_02);
    }

    private void cCY() {
        int n = Integer.parseInt(this.eLK[0]);
        if (n < 0) {
            aqh_0.cBI().jI("Value should be a positive integer");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)467);
        ns_02.nX(n);
        aRK.b(ns_02);
    }

    private void cCZ() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)224);
        this.eLJ.stream().map(GC::cu).forEach(ns_02::R);
        aRK.b(ns_02);
    }

    private void cDa() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)323);
        this.eLJ.forEach(ns_02::nX);
        aRK.b(ns_02);
    }

    private void cDb() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)148);
        this.eLJ.forEach(ns_02::nX);
        aRK.b(ns_02);
    }

    private static void b(ns_0 ns_02) {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Can't use this command: you're not logged in!");
            return;
        }
        ayf_22.d(ns_02);
    }

    private static void cBS() {
        aRK.jF("(help | h) : show full documentation");
        aRK.jF("(setTurnLimit | stl) number : the fight will end on the designated turn (can end the fight immediately)");
        aRK.jF("(listArtifacts | la) : show the artifact list of the current fight");
        aRK.jF("(setArtifacts | sa) id id id... : define the artifacts that will appear in this fight");
        aRK.jF("(forceMonsters | fm) id id id... : force the apparition of the monsters in the next wave");
        aRK.jF("(forceArtifacts | fa) id id id... : force the apparition of the artifacts in the next wave");
        aRK.jF("(forceLegendaryArtifacts | fla) id id id... : force the apparition of the legendary artifacts in the next applicable wave");
    }
}

