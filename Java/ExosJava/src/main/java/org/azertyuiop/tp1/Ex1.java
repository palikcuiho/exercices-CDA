package org.azertyuiop.tp1;

public class Ex1 {
    public static int calculerMoyenne(int[] notes) throws Exception {
        int sommeNotes = 0;
        for(int note: notes) {
            if (note < 0 || note > 20)
                throw new Exception("Les notes doivent être comprises entre 0 et 20");
            sommeNotes += note;
        }
        return sommeNotes/notes.length;
        // Faux : doit demander à l'utilisateur de saisir 3 notes
    }
}
