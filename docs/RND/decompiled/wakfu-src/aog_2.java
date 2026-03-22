/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aog
 */
class aog_2
extends aoe_1 {
    private final int[] cLe;

    aog_2(int n, int n2) {
        this.cLe = new int[]{n, n2};
    }

    @Override
    public int[] n(int ... nArray) {
        return new int[]{nArray[0] + this.cLe[0], nArray[1] + this.cLe[1]};
    }

    @Override
    public int[] o(int ... nArray) {
        return new int[]{nArray[0] - this.cLe[0], nArray[1] - this.cLe[1]};
    }
}

