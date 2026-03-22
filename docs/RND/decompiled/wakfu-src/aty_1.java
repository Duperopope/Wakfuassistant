/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aty$atA
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.io.FilenameFilter;
import org.apache.log4j.Logger;

/*
 * Renamed from aty
 */
public abstract class aty_1<P extends ParticleSystem>
extends adm_1<byte[]> {
    private static final Logger ddc = Logger.getLogger(aty_1.class);
    public static final String ddd = ".xps";
    public static final int dde = 1;
    public final FilenameFilter ddf = new atz_1(this);

    protected aty_1() {
        super(0x500000L, true);
    }

    public abstract P eK(String var1);

    @Override
    public String bLX() {
        return ddd;
    }

    @Override
    public final FilenameFilter bLY() {
        return this.ddf;
    }

    protected String uE(int n) {
        return this.bYf() + n + this.bLX();
    }

    protected void a(int n, int n2, ParticleSystem particleSystem) {
        String string = this.uE(n);
        this.a(string, n2, particleSystem);
    }

    protected void a(String string, int n, ParticleSystem particleSystem) {
        long l;
        this.a(particleSystem, string);
        this.b(string, n, particleSystem);
        particleSystem.bLM();
        try {
            l = 0xDD00DD0000000000L | particleSystem.aJw;
        }
        catch (Exception exception) {
            ddc.error((Object)("The name of a particle system must be a number" + String.valueOf(exception)));
            l = 0xDD00DD0000000000L | (long)arn_2.fX(fq_0.bJ(string));
        }
        String string2 = fq_0.bL(string) + "/" + particleSystem.aJw + ".tga";
        awm_1 awm_12 = awm_1.bPn();
        awk_1 awk_12 = awm_12.gB(l);
        if (awk_12 == null) {
            axc_2 axc_22 = new axc_2(string2);
            awk_12 = awm_12.a((art_1)aru_2.cVG.bIv(), l, axc_22, false);
            axc_22.bsI();
        }
        particleSystem.d(awk_12);
    }

    protected void b(String string, int n, ParticleSystem particleSystem) {
        particleSystem.aCH = string;
        particleSystem.dcy = Bw.b((Object)fq_0.bJ(string), 0);
        atb_1.a(string, particleSystem, n);
    }

    protected void a(ParticleSystem particleSystem, String string) {
        long l;
        int n;
        int n2 = string.lastIndexOf(47);
        int n3 = n2 > (n = string.lastIndexOf(92)) ? n2 : n;
        int n4 = string.indexOf(46, n3);
        String string2 = string.substring(n3 + 1, n4);
        try {
            l = 0xDD00DD0000000000L | (long)Integer.parseInt(string2);
        }
        catch (Exception exception) {
            l = 0xDD00DD0000000000L | (long)arn_2.fX(string2);
        }
        particleSystem.gx(l);
    }

    public final void a(int n, ParticleSystem particleSystem) {
        try {
            particleSystem.bLL().clear();
            Emitter[] emitterArray = particleSystem.bLT();
            atb_1.a(particleSystem.aCH, particleSystem, n);
            int n2 = emitterArray.length;
            for (int i = 0; i < n2; ++i) {
                auw_1 auw_12 = particleSystem.bLL().get(i);
                emitterArray[i].a(auw_12);
            }
            particleSystem.bLO();
        }
        catch (Exception exception) {
            ddc.error((Object)"", (Throwable)exception);
        }
    }

    protected final atA dB(byte[] byArray) {
        return new ata_1(this, byArray);
    }

    protected /* synthetic */ adp_2 dC(byte[] byArray) {
        return this.dB(byArray);
    }
}

