/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

public class acO
extends acL {
    private static final Logger chF = Logger.getLogger(acO.class);
    public static final acO chG = new acO();
    private final acr_1 chH = new acr_1();
    private final acr_1 chI = new acr_1();
    private final HashMap<Entity, float[]> chJ = new HashMap();

    private acO() {
    }

    @Override
    public void reset() {
        super.reset();
        this.chJ.clear();
    }

    @Override
    public ZL btT() {
        return new acN();
    }

    @Override
    protected void a(int n, Entity entity) {
        boolean bl;
        int n2 = this.chz.size();
        if (n2 - n <= 0) {
            return;
        }
        asr_1 asr_12 = ast_1.bJG().bJH();
        boolean bl2 = bl = !asr_12.un(asa_1.cYD);
        if (!bl) {
            int n3 = entity.brq;
            int n4 = entity.brr;
            int n5 = entity.bro;
            int n6 = entity.brp;
            for (int i = n; i < n2; ++i) {
                Entity entity2 = (Entity)this.chz.get(i);
                float[] fArray = this.chJ.get(entity2);
                if (fArray == null) {
                    fArray = new float[4];
                    this.chJ.put(entity2, fArray);
                    fArray[0] = n5;
                    fArray[1] = n3;
                    fArray[2] = n6;
                    fArray[3] = n4;
                    continue;
                }
                if ((float)n5 < fArray[0]) {
                    fArray[0] = n5;
                }
                if ((float)n3 > fArray[1]) {
                    fArray[1] = n3;
                }
                if ((float)n6 < fArray[2]) {
                    fArray[2] = n6;
                }
                if (!((float)n4 > fArray[3])) continue;
                fArray[3] = n4;
            }
        } else {
            for (int i = n; i < n2; ++i) {
                Entity entity3 = (Entity)this.chz.get(i);
                entity3.a(acP.chK);
                entity3.b(acM.chB);
                if (entity3 instanceof EntityGroup) {
                    ArrayList<Entity> arrayList = entity3.bJd();
                    for (int j = 0; j < arrayList.size(); ++j) {
                        Entity entity4 = arrayList.get(j);
                        entity4.a(acP.chK);
                        entity4.b(acM.chB);
                    }
                    continue;
                }
                entity3.a(acP.chK);
                entity3.b(acM.chB);
            }
        }
    }

    @Override
    public void a(Matrix44 matrix44, agb agb2) {
        if (this.chJ.isEmpty()) {
            return;
        }
        asr_1 asr_12 = ast_1.bJG().bJH();
        int n = agb2.byD();
        int n2 = agb2.byE();
        float f2 = agb2.getZoomFactor();
        float f3 = f2 / (float)n;
        float f4 = f2 / (float)n2;
        for (Map.Entry<Entity, float[]> entry : this.chJ.entrySet()) {
            Entity entity = entry.getKey();
            float[] fArray = entry.getValue();
            float f5 = fArray[1] - fArray[0] - 1.0f;
            if (f5 < 48.0f) {
                f5 = 48.0f;
            }
            float f6 = fArray[3] - fArray[2] - 1.0f;
            float f7 = f5 * f3 * GC.aGm;
            float f8 = f6 * f4 * GC.aGm;
            float f9 = (fArray[0] + fArray[1]) / 2.0f;
            float f10 = (fArray[2] + fArray[3]) / 2.0f;
            this.chH.y(f9, f10, 0.0f, 1.0f);
            matrix44.b(this.chH, this.chI);
            this.chI.aPY *= 2.0f / (float)n;
            this.chI.aPZ *= 2.0f / (float)n2;
            asl_1 asl_12 = new asl_1(asa_1.cZf);
            asl_12.a("gAlphaMaskRadius", f7, f8);
            asl_12.a("gAlphaMaskPos", this.chI.aPY, this.chI.aPZ);
            if (entity instanceof EntityGroup) {
                ArrayList<Entity> arrayList = entity.bJd();
                for (int i = 0; i < arrayList.size(); ++i) {
                    Entity entity2 = arrayList.get(i);
                    entity2.a(asr_12, asa_1.cYE, asl_12);
                }
                continue;
            }
            entity.a(asr_12, asa_1.cYD, asl_12);
        }
    }

    @Override
    public void f(aaj_0 aaj_02) {
    }
}

