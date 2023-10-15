package com.gildedrose;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {

  @Test
  @DisplayName("Test that the name is unchanged")
  void testName() {
    Item element = new Item("foo", 0, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals("foo", element.name, "the name changed");
  }

  @Test
  @DisplayName("Test that the quality has decreased")
  void testQuality1() {
    Item element = new Item("fool", 1, 2);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(1, element.quality, "the quality is wrong");
  }

  @Test
  @DisplayName("Test that the quality has decreased")
  void testQuality1p() {
    Item element = new Item("fool", 1, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(0, element.quality, "the quality is wrong");
  }

  @Test
  @DisplayName("Test that the quality has increased")
  void testQuality2() {
    Item element = new Item("Aged Brie", 1, 2);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(3, element.quality, "the quality is wrong");
  }

  @Test
  @DisplayName("Test that the quality has increased")
  void testQuality2p() {
    Item element = new Item("Aged Brie", 1, 50);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(50, element.quality, "the quality is wrong");
  }

  /*@Test
  @DisplayName("Test that the quality has not changed")
  void testQuality21() {
    Item element = new Item("Aged Brie", 1, 51);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(51, element.quality, "the quality is wrong");
  }*/

  @Test
  @DisplayName("Test that the quality has increased")
  void testQuality3() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 6, 2);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(4, element.quality, "the quality is wrong");
  }

  
  @Test
  @DisplayName("Test that the quality has increased")
  void testQuality31() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 2);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(3, element.quality, "the quality is wrong");
  }

  @Test
  @DisplayName("Test that the quality has increased")
  void testQuality32() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(50, element.quality, "the quality is wrong");
  }


  @Test
  @DisplayName("Test that the quality has increased")
  void testQuality4() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 2);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(5, element.quality, "the quality is wrong");
  }

  @Test
  @DisplayName("Test that the quality has increased")
  void testQuality41() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(50, element.quality, "the quality is wrong");
  }


  @Test
  @DisplayName("Test that the SellIn has increased")
  void testSellIn() {
    Item element = new Item("Sulfuras, Hand of Ragnaros", 5, 2);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(5, element.sellIn, "the SellIn is wrong");
  }

  @Test
  @DisplayName("Test that the quality has decreased")
  void testquality5() {
    Item element = new Item("fool", 0, 2);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(0, element.quality, "the quality is wrong");
  }

  @Test
  @DisplayName("Test that the quality has decreased")
  void testquality5p() {
    Item element = new Item("fool", 0, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(0, element.quality, "the quality is wrong");
  }

  @Test
  @DisplayName("Test that the quality has decreased")
  void testquality9() {
    Item element = new Item("Sulfuras, Hand of Ragnaros", -1, 2);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(2, element.quality, "the quality is wrong");
  }

  @Test
  @DisplayName("Test that the quality has decreased")
  void testquality6() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 2);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(0, element.quality, "the quality is wrong");
  }

  @Test
  @DisplayName("Test that the quality has decreased")
  void testquality7() {
    Item element = new Item("Aged Brie", 0, 2);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(4, element.quality, "the quality is wrong");
  }

  @Test
  @DisplayName("Test that the quality has decreased")
  void testquality8() {
    Item element = new Item("Aged Brie", 0, 49);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(50, element.quality, "the quality is wrong");
  }

  @Test
    public void testToString() {
        Item element = new Item("Aged Brie", 0, 49);
        // Appelez la méthode toString
        String resultat = element.toString();

        // Définissez la sortie attendue en fonction de l'état de l'objet
        String attendu = "Aged Brie, 0, 49";

        // Vérifiez que le résultat réel correspond au résultat attendu
        assertEquals(attendu, resultat);
    }

  @Test
  @DisplayName("Test that the quality has decreased")
  void testqualityconjured1() {
    Item element = new Item("Conjured", 1, 49);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(47, element.quality, "the quality is wrong");
  }

  @Test
  @DisplayName("Test that the quality has decreased")
  void testqualityconjured2() {
    Item element = new Item("Conjured", -1, 49);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(45, element.quality, "the quality is wrong");
  }

}
