/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fRy
 */
public interface fry_2
extends ayx_2 {
    public fsm_1 getContentGreedySize(faw_2 var1, fes_2 var2, fsm_1 var3);

    public fsm_1 getContentPreferedSize(faw_2 var1);

    public fsm_1 getContentMinSize(faw_2 var1);

    public void a(faw_2 var1);

    public void b(faw_2 var1, fes_2 var2);

    public boolean isStandAlone();

    default public fsm_1 getIncompressibleBounds(faw_2 faw_22) {
        return new fsm_1(0, 0);
    }
}

