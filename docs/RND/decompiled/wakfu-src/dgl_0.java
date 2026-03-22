/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dgL
 */
public class dgl_0
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fyk_0 fyk_02 = (fyk_0)fes_23.getAppearance();
        fyk_02.setElementMap(fhs_23);
        fyk_02.setAnimName("AnimTitre-G");
        fyk_02.setDirection(0);
        fyk_02.setFilePath("Banner_Titre.anm");
        fyk_02.setScale(1.0f);
        fes_22.X(fyk_02);
        fyk_02.guy();
        fyk_02.onChildrenAdded();
    }
}

