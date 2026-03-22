/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Renamed from aRq
 */
public class arq_0
extends aRY {
    public static final int eJI = 0;
    public static final int eJJ = 1;
    public static final int eJK = 2;
    public static final int eJL = 3;
    public static final int eJM = 4;
    private final int eJN;
    private final int eJO;

    public arq_0(int n) {
        this.eJN = n;
        this.eJO = -1;
    }

    public arq_0(int n, int n2) {
        this.eJN = n;
        this.eJO = n2;
    }

    @Override
    public boolean isValid() {
        return this.eJN >= 0 && this.eJN <= 4;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Requires to be connected!");
            return;
        }
        try {
            switch (this.eJN) {
                case 0: {
                    ns_0 ns_02 = new ns_0();
                    ns_02.Q((short)306);
                    ns_02.nX(this.eJO);
                    ns_02.C((byte)3);
                    ayf_22.d(ns_02);
                    break;
                }
                case 1: {
                    ns_0 ns_03 = new ns_0();
                    ns_03.Q((short)405);
                    ns_03.C((byte)3);
                    ayf_22.d(ns_03);
                    break;
                }
                case 2: {
                    ns_0 ns_04 = new ns_0();
                    ns_04.Q((short)473);
                    ns_04.nX(this.eJO);
                    ns_04.C((byte)3);
                    ayf_22.d(ns_04);
                    break;
                }
                case 3: {
                    ns_0 ns_05 = new ns_0();
                    ns_05.Q((short)385);
                    ns_05.C((byte)3);
                    ayf_22.d(ns_05);
                    break;
                }
                case 4: {
                    bgt_0 bgt_02 = aue_0.cVJ().cVK();
                    if (bgt_02 == null) {
                        arq_0.jI("Unable to fetch local player. Cannot proceed with the command.");
                        return;
                    }
                    long l = bgt_02.Xi();
                    Optional optional = evx_2.feo().b(l, eva_1.owB);
                    if (optional.isEmpty()) {
                        arq_0.jI("Unable to fetch account data for " + l);
                        return;
                    }
                    fnu fnu2 = (fnu)optional.get();
                    String string = fnu2.gev().stream().map(Object::toString).collect(Collectors.joining(","));
                    arq_0.jF("Known furniture : " + string);
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Command error " + String.valueOf(exception));
        }
    }
}

