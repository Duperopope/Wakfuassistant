/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class bwl
implements aeh_2,
bdz_0 {
    public static final String jwP = "items";
    public static final String jwQ = "isCollapsed";
    public static final String jwR = "categoryName";
    public static final String jwS = "categoryIcon";
    public static final String jwT = "size";
    private static final String[] jwU = new String[]{"items", "isCollapsed", "categoryName", "categoryIcon", "size"};
    @Nullable
    private final ffS jwV;
    private final String jwW;
    private final List<ffV> jwX = new ArrayList<ffV>();
    private boolean jwY;

    public bwl(String string) {
        this.jwV = null;
        this.jwW = string;
    }

    public bwl(ffS ffS2) {
        this.jwV = ffS2;
        this.jwW = aum_0.cWf().c(ffS2.shc, new Object[0]);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "items": {
                return this.jwX;
            }
            case "isCollapsed": {
                return this.jwY;
            }
            case "categoryName": {
                return this.jwW;
            }
            case "categoryIcon": {
                if (this.jwV == null) {
                    return null;
                }
                return auc_0.cVq().aZ(this.jwV.fVM());
            }
            case "size": {
                return this.jwX.size();
            }
        }
        return null;
    }

    public void S(List<ffV> list) {
        this.jwX.clear();
        this.jwX.addAll(list);
    }

    public void T(ffV ffV2) {
        this.jwX.add(ffV2);
    }

    public List<ffV> dLF() {
        return Collections.unmodifiableList(this.jwX);
    }

    @Override
    public boolean dbK() {
        return this.jwY;
    }

    @Override
    public void fm(boolean bl) {
        this.jwY = bl;
    }

    @Override
    public void dLG() {
        bdz_0.super.dLG();
        fse_1.gFu().a((aef_2)this, jwQ);
    }

    @Override
    public String[] bxk() {
        return jwU;
    }
}

