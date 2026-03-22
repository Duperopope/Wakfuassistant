/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.material.Material;
import java.util.Arrays;
import org.apache.log4j.Logger;

public class aIp {
    private static final Logger dXO = Logger.getLogger(aIp.class);
    private static final Material dXP = (Material)Material.daL.bSJ();
    private static final float dXQ = 0.0f;
    private static final float dXR = 0.1f;
    private static final float[] dXS = new float[]{0.0f, 0.0f, 0.0f};

    public static void b(ZH zH) {
        aIp.a(zH, 0.0f);
    }

    public static void c(ZH zH) {
        aIp.a(zH, 0.1f);
    }

    public static void d(ZH zH) {
        zH.bpV();
    }

    private static void a(ZH zH, float f2) {
        if (zH.bqc() == null) {
            return;
        }
        float[] fArray = zH.bqc().aJI();
        if (Arrays.equals(fArray, dXS)) {
            fArray = ey_1.azX;
        }
        dXP.x(fArray[0] + f2, fArray[1] + f2, fArray[2] + f2);
        zH.b(dXP);
    }

    public static void e(ZH zH) {
        aIp.b(zH, 0.0f);
    }

    private static void b(ZH zH, float f2) {
        float[] fArray = new float[]{0.1f, 0.1f, 0.1f};
        dXP.x(fArray[0] + f2, fArray[1] + f2, fArray[2] + f2);
        zH.b(dXP);
    }
}

