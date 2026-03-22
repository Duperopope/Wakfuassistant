/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.jogamp.opengl.cg.CGcontext
 *  com.jogamp.opengl.cg.CGeffect
 *  com.jogamp.opengl.cg.CGparameter
 *  com.jogamp.opengl.cg.CGtechnique
 *  com.jogamp.opengl.cg.CgGL
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.jogamp.opengl.cg.CGcontext;
import com.jogamp.opengl.cg.CGeffect;
import com.jogamp.opengl.cg.CGparameter;
import com.jogamp.opengl.cg.CGtechnique;
import com.jogamp.opengl.cg.CgGL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

/*
 * Renamed from asY
 */
public class asy_2
extends asr_1 {
    private static final boolean daP = false;
    static final Logger daQ = Logger.getLogger(asy_2.class);
    private static final int daR = 30;
    private static final LoadingCache<String, String> daS = CacheBuilder.newBuilder().expireAfterAccess(30L, TimeUnit.SECONDS).build((CacheLoader)new asz_2());
    private final asm_1 daT = new ata_2(this);
    private static CGcontext daU;
    protected CGeffect daV;
    final aah_1<atc_2> daW = new aah_1(5);
    private static String daX;

    @Override
    public void x(String string, String string2) {
        Object object;
        super.x(string, string2);
        if (daX == null) {
            String string3 = fq_0.bG(string2) + "/functions.cgfx";
            try {
                object = fo_0.by(string3);
            }
            catch (Exception exception) {
                daQ.error((Object)("Unable to read file functions: " + string3), (Throwable)exception);
                return;
            }
            daX = new String((byte[])object);
        }
        try {
            object = (String)daS.get((Object)string2);
        }
        catch (ExecutionException executionException) {
            daQ.error((Object)("Unable to load source file (" + string2 + ") in CACHE"));
            return;
        }
        if (object == null) {
            daQ.error((Object)("Unable to get source file (" + string2 + ")"));
            return;
        }
        this.daV = CgGL.cgCreateEffect((CGcontext)daU, (String)(daX + (String)object), null);
        if (this.daV == null) {
            daQ.error((Object)(CgGL.cgGetLastErrorString(null) + "\n(prendre en compte le nombre de ligne de functions.cgfx)"));
            daQ.error((Object)CgGL.cgGetLastListing((CGcontext)daU));
        }
        this.aPg();
    }

    public static void bKX() {
        try {
            daU = CgGL.cgCreateContext();
            CgGL.cgGLRegisterStates((CGcontext)daU);
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            daQ.error((Object)"GlEffect not loaded : Cg library not loaded", (Throwable)noClassDefFoundError);
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            daQ.error((Object)"GlEffect not loaded : Cg library not found", (Throwable)unsatisfiedLinkError);
        }
    }

    @Override
    public void aUI() {
        if (this.daV != null) {
            CgGL.cgDestroyEffect((CGeffect)this.daV);
        }
        super.aUI();
    }

    @Override
    public void y(String string, String string2) {
        super.y(string, string2);
        daU = CgGL.cgCreateContext();
        CgGL.cgGLRegisterStates((CGcontext)daU);
        this.daV = CgGL.cgCreateEffect((CGcontext)daU, (String)string2, null);
        this.aPg();
    }

    @Override
    public void bJD() {
        this.daW.clear();
        CGparameter cGparameter = CgGL.cgGetFirstEffectParameter((CGeffect)this.daV);
        do {
            String string;
            if ((string = CgGL.cgGetParameterName((CGparameter)cGparameter)) == null || string.isEmpty()) continue;
            this.daW.b(arn_2.fW(string), new atc_2(string, cGparameter));
        } while ((cGparameter = CgGL.cgGetNextParameter((CGparameter)cGparameter)) != null);
    }

    @Override
    public final void a(art_1 art_12, Entity entity, asl_1 asl_12) {
        super.a(art_12, entity, asl_12);
        if (this.bJC()) {
            ava_2.bMH().cY(asl_12.bX("gColorScale"));
            entity.d(art_12);
        } else {
            if (asl_12 != null) {
                this.a(asl_12);
            }
            this.cXX.b(art_12, entity);
        }
    }

    @Override
    protected final void a(asl_1 asl_12) {
        assert (asl_12 != null);
        asl_12.a(this.daT);
    }

    private int bKY() {
        int n = 0;
        CGtechnique cGtechnique = CgGL.cgGetFirstTechnique((CGeffect)this.daV);
        CgGL.cgGetTechniqueName((CGtechnique)cGtechnique);
        while (cGtechnique != null) {
            ++n;
            cGtechnique = CgGL.cgGetNextTechnique((CGtechnique)cGtechnique);
        }
        return n;
    }

    private void aPg() {
        this.cXW.clear();
        if (!avh_2.dhF.bMU()) {
            return;
        }
        this.cXW.vS(this.bKY());
        CGtechnique cGtechnique = CgGL.cgGetFirstTechnique((CGeffect)this.daV);
        while (cGtechnique != null) {
            boolean bl = CgGL.cgValidateTechnique((CGtechnique)cGtechnique);
            ate_2 ate_22 = new ate_2(cGtechnique);
            int n = ate_22.cXU;
            if (bl) {
                this.cXW.b(n, ate_22);
            }
            cGtechnique = CgGL.cgGetNextTechnique((CGtechnique)cGtechnique);
        }
        this.bJD();
    }
}

