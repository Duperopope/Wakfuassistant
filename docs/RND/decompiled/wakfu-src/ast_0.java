/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSt
 */
public class ast_0
extends aRY {
    public static final int eOs = 0;
    public static final int eOt = 1;
    public static final int eOu = 2;
    public static final int eOv = 3;
    public static final int eOw = 4;
    public static final int eOx = 5;
    public static final int eOy = 6;
    public static final int eOz = 7;
    private final int eOA;
    private final String[] eOB;

    public ast_0(int n, String ... stringArray) {
        this.eOA = n;
        this.eOB = stringArray;
    }

    @Override
    public boolean isValid() {
        switch (this.eOA) {
            case 0: {
                return this.eOB.length == 0;
            }
            case 1: 
            case 5: 
            case 7: {
                return this.eOB.length == 1;
            }
            case 4: 
            case 6: {
                return this.eOB.length == 2;
            }
            case 2: 
            case 3: {
                return this.eOB.length == 3;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        switch (this.eOA) {
            case 0: {
                ast_0.cBS();
                break;
            }
            case 1: {
                this.clear();
                break;
            }
            case 7: {
                this.bYz();
                break;
            }
            case 5: {
                this.cDz();
                break;
            }
            case 4: {
                this.removeAll();
                break;
            }
            case 6: {
                this.cDy();
                break;
            }
            case 3: {
                this.cDx();
                break;
            }
            case 2: {
                this.cDw();
            }
        }
    }

    private void cDw() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)3);
        ns_02.cX(Long.parseLong(this.eOB[0]));
        ns_02.nX(Integer.parseInt(this.eOB[1]));
        ns_02.nX(Integer.parseInt(this.eOB[2]));
        ast_0.b(ns_02);
    }

    private void cDx() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)262);
        ns_02.cX(Long.parseLong(this.eOB[0]));
        ns_02.nX(Integer.parseInt(this.eOB[1]));
        ns_02.nX(Integer.parseInt(this.eOB[2]));
        ast_0.b(ns_02);
    }

    private void cDy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)181);
        ns_02.cX(Long.parseLong(this.eOB[0]));
        ns_02.nX(Integer.parseInt(this.eOB[1]));
        ast_0.b(ns_02);
    }

    private void removeAll() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)262);
        ns_02.cX(Long.parseLong(this.eOB[0]));
        ns_02.nX(Integer.parseInt(this.eOB[1]));
        ast_0.b(ns_02);
    }

    private void cDz() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)300);
        ns_02.cX(Long.parseLong(this.eOB[0]));
        ast_0.b(ns_02);
    }

    private void bYz() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)389);
        ns_02.cX(Long.parseLong(this.eOB[0]));
        ast_0.b(ns_02);
    }

    private void clear() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)421);
        ns_02.cX(Long.parseLong(this.eOB[0]));
        ast_0.b(ns_02);
    }

    private static void cBS() {
        ast_0.jF("(help | h) : show full documentation");
        ast_0.jF("(add) accountId referenceId quantity : add the specified number of this item to target's pvp inventory");
        ast_0.jF("(clear) accountId : empty target's pvp inventory");
        ast_0.jF("(list) accountId : show full content of target's pvp inventory");
        ast_0.jF("(lock) accountId referenceId : lock item in target's pvp inventory");
        ast_0.jF("(remove) accountId referenceId quantity : remove the specified number of this item from target's pvp inventory");
        ast_0.jF("(removeAll) accountId referenceId : remove all of this item from target's pvp inventory");
        ast_0.jF("(unlock) accountId : unlock target's pvp inventory");
    }

    private static void b(ns_0 ns_02) {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Can't use this command: you're not logged in!");
            return;
        }
        ayf_22.d(ns_02);
    }
}

