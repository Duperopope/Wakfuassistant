/*
 * Decompiled with CFR 0.152.
 */
public class aSo
extends aRY {
    public static final int eNT = 0;
    public static final int eNU = 1;
    public static final int eNV = 2;
    public static final int eNW = 3;
    private final int eNX;
    private final Object[] eNY;

    public aSo(int n, Object ... objectArray) {
        this.eNX = n;
        this.eNY = objectArray;
    }

    @Override
    public boolean isValid() {
        switch (this.eNX) {
            case 0: {
                return true;
            }
            case 1: 
            case 3: {
                return this.eNY.length == 0 || (Long)this.eNY[0] > 0L;
            }
            case 2: {
                return this.eNY.length > 0 && (this.eNY.length == 1 || (Long)this.eNY[0] > 0L);
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Can't use this command: you're not logged in!");
            return;
        }
        switch (this.eNX) {
            case 0: {
                aSo.cBS();
                return;
            }
            case 1: {
                this.aB(ayf_22);
                return;
            }
            case 2: {
                this.aC(ayf_22);
                return;
            }
            case 3: {
                this.aD(ayf_22);
                return;
            }
        }
    }

    private static void cBS() {
        aSo.jF("\"help\" | \"h\" : show help");
        aSo.jF("\"get\" : show the players quota of the current instance");
        aSo.jF("\"get\" &lt;instance_id&gt; : show the players quota of the given instance");
        aSo.jF("\"set\" &lt;players_quota&gt; : set the players quota of the current instance to the given value");
        aSo.jF("\"set\" &lt;instance_id&gt; &lt;players_quota&gt; : set the players quota of the given instance to the given value");
        aSo.jF("\"reset\" : reset the players quota of the current instance to its original value");
        aSo.jF("\"reset\" &lt;instance_id&gt; : reset the players quota of the given instance to its original value");
    }

    private void aB(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)435);
        if (this.eNY.length == 0) {
            ns_02.cX(aue_0.cVJ().cVK().aqZ());
        } else {
            ns_02.cX((Long)this.eNY[0]);
        }
        ayf_22.d(ns_02);
    }

    private void aC(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)290);
        if (this.eNY.length == 1) {
            ns_02.cX(aue_0.cVJ().cVK().aqZ());
            ns_02.nX((Integer)this.eNY[0]);
        } else {
            ns_02.cX((Long)this.eNY[0]);
            ns_02.nX((Integer)this.eNY[1]);
        }
        ayf_22.d(ns_02);
    }

    private void aD(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)289);
        if (this.eNY.length == 0) {
            ns_02.cX(aue_0.cVJ().cVK().aqZ());
        } else {
            ns_02.cX((Long)this.eNY[0]);
        }
        ayf_22.d(ns_02);
    }
}

