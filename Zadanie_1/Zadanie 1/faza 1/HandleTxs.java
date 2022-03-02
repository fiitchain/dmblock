// Meno študenta:
public class HandleTxs {

    /**
     * Vytvorí verejný ledger, ktorého aktuálny UTXOPool (zbierka nevyčerpaných
     * transakčných výstupov) je {@code utxoPool}. Malo by to vytvoriť obchrannú kópiu
     * utxoPool pomocou konštruktora UTXOPool (UTXOPool uPool).
     */
    public HandleTxs(UTXOPool utxoPool) {
        // IMPLEMENTOVAŤ
    }

    /**
     * @return aktuálny UTXO pool. 
     * Ak nenájde žiadny aktuálny UTXO pool, tak vráti prázdny (nie nulový) objekt {@code UTXOPool}.
     */
    public UTXOPool UTXOPoolGet() {
        // IMPLEMENTOVAŤ
        return false;
    }

    /**
     * @return true, ak 
     * (1) sú všetky výstupy nárokované {@code tx} v aktuálnom UTXO pool, 
     * (2) podpisy na každom vstupe {@code tx} sú platné, 
     * (3) žiadne UTXO nie je nárokované viackrát, 
     * (4) všetky výstupné hodnoty {@code tx}s sú nezáporné a 
     * (5) súčet vstupných hodnôt {@code tx}s je väčší alebo rovný súčtu jej
     *     výstupných hodnôt; a false inak.
     */
    public boolean txIsValid(Transaction tx) {
        // IMPLEMENTOVAŤ
        return false;
    }

    /**
     * Spracováva každú epochu prijímaním neusporiadaného radu navrhovaných
     * transakcií, kontroluje správnosť každej transakcie, vracia pole vzájomne 
     * platných prijatých transakcií a aktualizuje aktuálny UTXO pool podľa potreby.
     */
    public Transaction[] handler(Transaction[] possibleTxs) {
        // IMPLEMENTOVAŤ
        return false;
    }
}
