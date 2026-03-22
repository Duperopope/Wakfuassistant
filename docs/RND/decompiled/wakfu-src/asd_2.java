/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import java.nio.Buffer;

/*
 * Renamed from asd
 */
public class asd_2
extends asa_2 {
    private ati_2 cWI;

    @Override
    public void aPg() {
        super.aPg();
        String string = arn_2.bIc().bIe() + "textures/cloud.tga";
        this.cWI = new ati_2((long)arn_2.fX(string), string, false);
    }

    @Override
    public void a(arx_2 arx_22) {
        atg_2 atg_22 = aru_2.cVG.bIv();
        this.cWv.glDrawBuffer(1029);
        this.bIQ();
        GL2 gL2 = atg_22.bIq();
        this.cWI.f(gL2);
        atg_22.dbl.uu(9);
        arq_2 arq_22 = arq_2.cVu;
        int n = 0;
        long l = System.nanoTime();
        while (System.nanoTime() - l < 500000000L) {
            this.cWv.glVertexPointer(2, 5126, 0, (Buffer)this.cdJ.bIy());
            this.cWv.glTexCoordPointer(2, 5126, 0, (Buffer)this.cdJ.bIA());
            this.cWv.glDrawElements(7, 4, 5123, (Buffer)arq_22.bIl());
            ++n;
        }
        float f2 = (float)n / 0.5f;
        cWw.info((Object)("textured quad draw/s ~= " + f2));
        arx_22.G(f2);
    }

    @Override
    public void bmX() {
        atg_2 atg_22 = aru_2.cVG.bIv();
        GL2 gL2 = atg_22.bIq();
        this.cWI.g((GL)gL2);
        this.cWI.bsI();
        super.bmX();
    }

    @Override
    public String getName() {
        return "GL texture fillrate";
    }
}

