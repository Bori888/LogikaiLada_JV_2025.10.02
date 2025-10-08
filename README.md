# Lada Projekt

## Feladatleírás

- 3 ládából kell választani, hogy melyikben van a kincs  
- Mind a 3 ládán 3 felirat van  
- Csak az egyik láda az igaz láda  

**Feliratok:**
- Arany láda: *„én rejtem a kincset”*  
- Ezüst láda: *„nem én rejtem a kincset”*  
- Bronz láda: *„az Arany láda hazudik”*  

**GUI elemek:**
- **Label** – feladatleírás  
- **Label (kép)** – ládák megjelenítése  
- **Panel** – a ládák szöveges elhelyezése  
- **JRadioButton** – kiválasztás, melyikben van a kincs  
- **JTextField** – eredmény visszajelzés (nyertél/vesztettél)  
- **JButton** – ellenőrző gomb  

---

## Osztályok áttekintése

| Osztály neve   | Adattagok | Metódusok | Egyéb megjegyzések |
|----------------|-----------|-----------|--------------------|
| **LadaModell** | - felirata: `str`<br>- Nev: `str`<br>- benneVanEAKincs: `bool`<br>- **IgazatMonddE: `bool`** | - getterek<br>- setterek<br>- konstruktor | A láda adatait tárolja; `IgazatMonddE` jelzi, hogy a láda felirata igaz-e |
| **GuiLadaNezet** | - modell: `LadaModell` | - getter<br>- mutat() | Felhasználói felület megjelenítéséért felel |
| **LadaVezerlo** | - modell: `LadaModell`<br>- nezet: `GuiLadaNezet` | - konstruktor (modell, nezet)<br>- megjelenit()<br>- feladat() | Az adatok és nézet összekapcsolása, vezérlés |
| **Main** | *(nincs adattag)* | - konstruktor()<br>- main() | A program belépési pontja, innen indul minden |

---

## Részletes osztályleírások

### LadaModell

**Adattagok:**
- `felirata: str` — A láda felirata  
- `Nev: str` — A láda neve  
- `benneVanEAKincs: bool` — Jelzi, hogy van-e kincs benne  
- `IgazatMonddE: bool` — **Privát** jelző, hogy a láda felirata igaz állítást mond-e  

**Metódusok:**
- Getterek és setterek az adattagokhoz (beleértve `isIgazatMonddE()` / `setIgazatMonddE(boolean)`),  
- Konstruktor az adattagok inicializálásához  

---

### GuiLadaNezet

**Adattagok:**
- `modell: LadaModell` — Az adatmodell referencia  

**Metódusok:**
- Getter a modell eléréséhez  
- `mutat()` — Megjeleníti a modellt a felületen  

---

### LadaVezerlo

**Adattagok:**
- `modell: LadaModell`  
- `nezet: GuiLadaNezet`  

**Metódusok:**
- Konstruktor (modell, nezet) — Inicializálja a vezérlőt  
- `megjelenit()` — Meghívja a nézet megjelenítő metódusát  
- `feladat()` — A fő feladatok végrehajtása  

---

### Main

**Adattagok:**
- *(nincs adattag)*  

**Metódusok:**
- `main()` — A program belépési pontja, innen indul minden  
- Konstruktor — Az alapvető inicializálásokat végzi  

**Feladat:**
- Az alkalmazás indítása  
- Modellek, nézet és vezérlő példányosítása  

---

## Munkamegosztás

| Feladat | Felelős |
|---------|---------|
| Feladatleírás összeállítása | András |
| Táblázat (osztályok áttekintése) | Bori |
| Tervezés (osztályok, GUI felépítés) | Közös |
| Kincs megtalálásának logikája | Bori |
| Modell (LadaModell osztály) | Bori |
| Nézet (GuiLadaNezet osztály) | András |
| Vezérlő (LadaVezerlo osztály) | Közös |
| Main program | Közös |
| Dokumentáció (README, leírás) | Közös |

---
# Bori megoldása a kincs rejtekhelyére vonatkozóan

A következő állítások alapján kell meghatározni, hogy hol van a kincs:

| Ládánál   | Állítás                             | Jelölés  |
|-----------|-----------------------------------|----------|
| Arany     | Én rejtem a kincset                | h (hazudik) |
| Ezüst     | Nem én rejtem a kincset            | i (igazat mond) |
| Bronz     | Arany hazudik                     | h (hazudik) |

**Jelölések:**

- **h** = hazudik  
- **i** = igazat mond  

---

## Bori megoldása összefoglalva:

- Az Arany láda állítása hamis, tehát **nem ő rejti a kincset**.
- Az Ezüst láda állítása igaz, tehát **nem ő rejti a kincset**.
- A Bronz láda állítása hamis, vagyis **az Arany láda nem hazudik** — de ez ellentmond az első pontnak, ezért a kincs **itt (Bronz ládában) van**.

**Tehát a kincs a Bronz ládában található.**


## Csapat tagok
- Ilyés Borbála  
- Fabu András

<img width="583" height="379" alt="image" src="https://github.com/user-attachments/assets/c6056e4a-88b4-49d9-b077-e799bd8044ad" />
