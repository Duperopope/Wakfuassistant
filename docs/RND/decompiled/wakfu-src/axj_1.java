/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.common.nio.Buffers
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLProfile
 *  org.apache.log4j.Logger
 */
import com.jogamp.common.nio.Buffers;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLProfile;
import java.nio.IntBuffer;
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from axJ
 */
public class axj_1 {
    protected static final Logger dqC = Logger.getLogger(axj_1.class);
    private static final axj_1 dqD = new axj_1();
    public static final String dqE = "Renderer";
    public static final String dqF = "Vendor";
    public static final String dqG = "Version";
    public static final String dqH = "Extensions";

    private axj_1() {
    }

    public static axj_1 bQX() {
        return dqD;
    }

    public static void a(GL gL, HashMap<String, String> hashMap) {
        hashMap.put(dqE, gL.glGetString(7937));
        hashMap.put(dqF, gL.glGetString(7936));
        hashMap.put(dqG, gL.glGetString(7938));
        hashMap.put(dqH, gL.glGetString(7939));
    }

    public static void o(GL gL) {
        dqC.info((Object)"------- GL dump ---------");
        IntBuffer intBuffer = Buffers.newDirectIntBuffer((int)4);
        intBuffer.rewind();
        boolean bl = gL.glIsEnabled(2929);
        boolean bl2 = gL.glIsEnabled(3089);
        boolean bl3 = gL.glIsEnabled(3008);
        boolean bl4 = gL.glIsEnabled(2960);
        boolean bl5 = gL.glIsEnabled(2884);
        dqC.info((Object)("GL_PROFILE : " + GLProfile.getDefault().getImplName()));
        dqC.info((Object)("GL_RENDERER : " + gL.glGetString(7937)));
        dqC.info((Object)("GL_VENDOR : " + gL.glGetString(7936)));
        dqC.info((Object)("GL_VERSION : " + gL.glGetString(7938)));
        dqC.info((Object)("GL_DEPTH_TEST = " + bl));
        dqC.info((Object)("GL_SCISSOR_TEST = " + bl2));
        dqC.info((Object)("GL_ALPHA_TEST = " + bl3));
        gL.glGetIntegerv(3415, intBuffer);
        dqC.info((Object)("GL_STENCIL_TEST = " + bl4 + ";  Stencil depth = " + intBuffer.get(0) + " bits"));
        dqC.info((Object)("GL_CULL_FACE = " + bl5));
        gL.glGetIntegerv(2978, intBuffer);
        dqC.info((Object)("GL_VIEWPORT = [" + intBuffer.get(0) + ";" + intBuffer.get(1) + "] - [" + intBuffer.get(2) + ";" + intBuffer.get(3) + "]"));
        gL.glGetIntegerv(3088, intBuffer);
        dqC.info((Object)("GL_SCISSOR_BOX = [" + intBuffer.get(0) + ";" + intBuffer.get(1) + "] - [" + intBuffer.get(2) + ";" + intBuffer.get(3) + "]"));
        gL.glGetIntegerv(33001, intBuffer);
        dqC.info((Object)("GL_MAX_ELEMENTS_INDICES = " + intBuffer.get(0)));
        gL.glGetIntegerv(33000, intBuffer);
        dqC.info((Object)("GL_MAX_ELEMENTS_VERTICES = " + intBuffer.get(0)));
    }

    public static String bQY() {
        GL2 gL2 = aru_2.cVG.bIv().bIq();
        StringBuilder stringBuilder = new StringBuilder();
        IntBuffer intBuffer = Buffers.newDirectIntBuffer((int)4);
        intBuffer.rewind();
        boolean bl = gL2.glIsEnabled(2929);
        boolean bl2 = gL2.glIsEnabled(3089);
        boolean bl3 = gL2.glIsEnabled(3008);
        boolean bl4 = gL2.glIsEnabled(2960);
        boolean bl5 = gL2.glIsEnabled(2884);
        stringBuilder.append("\tGL_RENDERER : ").append(gL2.glGetString(7937));
        stringBuilder.append("\n\tGL_VENDOR : ").append(gL2.glGetString(7936));
        stringBuilder.append("\n\tGL_VERSION : ").append(gL2.glGetString(7938));
        stringBuilder.append("\n\tGL_DEPTH_TEST = ").append(bl);
        stringBuilder.append("\n\tGL_SCISSOR_TEST = ").append(bl2);
        stringBuilder.append("\n\tGL_ALPHA_TEST = ").append(bl3);
        gL2.glGetIntegerv(3415, intBuffer);
        stringBuilder.append("\n\tGL_STENCIL_TEST = ").append(bl4).append("  ").append(intBuffer.get(0)).append("bits");
        stringBuilder.append("\n\tGL_CULL_FACE = ").append(bl5);
        gL2.glGetIntegerv(2978, intBuffer);
        stringBuilder.append("\n\tGL_VIEWPORT = [").append(intBuffer.get(0)).append(';').append(intBuffer.get(1)).append("] - [").append(intBuffer.get(2)).append(';').append(intBuffer.get(3)).append(']');
        gL2.glGetIntegerv(3088, intBuffer);
        stringBuilder.append("\n\tGL_SCISSOR_BOX = [").append(intBuffer.get(0)).append(';').append(intBuffer.get(1)).append("] - [").append(intBuffer.get(2)).append(';').append(intBuffer.get(3)).append(']');
        return stringBuilder.toString();
    }
}

