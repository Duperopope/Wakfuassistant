/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUg
 */
class fug_1 {
    fug_1() {
    }

    public static void main(String[] stringArray) {
        fuu_1 fuu_12 = null;
        try {
            fuu_12 = stringArray.length > 0 ? new fuu_1(stringArray[0]) : new fuu_1(System.in, null, -1);
        }
        catch (Exception exception) {
            System.err.println(exception);
            return;
        }
        if (fuu_12.gIg()) {
            System.out.println("Input bitstream contained " + fuu_12.gIf() + " logical bitstream section(s).");
            System.out.println("Total bitstream playing time: " + fuu_12.acG(-1) + " seconds\n");
        } else {
            System.out.println("Standard input was not seekable.");
            System.out.println("First logical bitstream information:\n");
        }
        for (int i = 0; i < fuu_12.gIf(); ++i) {
            fua_1 fua_12 = fuu_12.acI(i);
            System.out.println("\tlogical bitstream section " + (i + 1) + " information:");
            System.out.println("\t\t" + fua_12.vjB + "Hz " + fua_12.vkU + " channels bitrate " + fuu_12.acC(i) / 1000 + "kbps serial number=" + fuu_12.acD(i));
            System.out.print("\t\tcompressed length: " + fuu_12.acE(i) + " bytes ");
            System.out.println(" play time: " + fuu_12.acG(i) + "s");
            fuj_2 fuj_22 = fuu_12.acJ(i);
            System.out.println(fuj_22);
        }
    }
}

