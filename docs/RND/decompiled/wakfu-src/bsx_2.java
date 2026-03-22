/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ankama.model.CmsPollInGame
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.haapi.client.okhttp.ankama.model.CmsPollInGame;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bSx
 */
public class bsx_2
implements aeh_2 {
    public static final String lgX = "title";
    public static final String lgY = "description";
    public static final String lgZ = "portrait";
    public static final String[] lha = new String[]{"title", "description", "portrait"};
    public static final String lhb = "npc1719";
    private final CmsPollInGame lhc;

    public bsx_2(CmsPollInGame cmsPollInGame) {
        this.lhc = cmsPollInGame;
    }

    @Override
    public String[] bxk() {
        return lha;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (lgX.equals(string)) {
            return this.lhc.getTitle();
        }
        if (lgY.equals(string)) {
            return this.lhc.getDescription();
        }
        if (lgZ.equals(string)) {
            return auc_0.cVq().kC(lhb);
        }
        return null;
    }

    public long emR() {
        return this.lhc.getItemId();
    }

    public String bZo() {
        return this.lhc.getUrl();
    }
}

