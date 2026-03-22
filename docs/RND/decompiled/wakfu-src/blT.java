/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class blT {
    private static final String ixA = "-";
    private static final String ixB = ":";
    private static final String ixC = ",";
    private static final int ixD = 0;
    private static final int ixE = 1;
    private static final String ixF = "[^0-9:,-]";

    private blT() {
    }

    @NotNull
    @Contract(pure=true)
    public static String a(@NotNull eks_0 eks_02) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(eks_02.dva() ? 1 : 0);
        Map<fm_1, List<ekp_0>> map = eks_02.fye();
        if (!map.isEmpty()) {
            stringBuilder.append(ixA);
            map.forEach((fm_12, list) -> {
                if (list.isEmpty()) {
                    return;
                }
                stringBuilder.append(fm_12.getNumber()).append(ixB);
                int n = list.size();
                for (int i = 0; i < n; ++i) {
                    stringBuilder.append(((ekp_0)list.get(i)).AK());
                    if (i >= n - 1) continue;
                    stringBuilder.append(ixC);
                }
                stringBuilder.append(ixA);
            });
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }

    @NotNull
    @Contract(pure=true)
    public static Optional<eks_0> lY(@NotNull String string) {
        try {
            String[] stringArray = blT.lt(string).split(ixA);
            boolean bl = Integer.parseInt(stringArray[0]) == 1;
            EnumMap<fm_1, List<ekp_0>> enumMap = new EnumMap<fm_1, List<ekp_0>>(fm_1.class);
            for (int i = 1; i < stringArray.length; ++i) {
                String[] stringArray2 = stringArray[i].split(ixB);
                fm_1 fm_12 = fm_1.ce(Integer.parseInt(stringArray2[0]));
                List list = Arrays.stream(stringArray2[1].split(ixC)).map(Integer::parseInt).limit(ekj_0.z(fm_12) ? Integer.MAX_VALUE : 1L).map(n -> new ekp_0((int)n, null, null)).collect(Collectors.toList());
                enumMap.put(fm_12, list);
            }
            return Optional.of(new eks_0(-1, -1, "", enumMap, uw_0.bju(), bl));
        }
        catch (Exception exception) {
            return Optional.empty();
        }
    }

    @NotNull
    @Contract(pure=true)
    private static String lt(@NotNull String string) {
        return string.replaceAll(ixF, "");
    }
}

