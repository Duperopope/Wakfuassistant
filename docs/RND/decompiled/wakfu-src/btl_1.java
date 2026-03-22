/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from btL
 */
public class btl_1 {
    public btj_1 a(bsS bsS2, byte by) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        eUw eUw2 = bsS2.dGo();
        switch (eUw2) {
            case ruF: 
            case rva: 
            case ruR: 
            case ruP: 
            case ruQ: {
                return new bto_1(bsS2, bgt_02, by);
            }
            case ruN: 
            case ruS: {
                return new bti_1(bsS2, bgt_02, by);
            }
            case ruH: 
            case ruG: 
            case ruI: 
            case ruM: 
            case ruK: 
            case ruL: 
            case ruO: 
            case ruZ: 
            case rvc: {
                return new btn_1(bsS2, bgt_02, by);
            }
        }
        throw new IllegalArgumentException(String.format("fightModel %s non g\u00e9r\u00e9.", new Object[]{eUw2}));
    }
}

