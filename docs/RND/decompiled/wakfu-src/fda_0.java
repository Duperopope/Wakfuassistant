/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.EnumMap;
import java.util.function.Consumer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fdA
 */
public class fda_0 {
    private static final Logger rWH = Logger.getLogger(fda_0.class);
    public static final fda_0 rWI = new fda_0();
    private final EnumMap<fdv_0, TIntObjectHashMap<fdz_0>> rWJ = new EnumMap(fdv_0.class);

    private fda_0() {
    }

    public void a(@NotNull fdc_0 fdc_02) {
        this.a(fdc_02, fdv_0.rZh);
    }

    public void a(@NotNull fdy_0 fdy_02) {
        this.a(fdy_02, fdv_0.rZf);
    }

    public void a(@NotNull fdf_0 fdf_02) {
        this.a(fdf_02, fdv_0.rZc);
    }

    public void a(@NotNull fdl fdl2) {
        this.a(fdl2, fdv_0.rZb);
    }

    public void a(@NotNull fdx_0 fdx_02) {
        this.a(fdx_02, fdv_0.rZa);
    }

    public void a(@NotNull fdm_0 fdm_02) {
        this.a(fdm_02, fdv_0.rYT);
    }

    public void a(@NotNull fdg fdg2) {
        this.a(fdg2, fdv_0.rZu);
    }

    public void a(@NotNull fdo fdo2) {
        this.a(fdo2, fdv_0.rYV);
    }

    public void a(@NotNull fdE fdE2) {
        this.a(fdE2, fdv_0.rYW);
    }

    public void a(@NotNull fdj_0 fdj_02) {
        this.a(fdj_02, fdv_0.rYX);
    }

    public void a(@NotNull fdh fdh2) {
        this.a(fdh2, fdv_0.rZe);
    }

    public void a(@NotNull fdi_0 fdi_02) {
        this.a(fdi_02, fdv_0.rYY);
    }

    public void a(@NotNull fdn fdn2) {
        this.a(fdn2, fdv_0.rYZ);
    }

    public void a(@NotNull fdd_0 fdd_02) {
        this.a(fdd_02, fdv_0.rZd);
    }

    public void b(@NotNull fds_0 fds_02) {
        this.a(fds_02, fdv_0.rZi);
    }

    public void a(@NotNull fdb_0 fdb_02) {
        this.a(fdb_02, fdv_0.rZj);
    }

    public void a(@NotNull fdq fdq2) {
        this.a(fdq2, fdv_0.rZl);
    }

    public void a(@NotNull fdC fdC2) {
        this.a(fdC2, fdv_0.rZm);
    }

    public void a(@NotNull fdr fdr2) {
        this.a(fdr2, fdv_0.rZo);
    }

    public void a(@NotNull fdk_0 fdk_02) {
        this.a(fdk_02, fdv_0.rZp);
    }

    public void a(@NotNull fdv fdv2) {
        this.a(fdv2, fdv_0.rZq);
    }

    public void a(@NotNull fdw_0 fdw_02) {
        this.a(fdw_02, fdv_0.rZr);
    }

    public void a(@NotNull fdK fdK2) {
        this.a(fdK2, fdv_0.rZv);
    }

    public void a(@NotNull fdI fdI2) {
        this.a(fdI2, fdv_0.rZw);
    }

    public void a(@NotNull fdp fdp2) {
        this.a(fdp2, fdv_0.rZt);
    }

    @Nullable
    public fdz_0 a(@NotNull fdv_0 fdv_02, int n) {
        TIntObjectHashMap<fdz_0> tIntObjectHashMap = this.rWJ.get((Object)fdv_02);
        return tIntObjectHashMap != null ? (fdz_0)tIntObjectHashMap.get(n) : null;
    }

    public <T extends fdz_0> void a(@NotNull fdv_0 fdv_02, Consumer<T> consumer) {
        TIntObjectHashMap<fdz_0> tIntObjectHashMap = this.rWJ.get((Object)fdv_02);
        if (tIntObjectHashMap == null) {
            return;
        }
        tIntObjectHashMap.forEachValue(fdz_02 -> {
            consumer.accept(fdz_02);
            return true;
        });
    }

    private void a(@NotNull fdz_0 fdz_02, fdv_0 fdv_02) {
        TIntObjectHashMap tIntObjectHashMap = this.rWJ.get((Object)fdv_02);
        if (tIntObjectHashMap == null) {
            tIntObjectHashMap = new TIntObjectHashMap();
            this.rWJ.put(fdv_02, (TIntObjectHashMap<fdz_0>)tIntObjectHashMap);
        }
        if (tIntObjectHashMap.put(fdz_02.d(), (Object)fdz_02) != null) {
            rWH.error((Object)new IllegalArgumentException("on essaye d'enregistrer des param\u00e8tres d' IE " + fdv_02.toString() + " avec le meme id " + fdz_02.d()));
        }
    }

    public String toString() {
        return "IEParametersManager{m_params=" + this.rWJ.size() + "}";
    }
}

