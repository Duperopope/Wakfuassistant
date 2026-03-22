/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class bfD
implements aeh_2 {
    private static final Logger hUv = Logger.getLogger(bfD.class);
    public static final bfD hUw = new bfD();
    public static final String hUx = "levels";
    private final List<bfC> hUy = new ArrayList<bfC>();
    private static final String[] hUz = new String[]{"levels"};

    private bfD() {
        for (eIi eIi2 : eIi.values()) {
            bfC bfC2 = new bfC(eIi2.cmL());
            this.hUy.add(bfC2);
        }
    }

    public bfC bp(short s) {
        for (bfC bfC2 : this.hUy) {
            if (bfC2.cmL() != s) continue;
            return bfC2;
        }
        return this.dgM();
    }

    public bfC dgM() {
        return this.hUy.get(0);
    }

    public String bq(short s) {
        String string = this.bp(s).dgL();
        String string2 = s <= 0 ? string : aum_0.cWf().c("levelShort.custom", string);
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceC().c("(").c(string2);
        try {
            if (s > 0) {
                ahv_22.c(" ").a(auk_0.zU(116), 14, 13, null, null);
            }
        }
        catch (fu_0 fu_02) {
            hUv.error((Object)"Exception trying to get downscale arrow image", (Throwable)fu_02);
        }
        return ahv_22.c(")").ceL();
    }

    public @Unmodifiable List<bfC> ab(bgy bgy2) {
        return this.e(bgy2, Integer.MIN_VALUE);
    }

    public @Unmodifiable List<bfC> e(bgy bgy2, int n) {
        short s = bgy2.dnG();
        return this.hUy.stream().filter(Objects::nonNull).filter(bfC2 -> bfD.b(bfC2.cmL(), s, n)).toList();
    }

    private static boolean b(short s, short s2, int n) {
        if (s == -1) {
            return s2 >= n;
        }
        return s2 - 0 >= s && s >= n;
    }

    @Override
    public String[] bxk() {
        return hUz;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(hUx)) {
            return this.hUy;
        }
        return null;
    }
}

