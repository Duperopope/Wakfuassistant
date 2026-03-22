/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fHc
 */
public class fhc_1
implements fib_1<fio_1> {
    private final Class<fio_1> uvL = fio_1.class;

    public fio_1 uu(String string) {
        return null;
    }

    public fio_1 j(Class<? extends fio_1> clazz, String string) {
        return this.j(clazz, string, null);
    }

    public fio_1 j(Class<? extends fio_1> clazz, String string, fhs_2 fhs_22) {
        fip_1 fip_12 = null;
        if (string != null) {
            if (clazz.equals(fmd_2.class)) {
                fip_12 = new fmd_2();
            } else if (clazz.equals(fmf_1.class)) {
                fip_12 = new fmf_1();
            } else if (clazz.equals(fmn_2.class)) {
                fip_12 = new fmn_2();
            } else if (clazz.equals(fms_2.class)) {
                fip_12 = new fms_2();
            } else if (clazz.equals(fmt_2.class)) {
                fip_12 = new fmt_2();
            } else if (clazz.equals(fmu_2.class)) {
                fip_12 = new fmu_2();
            } else if (clazz.equals(fmw_2.class)) {
                fip_12 = new fmw_2();
            } else if (clazz.equals(fmx_2.class)) {
                fip_12 = new fmx_2();
            } else if (clazz.equals(fmy_1.class)) {
                fip_12 = new fmy_1();
            } else if (clazz.equals(fmh_2.class)) {
                fip_12 = new fmh_2();
            } else if (clazz.equals(fmi_2.class)) {
                fip_12 = new fmi_2();
            } else if (clazz.equals(fmz_1.class)) {
                fip_12 = new fmz_1();
            } else if (clazz.equals(fma_2.class)) {
                fip_12 = new fma_2();
            } else if (clazz.equals(fme_1.class)) {
                fip_12 = new fme_1();
            } else if (clazz.equals(fmf_2.class)) {
                fip_12 = new fmf_2();
            } else if (clazz.equals(fmd_1.class)) {
                fip_12 = new fmd_1();
            } else if (clazz.equals(fmc_2.class)) {
                fip_12 = new fmc_2();
            } else if (clazz.equals(fmb_2.class)) {
                fip_12 = new fmb_2();
            } else if (clazz.equals(fmg_1.class)) {
                fip_12 = new fmg_1();
            } else if (clazz.equals(fmi_2.class)) {
                fip_12 = new fmi_2();
            } else if (clazz.equals(fmj_2.class)) {
                fip_12 = new fmj_2();
            } else if (clazz.equals(fmq_2.class)) {
                fip_12 = new fmq_2();
            } else if (clazz.equals(fmo_1.class)) {
                fip_12 = new fmo_1();
            } else if (clazz.equals(fmp_2.class)) {
                fip_12 = new fmp_2();
            } else if (clazz.equals(fmr_1.class)) {
                fip_12 = new fmr_1();
            } else if (clazz.equals(fms_1.class)) {
                fip_12 = new fms_1();
            } else if (clazz.equals(fmq_1.class)) {
                fip_12 = new fmq_1();
            } else if (clazz.equals(fmr_2.class)) {
                fip_12 = new fmr_2();
            } else if (clazz.equals(fmo_2.class)) {
                fip_12 = new fmo_2();
            } else if (clazz.equals(fmp_1.class)) {
                fip_12 = new fmp_1();
            } else if (clazz.equals(fmh_1.class)) {
                fip_12 = new fmh_1();
            } else if (clazz.equals(fmi_1.class)) {
                fip_12 = new fmi_1();
            } else if (clazz.equals(fmj_1.class)) {
                fip_12 = new fmj_1();
            } else if (clazz.equals(fmk_1.class)) {
                fip_12 = new fmk_1();
            } else if (clazz.equals(fml_2.class)) {
                fip_12 = new fml_2();
            } else if (clazz.equals(fmv_2.class)) {
                fip_12 = new fmv_2();
            } else if (clazz.equals(fmk_2.class)) {
                fip_12 = new fmk_2();
            } else if (clazz.equals(fml_1.class)) {
                fip_12 = new fml_1();
            } else if (clazz.equals(fme_2.class)) {
                fip_12 = new fme_2();
            } else if (clazz.equals(fmn_1.class)) {
                fip_12 = new fmn_1();
            } else if (clazz.equals(fmg_2.class)) {
                fip_12 = new fmg_2();
            } else if (clazz.equals(fmm_1.class)) {
                fip_12 = new fmm_1();
            }
        }
        if (fip_12 != null) {
            fip_12.vw(string);
        }
        return fip_12;
    }

    @Override
    public Class<fio_1> gzM() {
        return this.uvL;
    }

    @Override
    public boolean gzN() {
        return true;
    }

    @Override
    public boolean gzO() {
        return true;
    }

    @Override
    public String a(ftz_2 ftz_22, fhq_2 fhq_22, Class<? extends fio_1> clazz, String string, fhu_1 fhu_12) {
        String string2 = ftz_22.gHa();
        ftz_22.E(clazz);
        ftz_22.a(new fte_2(clazz, string2, "new " + clazz.getSimpleName() + "()"));
        ftz_22.a(new ftd_2(null, "setCallBackFunc", string2, "\"" + string + "\""));
        return string2;
    }

    @Override
    public /* synthetic */ Object um(String string) {
        return this.uu(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.j(clazz, string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string, fhs_2 fhs_22) {
        return this.j(clazz, string, fhs_22);
    }
}

