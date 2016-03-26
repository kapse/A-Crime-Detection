
package crime;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class ClassificationTableModel implements TableModel {

    private ArrayList<StatusDTO> arraylist;
    private String[] columnname = {"SR NO", "LINK TYPE", "WEIGHT", "SCORE"};
    private Class[] colnclas = {String.class, String.class, String.class, String.class};

    public ClassificationTableModel(ArrayList<StatusDTO> arraylist) {
        this.arraylist = arraylist;
    }

    @Override
    public int getRowCount() {
        return arraylist.size();
    }

    @Override
    public int getColumnCount() {
        return columnname.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnname[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return colnclas[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StatusDTO dTO = arraylist.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return rowIndex + 1;
//                return dTO.getLink();
            case 1:
                return dTO.getLinktype();
            case 2:
                return dTO.getZ();
            case 3:
//                String parseDouble = dTO.getWeight();
                double count = Double.parseDouble(dTO.getWeight()) / 100;
                return "" + count;
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }

}
