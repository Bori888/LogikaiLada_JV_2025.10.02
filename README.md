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

| Osztály neve | Adattagok | Metódusok | Egyéb megjegyzések |
|--------------|-----------|-----------|--------------------|
| **LadaModell** | - felirata: `str`<br>- Nev: `str`<br>- benneVanEAKincs: `bool` | - getterek<br>- setterek<br>- konstruktor | A láda adatait tárolja |
| **GuiLadaNezet** | - modell: `LadaModell` | - getter<br>- mutat() | Felhasználói felület megjelenítéséért felel |
| **LadaVezerlo** | - modell: `LadaModell`<br>- nezet: `GuiLadaNezet` | - konstruktor (modell, nezet)<br>- megjelenit()<br>- feladat() | Az adatok és nézet összekapcsolása, vezérlés |

---

## Részletes osztályleírások

### LadaModell

**Adattagok:**
- `felirata: str` — A láda felirata  
- `Nev: str` — A láda neve  
- `benneVanEAKincs: bool` — Jelzi, hogy van-e kincs benne  

**Metódusok:**
- Getterek és setterek az adattagokhoz  
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

## Main

- Konstruktor inicializálás  
- Fő program logika
