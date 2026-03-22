/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bFt
 */
public class bft_0 {
    private static final Logger jTu = Logger.getLogger(bft_0.class);

    public static bfc_1 a(int n, fgM fgM2) {
        if (fgM2 == null) {
            jTu.error((Object)"Impossible de cr\u00e9er une action d'item \u00e0 partir d'une constante 'null'", (Throwable)new IllegalArgumentException());
            return null;
        }
        switch (fgM2) {
            case skl: {
                return new bfp_1(n);
            }
            case skm: {
                return new bfh_1(n);
            }
            case skn: {
                return new bfn_0(n);
            }
            case sko: {
                return new bfr_1(n);
            }
            case skp: {
                return new bfu_1(n);
            }
            case skq: {
                return new bfg_2(n);
            }
            case skr: {
                return new bfx_0(n);
            }
            case sks: {
                return new bfz_0(n);
            }
            case skt: {
                return new bfb_1(n);
            }
            case sku: {
                return new bfc_2(n);
            }
            case skv: {
                return new bgd_1(n);
            }
            case sla: {
                return new bge_1(n);
            }
            case skw: {
                return new bfh_2(n);
            }
            case skx: {
                return new bfj_1(n);
            }
            case sky: {
                return new bff_1(n);
            }
            case skz: {
                return new bfe_2(n);
            }
            case skA: {
                return new bfo_0(n);
            }
            case skB: {
                return new bfz_1(n);
            }
            case skC: {
                return new bgc_1(n);
            }
            case skD: {
                return new bfr_0(n);
            }
            case skE: {
                return new bfm_1(n);
            }
            case skF: {
                return new bfs_1(n);
            }
            case skG: {
                return new bfq_0(n);
            }
            case skH: {
                return new bfy_1(n);
            }
            case skI: {
                return new bff_2(n);
            }
            case skJ: {
                return new bfn_1(n);
            }
            case skK: {
                return new bfp_0(n);
            }
            case skL: {
                return new bfk_0(n);
            }
            case skM: {
                return new bfx_1(n);
            }
            case skN: {
                return new bfl_1(n);
            }
            case skO: {
                return new bfi_2(n);
            }
            case skP: {
                return new bfs_0(n);
            }
            case skQ: {
                return new bfe_1(n);
            }
            case skR: {
                return new bfd_2(n);
            }
            case skS: {
                return new bfk_1(n);
            }
            case skT: {
                return new bfa_0(n);
            }
            case skU: {
                return new bgh_1(n);
            }
            case skV: {
                return new bgg_1(n);
            }
            case skW: {
                return new bfi_1(n);
            }
            case skX: {
                return new bfm_0(n);
            }
            case skY: {
                return new bga_1(n);
            }
            case skZ: {
                return new bfd_1(n);
            }
        }
        return null;
    }
}

