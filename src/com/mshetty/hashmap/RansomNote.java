package com.mshetty.hashmap;

public class RansomNote {
    public static void main(String[] args) {
        String[] magazine = {"apgo", "clm", "w", "lxkvg", "mwz", "elo", "bg", "elo", "lxkvg", "elo", "apgo", "apgo", "w", "elo", "bg"};
        String[] note = {"elo", "lxkvg", "bg", "mwz", "clm", "w"};
        checkMagazine(magazine, note);
    }

    public static void checkMagazine(String[] magazine, String[] note) {

        if(magazine.length < note.length) {
            System.out.println("No");
            return;
        }



        boolean wordFound= false;
        for(int i=0; i<note.length; i++){
            wordFound=false;
            for(int j=0; j<magazine.length; j++){

                if(note[i].equals(magazine[j])){
                    magazine[j]="n/a";
                    wordFound=true;
                    break;

                }

            }
            if(!wordFound) {
                System.out.println("No");
                break;
            }

        }
        if(wordFound)
            System.out.println("Yes");

    }

}
