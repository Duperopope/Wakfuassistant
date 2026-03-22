/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.cg.CGparameter
 *  com.jogamp.opengl.cg.CgGL
 */
import com.jogamp.opengl.cg.CGparameter;
import com.jogamp.opengl.cg.CgGL;

/*
 * Renamed from ata
 */
class ata_2
implements asm_1 {
    final /* synthetic */ asy_2 daZ;

    ata_2(asy_2 asy_22) {
        this.daZ = asy_22;
    }

    @Override
    public void a(ase_1 ase_12, int n, float[] fArray) {
        atc_2 atc_22 = this.daZ.daW.vK(ase_12.cXU);
        if (atc_22 == null) {
            asy_2.daQ.error((Object)("param\u00e8tre inconnu " + ase_12.cXV));
            return;
        }
        switch (ase_12.cZq) {
            case cZr: {
                if (atc_22.cV(fArray[n])) break;
                CgGL.cgSetParameter1f((CGparameter)atc_22.dbb, (float)fArray[n]);
                atc_22.cW(fArray[n]);
                break;
            }
            case cZs: {
                if (atc_22.a(fArray, n, 2)) break;
                CgGL.cgSetParameter2fv((CGparameter)atc_22.dbb, (float[])fArray, (int)n);
                atc_22.b(fArray, n, 2);
                break;
            }
            case cZt: {
                if (atc_22.a(fArray, n, 3)) break;
                CgGL.cgSetParameter3fv((CGparameter)atc_22.dbb, (float[])fArray, (int)n);
                atc_22.b(fArray, n, 3);
                break;
            }
            case cZu: {
                if (atc_22.a(fArray, n, 4)) break;
                CgGL.cgSetParameter4fv((CGparameter)atc_22.dbb, (float[])fArray, (int)n);
                atc_22.b(fArray, n, 4);
                break;
            }
            case cZv: {
                if (atc_22.a(fArray, n, 16)) break;
                CgGL.cgSetParameterValuefr((CGparameter)atc_22.dbb, (int)16, (float[])fArray, (int)n);
                atc_22.b(fArray, n, 16);
                break;
            }
            default: {
                asy_2.daQ.error((Object)("type inconnu " + String.valueOf((Object)ase_12.cZq)));
            }
        }
    }
}

