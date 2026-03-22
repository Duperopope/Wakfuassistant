/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from avg
 */
public final class avg_2
extends Enum<avg_2> {
    public static final /* enum */ avg_2 dhg = new avg_2("GL render targets", "renderTargetsSupported");
    public static final /* enum */ avg_2 dhh = new avg_2("GL multi-sampling", "multiSamplingSupported");
    public static final /* enum */ avg_2 dhi = new avg_2("GL multi-texturing", "multiTexturingSupported");
    public static final /* enum */ avg_2 dhj = new avg_2("GL texture compression", "textureCompressionSupported");
    public static final /* enum */ avg_2 dhk = new avg_2("GL fragment shaders", "fragmentShadersSupported");
    public static final /* enum */ avg_2 dhl = new avg_2("Cg GL fragment shaders", "cgFragmentShadersSupported");
    public static final /* enum */ avg_2 dhm = new avg_2("GL vertex shaders", "vertexShadersSupported");
    public static final /* enum */ avg_2 dhn = new avg_2("Cg GL vertex shaders", "cgVertexShadersSupported");
    public static final /* enum */ avg_2 dho = new avg_2("GL texture non power of two", "textureNonPowerOfTwo");
    public static final /* enum */ avg_2 dhp = new avg_2("GL compressed text image 2d fonction", "glCompressedTextImage2D");
    public static final /* enum */ avg_2 dhq = new avg_2("OpenGL driver in use are faulty AMD Adrenalin driver", "glAMDAdrenalinArtefactTearing");
    public static final /* enum */ avg_2 dhr = new avg_2("AL effects", "alEffectsSupported");
    public static final /* enum */ avg_2 dhs = new avg_2("AL filters", "alFiltersSupported");
    public static final /* enum */ avg_2 dht = new avg_2("AL debug Extension", "alDebugExt");
    public static final /* enum */ avg_2 dhu = new avg_2("ALC Enumeration Extension", "alEnumerationExt");
    public static final /* enum */ avg_2 dhv = new avg_2("ALC Enumerate All Extension", "alEnumerateAllExt");
    public static final /* enum */ avg_2 dhw = new avg_2("AL SOFT events Extension", "alSOFTeventsExt");
    public static final /* enum */ avg_2 dhx = new avg_2("ALC Soft system events Extension", "alcSOFTsystemEventsExt");
    public static final /* enum */ avg_2 dhy = new avg_2("ALC Soft default playback device change event support", "alcSOFTdefaultPlaybackDeviceChangeEvent");
    public static final /* enum */ avg_2 dhz = new avg_2("ALC Soft HRTF Extension", "alcSoftHRTFExt");
    private static final HashMap<String, avg_2> dhA;
    private final String dhB;
    private final String dhC;
    private static final /* synthetic */ avg_2[] dhD;

    public static avg_2[] values() {
        return (avg_2[])dhD.clone();
    }

    public static avg_2 valueOf(String string) {
        return Enum.valueOf(avg_2.class, string);
    }

    private avg_2(String string2, String string3) {
        this.dhB = string2;
        this.dhC = string3;
    }

    public String bMQ() {
        return this.dhB;
    }

    public String aYh() {
        return this.dhC;
    }

    public static avg_2 go(String string) {
        return dhA.get(string);
    }

    private static /* synthetic */ avg_2[] bMR() {
        return new avg_2[]{dhg, dhh, dhi, dhj, dhk, dhl, dhm, dhn, dho, dhp, dhq, dhr, dhs, dht, dhu, dhv, dhw, dhx, dhy, dhz};
    }

    static {
        dhD = avg_2.bMR();
        dhA = new HashMap();
        for (avg_2 avg_22 : avg_2.values()) {
            dhA.put(avg_22.aYh(), avg_22);
        }
    }
}

