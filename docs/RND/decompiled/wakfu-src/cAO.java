/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

abstract sealed class cAO
extends Enum<cAO>
implements agf_1
permits cAP, cAQ, cAR {
    public static final /* enum */ cAO mpE = new cAP("pak");
    public static final /* enum */ cAO mpF = new cAQ("jar");
    public static final /* enum */ cAO mpG = new cAR("file");
    static final Logger mpH;
    private final String mpI;
    private static final /* synthetic */ cAO[] mpJ;

    public static cAO[] values() {
        return (cAO[])mpJ.clone();
    }

    public static cAO valueOf(String string) {
        return Enum.valueOf(cAO.class, string);
    }

    cAO(String string2) {
        this.mpI = string2;
    }

    @Override
    public final void cbw() {
        this.a("MUSIC", "musicPath", cAN.mpo.eGS(), cAN.mpo.eGU());
        this.a("GUI_SFX", "guiSoundPath", cAN.mps.eGT());
        this.a("AMB2D", "amb2DPath", cAN.mpp.eGT(), cAN.mpp.eGS(), cAN.mpp.eGU());
        this.a("FIGHT_SOUND", "fightSoundPath", cAN.mpr.eGT(), cAN.mpr.eGU());
        this.a("SFX_SOUND", "sfxSoundPath", cAN.mpu.eGT(), cAN.mpu.eGU());
        this.a("VOICES_SOUND", "voicesPath", cAN.mpt.eGT(), cAN.mpt.eGU());
        this.a("FOLEYS_SOUND", "foleysSoundPath", cAN.mpw.eGT(), cAN.mpw.eGU());
        this.a("PARTICLES_SOUND", "particlesSoundPath", cAN.mpv.eGT(), cAN.mpv.eGU());
    }

    private void a(String string, String string2, agk_1 ... agk_1Array) {
        try {
            String string3 = auc_0.cVq().bS(string2);
            ahg_2 ahg_22 = this.oN(string3);
            if (ahg_22 == null) {
                return;
            }
            for (agk_1 agk_12 : agk_1Array) {
                agk_12.a(ahg_22);
            }
        }
        catch (Exception exception) {
            mpH.error((Object)("impossible d'initialiser " + string), (Throwable)exception);
        }
    }

    protected abstract ahg_2 oN(String var1);

    public static cAO oO(String string) {
        for (cAO cAO2 : cAO.values()) {
            if (!cAO2.mpI.equalsIgnoreCase(string)) continue;
            return cAO2;
        }
        return null;
    }

    private static /* synthetic */ cAO[] eGZ() {
        return new cAO[]{mpE, mpF, mpG};
    }

    static {
        mpJ = cAO.eGZ();
        mpH = Logger.getLogger(cAO.class);
    }
}

