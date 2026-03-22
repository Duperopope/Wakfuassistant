/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * Renamed from aIf
 */
class aif_0
implements alu_2 {
    final /* synthetic */ aie_0 dXl;

    aif_0(aie_0 aie_02) {
        this.dXl = aie_02;
    }

    @Override
    public void b(alt_2 alt_22) {
        this.dXl.cft().b(this);
        SwingUtilities.invokeLater(() -> {
            try {
                this.dXl.cfw();
            }
            catch (Exception exception) {
                aie_0.dXa.fatal((Object)"Erreur au lancement", (Throwable)exception);
                JOptionPane.showMessageDialog(null, exception, "Error", 0);
                System.exit(0);
            }
        });
    }
}

