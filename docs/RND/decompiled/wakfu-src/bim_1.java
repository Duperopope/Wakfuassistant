/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bIm
 */
public class bim_1
implements aeh_2,
fgf_0 {
    public static final String kfh = "item";
    public static final String kfi = "shortQuantity";
    public static final String[] kfj = (String[])ArrayUtils.addAll((Object[])bEf.jNn, (Object[])new String[]{"item", "shortQuantity"});
    @NotNull
    private final ffV kfk;
    private final List<@NotNull ffV> kfl = new ArrayList<ffV>();
    private int ejM;

    public bim_1(@NotNull ffV ffV2) {
        this.kfk = ffV2;
        this.ejM = ffV2.bfd();
    }

    public void bf(@NotNull ffV ffV2) {
        this.ejM += ffV2.bfd();
        this.kfl.add(ffV2);
    }

    public int avr() {
        return this.kfk.avr();
    }

    public static Comparator<bim_1> b(Comparator<ffV> comparator) {
        return (bim_12, bim_13) -> comparator.compare(bim_12.kfk, bim_13.kfk);
    }

    public Map<Long, Integer> GY(int n) {
        if (this.kfk.bfd() >= n) {
            return Collections.singletonMap(this.kfk.LV(), n);
        }
        HashMap<Long, Integer> hashMap = new HashMap<Long, Integer>();
        hashMap.put(this.kfk.LV(), Integer.valueOf(this.kfk.bfd()));
        int n2 = n - this.kfk.bfd();
        for (ffV ffV2 : this.kfl) {
            hashMap.put(ffV2.LV(), Math.min(n2, ffV2.bfd()));
            if ((n2 -= ffV2.bfd()) > 0) continue;
            break;
        }
        return hashMap;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "item": {
                return this.kfk;
            }
            case "shortQuantity": {
                if (this.ejM >= 10000000) {
                    return aum_0.cWf().cQ(this.ejM / 1000000) + "M";
                }
                if (this.ejM >= 1000000) {
                    int n = this.ejM % 1000000 / 100000;
                    return aum_0.cWf().cQ(this.ejM / 1000000) + "M" + n;
                }
                if (this.ejM >= 1000) {
                    return aum_0.cWf().cQ(this.ejM / 1000) + "k";
                }
                return this.ejM;
            }
            case "quantity": {
                return this.ejM;
            }
            case "quantityText": {
                return bEf.Gp(this.ejM);
            }
        }
        return this.kfk.eu(string);
    }

    @NotNull
    public ffV dXE() {
        return this.kfk;
    }

    public int oP() {
        return this.ejM;
    }

    public String getName() {
        return this.kfk.getName();
    }

    public short cmL() {
        return this.kfk.cmL();
    }

    @Override
    public ffV getItem() {
        return this.kfk;
    }

    @Override
    public String[] bxk() {
        return kfj;
    }

    public String toString() {
        return this.ejM + " x " + String.valueOf(this.kfk);
    }
}

