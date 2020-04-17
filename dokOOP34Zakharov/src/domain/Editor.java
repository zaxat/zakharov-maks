package domain;
/**
 * публічный клас Editor, який наслідує клас Artist
 * @author admin
 */
public class Editor extends Artist {
    /**
     * конструктор для класу Editor
     * @param electronicEditing - електронне видання
     * @param skiils - навик
     * @param name - імя
     * @param jobTitle проффесія
     * @param level - рівень
     * @param dept - відділ
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    /**
     * конструктор для обєкту класу Editor
     * @param electronicEditing - електронне видання
     * @param skiils - навикчок
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    /**
     * конструктор для классу Editor
     * @param electronicEditing - електронне видання
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    /**
     * конструктор для обєкту класу Editor
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    /**
     * метод toString()
     * @return string
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;
    /**
     * метод getPreferences()
     * @return electronicEditing
     */
    public boolean getPreferences() {
        return electronicEditing;
    }
    /**
     * метод setPreferences()
     * @param electronic 
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
