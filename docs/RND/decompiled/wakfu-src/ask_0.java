/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aSk
 */
public class ask_0
extends aRY
implements aao_2 {
    protected static final Logger eNA = Logger.getLogger(ask_0.class);
    public static final int eNB = 0;
    public static final int eNC = 1;
    public static final int eND = 2;
    public static final int eNE = 3;
    private static final int eNF = 200;
    private static int eNG = 0;
    private static boolean eNH = false;
    private static long eNI = 0L;
    private final int eNJ;
    private final int eNK;

    public ask_0(int n) {
        this.eNK = n;
        this.eNJ = -1;
    }

    public ask_0(int n, int n2) {
        this.eNK = n;
        this.eNJ = n2;
    }

    @Override
    public boolean isValid() {
        switch (this.eNK) {
            case 0: 
            case 1: 
            case 3: {
                return true;
            }
            case 2: {
                return this.eNJ > 200;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        switch (this.eNK) {
            case 0: {
                ask_0.cBS();
                return;
            }
            case 1: {
                ask_0.cDp();
                return;
            }
            case 3: {
                ask_0.cDo();
                return;
            }
            case 2: {
                ask_0.b(this, this.eNJ);
                return;
            }
        }
    }

    private static void b(aao_2 aao_22, int n) {
        if (!eNH) {
            eNI = abb_2.bUA().a(aao_22, n, 1);
            eNH = true;
            ask_0.jG("Auto ping every " + n + " ms started (clock id " + eNI + ")");
        }
    }

    private static void cDo() {
        if (eNH) {
            abb_2.bUA().hk(eNI);
            eNH = false;
            eNI = 0L;
            ask_0.jG("Auto ping stopped");
        }
    }

    private static boolean cDp() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("You need to be connected to access this command.");
            return false;
        }
        ayf_22.d(new nw_1(2, ++eNG));
        ayf_22.d(new nw_1(3, eNG));
        ayf_22.d(new nw_1(1, eNG));
        ayf_22.d(new nw_1(6, eNG));
        ayf_22.d(new nw_1(4, eNG));
        ask_0.jG("===== Ping (n\u00b0 " + eNG + ") =====");
        return true;
    }

    private static void cBS() {
        ask_0.jF("=== Ping command");
        ask_0.jF("\"ping\" \"help\" : show help");
        ask_0.jF("\"ping\" : ping every server once");
        ask_0.jF("\"ping\" \"start\" &lt;Delay in ms&gt; : auto ping all servers with the specified delay (> 200 ms)");
        ask_0.jF("\"ping\" \"start\" : auto ping all servers once every second");
        ask_0.jF("\"ping\" \"stop\" : stop the auto ping");
        ask_0.jF("");
        ask_0.jF("In the ping response, \"RTT\" is the round trip time, and \"PT\" is the server processing time.");
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22.d() == Integer.MIN_VALUE) {
            if (!ask_0.cDp()) {
                ask_0.cDo();
            }
            return false;
        }
        return true;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }
}

