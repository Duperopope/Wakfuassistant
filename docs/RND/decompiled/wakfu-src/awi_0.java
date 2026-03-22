/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWi
 */
class awi_0
implements ZJ {
    private final bdj_2 hus;
    private final bgy hut;
    final /* synthetic */ awf_0 huu;

    public awi_0(awf_0 awf_02, bdj_2 bdj_22, bgy bgy2) {
        this.huu = awf_02;
        this.hus = bdj_22;
        this.hut = bgy2;
    }

    @Override
    public void animationEnded(ZC zC) {
        int[] nArray = this.huu.huj.bDX();
        int n = this.huu.huj.bDU();
        acd_1 acd_12 = new acd_1(nArray);
        if (n <= 1) {
            this.hut.a(this.hut.aZw().y(acd_12));
        } else {
            this.hut.a(new acd_1(this.huu.huj.tj(n - 2)).y(acd_12));
        }
        this.hut.b(acd_12);
        this.hus.e(nArray[0], nArray[1], nArray[2]);
        this.huu.a(this.hus, this.hut);
        this.hus.dT("AnimCourseTp02-Fin");
        this.hus.b(this);
    }
}

