/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

public class aQV
extends aRY {
    public static final byte eIf = 0;
    public static final byte eIg = 1;
    public static final byte eIh = 2;
    public static final byte eIi = 3;
    public static final byte eIj = 4;
    private final byte eIk;
    private final int eIl;
    private final int eIm;
    private final short eIn;

    public aQV(byte by, int n) {
        this(by, n, 1);
    }

    public aQV(byte by, int n, int n2) {
        this(by, n, n2, 0);
    }

    public aQV(byte by, int n, int n2, short s) {
        this.eIk = by;
        this.eIl = n;
        this.eIm = n2;
        this.eIn = s;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        if (this.eIk == 0) {
            aQV.cBS();
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q(this.aVZ());
        ns_02.nX(this.eIl);
        ns_02.nX(this.eIm);
        ns_02.R(this.eIn);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private static void cBS() {
        aQV.jF("&lt;ID&gt; : create a monster of given ID near the character");
        aQV.jF("&lt;ID&gt; &lt;Count&gt; : same with the given count");
        aQV.jF("&lt;ID&gt; &lt;Count&gt; &lt;Level&gt; : same with the given level (must be a valid level for this monster)");
        aQV.jF("-t id : add given templateId");
        aQV.jF("-t id x : same with X templates");
        aQV.jF("-ut id : add usergroup with template ID");
        aQV.jF("-ut id x : same with X usergroups");
        aQV.jF("-ugi id : init usergroup ID in current instance");
        aQV.jF("-ugi cn : DEPRECATED init Black Crow on Kelba");
    }

    private short aVZ() {
        switch (this.eIk) {
            case 1: {
                return 136;
            }
            case 3: {
                return 431;
            }
            case 2: {
                return 310;
            }
            case 4: {
                return 493;
            }
        }
        String string = "Type de groupe " + this.eIk + " inconnu";
        aqh_0.cBI().jI(string);
        throw new UnsupportedOperationException(string);
    }

    @Generated
    public int d() {
        return this.eIl;
    }
}

