/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;

/*
 * Renamed from bZu
 */
class bzu_1
extends bzo_1 {
    private static final int lDa = 18;
    private static final int lDb = 18;
    private float lDc = 0.0f;

    bzu_1() {
    }

    @Override
    void i(afV afV2) {
        super.i(afV2);
        this.hNy = true;
    }

    @Override
    void bhk() {
        super.bhk();
        this.hNy = false;
    }

    @Override
    void b(afV afV2, float f2, float f3) {
        if (!this.hNy) {
            return;
        }
        float f4 = f3 * f2;
        float f5 = -0.3f * f4;
        float f6 = f5 / 2.0f;
        this.lDc += 0.17453292f * f4;
        ArrayList arrayList = bLe.ecw().bph();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            this.a(f6, (bKV)arrayList.get(i));
        }
    }

    private void a(float f2, bKV bKV2) {
        Entity entity = bKV2.bpq();
        if (entity == null) {
            return;
        }
        BatchTransformer batchTransformer = entity.bIS();
        awp_1 awp_12 = (awp_1)batchTransformer.uW(0);
        Matrix44 matrix44 = awp_12.bPE();
        if (!fsi_0.c(bKV2.ecn())) {
            if (!matrix44.bWq()) {
                matrix44.bPx();
                awp_12.bPv();
                batchTransformer.bPv();
            }
            return;
        }
        float f3 = bKV2.getWorldX() * bKV2.getWorldY() * 1.0f * ((float)Math.PI / 180);
        float f4 = f2 + f2 * GC.G(this.lDc + f3);
        matrix44.d(4, f4);
        awp_12.bPv();
        batchTransformer.bPv();
    }
}

