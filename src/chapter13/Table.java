//: c13:Table.java
// From 'Thinking in Java, 2nd ed.' by Bruce Eckel
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
// Simple demonstration of JTable.
// <applet code=Table
//  width=350 height=200></applet>
package chapter13;

import chapter13.com.bruceeckel.swing.Console;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import java.awt.*;

public class Table extends JApplet {
  JTextArea txt = new JTextArea(4, 20);
  // The TableModel controls all the data:
  class DataModel extends AbstractTableModel {
    Object[][] data = {
      {"one", "two", "three", "four"},
      {"five", "six", "seven", "eight"},
      {"nine", "ten", "eleven", "twelve"},
    };
    // Prints data when table changes:
    class TML implements TableModelListener {
      public void tableChanged(TableModelEvent e){
        txt.setText(""); // Clear it
        for(int i = 0; i < data.length; i++) {
          for(int j = 0; j < data[0].length; j++)
            txt.append(data[i][j] + " ");
          txt.append("\n");
        }
      }
    }
    public DataModel() {
      addTableModelListener(new TML());
    }
    public int getColumnCount() { 
      return data[0].length; 
    }
    public int getRowCount() { 
      return data.length;
    }
    public Object getValueAt(int row, int col) {
      return data[row][col]; 
    }
    public void 
    setValueAt(Object val, int row, int col) {
      data[row][col] = val;
      // Indicate the change has happened:
      fireTableDataChanged();
    }
    public boolean 
    isCellEditable(int row, int col) { 
      return true; 
    }
  }
  public void init() {
    Container cp = getContentPane();
    JTable table = new JTable(new DataModel());
    cp.add(new JScrollPane(table));
    cp.add(BorderLayout.SOUTH, txt);
  }
  public static void main(String[] args) {
    Console.run(new Table(), 350, 200);
  }
} ///:~