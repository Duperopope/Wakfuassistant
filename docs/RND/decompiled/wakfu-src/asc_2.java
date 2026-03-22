/*
 * Decompiled with CFR 0.152.
 */
import java.nio.Buffer;

/*
 * Renamed from asc
 */
public class asc_2
extends asa_2 {
    @Override
    public void a(arx_2 arx_22) {
        atg_2 atg_22 = aru_2.cVG.bIv();
        this.cWv.glDrawBuffer(1029);
        this.bIQ();
        atg_22.dbl.uu(5);
        arq_2 arq_22 = arq_2.cVu;
        int n = 0;
        long l = System.nanoTime();
        while (System.nanoTime() - l < 500000000L) {
            this.cWv.glVertexPointer(2, 5126, 0, (Buffer)this.cdJ.bIy());
            this.cWv.glColorPointer(4, 5126, 0, (Buffer)this.cdJ.bIz());
            this.cWv.glDrawElements(7, 4, 5123, (Buffer)arq_22.bIl());
            ++n;
        }
        float f2 = (float)n / 0.5f;
        cWw.info((Object)("colored quad draw/s ~= " + f2));
        arx_22.F(f2);
    }

    @Override
    public String getName() {
        return "GL pixel fillrate";
    }
}

