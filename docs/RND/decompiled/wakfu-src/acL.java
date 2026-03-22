/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;

public abstract class acL {
    protected final ArrayList<Entity> chz = new ArrayList(128);
    private static acL chA = acO.chG;

    public void reset() {
        int n = this.chz.size();
        for (int i = 0; i < n; ++i) {
            Entity entity = this.chz.get(i);
            if (entity.bSW() < 0) continue;
            if (entity instanceof EntityGroup) {
                ArrayList<Entity> arrayList = entity.bJd();
                for (int j = 0; j < arrayList.size(); ++j) {
                    Entity entity2 = arrayList.get(j);
                    entity2.bIZ();
                    entity.a(avc_2.dgN);
                    entity.b(avc_2.dgN);
                }
                continue;
            }
            entity.bIZ();
            entity.a(avc_2.dgN);
            entity.b(avc_2.dgN);
        }
        this.chz.clear();
    }

    public void k(ArrayList<Entity> arrayList) {
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            Entity entity = arrayList.get(i);
            if ((entity.cWQ & 1) == 0) continue;
            int n2 = entity.brq;
            int n3 = entity.brr;
            int n4 = entity.bro;
            int n5 = entity.brp;
            float f2 = entity.cWN + entity.cWO;
            float f3 = entity.cWP + entity.cej * 0.666f;
            int n6 = this.chz.size();
            for (int j = i + 1; j < n; ++j) {
                Entity entity2 = arrayList.get(j);
                if ((entity2.cWQ & 2) == 0 || entity2.bro >= n2 || entity2.brp >= n3 || entity2.brq <= n4 || entity2.brr <= n5 || entity2.cWP + entity2.cej <= f3 || entity2.cWN + entity2.cWO <= f2) continue;
                this.b(entity, entity2);
            }
            this.a(n6, entity);
        }
    }

    public abstract ZL btT();

    protected abstract void a(int var1, Entity var2);

    public void a(Matrix44 matrix44, agb agb2) {
    }

    public abstract void f(aaj_0 var1);

    protected void b(Entity entity, Entity entity2) {
        this.chz.add(entity2);
    }

    public static acL btU() {
        return chA;
    }

    public static void a(acL acL2) {
        chA = acL2;
    }
}

