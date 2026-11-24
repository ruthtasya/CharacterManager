
package com.unpri.charactermanager.model;

/**
 * Enum yang mendefinisikan jenis-jenis
 * karakter dalam aplikasi.
 * Menggunakan enum agar nilai selalu valid
 * dan type-safe.
 */
public enum CharacterType {
    WARRIOR,  // karakter pejuang - HP & attack tinggi
    MAGE,     // karakter penyihir - attack tinggi, HP rendah
    ARCHER,   // karakter pemanah - seimbang, attack jarak jauh
    HEALER,   // karakter penyembuh
    ATTACK    // karakter penyerang - HP tinggi, attack rendah
}
