
package com.unpri.charactermanager.model;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Membuat objek CharacterManager
        CharacterManager manager = new CharacterManager();

        System.out.println("==================================");
        System.out.println("     CHARACTER MANAGER SYSTEM");
        System.out.println("==================================");

        // A. Menambahkan karakter
        System.out.println("\n--- A. MENAMBAHKAN KARAKTER ---");

        Character c1 = new Character("Arthas", CharacterType.WARRIOR, 10);
        Character c2 = new Character("Merlin", CharacterType.MAGE, 8);
        Character c3 = new Character("Legolas", CharacterType.ARCHER, 12);
        Character c4 = new Character("Luna", CharacterType.HEALER, 6);

        manager.addCharacter(c1);
        manager.addCharacter(c2);
        manager.addCharacter(c3);
        manager.addCharacter(c4);

        System.out.println("Total karakter: " + manager.getTotalCharacters());

        // Menguji nama duplikat
        System.out.println("\n--- B. MENGUJI NAMA DUPLIKAT ---");

        Character duplicate = new Character(
            "Arthas", CharacterType.MAGE, 5
        );

        manager.addCharacter(duplicate);

        System.out.println("Total setelah mencoba duplikat: "
                + manager.getTotalCharacters());

        // Mencari karakter
        System.out.println("\n--- C. MENCARI KARAKTER ---");

        Character found = manager.findByName("Merlin");

        if (found != null) {
            System.out.println("Karakter ditemukan: " + found.getName());
        } else {
            System.out.println("Karakter tidak ditemukan.");
        }

        // Menampilkan semua karakter
        System.out.println("\n--- D. DAFTAR KARAKTER ---");

        for (Character c : manager.getAllCharacters()) {
            System.out.println(
                c.getName() + " | "
                + c.getType() + " | Level: "
                + c.getLevel()
            );
        }

        // Menguji getAllCharacters() sebagai salinan
        System.out.println("\n--- E. MENGUJI SALINAN ARRAYLIST ---");

        ArrayList<Character> copy = manager.getAllCharacters();

        copy.clear();

        System.out.println("Jumlah karakter dalam salinan: "
                + copy.size());

        System.out.println("Jumlah karakter asli: "
                + manager.getTotalCharacters());

        // B. Mini Challenge: rata-rata level
        System.out.println("\n--- F. RATA-RATA LEVEL ---");

        System.out.println("Rata-rata level: "
                + manager.getAverageLevel());

        // Mini Challenge: mencari berdasarkan tipe
        System.out.println("\n--- G. MENCARI BERDASARKAN TIPE ---");

        ArrayList<Character> warriors =
                manager.findByType(CharacterType.WARRIOR);

        for (Character c : warriors) {
            System.out.println(c.getName() + " - " + c.getType());
        }

        // C. Fitur tambahan: mencari karakter terkuat
        System.out.println("\n--- H. KARAKTER TERKUAT ---");

        Character strongest = manager.findStrongest();

        if (strongest != null) {
            System.out.println("Karakter terkuat: "
                    + strongest.getName());

            System.out.println("Level: "
                    + strongest.getLevel());
        } else {
            System.out.println("Belum ada karakter.");
        }

        // Menghapus karakter
        System.out.println("\n--- I. MENGHAPUS KARAKTER ---");

        manager.removeCharacter("Luna");

        System.out.println("Total karakter setelah dihapus: "
                + manager.getTotalCharacters());

        // Menampilkan daftar akhir
        System.out.println("\n--- J. DAFTAR AKHIR ---");

        for (Character c : manager.getAllCharacters()) {
            System.out.println(c.getName()
                    + " - " + c.getType()
                    + " - Level " + c.getLevel());
        }

        System.out.println("\n==================================");
        System.out.println("       PROGRAM SELESAI");
        System.out.println("==================================");
    }
}
