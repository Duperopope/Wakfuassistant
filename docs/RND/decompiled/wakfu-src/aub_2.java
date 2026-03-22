/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import java.util.ArrayList;

/*
 * Renamed from auB
 */
public class aub_2
implements aua_2 {
    private final aua_2 deJ;
    private static final ArrayList<auc_2> deK = new ArrayList();

    public aub_2(aua_2 aua_22) {
        this.deJ = aua_22;
    }

    public static boolean a(auc_2 auc_22) {
        return !deK.contains(auc_22) && deK.add(auc_22);
    }

    @Override
    public void a(VertexBufferPCT vertexBufferPCT, float[] fArray, int n) {
        for (int i = 0; i < deK.size(); ++i) {
            auc_2 auc_22 = deK.get(i);
            if (auc_22.bMs()) continue;
            aue_2.bMt().a(vertexBufferPCT, fArray, n);
            return;
        }
        this.deJ.a(vertexBufferPCT, fArray, n);
    }

    @Override
    public void U(float[] fArray) {
        for (int i = 0; i < deK.size(); ++i) {
            auc_2 auc_22 = deK.get(i);
            if (auc_22.bMs()) continue;
            aue_2.bMt().U(fArray);
            return;
        }
        this.deJ.U(fArray);
    }
}

