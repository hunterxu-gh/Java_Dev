package Intro_Java_Exercises.zju.notebook;

import java.util.ArrayList;

/**
 * Notebook
 * 业务逻辑：
 *  - 能存储记录
 *  - 无限条笔记
 *  - 能查阅已知笔记的数量
 *  - 能读取每一条笔记
 *  - 能删除笔记
 *  - 能列出所有的笔记
 */
public class Notebook {
    private ArrayList<String> notes = new ArrayList<String>(); // ArrayList(Vol Type) of String(Element type)

    public void add(String note) {
        notes.add(note);
    }

    public void add(String note, int location) {
        notes.add(location, note);
    }

    public int getSize() {
        return notes.size();
    }

    public String getNote(int index) { // moutitiao
        return notes.get(index);
    }

    public void removeNote(int index) {
        notes.remove(index);
    }

    public String[] list() {
        String[] s = new String[notes.size()];
        //for(int i = 0; i < notes.size(); i++) {
          //  s[i] = notes.get(i);
        //}

        notes.toArray(s);
        return s;
    }

    public static void main(String[] args) {
        Notebook nb = new Notebook();
        nb.add("first");
        nb.add("second");
        nb.add("third", 1);
        System.out.println(nb.getSize());
        System.out.println(nb.getNote(1));
        nb.removeNote(1);
        String[] s = nb.list();
        for (String a : s) {
            System.out.println(a);
        }
    }
}