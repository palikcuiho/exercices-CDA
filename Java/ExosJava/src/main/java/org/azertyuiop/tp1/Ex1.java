package org.azertyuiop.tp1;

public class Ex1 {
    public static int calculerMoyenne(int[] notes) {
        int sommeNotes = 0;
        for(int note: notes) {
            sommeNotes += note;
        }
        return sommeNotes/notes.length;
    }
}
