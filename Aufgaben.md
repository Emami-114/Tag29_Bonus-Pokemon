
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Objektorientierte Programmierung</h3>


#### Beschreibung:

- Willkommen bei den Bonusaufgaben! Hier sollst du jetzt weiter mit Klassen und Instanzen arbeiten.

#### Hinweise zur Bearbeitung:

- Die main-Funktionen für die Aufgaben sind immer unter der Klasse zu finden.
- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
  - [Handbuch: Objektorientierte Programmierung (OOP) → Nachschlagen → Best Practice: Name für Klasse entwerfen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.d8lnnw7x9ec3)
  - [Handbuch: Objektorientierte Programmierung (OOP) → Nachschlagen → Best Practice: Name für Instanz-Variable entwerfen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.gxj2gu539y2v)
  - [Handbuch: Objektorientierte Programmierung (OOP)  → Implementieren → Klasse + Eigenschaften implementieren, instanzieren und nutzen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.vyyp38n6yw1d)


---

<details>
<summary><b>Aufgabe 1</b></summary>

Du hast bisher andere kleine Spiele und Spielereien programmiert und umgesetzt. Heute wünsche ich mir, dass du eine kleine Herzensangelegenheit von mir umsetzt. Es geht um einen kleinen `Pokemon` Simulator.

Schreibe eine Mutterklasse mit dem Namen `Pokemon`. 

Ein Pokemon soll folgende Attribute haben:
- Name: String
- Level: Int
- Trefferpunkte: Int
- Schadenswert = 0.5 * Level 
- Typ: String
- isKo: Boolean = false

Außerdem soll diese Klasse zwei Methoden haben: Einmal `looseTP(lost: Int)` in welcher die Trefferpunkte des Pokemon verringert werden und wenn diese auf 0 fallen isKo auf true gesetzt und eine Meldung dazu ausgegeben wird.
Die zweite Methode ist `attack(pok: Pokemon)` - diese ist leer und wird in den erbenden Klassen überschrieben.

Jetzt gibt es natürlich Unter-Arten von Pokemon z.B. Feuer, Wasser oder Gras.
In diesen erbenden Klassen soll der Typ immer direkt mit-initialisiert werden, das heißt, wenn z.B. ein Objekt vom Typ `FirePokemon` erstell wird soll der Typ automatisch auf `Feuer` gesetzt werden.

Schreibe für mindestens zwei dieser Arten eine Klasse die von Pokemon erbt und die Methode attack(pok: Pokemon) überschreibt. Wie du siehst soll dieser Methode ein anderes Pokemon übergeben werden. 
In der Methode attack() soll über den Typ und den Schadenswert bestimmt werden wie viel Schaden das verteidigende Pokemon erhält. Z.b. könnte ein Wasser-Pokemon gegen ein Feuer-Pokemon den doppelten Schaden verursachen. 
Bevor ein Pokemon angreifen kann, soll überprüft werden, ob das Pokemon aktuell K.O. ist. Außerdem kann ein Angriff mit einer bestimmten Wahrscheinlichkeit daneben gehen. Überlege dir wie und in welcher Methode du das implementieren kannst.

Schreibe anschließend eine Funktion `fight` in der `main` Methode um zwei Pokemon gegeneinander kämpfen lässt. Sobald das erste Pokemon K.O. geht, ist der Kampf vorbei.

Generell sind deinen Vorstellungen jetzt keine Grenzen gesetzt! Schreibe so viele verschiedene Pokemon-Klassen wie du möchtest und verändere ihre Eigenschaften & Eigenheiten nach deinem Belieben.

</details>

---

<details>
<summary><b>Bonus</b></summary>

Ein Team aus Pokemon besteht immer aus 6 Pokemon. Erstelle 2 Teams als Listen von Pokemon und schreibe eine Funktion teamfight() in der main-Methode um die beiden Teams gegeneinander kämpfen zu lassen.
Dabei soll ein Pokemon aus einem Team immer ein zufälliges Pokemon aus dem anderen Team angreifen. Geht ein Pokemon K.O. soll es aus der Liste entfernt werden.

</details>

---









