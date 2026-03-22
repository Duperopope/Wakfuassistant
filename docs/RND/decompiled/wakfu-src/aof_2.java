/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aof
 */
class aof_2
extends aoe_1 {
    private final int[][] cLd;

    aof_2(int n, int n2, abi_1 abi_12) {
        if (abi_12 == abi_1.dzt) {
            abi_12 = abi_1.dzk;
        }
        int n3 = abi_12.dzz;
        int n4 = abi_12.dzA;
        this.cLd = new int[][]{{n3, -n4, n}, {n4, n3, n2}};
    }

    @Override
    public int[] n(int ... nArray) {
        return new int[]{this.cLd[0][0] * nArray[0] + this.cLd[0][1] * nArray[1] + this.cLd[0][2], this.cLd[1][0] * nArray[0] + this.cLd[1][1] * nArray[1] + this.cLd[1][2]};
    }

    @Override
    public int[] o(int ... nArray) {
        int n = nArray[0] - this.cLd[0][2];
        int n2 = nArray[1] - this.cLd[1][2];
        return new int[]{this.cLd[0][0] * n + this.cLd[1][0] * n2, this.cLd[0][1] * n + this.cLd[1][1] * n2};
    }
}

