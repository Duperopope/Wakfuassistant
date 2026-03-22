/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import org.apache.log4j.Logger;

public class aJU {
    private static final Logger ecB = Logger.getLogger(aJU.class);
    public static final float ecC = 4.0f;
    public static final float ecD = 4.0f;
    private static final ajv_0 ecE = new ajv_0();
    private static final ajv_0 ecF = new ajv_0();

    public static void P(String string, String string2) {
        ecE.ec(string);
        ecF.ec(string2);
    }

    public static void a(EntityGroup entityGroup, int n, int n2, int n3, float f2, acc_1 acc_12) {
        awk_1 awk_12 = ecE.qW(n);
        float f3 = aJU.bx(n2, n3);
        float f4 = aJU.bw(n2, n3);
        f4 -= aie_0.cfn().bmC().bys() / 4.0f;
        try {
            aJU.a(entityGroup, awk_12, f3, f4, f2, acc_12);
        }
        catch (NullPointerException nullPointerException) {
            ecB.error((Object)("probl\u00e8me avec le patch " + n), (Throwable)nullPointerException);
        }
    }

    static void b(EntityGroup entityGroup, int n, int n2, int n3, float f2, acc_1 acc_12) {
        awk_1 awk_12 = ecF.qW(n);
        float f3 = (float)n2 / 9.0f;
        float f4 = (float)n3 / 9.0f;
        float f5 = aJU.bx(f3, f4);
        float f6 = aJU.bw(f3, f4);
        try {
            aJU.a(entityGroup, awk_12, f5, f6, f2, acc_12);
        }
        catch (NullPointerException nullPointerException) {
            ecB.error((Object)("probl\u00e8me avec le building " + n), (Throwable)nullPointerException);
        }
    }

    private static float bw(float f2, float f3) {
        return (f2 - f3) * aJU.cin();
    }

    private static float bx(float f2, float f3) {
        return -(f2 + f3) * aJU.cio() + aie_0.cfn().bmC().bys() * 0.5f;
    }

    private static void a(EntityGroup entityGroup, awk_1 awk_12, float f2, float f3, float f4, acc_1 acc_12) {
        if (awk_12 == null || acc_12 == null) {
            throw new NullPointerException();
        }
        aam_0 aam_02 = aie_0.cfn().bmC();
        f3 += aam_02.aM(entityGroup.cWN, entityGroup.cWO);
        f2 += aam_02.aN(entityGroup.cWN, entityGroup.cWO) + f4;
        acc_1 acc_13 = awk_12.bQs();
        EntitySprite entitySprite = aJU.f(awk_12);
        entitySprite.e(f2 += (float)acc_12.bWy() / 4.0f / 9.0f, f3 += (float)acc_12.bWx() / 4.0f / 9.0f, acc_13.bWx() + 1, acc_13.bWy() + 1);
        entitySprite.bro = GC.B(f3);
        entitySprite.brp = GC.B(f2);
        entitySprite.brq = GC.C(f3 + (float)acc_13.bWx());
        entitySprite.brr = GC.C(f2 - (float)acc_13.bWy());
        entityGroup.g(entitySprite);
        entitySprite.bsI();
    }

    private static EntitySprite f(awk_1 awk_12) {
        acc_1 acc_12 = awk_12.bQs();
        acc_1 acc_13 = awk_12.bQt();
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.dbk.bSK();
        gLGeometrySprite.c(auw_2.dfI, auw_2.dfM);
        gLGeometrySprite.f(0.0f, 0.0f, acc_12.bWx(), acc_12.bWy());
        gLGeometrySprite.o(0.0f, 0.0f, (float)acc_12.bWy() / (float)acc_13.bWy(), (float)acc_12.bWx() / (float)acc_13.bWx());
        EntitySprite entitySprite = (EntitySprite)EntitySprite.cXk.bSK();
        entitySprite.a(gLGeometrySprite);
        entitySprite.setTexture(awk_12);
        entitySprite.bIZ();
        entitySprite.c(0.5f, 0.5f, 0.5f, 1.0f);
        gLGeometrySprite.bsI();
        return entitySprite;
    }

    private static float cin() {
        aam_0 aam_02 = aie_0.cfn().bmC();
        return 0.5f * aam_02.byr() / 4.0f;
    }

    private static float cio() {
        aam_0 aam_02 = aie_0.cfn().bmC();
        return 0.5f * aam_02.bys() / 4.0f;
    }
}

