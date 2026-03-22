/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRZ
 */
final class arz_0 {
    arz_0() {
    }

    protected static uw_0 jT(String string) {
        String[] stringArray = string.split(" ");
        if (stringArray.length < 2) {
            return null;
        }
        String[] stringArray2 = stringArray[0].split("/");
        if (stringArray2.length < 3) {
            return null;
        }
        String[] stringArray3 = stringArray[1].split(":");
        if (stringArray3.length < 2) {
            return null;
        }
        return new uw_0(0, Integer.parseInt(stringArray3[1]), Integer.parseInt(stringArray3[0]), Integer.parseInt(stringArray2[0]), Integer.parseInt(stringArray2[1]), Integer.parseInt(stringArray2[2]));
    }
}

