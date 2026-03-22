/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bnd
 */
public class bnd_2
implements aeh_2 {
    public static final String iGa = "currentArtisansPage";
    public static final String iGb = "currentPageText";
    public static final String iGc = "currentPage";
    public static final String iGd = "totalPages";
    private int bUj = 0;
    private int iGe = 0;
    private List<bna_2> iGf;
    public static final String[] iGg = new String[]{"currentArtisansPage", "currentPageText", "currentPage", "totalPages"};

    public void K(List<bna_2> list) {
        this.iGf = list;
    }

    public List<bna_2> dxX() {
        if (this.iGf == null) {
            return new ArrayList<bna_2>();
        }
        return this.iGf;
    }

    @Override
    public String[] bxk() {
        return iGg;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (Strings.isNullOrEmpty((String)string)) {
            return null;
        }
        if (string.equals(iGa)) {
            return this.iGf;
        }
        if (string.equals(iGb)) {
            return this.dfz() + 1 + " / " + Math.max(this.dxY(), 1);
        }
        if (string.equals(iGc)) {
            return this.dfz() + 1;
        }
        if (string.equals(iGd)) {
            return this.dxY();
        }
        return null;
    }

    public int getCurrentIndex() {
        return this.bUj;
    }

    public int dfz() {
        return this.bUj / 13;
    }

    private int dxY() {
        if (this.iGe % 13 == 0) {
            return this.iGe / 13;
        }
        return this.iGe / 13 + 1;
    }

    public void Et(int n) {
        this.bUj = n;
    }

    public void Eu(int n) {
        this.iGe = n;
    }
}

