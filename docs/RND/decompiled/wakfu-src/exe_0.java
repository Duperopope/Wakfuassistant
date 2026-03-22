/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from exE
 */
public final class exe_0
extends Enum<exe_0>
implements aoq_1 {
    public static final /* enum */ exe_0 pcX = new exe_0(0, "Sp\u00e9cial", "Etat sp\u00e9cial, utilis\u00e9 pour le Gameplay. Son application ne peut \u00eatre ni boost\u00e9e, ni r\u00e9duite", new exf_0().ffz());
    public static final /* enum */ exe_0 pcY = new exe_0(1, "Normal", "Etat classique, infligeant principalement des d\u00e9g\u00e2ts", new exf_0().bC(1.0f, 1.0f));
    public static final /* enum */ exe_0 pcZ = new exe_0(2, "Semi Game Breaker", "Etat bloquant partiellement le joueur", new exf_0().bC(0.75f, 1.0f));
    public static final /* enum */ exe_0 pda = new exe_0(3, "Game Breaker", "Etat bloquant totalement le joueur", new exf_0().bC(0.25f, 1.0f));
    private final int pdb;
    private final String pdc;
    private final String pdd;
    private final exf_0 pde;
    private static final /* synthetic */ exe_0[] pdf;

    public static exe_0[] values() {
        return (exe_0[])pdf.clone();
    }

    public static exe_0 valueOf(String string) {
        return Enum.valueOf(exe_0.class, string);
    }

    private exe_0(int n2, String string2, String string3, exf_0 exf_02) {
        this.pdb = n2;
        this.pdc = string2;
        this.pdd = string3;
        this.pde = exf_02;
    }

    public static exe_0 OA(int n) {
        for (exe_0 exe_02 : exe_0.values()) {
            if (exe_02.pdb != n) continue;
            return exe_02;
        }
        return pcX;
    }

    public float ffw() {
        return this.pde.pdg;
    }

    public float ffx() {
        return this.pde.pdh;
    }

    @Override
    public String aXA() {
        return Integer.toString(this.pdb);
    }

    @Override
    public String aXB() {
        return this.pdc;
    }

    @Override
    public String aXC() {
        return this.pdd;
    }

    private static /* synthetic */ exe_0[] ffy() {
        return new exe_0[]{pcX, pcY, pcZ, pda};
    }

    static {
        pdf = exe_0.ffy();
    }
}

