/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.jogamp.opengl.GL2;
import java.util.ArrayList;
import java.util.HashSet;

class aan
implements arr_2 {
    final /* synthetic */ aam_0 bYM;

    aan(aam_0 aam_02) {
        this.bYM = aam_02;
    }

    @Override
    public void b(art_1 art_12) {
        GL2 gL2 = art_12.bIq();
        this.a(art_12, gL2, this.bYM.bYI);
        this.bYM.a(gL2);
        this.bYM.bYk.b(art_12);
        this.a(art_12, gL2, this.bYM.bYJ);
    }

    private void a(art_1 art_12, GL2 gL2, ArrayList<aaO> arrayList) {
        if (!this.bYM.bYL) {
            return;
        }
        for (int i = 0; i < arrayList.size(); ++i) {
            aaO aaO2 = arrayList.get(i);
            aaO2.a(gL2);
            aaO2.bYk.b(art_12);
        }
    }

    @Override
    public void c(Entity entity) {
    }

    @Override
    public void a(Entity entity, int n) {
    }

    @Override
    public void clear() {
    }

    @Override
    public void c(HashSet<Entity> hashSet) {
    }
}

