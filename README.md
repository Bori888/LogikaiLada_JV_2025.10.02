# Lada Projekt

## Osztályok áttekintése

| Osztály neve | Adattagok | Metódusok | Egyéb megjegyzések |
|--------------|-----------|-----------|--------------------|
| **LadaModell** | - felirata: `str`<br>- Nev: `str`<br>- benneVanEAKincs: `bool` | - getterek<br>- setterek<br>- konstruktor | Az autó modell adatait tárolja |
| **GuiLadaNezet** | - modell: `LadaModell` | - getter<br>- mutat() | Felhasználói felület megjelenítéséért felel |
| **LadaVezerlo** | - modell: `LadaModell`<br>- nezet: `GuiLadaNezet` | - konstruktor (modell, nezet)<br>- megjelenit()<br>- feladat() | Az adatok és nézet összekapcsolása, vezérlés |

---

## Részletes osztályleírások

### LadaModell

**Adattagok:**

- `felirata: str` — A modell felirata
- `Nev: str` — A modell neve
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

---

Ha szeretnéd, tudok segíteni a kód dokumentálásában vagy további részletek kidolgozásában is!
