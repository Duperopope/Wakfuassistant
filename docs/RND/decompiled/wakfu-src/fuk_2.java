/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileInputStream;
import java.io.InputStream;

/*
 * Renamed from fUk
 */
class fuk_2 {
    static int viO = 8192;
    static final byte[] viP = new byte[viO];

    fuk_2() {
    }

    public static void main(String[] stringArray) {
        InputStream inputStream = System.in;
        if (stringArray.length > 0) {
            try {
                inputStream = new FileInputStream(stringArray[0]);
            }
            catch (Exception exception) {
                System.err.println(exception);
            }
        }
        fue_2 fue_22 = new fue_2();
        fud_2 fud_22 = new fud_2();
        fuc_2 fuc_22 = new fuc_2();
        fub_2 fub_22 = new fub_2();
        fua_1 fua_12 = new fua_1();
        fuj_2 fuj_22 = new fuj_2();
        fum_1 fum_12 = new fum_1();
        fuf_1 fuf_12 = new fuf_1(fum_12);
        int n = 0;
        fue_22.bkZ();
        while (true) {
            byte[] byArray;
            int n2;
            Object object;
            boolean bl = false;
            int n22 = fue_22.act(4096);
            byte[] byArray2 = fue_22.SY;
            try {
                n = inputStream.read(byArray2, n22, 4096);
            }
            catch (Exception exception) {
                System.err.println(exception);
                System.exit(-1);
            }
            fue_22.acu(n);
            if (fue_22.e(fuc_22) != 1) {
                if (n < 4096) break;
                System.err.println("Input does not appear to be an Ogg bitstream.");
                System.exit(1);
            }
            fud_22.tZ(fuc_22.gHL());
            fua_12.bkZ();
            fuj_22.bkZ();
            if (fud_22.c(fuc_22) < 0) {
                System.err.println("Error reading first page of Ogg bitstream data.");
                System.exit(1);
            }
            if (fud_22.b(fub_22) != 1) {
                System.err.println("Error reading initial header packet.");
                System.exit(1);
            }
            if (fua_12.a(fuj_22, fub_22) < 0) {
                System.err.println("This Ogg bitstream does not contain Vorbis audio data.");
                System.exit(1);
            }
            int n3 = 0;
            while (n3 < 2) {
                int n4;
                while (n3 < 2 && (n4 = fue_22.e(fuc_22)) != 0) {
                    if (n4 != 1) continue;
                    fud_22.c(fuc_22);
                    while (n3 < 2 && (n4 = fud_22.b(fub_22)) != 0) {
                        if (n4 == -1) {
                            System.err.println("Corrupt secondary header.  Exiting.");
                            System.exit(1);
                        }
                        fua_12.a(fuj_22, fub_22);
                        ++n3;
                    }
                }
                n22 = fue_22.act(4096);
                byArray2 = fue_22.SY;
                try {
                    n = inputStream.read(byArray2, n22, 4096);
                }
                catch (Exception exception) {
                    System.err.println(exception);
                    System.exit(1);
                }
                if (n == 0 && n3 < 2) {
                    System.err.println("End of file before finding all Vorbis headers!");
                    System.exit(1);
                }
                fue_22.acu(n);
            }
            byte[][] byArray3 = object = fuj_22.viK;
            int exception = byArray3.length;
            for (n2 = 0; n2 < exception && (byArray = byArray3[n2]) != null; ++n2) {
                System.err.println(new String(byArray, 0, byArray.length - 1));
            }
            System.err.println("\nBitstream is " + fua_12.vkU + " channel, " + fua_12.vjB + "Hz");
            System.err.println("Encoded by: " + new String(fuj_22.viN, 0, fuj_22.viN.length - 1) + "\n");
            viO = 4096 / fua_12.vkU;
            fum_12.a(fua_12);
            fuf_12.a(fum_12);
            object = new float[1][][];
            int[] object2 = new int[fua_12.vkU];
            while (!bl) {
                while (!bl && (exception = fue_22.e(fuc_22)) != 0) {
                    if (exception == -1) {
                        System.err.println("Corrupt or missing data in bitstream; continuing...");
                        continue;
                    }
                    fud_22.c(fuc_22);
                    while ((exception = fud_22.b(fub_22)) != 0) {
                        if (exception == -1) continue;
                        if (fuf_12.c(fub_22) == 0) {
                            fum_12.a(fuf_12);
                        }
                        while ((n2 = fum_12.a((float[][][])object, object2)) > 0) {
                            byArray = object[0];
                            int n4 = n2 < viO ? n2 : viO;
                            for (n3 = 0; n3 < fua_12.vkU; ++n3) {
                                int n5 = n3 * 2;
                                int n6 = object2[n3];
                                for (int i = 0; i < n4; ++i) {
                                    int n7 = (int)((double)byArray[n3][n6 + i] * 32767.0);
                                    if (n7 > Short.MAX_VALUE) {
                                        n7 = Short.MAX_VALUE;
                                    }
                                    if (n7 < Short.MIN_VALUE) {
                                        n7 = Short.MIN_VALUE;
                                    }
                                    if (n7 < 0) {
                                        n7 |= 0x8000;
                                    }
                                    fuk_2.viP[n5] = (byte)n7;
                                    fuk_2.viP[n5 + 1] = (byte)(n7 >>> 8);
                                    n5 += 2 * fua_12.vkU;
                                }
                            }
                            System.out.write(viP, 0, 2 * fua_12.vkU * n4);
                            fum_12.acw(n4);
                        }
                    }
                    if (fuc_22.gHJ() == 0) continue;
                    bl = true;
                }
                if (bl) continue;
                n22 = fue_22.act(4096);
                byArray2 = fue_22.SY;
                try {
                    n = inputStream.read(byArray2, n22, 4096);
                }
                catch (Exception exception2) {
                    System.err.println(exception2);
                    System.exit(1);
                }
                fue_22.acu(n);
                if (n != 0) continue;
                bl = true;
            }
            fud_22.clear();
            fuf_12.gHR();
            fum_12.clear();
            fua_12.clear();
        }
        fue_22.gHR();
        System.err.println("Done.");
    }
}

