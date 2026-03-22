/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.packrect.Rect
 *  com.jogamp.opengl.util.packrect.RectVisitor
 */
import com.jogamp.opengl.util.packrect.Rect;
import com.jogamp.opengl.util.packrect.RectVisitor;
import java.util.List;

/*
 * Renamed from avV
 */
class avv_2
implements RectVisitor {
    final /* synthetic */ List djm;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    avv_2(avu_2 avu_22, List list) {
        this.djm = list;
    }

    public void visit(Rect rect) {
        awf_1 awf_12 = (awf_1)rect.getUserData();
        if (!awf_12.bOa()) {
            this.djm.add(rect);
        }
    }
}

