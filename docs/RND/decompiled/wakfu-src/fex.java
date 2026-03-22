/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class fex
extends AbstractTableModel {
    private final ArrayList<String[]> sem = new ArrayList();
    private final String[] sen = new String[]{"logLevel", "serverId", "date", "accountFrom", "characterFrom", "accountTo", "characterTo", "ipFrom", "ipTo", "type", "externalId", "instanceId", "itemRefId", "itemFromUid", "itemToUId", "quantity", "kamas"};

    @Override
    public int getRowCount() {
        return this.sem.size();
    }

    @Override
    public int getColumnCount() {
        return this.sen.length;
    }

    @Override
    public String getColumnName(int n) {
        return this.sen[n];
    }

    @Override
    public Object getValueAt(int n, int n2) {
        return this.sem.get(n)[n2];
    }

    public void y(String[] stringArray) {
        this.sem.add(stringArray);
        this.fireTableRowsInserted(this.sem.size() - 1, this.sem.size() - 1);
    }

    public void UA(int n) {
        this.sem.remove(n);
        this.fireTableRowsDeleted(n, n);
    }

    public void fUy() {
        if (this.sem.isEmpty()) {
            return;
        }
        int n = this.sem.size();
        this.sem.clear();
        this.fireTableRowsDeleted(0, n - 1);
    }
}

