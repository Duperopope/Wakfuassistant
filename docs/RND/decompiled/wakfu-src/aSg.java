/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.stream.IntStream;

public class aSg
extends aRY {
    private int epQ;
    private final byte eNk;

    public aSg(byte by) {
        this.eNk = by;
    }

    public aSg(byte by, int n) {
        this.epQ = n;
        this.eNk = by;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        if (this.eNk != 1 || IntStream.of(fjt.syH.gbS()).noneMatch(n -> n == this.epQ)) {
            aSg.cBS();
            return;
        }
        if (aue_0.cVJ().cVK() == null) {
            return;
        }
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aSg.jI("This command requires you to be connected.");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)11);
        ns_02.nX(this.epQ);
        ayf_22.d(ns_02);
    }

    private static void cBS() {
        int[] nArray = fjt.syH.gbS();
        aSg.jF("nationChange <nationId> : set nation of current character. Ids are " + Arrays.toString(nArray));
    }
}

