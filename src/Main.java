//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gatos g1 = new Gatos(3,"Zeus");
        Gatos g2 = new Gatos(4,"Liam");
        Gatos g3 = new Gatos(5,"Bigo");
        Gatos g4 = new Gatos(6,"MIA");

        //System.out.println(g1);
        System.out.printf(g1.toString()).println();
        System.out.printf(g2.toString()).println();
        System.out.printf(g3.toString()).println();
        System.out.printf(g4.toString()).println();

        }
    }
